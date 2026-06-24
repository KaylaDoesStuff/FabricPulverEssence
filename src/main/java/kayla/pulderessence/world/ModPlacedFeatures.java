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

import java.util.ArrayList;
import java.util.List;

public class ModPlacedFeatures {

    private static final List<RegistryKey<PlacedFeature>> PLACED_KEYS = new ArrayList<>();

    public static List<RegistryKey<PlacedFeature>> getAllPlacedKeys() {
        return PLACED_KEYS;
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(PulderEssence.MOD_ID, name));
    }

    public static void boostrap(Registerable<PlacedFeature> context) {
        registerSmeltable(context);
        registerUlv(context);
        registerMlv(context);
        registerLvMv(context);
        registerHvShv(context);
        registerUhvVhv(context);
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, int count, PlacementModifier height) {
        PLACED_KEYS.add(key);
        context.register(key, new PlacedFeature(configuration, ModOrePlacement.modifiersWithCount(count, height)));
    }

    private static void placeVein(Registerable<PlacedFeature> context, String veinPrefix, int count, PlacementModifier height, String... oreSuffixes) {
        var lookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        for (String suffix : oreSuffixes) {
            String keyName = veinPrefix + "_" + suffix;
            register(context, registerKey(keyName + "_placed"), lookup.getOrThrow(ModConfiguredFeatures.getKey(keyName)), count, height);
        }
    }

    private static void registerSmeltable(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(72));
        placeVein(context, "iron", 8, height, "hematite", "magnetite");
        placeVein(context, "copper", 8, height, "chalcopyrite", "sphalerite", "galena");
        placeVein(context, "tin_tungsten", 8, height, "cassiterite", "wolframite");
        placeVein(context, "nickel_cobalt", 8, height, "pentlandite", "cobaltite");
        placeVein(context, "coal", 8, height, "anthracite");
        placeVein(context, "antimony", 8, height, "stibnite");
    }

    private static void registerUlv(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(48));
        placeVein(context, "gold_silver", 6, height, "native_gold", "argentite", "calaverite");
        placeVein(context, "mercury_bismuth", 6, height, "cinnabar", "bismuthinite");
        placeVein(context, "saltpeter", 6, height, "nitratite");
    }

    private static void registerMlv(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32));
        placeVein(context, "bauxite_lithium", 5, height, "bauxite", "spodumene", "lepidolite");
        placeVein(context, "salt_evaporite", 5, height, "halite", "sylvite");
        placeVein(context, "magnesium", 5, height, "magnesite", "dolomite");
        placeVein(context, "beryllium_caesium", 5, height, "beryl", "pollucite");
        placeVein(context, "strontium_barium", 5, height, "celestine", "barite");
        placeVein(context, "silver_halide", 5, height, "iodyrite", "bromyrite");
        placeVein(context, "fluorite", 5, height, "fluorite");
    }

    private static void registerLvMv(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-16));
        placeVein(context, "titanium_chromium", 3, height, "ilmenite", "chromite", "pyrolusite");
        placeVein(context, "niobium_tantalum", 3, height, "columbite", "tantalite", "zircon");
        placeVein(context, "vanadium_molybdenum", 3, height, "vanadinite", "molybdenite", "rheniite");
        placeVein(context, "silicon_boron", 3, height, "quartz", "kernite");
        placeVein(context, "phosphate_ree", 3, height, "apatite", "monazite", "xenotime");
        placeVein(context, "uranium_thorium", 3, height, "uraninite", "thorite", "bastnaesite");
    }

    private static void registerHvShv(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-32));
        placeVein(context, "platinum_group", 2, height, "sperrylite", "iridosmine", "laurite");
        placeVein(context, "palladium_rhodium", 2, height, "stibiopalladinite", "hollingsworthite", "clausthalite");
        placeVein(context, "scandium", 2, height, "thortveitite");
        placeVein(context, "mythril_naquadah", 2, height, "mythrilite", "naquadite");
    }

    private static void registerUhvVhv(Registerable<PlacedFeature> context) {
        var height = HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-48));
        placeVein(context, "naquadrium", 1, height, "naquadriate");
        placeVein(context, "energite_eridium", 1, height, "energite", "eridium_vein");
    }
}
