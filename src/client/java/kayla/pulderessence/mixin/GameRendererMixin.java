package kayla.pulderessence.mixin;

import kayla.pulderessence.client.BlackholeRenderer;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @Unique
    private static final BlackholeRenderer pulderessence_blackhole = new BlackholeRenderer();

    @Inject(method = "renderWorld", at = @At("TAIL"))
    private void onRenderWorldTail(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
        pulderessence_blackhole.tick(tickDelta);
        pulderessence_blackhole.render(tickDelta);
    }
}
