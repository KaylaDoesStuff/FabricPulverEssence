package kayla.pulderessence.mixin.client;

import net.minecraft.client.gl.PostEffectPass;
import net.minecraft.client.gl.PostEffectProcessor;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(PostEffectProcessor.class)
public class PostEffectProcessorMixin {
    @Shadow
    private List<PostEffectPass> passes;

    @Shadow
    private Matrix4f projectionMatrix;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void pulderessence$onInit(CallbackInfo ci) {
        if (passes == null || projectionMatrix == null) return;
        for (PostEffectPass pass : passes) {
            pass.setProjectionMatrix(projectionMatrix);
        }
    }
}
