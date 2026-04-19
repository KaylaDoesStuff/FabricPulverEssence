package kayla.pulderessence.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class SprintAccelerationMixin {

    private float sprintProgress = 0.0f;

    @Inject(method = "travel", at = @At("TAIL"))
    private void directPhysics(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (!(entity instanceof PlayerEntity player)) return;

        Vec3d vel = player.getVelocity();
        boolean sprinting = player.isSprinting();
        boolean onGround = player.isOnGround();
        double horizSpeed = Math.sqrt(vel.x * vel.x + vel.z * vel.z);

        // SMOOTH RAMP
        if (onGround) {
            if (sprinting) {
                sprintProgress = Math.min(sprintProgress + 0.075f, 1.0f);
            } else {
                sprintProgress = Math.max(sprintProgress - 0.10f, 0.0f);
            }
        }

        // DIRECT ACCELERATION
        if (sprinting && onGround) {
            double targetSpeed = 0.15 * sprintProgress;
            if (horizSpeed < targetSpeed) {
                // Add velocity toward target
                double accelX = (Math.copySign(targetSpeed * 0.25, vel.x) - vel.x) * 0.3;
                double accelZ = (Math.copySign(targetSpeed * 0.25, vel.z) - vel.z) * 0.3;
                player.setVelocity(vel.x + accelX, vel.y, vel.z + accelZ);
            }
        }

        // DIRECT SLIDING FRICTION
        if (onGround && !sprinting) {
            // Preserve momentum, gradual decay
            double slideFriction = 0.92;  // 8% loss/tick = 5 block slide
            player.setVelocity(
                    vel.x * slideFriction,
                    vel.y,
                    vel.z * slideFriction
            );
        }

        // DEBUG
        if (player.age % 100 == 0) {
            double speed = Math.sqrt(vel.x * vel.x + vel.z * vel.z);
            String mode = sprinting ? "SPRT" : "SLID";
            player.sendMessage(Text.literal("P:" + (int)(sprintProgress*100) +
                    " S:" + String.format("%.3f", speed) + " " + mode), false);
        }
    }
}