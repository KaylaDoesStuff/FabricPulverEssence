package kayla.pulderessence.world;

import kayla.pulderessence.PulderEssence;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> MYTHRIL_ORE_PLACED_KEY = registerKey("mythril_ore_placed");
    public static final RegistryKey<PlacedFeature> INDIUM_ORE_PLACED_KEY = registerKey("indium_ore_placed");
    public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MYTHRIL_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.MYTHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(32))));
        register(context, INDIUM_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.INDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(20))));

        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(16))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(PulderEssence.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
