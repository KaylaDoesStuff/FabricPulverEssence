package kayla.pulderessence.mixin;

import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Entity.class)
public class EntityMoveDilationMixin {

    @ModifyVariable(method = "move", at = @At("HEAD"), argsOnly = true)
    private Vec3d scaleMovement(Vec3d movement) {
        Entity entity = (Entity)(Object)this;
        if (entity.getWorld() == null) return movement;
        double factor = TimeDilation.getDilationFactor(entity.getWorld(), entity.getPos());
        if (factor >= 1.0) return movement;
        return movement.multiply(factor);
    }
}
