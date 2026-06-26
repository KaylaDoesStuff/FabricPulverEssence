package kayla.pulderessence.mixin;

import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LivingEntity.class)
public class LivingEntityGravityDilationMixin {

    @Redirect(
            method = "travel",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V")
    )
    private void redirectSetVelocityInTravel(LivingEntity self, Vec3d velocity) {
        Vec3d current = self.getVelocity();
        Vec3d delta = velocity.subtract(current);
        double factor = TimeDilation.getDilationFactor(self.getWorld(), self.getPos());
        if (factor < 1.0 && delta.lengthSquared() > 1.0e-12) {
            self.setVelocity(current.add(delta.multiply(factor)));
            return;
        }
        self.setVelocity(velocity);
    }

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
}
