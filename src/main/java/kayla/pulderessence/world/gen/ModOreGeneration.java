package kayla.pulderessence.world.gen;

import kayla.pulderessence.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        ModPlacedFeatures.getAllPlacedKeys().forEach(key ->
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, key));
    }
}
