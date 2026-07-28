package kayla.pulderessence.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;
import kayla.pulderessence.render.BlackHoleShader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Unique
    private static PostEffectProcessor blackHolePostEffect;

    @Unique
    private static final Matrix4f worldProjectionMatrix = new Matrix4f();

    @Unique
    private static final Matrix4f worldModelViewMatrix = new Matrix4f();

    @Inject(method = "renderWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/math/MatrixStack;FJZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/render/LightmapTextureManager;Lorg/joml/Matrix4f;)V"))
    private void pulderessence$snapshotWorldMatrices(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
        worldProjectionMatrix.set(RenderSystem.getProjectionMatrix());
        worldModelViewMatrix.set(matrices.peek().getPositionMatrix());
    }

    @Inject(method = "renderWorld", at = @At("TAIL"))
    private void pulderessence$onRenderWorld(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null || client.player == null) return;

        if (blackHolePostEffect == null) {
            try {
                blackHolePostEffect = new PostEffectProcessor(
                        client.getTextureManager(),
                        client.getResourceManager(),
                        client.getFramebuffer(),
                        new Identifier("minecraft", "shaders/post/blackhole.json")
                );
                blackHolePostEffect.setupDimensions(client.getWindow().getFramebufferWidth(), client.getWindow().getFramebufferHeight());
            } catch (Exception e) {
                return;
            }
        }

        Matrix4f mvp = new Matrix4f(worldProjectionMatrix).mul(worldModelViewMatrix);
        BlackHoleShader.prepareFrame(tickDelta, mvp);
        blackHolePostEffect.render(tickDelta);
    }

    @Inject(method = "onResized", at = @At("TAIL"))
    private void pulderessence$onResized(int width, int height, CallbackInfo ci) {
        if (blackHolePostEffect != null) {
            blackHolePostEffect.setupDimensions(width, height);
        }
    }
}
