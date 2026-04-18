package kayla.pulderessence.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class GravityMixin {
    @Inject(method = "travel", at = @At("HEAD"))
    private void realisticPhysics(CallbackInfo ci, int mass) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (!entity.hasNoGravity() && !entity.isOnGround()) {
            // 1. Real gravity
            Vec3d vel = entity.getVelocity();
            entity.setVelocity(vel.x, vel.y - 0.308, vel.z);

            // 2. Terminal velocity drag (70kg human)
            double termVel = 2.7;  // blocks/tick
            double drag = 1.0 - Math.pow(Math.abs(vel.y) / termVel, 2);
            drag = MathHelper.clamp(drag, 0.998, 1.0);
            entity.setVelocity(vel.x, vel.y * drag, vel.z);
        }
    }
}