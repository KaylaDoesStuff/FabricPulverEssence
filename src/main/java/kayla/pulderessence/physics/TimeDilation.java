package kayla.pulderessence.physics;

import kayla.pulderessence.PulderEssence;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TimeDilation {

    // dτ/dt = sqrt(1 - r_s/r) — standard Schwarzschild metric time dilation.
    // r_s = 2GM/c² in physical units; here r_s = mass * R_S_PER_MASS in blocks.
    private static final double R_S_PER_MASS = 1.0;

    private static final Map<RegistryKey<World>, List<MassSource>> MASS_SOURCES = new ConcurrentHashMap<>();
    private static final Map<RegistryKey<World>, Map<BlockPos, Double>> BLOCK_ACCUMULATORS = new ConcurrentHashMap<>();

    private TimeDilation() {}

    private static RegistryKey<World> key(World world) {
        return world.getRegistryKey();
    }

    public static void addSource(World world, BlockPos pos, double mass) {
        double r_s = mass * R_S_PER_MASS;
        PulderEssence.LOGGER.info("TimeDilation: addSource at {} with mass={} (r_s={})", pos, mass, r_s);
        List<MassSource> sources = MASS_SOURCES.computeIfAbsent(key(world), k -> Collections.synchronizedList(new ArrayList<>()));
        synchronized (sources) {
            sources.removeIf(s -> s.pos.equals(pos));
            sources.add(new MassSource(pos, mass));
        }
    }

    public static void removeSource(World world, BlockPos pos) {
        PulderEssence.LOGGER.info("TimeDilation: removeSource at {}", pos);
        List<MassSource> sources = MASS_SOURCES.get(key(world));
        if (sources != null) {
            synchronized (sources) {
                sources.removeIf(s -> s.pos.equals(pos));
            }
            Map<BlockPos, Double> accMap = BLOCK_ACCUMULATORS.get(key(world));
            if (accMap != null) {
                accMap.remove(pos);
            }
        }
    }

    // -----------------------------------------------------------------------
    //  Schwarzschild time dilation
    // -----------------------------------------------------------------------

    /**
     * Returns the factor dτ/dt = sqrt(1 - Σ(r_s_i / r_i)) for the entity at {@code pos}.
     * Clamped to [0.01, 1.0].
     */
    public static double getDilationFactor(World world, Vec3d pos) {
        List<MassSource> sources = MASS_SOURCES.get(key(world));
        if (sources == null || sources.isEmpty()) {
            return 1.0;
        }

        double sum = 0.0;
        synchronized (sources) {
            for (MassSource source : sources) {
                double dist = pos.distanceTo(Vec3d.ofCenter(source.pos));
                if (dist < 0.1) dist = 0.1;
                double r_s = source.mass * R_S_PER_MASS;
                sum += r_s / dist;
            }
        }
        if (sum <= 0) return 1.0;
        return Math.max(0.01, Math.sqrt(Math.max(0, 1.0 - sum)));
    }

    /**
     * Returns the Schwarzschild radius in blocks for a mass source at {@code pos},
     * or 0 if no source exists there.
     */
    public static double getSchwarzschildRadius(World world, BlockPos pos) {
        List<MassSource> sources = MASS_SOURCES.get(key(world));
        if (sources == null) return 0;
        synchronized (sources) {
            for (MassSource s : sources) {
                if (s.pos.equals(pos)) return s.mass * R_S_PER_MASS;
            }
        }
        return 0;
    }

    /**
     * Returns all mass sources visible to the renderer / shader pipeline.
     */
    public static List<SchwarzschildSource> getSources(World world) {
        List<MassSource> sources = MASS_SOURCES.get(key(world));
        if (sources == null) return List.of();
        List<SchwarzschildSource> result = new ArrayList<>();
        synchronized (sources) {
            for (MassSource s : sources) {
                result.add(new SchwarzschildSource(s.pos, s.mass * R_S_PER_MASS));
            }
        }
        return result;
    }

    // -----------------------------------------------------------------------
    //  Block-entity tick accumulation (for tick-skipping)
    // -----------------------------------------------------------------------

    public static double accumulateBlockEntityTick(World world, BlockPos pos) {
        double factor = getDilationFactor(world, Vec3d.ofCenter(pos));
        if (factor >= 1.0) return 1.0;

        Map<BlockPos, Double> accMap = BLOCK_ACCUMULATORS.computeIfAbsent(key(world), k -> new ConcurrentHashMap<>());
        double acc = accMap.getOrDefault(pos, 0.0);
        acc += factor;
        if (acc >= 1.0) {
            acc -= 1.0;
            accMap.put(pos, acc);
            return 1.0;
        }
        accMap.put(pos, acc);
        return 0.0;
    }

    // -----------------------------------------------------------------------
    //  Data records
    // -----------------------------------------------------------------------

    private record MassSource(BlockPos pos, double mass) {}

    /** Public record exposed to the renderer. */
    public record SchwarzschildSource(BlockPos pos, double r_s) {}
}
