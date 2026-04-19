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
    private void pinDropPhysics(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity)(Object)this;

        // Pure freefall only
        if (isFreefalling(entity)) {
            Vec3d vel = entity.getVelocity();

            // 90kg Pin Drop - VERTICAL ONLY
            double gravity = 0.045;
            double termVel = 4.2;

            double drag = MathHelper.clamp(0.92 + (1.0 - Math.abs(vel.y) / termVel) * 0.08, 0.92, 1.0);
            double newYVel = vel.y * drag - gravity;
            newYVel = MathHelper.clamp(newYVel, -termVel, 2.0);

            // HORIZONTAL VELOCITY 100% UNTOUCHED
            // Only replace Y component
            entity.setVelocity(vel.x, newYVel, vel.z);
        }
    }

    private boolean isFreefalling(LivingEntity entity) {
        Vec3d vel = entity.getVelocity();
        return !entity.hasNoGravity() &&
                !entity.isOnGround() &&
                vel.y < -0.05 &&  // Definitely falling
                !entity.isFallFlying() &&
                !entity.hasVehicle() &&
                !entity.isUsingRiptide() &&
                !entity.isClimbing();
    }
}