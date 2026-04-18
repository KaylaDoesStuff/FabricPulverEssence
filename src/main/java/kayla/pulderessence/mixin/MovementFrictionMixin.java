package kayla.pulderessence.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;


@Mixin(PlayerEntity.class)
public class MovementFrictionMixin {

    @Inject(method = "travel", at = @At("Head"))
    private void

}
