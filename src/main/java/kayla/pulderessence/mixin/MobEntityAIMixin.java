package kayla.pulderessence.mixin;

import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public abstract class MobEntityAIMixin {

    @Unique
    private double dilationAiAccumulator = 0.0;

    @Inject(method = "tickNewAi", at = @At("HEAD"), cancellable = true)
    private void onTickNewAi(CallbackInfo ci) {
        MobEntity self = (MobEntity)(Object)this;
        if (self.getWorld().isClient) return;

        double factor = TimeDilation.getDilationFactor(self.getWorld(), self.getPos());
        if (factor >= 1.0) {
            dilationAiAccumulator = 0.0;
            return;
        }

        dilationAiAccumulator += factor;
        if (dilationAiAccumulator >= 1.0) {
            dilationAiAccumulator -= 1.0;
        } else {
            ci.cancel();
        }
    }
}
