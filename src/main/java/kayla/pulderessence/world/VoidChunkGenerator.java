package kayla.pulderessence.world;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.BiomeAccess;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.biome.source.FixedBiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.Blender;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.VerticalBlockSample;
import net.minecraft.world.gen.noise.NoiseConfig;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class VoidChunkGenerator extends ChunkGenerator {

    // ✅ FIXED: Codec that expects a FixedBiomeSource, then casts to BiomeSource for the superclass
    public static final Codec<VoidChunkGenerator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    FixedBiomeSource.CODEC.fieldOf("biome_source").forGetter(generator -> (FixedBiomeSource) generator.biomeSource)
            ).apply(instance, VoidChunkGenerator::new)
    );

    public VoidChunkGenerator(FixedBiomeSource biomeSource) {
        super(biomeSource); // biomeSource is automatically upcast to BiomeSource
    }

    // Factory method to create an instance from a Biome registry
    public static VoidChunkGenerator create(net.minecraft.registry.Registry<Biome> biomeRegistry) {
        RegistryEntry<Biome> voidBiome = biomeRegistry.getEntry(BiomeKeys.THE_VOID)
                .orElseThrow();
        FixedBiomeSource fixedBiomeSource = new FixedBiomeSource(voidBiome);
        return new VoidChunkGenerator(fixedBiomeSource);
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

    // --- Void world generation overrides (all no-ops) ---
    @Override
    public void carve(ChunkRegion chunkRegion, long seed, NoiseConfig noiseConfig,
                      BiomeAccess world, StructureAccessor structureAccessor, Chunk chunk,
                      GenerationStep.Carver carverStep) {
        // No carving
    }

    @Override
    public void buildSurface(ChunkRegion region, StructureAccessor structures,
                             NoiseConfig noiseConfig, Chunk chunk) {
        // No surface
    }

    @Override
    public void populateEntities(ChunkRegion region) {
        // No passive mob spawning
    }

    @Override
    public CompletableFuture<Chunk> populateNoise(Executor executor, Blender blender,
                                                  NoiseConfig noiseConfig,
                                                  StructureAccessor structureAccessor,
                                                  Chunk chunk) {
        // The core void generation: do nothing, return empty chunk
        return CompletableFuture.completedFuture(chunk);
    }

    @Override
    public int getWorldHeight() {
        return 384;
    }

    @Override
    public int getSeaLevel() {
        return 0;
    }

    @Override
    public int getMinimumY() {
        return -64;
    }

    @Override
    public int getHeight(int x, int z, Heightmap.Type heightmap, HeightLimitView world,
                         NoiseConfig noiseConfig) {
        return 0;
    }

    @Override
    public VerticalBlockSample getColumnSample(int x, int z, HeightLimitView world,
                                               NoiseConfig noiseConfig) {
        // Return an empty column sample
        return new VerticalBlockSample(0, new net.minecraft.block.BlockState[0]);
    }

    @Override
    public void getDebugHudText(List<String> text, NoiseConfig noiseConfig, BlockPos pos) {
        text.add("Generator: VoidChunkGenerator (Pulderessence)");
    }
}