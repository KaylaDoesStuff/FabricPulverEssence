package kayla.pulderessence.world;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static RegistryKey<ConfiguredFeature<?, ?>> getKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PulderEssence.MOD_ID, name));
    }

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stone = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslate = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        registerSmeltable(context, stone, deepslate);
        registerUlv(context, stone, deepslate);
        registerMlv(context, stone, deepslate);
        registerLvMv(context, stone, deepslate);
        registerHvShv(context, stone, deepslate);
        registerUhvVhv(context, stone, deepslate);
    }

    private static void registerOre(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate, String keyName, Block block, Block deepslateBlock, int veinSize) {
        List<OreFeatureConfig.Target> targets = List.of(
                OreFeatureConfig.createTarget(stone, block.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, deepslateBlock.getDefaultState())
        );
        context.register(getKey(keyName), new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(targets, veinSize)));
    }

    private static void registerVein(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate, String veinPrefix, VeinEntry... entries) {
        for (VeinEntry entry : entries) {
            registerOre(context, stone, deepslate, veinPrefix + "_" + entry.name, entry.block, entry.deepslateBlock, entry.veinSize);
        }
    }

    private record VeinEntry(String name, Block block, Block deepslateBlock, int veinSize) {}

    private static void registerSmeltable(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "iron",
                new VeinEntry("hematite", ModBlocks.get("hematite_ore"), ModBlocks.get("deepslate_hematite_ore"), 9),
                new VeinEntry("magnetite", ModBlocks.get("magnetite_ore"), ModBlocks.get("deepslate_magnetite_ore"), 6)
        );
        registerVein(context, stone, deepslate, "copper",
                new VeinEntry("chalcopyrite", ModBlocks.get("chalcopyrite_ore"), ModBlocks.get("deepslate_chalcopyrite_ore"), 7),
                new VeinEntry("sphalerite", ModBlocks.get("sphalerite_ore"), ModBlocks.get("deepslate_sphalerite_ore"), 5),
                new VeinEntry("galena", ModBlocks.get("galena_ore"), ModBlocks.get("deepslate_galena_ore"), 3)
        );
        registerVein(context, stone, deepslate, "tin_tungsten",
                new VeinEntry("cassiterite", ModBlocks.get("cassiterite_ore"), ModBlocks.get("deepslate_cassiterite_ore"), 6),
                new VeinEntry("wolframite", ModBlocks.get("wolframite_ore"), ModBlocks.get("deepslate_wolframite_ore"), 4)
        );
        registerVein(context, stone, deepslate, "nickel_cobalt",
                new VeinEntry("pentlandite", ModBlocks.get("pentlandite_ore"), ModBlocks.get("deepslate_pentlandite_ore"), 6),
                new VeinEntry("cobaltite", ModBlocks.get("cobaltite_ore"), ModBlocks.get("deepslate_cobaltite_ore"), 4)
        );
        registerVein(context, stone, deepslate, "coal",
                new VeinEntry("anthracite", ModBlocks.get("anthracite_ore"), ModBlocks.get("deepslate_anthracite_ore"), 9)
        );
        registerVein(context, stone, deepslate, "antimony",
                new VeinEntry("stibnite", ModBlocks.get("stibnite_ore"), ModBlocks.get("deepslate_stibnite_ore"), 5)
        );
    }

    private static void registerUlv(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "gold_silver",
                new VeinEntry("native_gold", ModBlocks.get("native_gold_ore"), ModBlocks.get("deepslate_native_gold_ore"), 5),
                new VeinEntry("argentite", ModBlocks.get("argentite_ore"), ModBlocks.get("deepslate_argentite_ore"), 4),
                new VeinEntry("calaverite", ModBlocks.get("calaverite_ore"), ModBlocks.get("deepslate_calaverite_ore"), 2)
        );
        registerVein(context, stone, deepslate, "mercury_bismuth",
                new VeinEntry("cinnabar", ModBlocks.get("cinnabar_ore"), ModBlocks.get("deepslate_cinnabar_ore"), 4),
                new VeinEntry("bismuthinite", ModBlocks.get("bismuthinite_ore"), ModBlocks.get("deepslate_bismuthinite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "saltpeter",
                new VeinEntry("nitratite", ModBlocks.get("nitratite_ore"), ModBlocks.get("deepslate_nitratite_ore"), 6)
        );
    }

    private static void registerMlv(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "bauxite_lithium",
                new VeinEntry("bauxite", ModBlocks.get("bauxite_ore"), ModBlocks.get("deepslate_bauxite_ore"), 6),
                new VeinEntry("spodumene", ModBlocks.get("spodumene_ore"), ModBlocks.get("deepslate_spodumene_ore"), 4),
                new VeinEntry("lepidolite", ModBlocks.get("lepidolite_ore"), ModBlocks.get("deepslate_lepidolite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "salt_evaporite",
                new VeinEntry("halite", ModBlocks.get("halite_ore"), ModBlocks.get("deepslate_halite_ore"), 5),
                new VeinEntry("sylvite", ModBlocks.get("sylvite_ore"), ModBlocks.get("deepslate_sylvite_ore"), 4)
        );
        registerVein(context, stone, deepslate, "magnesium",
                new VeinEntry("magnesite", ModBlocks.get("magnesite_ore"), ModBlocks.get("deepslate_magnesite_ore"), 5),
                new VeinEntry("dolomite", ModBlocks.get("dolomite_ore"), ModBlocks.get("deepslate_dolomite_ore"), 4)
        );
        registerVein(context, stone, deepslate, "beryllium_caesium",
                new VeinEntry("beryl", ModBlocks.get("beryl_ore"), ModBlocks.get("deepslate_beryl_ore"), 4),
                new VeinEntry("pollucite", ModBlocks.get("pollucite_ore"), ModBlocks.get("deepslate_pollucite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "strontium_barium",
                new VeinEntry("celestine", ModBlocks.get("celestine_ore"), ModBlocks.get("deepslate_celestine_ore"), 4),
                new VeinEntry("barite", ModBlocks.get("barite_ore"), ModBlocks.get("deepslate_barite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "silver_halide",
                new VeinEntry("iodyrite", ModBlocks.get("iodyrite_ore"), ModBlocks.get("deepslate_iodyrite_ore"), 3),
                new VeinEntry("bromyrite", ModBlocks.get("bromyrite_ore"), ModBlocks.get("deepslate_bromyrite_ore"), 2)
        );
        registerVein(context, stone, deepslate, "fluorite",
                new VeinEntry("fluorite", ModBlocks.get("fluorite_ore"), ModBlocks.get("deepslate_fluorite_ore"), 5)
        );
    }

    private static void registerLvMv(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "titanium_chromium",
                new VeinEntry("ilmenite", ModBlocks.get("ilmenite_ore"), ModBlocks.get("deepslate_ilmenite_ore"), 5),
                new VeinEntry("chromite", ModBlocks.get("chromite_ore"), ModBlocks.get("deepslate_chromite_ore"), 4),
                new VeinEntry("pyrolusite", ModBlocks.get("pyrolusite_ore"), ModBlocks.get("deepslate_pyrolusite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "niobium_tantalum",
                new VeinEntry("columbite", ModBlocks.get("columbite_ore"), ModBlocks.get("deepslate_columbite_ore"), 4),
                new VeinEntry("tantalite", ModBlocks.get("tantalite_ore"), ModBlocks.get("deepslate_tantalite_ore"), 3),
                new VeinEntry("zircon", ModBlocks.get("zircon_ore"), ModBlocks.get("deepslate_zircon_ore"), 2)
        );
        registerVein(context, stone, deepslate, "vanadium_molybdenum",
                new VeinEntry("vanadinite", ModBlocks.get("vanadinite_ore"), ModBlocks.get("deepslate_vanadinite_ore"), 4),
                new VeinEntry("molybdenite", ModBlocks.get("molybdenite_ore"), ModBlocks.get("deepslate_molybdenite_ore"), 3),
                new VeinEntry("rheniite", ModBlocks.get("rheniite_ore"), ModBlocks.get("deepslate_rheniite_ore"), 2)
        );
        registerVein(context, stone, deepslate, "silicon_boron",
                new VeinEntry("quartz", ModBlocks.get("quartz_ore"), ModBlocks.get("deepslate_quartz_ore"), 6),
                new VeinEntry("kernite", ModBlocks.get("kernite_ore"), ModBlocks.get("deepslate_kernite_ore"), 4)
        );
        registerVein(context, stone, deepslate, "phosphate_ree",
                new VeinEntry("apatite", ModBlocks.get("apatite_ore"), ModBlocks.get("deepslate_apatite_ore"), 5),
                new VeinEntry("monazite", ModBlocks.get("monazite_ore"), ModBlocks.get("deepslate_monazite_ore"), 3),
                new VeinEntry("xenotime", ModBlocks.get("xenotime_ore"), ModBlocks.get("deepslate_xenotime_ore"), 2)
        );
        registerVein(context, stone, deepslate, "uranium_thorium",
                new VeinEntry("uraninite", ModBlocks.get("uraninite_ore"), ModBlocks.get("deepslate_uraninite_ore"), 4),
                new VeinEntry("thorite", ModBlocks.get("thorite_ore"), ModBlocks.get("deepslate_thorite_ore"), 3),
                new VeinEntry("bastnaesite", ModBlocks.get("bastnaesite_ore"), ModBlocks.get("deepslate_bastnaesite_ore"), 2)
        );
    }

    private static void registerHvShv(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "platinum_group",
                new VeinEntry("sperrylite", ModBlocks.get("sperrylite_ore"), ModBlocks.get("deepslate_sperrylite_ore"), 4),
                new VeinEntry("iridosmine", ModBlocks.get("iridosmine_ore"), ModBlocks.get("deepslate_iridosmine_ore"), 3),
                new VeinEntry("laurite", ModBlocks.get("laurite_ore"), ModBlocks.get("deepslate_laurite_ore"), 2)
        );
        registerVein(context, stone, deepslate, "palladium_rhodium",
                new VeinEntry("stibiopalladinite", ModBlocks.get("stibiopalladinite_ore"), ModBlocks.get("deepslate_stibiopalladinite_ore"), 3),
                new VeinEntry("hollingsworthite", ModBlocks.get("hollingsworthite_ore"), ModBlocks.get("deepslate_hollingsworthite_ore"), 2),
                new VeinEntry("clausthalite", ModBlocks.get("clausthalite_ore"), ModBlocks.get("deepslate_clausthalite_ore"), 2)
        );
        registerVein(context, stone, deepslate, "scandium",
                new VeinEntry("thortveitite", ModBlocks.get("thortveitite_ore"), ModBlocks.get("deepslate_thortveitite_ore"), 3)
        );
        registerVein(context, stone, deepslate, "mythril_naquadah",
                new VeinEntry("mythrilite", ModBlocks.get("mythrilite_ore"), ModBlocks.get("deepslate_mythrilite_ore"), 4),
                new VeinEntry("naquadite", ModBlocks.get("naquadite_ore"), ModBlocks.get("deepslate_naquadite_ore"), 3)
        );
    }

    private static void registerUhvVhv(Registerable<ConfiguredFeature<?, ?>> context, RuleTest stone, RuleTest deepslate) {
        registerVein(context, stone, deepslate, "naquadrium",
                new VeinEntry("naquadriate", ModBlocks.get("naquadriate_ore"), ModBlocks.get("deepslate_naquadriate_ore"), 3)
        );
        registerVein(context, stone, deepslate, "energite_eridium",
                new VeinEntry("energite", ModBlocks.get("energite_ore"), ModBlocks.get("deepslate_energite_ore"), 3),
                new VeinEntry("eridium_vein", ModBlocks.get("eridium_vein_ore"), ModBlocks.get("deepslate_eridium_vein_ore"), 2)
        );
    }
}
