package kayla.pulderessence.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class ForceGroundFalseOnJumpMixin {

    @Inject(method = "jump", at = @At("TAIL"))
    private void forceNotOnGroundAfterJump(CallbackInfo ci) {
        LivingEntity self = (LivingEntity)(Object)this;
        if (self.getVelocity().y > 0.0) {
            self.setOnGround(false);
        }
    }
}
