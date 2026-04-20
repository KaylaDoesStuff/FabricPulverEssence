package kayla.pulderessence.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class FixJumpMixin {

    /**
     * This injects AFTER the vanilla jump velocity has been set.
     * We then overwrite it with our own value.
     */
    @Inject(method = "jump", at = @At("TAIL"))
    private void onJump(CallbackInfo ci) {
        PlayerEntity self = (PlayerEntity) (Object) this;
        // Override the vanilla velocity with our custom value
        // Keep horizontal velocity the same, only change vertical
        self.setVelocity(self.getVelocity().x, 0.88, self.getVelocity().z);
    }
}