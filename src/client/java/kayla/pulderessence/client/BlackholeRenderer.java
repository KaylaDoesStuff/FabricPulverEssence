package kayla.pulderessence.client;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.mixin.PostEffectProcessorAccessor;
import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.gl.JsonEffectShaderProgram;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.Camera;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BlackholeRenderer {
    private static final Identifier SHADER_LOCATION = new Identifier("pulderessence", "shaders/post/blackhole.json");

    private PostEffectProcessor shader;
    private boolean active;

    public void tick(float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        World world = client.world;
        if (world == null) { active = false; return; }

        var sources = TimeDilation.getSources(world);
        if (sources.isEmpty()) { active = false; return; }

        if (shader == null) {
            try {
                shader = new PostEffectProcessor(
                    client.getTextureManager(),
                    client.getResourceManager(),
                    client.getFramebuffer(),
                    SHADER_LOCATION
                );
                shader.setupDimensions(
                    client.getWindow().getFramebufferWidth(),
                    client.getWindow().getFramebufferHeight()
                );
            } catch (Exception e) {
                PulderEssence.LOGGER.error("Failed to load blackhole shader", e);
                active = false;
                return;
            }
        }

        Camera camera = client.gameRenderer.getCamera();
        var passes = ((PostEffectProcessorAccessor) shader).getPasses();
        if (passes.isEmpty()) { active = false; return; }

        JsonEffectShaderProgram program = passes.get(0).getProgram();

        Vec3d camPos = camera.getPos();
        float yaw = camera.getYaw();
        float pitch = camera.getPitch();
        float fov = client.options.getFov().getValue().floatValue();
        float aspect = (float) client.getWindow().getFramebufferWidth()
                     / (float) client.getWindow().getFramebufferHeight();

        double yawRad = Math.toRadians(yaw);
        double pitchRad = Math.toRadians(pitch);
        double cosY = Math.cos(yawRad), sinY = Math.sin(yawRad);
        double cosP = Math.cos(pitchRad), sinP = Math.sin(pitchRad);
        float fovRad = (float) Math.toRadians(fov / 2.0);
        float radToUV = 1.0f / (2.0f * fovRad);

        TimeDilation.SchwarzschildSource best = null;
        float bestUX = 0, bestUY = 0;
        float bestEventHorizonUV = 0, bestEinsteinRadiusUV = 0;
        double bestScore = -1;

        for (var source : sources) {
            double dx = source.pos().getX() + 0.5 - camPos.x;
            double dy = source.pos().getY() + 0.5 - camPos.y;
            double dz = source.pos().getZ() + 0.5 - camPos.z;
            double dist = Math.sqrt(dx * dx + dy * dy + dz * dz);
            if (dist < 0.1) continue;

            // Right: (-cosY, 0, -sinY), Up: (-sinY*sinP, cosP, cosY*sinP), Forward: (-sinY*cosP, -sinP, cosY*cosP)
            double vx = -dx * cosY - dz * sinY;
            double vy = dx * (-sinY * sinP) + dy * cosP + dz * (cosY * sinP);
            double vz = dx * sinY * cosP + dy * sinP - dz * cosY * cosP;

            if (vz >= 0.0) continue;

            float horizontalHalfFovRad = (float) Math.atan(Math.tan(fovRad) * aspect);
            float horizontalRadToUV = 1.0f / (2.0f * horizontalHalfFovRad);
            float ux = (float) (Math.atan2(vx, -vz) * horizontalRadToUV) + 0.5f;
            float uy = (float) (Math.atan2(vy, -vz) * radToUV) + 0.5f;

            if (ux < -0.1f || ux > 1.1f || uy < -0.1f || uy > 1.1f) continue;

            double r_s = source.r_s();
            double eventHorizonUV = (r_s / dist) * radToUV;
            double einsteinRadiusUV = Math.sqrt(2.0 * r_s / dist) * radToUV;

            // Score by angular impact — larger Einstein radius = more visible
            double score = einsteinRadiusUV;
            if (score > bestScore) {
                bestScore = score;
                best = source;
                bestUX = ux;
                bestUY = uy;
                bestEventHorizonUV = (float) eventHorizonUV;
                bestEinsteinRadiusUV = (float) einsteinRadiusUV;
            }
        }

        if (best == null) { active = false; return; }

        float photonSphereUV = bestEventHorizonUV * 1.5f;

        setUniform(program, "u_blackHolePos", bestUX, bestUY);
        setUniform(program, "u_eventHorizon", bestEventHorizonUV);
        setUniform(program, "u_einsteinRadius", bestEinsteinRadiusUV);
        setUniform(program, "u_photonSphereRadius", photonSphereUV);
        setUniform(program, "u_gravityStrength", 1.0f);
        active = true;
    }

    public void render(float tickDelta) {
        if (shader != null && active) {
            try {
                RenderSystem.disableCull();
                shader.render(tickDelta);
                RenderSystem.enableCull();
            } catch (Exception e) {
                PulderEssence.LOGGER.error("Blackhole shader render error", e);
            }
        }
    }

    public void close() {
        if (shader != null) {
            shader.close();
            shader = null;
        }
    }

    private static void setUniform(JsonEffectShaderProgram program, String name, float a, float b) {
        GlUniform u = program.getUniformByName(name);
        if (u != null) u.set(a, b);
    }

    private static void setUniform(JsonEffectShaderProgram program, String name, float a) {
        GlUniform u = program.getUniformByName(name);
        if (u != null) u.set(a);
    }
}
