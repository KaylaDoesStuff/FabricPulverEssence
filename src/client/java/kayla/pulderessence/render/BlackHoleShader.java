package kayla.pulderessence.render;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.custom.SingularityBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.JsonEffectShaderProgram;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleShader {
    private static final Logger LOGGER = LoggerFactory.getLogger(PulderEssence.MOD_ID + "/BlackHoleShader");

    private static NativeImageBackedTexture bhTexture;
    private static Identifier bhTextureId;
    private static int bhCount = 0;
    private static float tanHalfFov = 0.7f;

    public static void init() {
    }

    public static void prepareFrame(float tickDelta, Matrix4f mvpMatrix) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null || client.player == null) return;

        if (bhTexture == null) {
            try {
                NativeImage image = new NativeImage(NativeImage.Format.RGBA, 64, 5, false);
                bhTexture = new NativeImageBackedTexture(image);
                bhTextureId = client.getTextureManager().registerDynamicTexture("blackhole_data", bhTexture);
            } catch (Exception e) {
                LOGGER.error("BlackHoleShader: Failed to create texture", e);
                return;
            }
        }

        int renderDistance = client.options.getViewDistance().getValue() * 16;
        Vec3d cameraPos = client.gameRenderer.getCamera().getPos();
        List<SingularityBlockEntity> blackHoles = new ArrayList<>();

        int chunkRadius = client.options.getViewDistance().getValue();
        int playerChunkX = client.player.getChunkPos().x;
        int playerChunkZ = client.player.getChunkPos().z;
        for (int cx = playerChunkX - chunkRadius; cx <= playerChunkX + chunkRadius; cx++) {
            for (int cz = playerChunkZ - chunkRadius; cz <= playerChunkZ + chunkRadius; cz++) {
                var chunk = client.world.getChunk(cx, cz);
                if (chunk == null) continue;
                for (var entry : chunk.getBlockEntities().entrySet()) {
                    if (entry.getValue() instanceof SingularityBlockEntity sbe) {
                        Vec3d bhPos = Vec3d.ofCenter(entry.getKey());
                        if (bhPos.distanceTo(cameraPos) <= renderDistance) {
                            blackHoles.add(sbe);
                        }
                    }
                }
            }
        }

        NativeImage image = bhTexture.getImage();
        int count = Math.min(blackHoles.size(), 64);
        Vector4f clipPos = new Vector4f();

        float fovRad = (float) Math.toRadians(client.options.getFov().getValue());
        BlackHoleShader.tanHalfFov = (float) Math.tan(fovRad * 0.5);

        for (int i = 0; i < 64; i++) {
            if (i < count) {
                SingularityBlockEntity sbe = blackHoles.get(i);
                Vec3d pos = Vec3d.ofCenter(sbe.getPos());
                float rx = (float) (pos.x - cameraPos.x);
                float ry = (float) (pos.y - cameraPos.y);
                float rz = (float) (pos.z - cameraPos.z);

                clipPos.set(rx, ry, rz, 1.0f);
                clipPos.mul(mvpMatrix);

                if (clipPos.w <= 0.0f) {
                    for (int ray = 0; ray < 5; ray++) image.setColor(i, ray, 0);
                    continue;
                }

                double r_s = SingularityBlockEntity.getSchwarzschildRadius(sbe.getMass());
                float distance = (float) Math.sqrt(rx * rx + ry * ry + rz * rz);
                float uvRadius = (float) (r_s / distance / tanHalfFov) * 0.5f;

                float cosYaw = (float) Math.cos(Math.toRadians(client.gameRenderer.getCamera().getYaw()));
                float sinYaw = (float) Math.sin(Math.toRadians(client.gameRenderer.getCamera().getYaw()));
                Vec3d right = new Vec3d(cosYaw, 0, sinYaw);
                Vec3d up = new Vec3d(0, 1, 0);
                Vec3d[] offsets = {
                    Vec3d.ZERO,
                    right.multiply(0.4),
                    right.multiply(-0.4),
                    up.multiply(0.4),
                    up.multiply(-0.4)
                };

                for (int ray = 0; ray < 5; ray++) {
                    Vec3d sample = pos.add(offsets[ray]);
                    float srx = (float) (sample.x - cameraPos.x);
                    float sry = (float) (sample.y - cameraPos.y);
                    float srz = (float) (sample.z - cameraPos.z);

                    Vector4f sclip = new Vector4f(srx, sry, srz, 1.0f);
                    sclip.mul(mvpMatrix);

                    if (sclip.w <= 0.0f) {
                        image.setColor(i, ray, 0);
                        continue;
                    }

                    float sndcX = sclip.x / sclip.w;
                    float sndcY = -(sclip.y / sclip.w);
                    float suvX = sndcX * 0.5f + 0.5f;
                    float suvY = 0.5f - sndcY * 0.5f;

                    boolean blocked = false;
                    if (distance > 0.01f) {
                        BlockHitResult hitResult = client.world.raycast(new RaycastContext(
                            cameraPos, sample,
                            RaycastContext.ShapeType.COLLIDER,
                            RaycastContext.FluidHandling.NONE,
                            client.player
                        ));
                        if (hitResult.getType() == HitResult.Type.BLOCK
                            && !hitResult.getBlockPos().equals(sbe.getPos())) {
                            blocked = true;
                        }
                    }

                    int sr = (int) (suvX * 255) & 0xFF;
                    int sg = (int) (suvY * 255) & 0xFF;
                    int sb = (int) (Math.min(uvRadius * 255.0f, 255.0f)) & 0xFF;
                    int sa = blocked ? 0 : 255;
                    image.setColor(i, ray, (sa << 24) | (sb << 16) | (sg << 8) | sr);
                }
            } else {
                for (int ray = 0; ray < 5; ray++) image.setColor(i, ray, 0);
            }
        }
        bhTexture.upload();

        bhCount = count;
    }

    public static void flushUniforms(JsonEffectShaderProgram prog) {
        if (prog == null) return;

        var countUni = prog.getUniformByName("u_blackHoleCount");
        if (countUni == null) return;

        if (bhTexture == null) return;

        prog.bindSampler("u_blackHoleData", () -> bhTexture.getGlId());
        countUni.set(bhCount);

        var fovUni = prog.getUniformByName("u_tanHalfFov");
        if (fovUni != null) fovUni.set(tanHalfFov);
    }
}
