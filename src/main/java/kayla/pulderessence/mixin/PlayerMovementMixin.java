package kayla.pulderessence.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PlayerEntity.class)
public abstract class PlayerMovementMixin {

    @ModifyConstant(method = "createPlayerAttributes", constant = @Constant(doubleValue = 0.10000000149011612))
    private static double modifyWalkSpeed(double original) {
        return 0.03706;
    }
}
