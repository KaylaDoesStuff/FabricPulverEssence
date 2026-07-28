package kayla.pulderessence.mixin.client;

import kayla.pulderessence.render.BlackHoleShader;
import net.minecraft.client.gl.JsonEffectShaderProgram;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(JsonEffectShaderProgram.class)
public class JsonEffectShaderProgramMixin {
    @Inject(method = "enable", at = @At("HEAD"))
    private void pulderessence$onEnable(CallbackInfo ci) {
        JsonEffectShaderProgram self = (JsonEffectShaderProgram) (Object) this;
        BlackHoleShader.flushUniforms(self);
    }
}
