package kayla.pulderessence.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;


public class ModNetherRegion extends Region {
    public ModNetherRegion(Identifier name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
                                RegistryKey<Biome>>> mapper) {
        this.addBiome(mapper, MultiNoiseUtil.ParameterRange.of(0.5F),
                MultiNoiseUtil.ParameterRange.of(0.5F),
                MultiNoiseUtil.ParameterRange.of(1.0F),
                MultiNoiseUtil.ParameterRange.of(0.5F),
                MultiNoiseUtil.ParameterRange.of(-0.5F),
                MultiNoiseUtil.ParameterRange.of(1.0F),
                0.375F, ModBiomes.PULVERENT_BIOME);
        }
    }

