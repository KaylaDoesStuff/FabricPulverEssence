# Fix: Add setVelocity(DDD) redirect for ground movement

## Problem

`LivingEntityGravityDilationMixin` only redirects `setVelocity(Vec3d)`, but the
ground branch of `LivingEntity.travel()` calls `setVelocity(double, double, double)`
instead. The redirect has zero effect on normal walking/jumping/falling.

**Bytecode evidence:**
- Water/lava/elytra: `invokevirtual #2831` → `setVelocity(Vec3d)` — REDIRECTED
- Ground branch: `invokevirtual #2343` → `setVelocity(DDD)` — NOT redirected

## Impact

Movement time-dilation relies solely on `EntityMoveDilationMixin` (which scales
the Vec3d argument in `Entity.move()`). This halves jump height at factor=0.5
(~0.55 vs vanilla ~1.106 blocks), which violates the requirement to preserve
jump height.

## Fix

Add a second `@Redirect` in `LivingEntityGravityDilationMixin` targeting
`setVelocity(DDD)V` in the `travel` method. It applies the same delta-scaling
logic as the existing Vec3d redirect.

With both scalings active:
- **move() × factor** (EntityMoveDilationMixin): position change reduced
- **setVelocity delta × factor** (new redirect): velocity evolution slowed

Their effects approximately cancel for jump height (~1.045 blocks at factor=0.5),
while horizontal movement and fall speed are still visibly slowed.

## Safety

`setVelocity(DDD)` delegates to `setVelocity(Vec3d)` in vanilla, so calling
`self.setVelocity(new Vec3d(...))` from the DDD handler goes through the
original `setVelocity(Vec3d)` — the `@Redirect` only intercepts calls
whose INVOKE instructions reside in `travel()` bytecode, not calls from our
mixin handler methods. No recursion or double-processing.

## File to modify

`src/main/java/kayla/pulderessence/mixin/LivingEntityGravityDilationMixin.java`

Add after the existing Vec3d redirect:

```java
@Redirect(
        method = "travel",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setVelocity(DDD)V")
)
private void redirectSetVelocityInTravelDDD(LivingEntity self, double x, double y, double z) {
    Vec3d current = self.getVelocity();
    Vec3d velocity = new Vec3d(x, y, z);
    Vec3d delta = velocity.subtract(current);
    double factor = TimeDilation.getDilationFactor(self.getWorld(), self.getPos());
    if (factor < 1.0 && delta.lengthSquared() > 1.0e-12) {
        self.setVelocity(current.add(delta.multiply(factor)));
        return;
    }
    self.setVelocity(velocity);
}
```
