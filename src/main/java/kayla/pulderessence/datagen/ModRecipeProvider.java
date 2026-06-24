package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> HEMATITE_SMELTABLES = List.of(ModOres.get("hematite"), ModBlocks.get("hematite_ore"), ModBlocks.get("deepslate_hematite_ore"));
    private static final List<ItemConvertible> MAGNETITE_SMELTABLES = List.of(ModOres.get("magnetite"), ModBlocks.get("magnetite_ore"), ModBlocks.get("deepslate_magnetite_ore"));
    private static final List<ItemConvertible> CHALCOPYRITE_SMELTABLES = List.of(ModOres.get("chalcopyrite"), ModBlocks.get("chalcopyrite_ore"), ModBlocks.get("deepslate_chalcopyrite_ore"));
    private static final List<ItemConvertible> SPHALERITE_SMELTABLES = List.of(ModOres.get("sphalerite"), ModBlocks.get("sphalerite_ore"), ModBlocks.get("deepslate_sphalerite_ore"));
    private static final List<ItemConvertible> CASSITERITE_SMELTABLES = List.of(ModOres.get("cassiterite"), ModBlocks.get("cassiterite_ore"), ModBlocks.get("deepslate_cassiterite_ore"));
    private static final List<ItemConvertible> PENTLANDITE_SMELTABLES = List.of(ModOres.get("pentlandite"), ModBlocks.get("pentlandite_ore"), ModBlocks.get("deepslate_pentlandite_ore"));
    private static final List<ItemConvertible> GALENA_SMELTABLES = List.of(ModOres.get("galena"), ModBlocks.get("galena_ore"), ModBlocks.get("deepslate_galena_ore"));
    private static final List<ItemConvertible> COBALTITE_SMELTABLES = List.of(ModOres.get("cobaltite"), ModBlocks.get("cobaltite_ore"), ModBlocks.get("deepslate_cobaltite_ore"));
    private static final List<ItemConvertible> STIBNITE_SMELTABLES = List.of(ModOres.get("stibnite"), ModBlocks.get("stibnite_ore"), ModBlocks.get("deepslate_stibnite_ore"));

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    private void chargingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .pattern("IFF")
                .pattern("FF ")
                .input('I', input)
                .input('F', ModDusts.get("faerie_dust"))
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private void convertableNuggetIngot(Consumer<RecipeJsonProvider> exporter, Item ingot, Item nugget) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, nugget, 9)
                .input(ingot, 1)
                .criterion(hasItem(ingot), conditionsFromItem(ingot))
                .offerTo(exporter, new Identifier(nugget.getTranslationKey() + "s_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ingot, 1)
                .input(nugget, 9)
                .criterion(hasItem(nugget), conditionsFromItem(nugget))
                .offerTo(exporter, new Identifier(ingot.getTranslationKey() + "_from_nugget"));
    }

    private void rodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible item, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .pattern("M")
                .pattern("M")
                .input('M', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    @Override    
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, HEMATITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("iron_ingot"), 0.7f, 200, "hematite");
        offerBlasting(exporter, HEMATITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("iron_ingot"), 0.7f, 100, "hematite");

        offerSmelting(exporter, MAGNETITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("iron_ingot"), 0.7f, 200, "magnetite");
        offerBlasting(exporter, MAGNETITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("iron_ingot"), 0.7f, 100, "magnetite");

        offerSmelting(exporter, CHALCOPYRITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("copper_ingot"), 0.7f, 200, "chalcopyrite");
        offerBlasting(exporter, CHALCOPYRITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("copper_ingot"), 0.7f, 100, "chalcopyrite");

        offerSmelting(exporter, SPHALERITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("zinc_ingot"), 0.7f, 200, "sphalerite");
        offerBlasting(exporter, SPHALERITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("zinc_ingot"), 0.7f, 100, "sphalerite");

        offerSmelting(exporter, CASSITERITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("tin_ingot"), 0.7f, 200, "cassiterite");
        offerBlasting(exporter, CASSITERITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("tin_ingot"), 0.7f, 100, "cassiterite");

        offerSmelting(exporter, PENTLANDITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("nickel_ingot"), 0.7f, 200, "pentlandite");
        offerBlasting(exporter, PENTLANDITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("nickel_ingot"), 0.7f, 100, "pentlandite");

        offerSmelting(exporter, GALENA_SMELTABLES, RecipeCategory.MISC, ModIngots.get("lead_ingot"), 0.7f, 200, "galena");
        offerBlasting(exporter, GALENA_SMELTABLES, RecipeCategory.MISC, ModIngots.get("lead_ingot"), 0.7f, 100, "galena");

        offerSmelting(exporter, COBALTITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("cobalt_ingot"), 0.7f, 200, "cobaltite");
        offerBlasting(exporter, COBALTITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("cobalt_ingot"), 0.7f, 100, "cobaltite");

        offerSmelting(exporter, STIBNITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("antimony_ingot"), 0.7f, 200, "stibnite");
        offerBlasting(exporter, STIBNITE_SMELTABLES, RecipeCategory.MISC, ModIngots.get("antimony_ingot"), 0.7f, 100, "stibnite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("mythril_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("mythril_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("yttrium_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("yttrium_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("lead_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("lead_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("silver_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("silver_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("indium_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("indium_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModIngots.get("tungsten_ingot"), RecipeCategory.DECORATIONS, ModBlocks.get("tungsten_block"));
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModCraftingItems.get("energium_shard"), RecipeCategory.DECORATIONS, ModBlocks.get("energium_block"));

        rodRecipe(exporter, ModIngots.get("mythril_ingot"), ModRods.get("mythril_rod"));
        rodRecipe(exporter, ModIngots.get("yttrium_ingot"), ModRods.get("yttrium_rod"));
        rodRecipe(exporter, ModIngots.get("indium_ingot"), ModRods.get("indium_rod"));
        rodRecipe(exporter, ModIngots.get("tungsten_ingot"), ModRods.get("tungsten_rod"));
        rodRecipe(exporter, ModIngots.get("energium_ingot"), ModRods.get("energium_rod"));
        rodRecipe(exporter, ModIngots.get("silver_ingot"), ModRods.get("silver_rod"));
        rodRecipe(exporter, ModIngots.get("lead_ingot"), ModRods.get("lead_rod"));
        rodRecipe(exporter, ModIngots.get("iron_ingot"), ModRods.get("iron_rod"));
        rodRecipe(exporter, ModIngots.get("gold_ingot"), ModRods.get("gold_rod"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModRods.get("faerie_rod"), 4)
                .pattern("M")
                .pattern("M")
                .input('M', ModDusts.get("faerie_dust"))
                .criterion(hasItem(ModDusts.get("faerie_dust")), conditionsFromItem(ModDusts.get("faerie_dust")))
                .offerTo(exporter, new Identifier(getRecipeName(ModRods.get("faerie_rod"))));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.get("pulverent_planks"), 4)
                .input(ModBlocks.get("pulverent_log"), 1)
                .criterion(hasItem(ModBlocks.get("pulverent_log").asItem()), conditionsFromItem(ModBlocks.get("pulverent_log").asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_planks"))));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.get("pulverent_button"), 1)
                .input(ModBlocks.get("pulverent_planks"), 1)
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks").asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_button"))));

        chargingRecipe(exporter, ModRods.get("mythril_rod"), ModChargedRods.get("charged_mythril_rod"));
        chargingRecipe(exporter, ModRods.get("faerie_rod"), ModChargedRods.get("charged_faerie_rod"));
        chargingRecipe(exporter, ModRods.get("indium_rod"), ModChargedRods.get("charged_indium_rod"));
        chargingRecipe(exporter, ModRods.get("tungsten_rod"), ModChargedRods.get("charged_tungsten_rod"));
        chargingRecipe(exporter, ModRods.get("energium_rod"), ModChargedRods.get("charged_energium_rod"));
        chargingRecipe(exporter, ModRods.get("yttrium_rod"), ModChargedRods.get("charged_yttrium_rod"));
        chargingRecipe(exporter, ModRods.get("silver_rod"), ModChargedRods.get("charged_silver_rod"));
        chargingRecipe(exporter, ModRods.get("lead_rod"), ModChargedRods.get("charged_lead_rod"));
        chargingRecipe(exporter, ModRods.get("iron_rod"), ModChargedRods.get("charged_iron_rod"));
        chargingRecipe(exporter, ModRods.get("gold_rod"), ModChargedRods.get("charged_gold_rod"));

        // EXISTING ELEMENTAL RODS (missing recipes)
        rodRecipe(exporter, ModIngots.get("aluminum_ingot"), ModRods.get("aluminum_rod"));
        rodRecipe(exporter, ModIngots.get("chromium_ingot"), ModRods.get("chromium_rod"));
        rodRecipe(exporter, ModIngots.get("cobalt_ingot"), ModRods.get("cobalt_rod"));
        rodRecipe(exporter, ModIngots.get("gallium_ingot"), ModRods.get("gallium_rod"));
        rodRecipe(exporter, ModIngots.get("iridium_ingot"), ModRods.get("iridium_rod"));
        rodRecipe(exporter, ModIngots.get("magnesium_ingot"), ModRods.get("magnesium_rod"));
        rodRecipe(exporter, ModIngots.get("manganese_ingot"), ModRods.get("manganese_rod"));
        rodRecipe(exporter, ModIngots.get("naquadah_ingot"), ModRods.get("naquadah_rod"));
        rodRecipe(exporter, ModIngots.get("nickel_ingot"), ModRods.get("nickel_rod"));
        rodRecipe(exporter, ModIngots.get("titanium_ingot"), ModRods.get("titanium_rod"));
        rodRecipe(exporter, ModIngots.get("vanadium_ingot"), ModRods.get("vanadium_rod"));
        rodRecipe(exporter, ModIngots.get("zinc_ingot"), ModRods.get("zinc_rod"));

        // CARBON ROD (from carbon dust, no ingot)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModRods.get("carbon_rod"), 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModDusts.get("carbon_dust"))
                .criterion(hasItem(ModDusts.get("carbon_dust")), conditionsFromItem(ModDusts.get("carbon_dust")))
                .offerTo(exporter, new Identifier(getRecipeName(ModRods.get("carbon_rod"))));

        // GERMANIUM ROD (from germanium dust, no ingot)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModRods.get("germanium_rod"), 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModDusts.get("germanium_dust"))
                .criterion(hasItem(ModDusts.get("germanium_dust")), conditionsFromItem(ModDusts.get("germanium_dust")))
                .offerTo(exporter, new Identifier(getRecipeName(ModRods.get("germanium_rod"))));

        // SILICON ROD (from silicon dust, no ingot)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModRods.get("silicon_rod"), 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModDusts.get("silicon_dust"))
                .criterion(hasItem(ModDusts.get("silicon_dust")), conditionsFromItem(ModDusts.get("silicon_dust")))
                .offerTo(exporter, new Identifier(getRecipeName(ModRods.get("silicon_rod"))));

        // NEW ELEMENTAL RODS
        rodRecipe(exporter, ModIngots.get("barium_ingot"), ModRods.get("barium_rod"));
        rodRecipe(exporter, ModIngots.get("beryllium_ingot"), ModRods.get("beryllium_rod"));
        rodRecipe(exporter, ModIngots.get("bismuth_ingot"), ModRods.get("bismuth_rod"));
        rodRecipe(exporter, ModIngots.get("cadmium_ingot"), ModRods.get("cadmium_rod"));
        rodRecipe(exporter, ModIngots.get("calcium_ingot"), ModRods.get("calcium_rod"));
        rodRecipe(exporter, ModIngots.get("copper_ingot"), ModRods.get("copper_rod"));
        rodRecipe(exporter, ModIngots.get("lithium_ingot"), ModRods.get("lithium_rod"));
        rodRecipe(exporter, ModIngots.get("molybdenum_ingot"), ModRods.get("molybdenum_rod"));
        rodRecipe(exporter, ModIngots.get("naquadriah_ingot"), ModRods.get("naquadriah_rod"));
        rodRecipe(exporter, ModIngots.get("niobium_ingot"), ModRods.get("niobium_rod"));
        rodRecipe(exporter, ModIngots.get("osmium_ingot"), ModRods.get("osmium_rod"));
        rodRecipe(exporter, ModIngots.get("palladium_ingot"), ModRods.get("palladium_rod"));
        rodRecipe(exporter, ModIngots.get("platinum_ingot"), ModRods.get("platinum_rod"));
        rodRecipe(exporter, ModIngots.get("polonium_ingot"), ModRods.get("polonium_rod"));
        rodRecipe(exporter, ModIngots.get("rhenium_ingot"), ModRods.get("rhenium_rod"));
        rodRecipe(exporter, ModIngots.get("rhodium_ingot"), ModRods.get("rhodium_rod"));
        rodRecipe(exporter, ModIngots.get("ruthenium_ingot"), ModRods.get("ruthenium_rod"));
        rodRecipe(exporter, ModIngots.get("scandium_ingot"), ModRods.get("scandium_rod"));
        rodRecipe(exporter, ModIngots.get("sodium_ingot"), ModRods.get("sodium_rod"));
        rodRecipe(exporter, ModIngots.get("strontium_ingot"), ModRods.get("strontium_rod"));
        rodRecipe(exporter, ModIngots.get("tantalum_ingot"), ModRods.get("tantalum_rod"));
        rodRecipe(exporter, ModIngots.get("thallium_ingot"), ModRods.get("thallium_rod"));
        rodRecipe(exporter, ModIngots.get("thorium_ingot"), ModRods.get("thorium_rod"));
        rodRecipe(exporter, ModIngots.get("tin_ingot"), ModRods.get("tin_rod"));
        rodRecipe(exporter, ModIngots.get("uranium_ingot"), ModRods.get("uranium_rod"));
        rodRecipe(exporter, ModIngots.get("zirconium_ingot"), ModRods.get("zirconium_rod"));

        // EXISTING ALLOY ROD (bronze)
        rodRecipe(exporter, ModIngots.get("bronze_alloy_ingot"), ModRods.get("bronze_rod"));

        // A GROUP ALLOY RODS
        rodRecipe(exporter, ModIngots.get("alclad_alloy_ingot"), ModRods.get("alclad_rod"));
        rodRecipe(exporter, ModIngots.get("aldrey_alloy_ingot"), ModRods.get("aldrey_rod"));
        rodRecipe(exporter, ModIngots.get("alloys_8090_alloy_ingot"), ModRods.get("alloys_8090_rod"));
        rodRecipe(exporter, ModIngots.get("almag_alloy_ingot"), ModRods.get("almag_rod"));
        rodRecipe(exporter, ModIngots.get("almelec_alloy_ingot"), ModRods.get("almelec_rod"));
        rodRecipe(exporter, ModIngots.get("almgsi_alloy_ingot"), ModRods.get("almgsi_rod"));
        rodRecipe(exporter, ModIngots.get("alnimax_alloy_ingot"), ModRods.get("alnimax_rod"));
        rodRecipe(exporter, ModIngots.get("alsimec_alloy_ingot"), ModRods.get("alsimec_rod"));
        rodRecipe(exporter, ModIngots.get("alsin_alloy_ingot"), ModRods.get("alsin_rod"));
        rodRecipe(exporter, ModIngots.get("aluminium_bronze_alloy_ingot"), ModRods.get("aluminium_bronze_rod"));
        rodRecipe(exporter, ModIngots.get("alumel_alloy_ingot"), ModRods.get("alumel_rod"));
        rodRecipe(exporter, ModIngots.get("alumicrom_alloy_ingot"), ModRods.get("alumicrom_rod"));
        rodRecipe(exporter, ModIngots.get("aluminium_galimax_alloy_ingot"), ModRods.get("aluminium_galimax_rod"));
        rodRecipe(exporter, ModIngots.get("alusil_alloy_ingot"), ModRods.get("alusil_rod"));
        rodRecipe(exporter, ModIngots.get("antanium_alloy_ingot"), ModRods.get("antanium_rod"));
        rodRecipe(exporter, ModIngots.get("ardol_alloy_ingot"), ModRods.get("ardol_rod"));
        rodRecipe(exporter, ModIngots.get("birmabright_alloy_ingot"), ModRods.get("birmabright_rod"));

        // B GROUP ALLOY RODS
        rodRecipe(exporter, ModIngots.get("babbitt_metal_alloy_ingot"), ModRods.get("babbitt_metal_rod"));
        rodRecipe(exporter, ModIngots.get("barium_alloy_ingot"), ModRods.get("barium_alloy_rod"));
        rodRecipe(exporter, ModIngots.get("barmetal_alloy_ingot"), ModRods.get("barmetal_rod"));
        rodRecipe(exporter, ModIngots.get("bell_metal_alloy_ingot"), ModRods.get("bell_metal_rod"));
        rodRecipe(exporter, ModIngots.get("berylco_alloy_ingot"), ModRods.get("berylco_rod"));
        rodRecipe(exporter, ModIngots.get("beta_brass_alloy_ingot"), ModRods.get("beta_brass_rod"));
        rodRecipe(exporter, ModIngots.get("birmingham_gold_alloy_ingot"), ModRods.get("birmingham_gold_rod"));
        rodRecipe(exporter, ModIngots.get("brass_alloy_ingot"), ModRods.get("brass_rod"));

        // C GROUP ALLOY RODS
        rodRecipe(exporter, ModIngots.get("calcusil_alloy_ingot"), ModRods.get("calcusil_rod"));
        rodRecipe(exporter, ModIngots.get("cast_iron_alloy_ingot"), ModRods.get("cast_iron_rod"));
        rodRecipe(exporter, ModIngots.get("ccilla_alloy_ingot"), ModRods.get("ccilla_rod"));
        rodRecipe(exporter, ModIngots.get("cervenit_alloy_ingot"), ModRods.get("cervenit_rod"));
        rodRecipe(exporter, ModIngots.get("chrominium_alloy_ingot"), ModRods.get("chrominium_rod"));
        rodRecipe(exporter, ModIngots.get("c_manganese_steel_alloy_ingot"), ModRods.get("c_manganese_steel_rod"));
        rodRecipe(exporter, ModIngots.get("constitution_alloy_ingot"), ModRods.get("constitution_rod"));
        rodRecipe(exporter, ModIngots.get("copernicium_alloy_ingot"), ModRods.get("copernicium_alloy_rod"));
        rodRecipe(exporter, ModIngots.get("copper_aluminium_alloy_ingot"), ModRods.get("copper_aluminium_rod"));
        rodRecipe(exporter, ModIngots.get("copper_bismuth_alloy_ingot"), ModRods.get("copper_bismuth_rod"));
        rodRecipe(exporter, ModIngots.get("copper_nickel_alloy_ingot"), ModRods.get("copper_nickel_rod"));
        rodRecipe(exporter, ModIngots.get("cunal_alloy_ingot"), ModRods.get("cunal_rod"));
        rodRecipe(exporter, ModIngots.get("cunife_alloy_ingot"), ModRods.get("cunife_rod"));
        rodRecipe(exporter, ModIngots.get("cusil_alloy_ingot"), ModRods.get("cusil_rod"));

        // STEELS & FE-BASED ALLOY RODS
        rodRecipe(exporter, ModIngots.get("stainless_steel_alloy_ingot"), ModRods.get("stainless_steel_rod"));
        rodRecipe(exporter, ModIngots.get("tool_steel_alloy_ingot"), ModRods.get("tool_steel_rod"));
        rodRecipe(exporter, ModIngots.get("invar_alloy_ingot"), ModRods.get("invar_rod"));
        rodRecipe(exporter, ModIngots.get("kovar_alloy_ingot"), ModRods.get("kovar_rod"));
        rodRecipe(exporter, ModIngots.get("silicon_steel_alloy_ingot"), ModRods.get("silicon_steel_rod"));
        rodRecipe(exporter, ModIngots.get("ferrochrome_alloy_ingot"), ModRods.get("ferrochrome_rod"));
        rodRecipe(exporter, ModIngots.get("ferrotitanium_alloy_ingot"), ModRods.get("ferrotitanium_rod"));
        rodRecipe(exporter, ModIngots.get("ferrovanadium_alloy_ingot"), ModRods.get("ferrovanadium_rod"));
        rodRecipe(exporter, ModIngots.get("ferrotungsten_alloy_ingot"), ModRods.get("ferrotungsten_rod"));
        rodRecipe(exporter, ModIngots.get("ferromolybdenum_alloy_ingot"), ModRods.get("ferromolybdenum_rod"));

        // NI-BASED ALLOY RODS
        rodRecipe(exporter, ModIngots.get("inconel_alloy_ingot"), ModRods.get("inconel_rod"));
        rodRecipe(exporter, ModIngots.get("nichrome_alloy_ingot"), ModRods.get("nichrome_rod"));
        rodRecipe(exporter, ModIngots.get("permalloy_alloy_ingot"), ModRods.get("permalloy_rod"));
        rodRecipe(exporter, ModIngots.get("nickel_silver_alloy_ingot"), ModRods.get("nickel_silver_rod"));
        rodRecipe(exporter, ModIngots.get("constantan_alloy_ingot"), ModRods.get("constantan_rod"));
        rodRecipe(exporter, ModIngots.get("manganin_alloy_ingot"), ModRods.get("manganin_rod"));
        rodRecipe(exporter, ModIngots.get("monel_alloy_ingot"), ModRods.get("monel_rod"));

        // TI-BASED ALLOY RODS
        rodRecipe(exporter, ModIngots.get("ti_6al_4v_alloy_ingot"), ModRods.get("ti_6al_4v_rod"));
        rodRecipe(exporter, ModIngots.get("ti_3al_2_5v_alloy_ingot"), ModRods.get("ti_3al_2_5v_rod"));
        rodRecipe(exporter, ModIngots.get("ti_6al_7nb_alloy_ingot"), ModRods.get("ti_6al_7nb_rod"));

        // MG-BASED ALLOY RODS
        rodRecipe(exporter, ModIngots.get("az31_magnesium_alloy_ingot"), ModRods.get("az31_magnesium_rod"));
        rodRecipe(exporter, ModIngots.get("elektron_alloy_ingot"), ModRods.get("elektron_rod"));

        // PRECIOUS METAL ALLOY RODS
        rodRecipe(exporter, ModIngots.get("electrum_alloy_ingot"), ModRods.get("electrum_rod"));
        rodRecipe(exporter, ModIngots.get("tumbaga_alloy_ingot"), ModRods.get("tumbaga_rod"));
        rodRecipe(exporter, ModIngots.get("rose_gold_alloy_ingot"), ModRods.get("rose_gold_rod"));
        rodRecipe(exporter, ModIngots.get("white_gold_alloy_ingot"), ModRods.get("white_gold_rod"));
        rodRecipe(exporter, ModIngots.get("sterling_silver_alloy_ingot"), ModRods.get("sterling_silver_rod"));
        rodRecipe(exporter, ModIngots.get("shibuichi_alloy_ingot"), ModRods.get("shibuichi_rod"));

        // LOW-MELTING ALLOY RODS
        rodRecipe(exporter, ModIngots.get("roses_metal_alloy_ingot"), ModRods.get("roses_metal_rod"));
        rodRecipe(exporter, ModIngots.get("woods_metal_alloy_ingot"), ModRods.get("woods_metal_rod"));
        rodRecipe(exporter, ModIngots.get("solder_alloy_ingot"), ModRods.get("solder_rod"));
        rodRecipe(exporter, ModIngots.get("pewter_alloy_ingot"), ModRods.get("pewter_rod"));
        rodRecipe(exporter, ModIngots.get("fields_metal_alloy_ingot"), ModRods.get("fields_metal_rod"));

        // CU-BASED ALLOY RODS
        rodRecipe(exporter, ModIngots.get("silicon_bronze_alloy_ingot"), ModRods.get("silicon_bronze_rod"));
        rodRecipe(exporter, ModIngots.get("manganese_bronze_alloy_ingot"), ModRods.get("manganese_bronze_rod"));

        // OTHER ALLOY RODS
        rodRecipe(exporter, ModIngots.get("zamak_alloy_ingot"), ModRods.get("zamak_rod"));
        rodRecipe(exporter, ModIngots.get("stellite_alloy_ingot"), ModRods.get("stellite_rod"));
        rodRecipe(exporter, ModIngots.get("duralumin_alloy_ingot"), ModRods.get("duralumin_rod"));
        rodRecipe(exporter, ModIngots.get("heavy_tungsten_alloy_ingot"), ModRods.get("heavy_tungsten_rod"));
        rodRecipe(exporter, ModIngots.get("tungsten_copper_alloy_ingot"), ModRods.get("tungsten_copper_rod"));
        rodRecipe(exporter, ModIngots.get("tzm_molybdenum_alloy_ingot"), ModRods.get("tzm_molybdenum_rod"));
        rodRecipe(exporter, ModIngots.get("bismuth_tin_alloy_ingot"), ModRods.get("bismuth_tin_rod"));
        rodRecipe(exporter, ModIngots.get("tantalum_tungsten_alloy_ingot"), ModRods.get("tantalum_tungsten_rod"));
        rodRecipe(exporter, ModIngots.get("niobium_titanium_alloy_ingot"), ModRods.get("niobium_titanium_rod"));
        rodRecipe(exporter, ModIngots.get("depleted_uranium_alloy_ingot"), ModRods.get("depleted_uranium_rod"));
        rodRecipe(exporter, ModIngots.get("galinstan_alloy_ingot"), ModRods.get("galinstan_rod"));
        rodRecipe(exporter, ModIngots.get("germanium_silicon_alloy_ingot"), ModRods.get("germanium_silicon_rod"));
        rodRecipe(exporter, ModIngots.get("sodium_potassium_alloy_ingot"), ModRods.get("sodium_potassium_rod"));

        // FICTIONAL ALLOY RODS
        rodRecipe(exporter, ModIngots.get("mythril_steel_alloy_ingot"), ModRods.get("mythril_steel_rod"));
        rodRecipe(exporter, ModIngots.get("naquadah_steel_alloy_ingot"), ModRods.get("naquadah_steel_rod"));
        rodRecipe(exporter, ModIngots.get("naquadriah_titanium_alloy_ingot"), ModRods.get("naquadriah_titanium_rod"));
        rodRecipe(exporter, ModIngots.get("energium_copper_alloy_ingot"), ModRods.get("energium_copper_rod"));
        rodRecipe(exporter, ModIngots.get("eridium_gold_alloy_ingot"), ModRods.get("eridium_gold_rod"));
        rodRecipe(exporter, ModIngots.get("energium_aluminium_alloy_ingot"), ModRods.get("energium_aluminium_rod"));
        rodRecipe(exporter, ModIngots.get("naquadah_mythril_alloy_ingot"), ModRods.get("naquadah_mythril_rod"));
        rodRecipe(exporter, ModIngots.get("eridium_tantalum_alloy_ingot"), ModRods.get("eridium_tantalum_rod"));

        // NEW CHARGED RODS (existing metals)
        chargingRecipe(exporter, ModRods.get("aluminum_rod"), ModChargedRods.get("charged_aluminum_rod"));
        chargingRecipe(exporter, ModRods.get("chromium_rod"), ModChargedRods.get("charged_chromium_rod"));
        chargingRecipe(exporter, ModRods.get("cobalt_rod"), ModChargedRods.get("charged_cobalt_rod"));
        chargingRecipe(exporter, ModRods.get("eridium_rod"), ModChargedRods.get("charged_eridium_rod"));
        chargingRecipe(exporter, ModRods.get("gallium_rod"), ModChargedRods.get("charged_gallium_rod"));
        chargingRecipe(exporter, ModRods.get("iridium_rod"), ModChargedRods.get("charged_iridium_rod"));
        chargingRecipe(exporter, ModRods.get("magnesium_rod"), ModChargedRods.get("charged_magnesium_rod"));
        chargingRecipe(exporter, ModRods.get("manganese_rod"), ModChargedRods.get("charged_manganese_rod"));
        chargingRecipe(exporter, ModRods.get("naquadah_rod"), ModChargedRods.get("charged_naquadah_rod"));
        chargingRecipe(exporter, ModRods.get("nickel_rod"), ModChargedRods.get("charged_nickel_rod"));
        chargingRecipe(exporter, ModRods.get("titanium_rod"), ModChargedRods.get("charged_titanium_rod"));
        chargingRecipe(exporter, ModRods.get("vanadium_rod"), ModChargedRods.get("charged_vanadium_rod"));
        chargingRecipe(exporter, ModRods.get("zinc_rod"), ModChargedRods.get("charged_zinc_rod"));

        // NEW CHARGED RODS (new metals)
        chargingRecipe(exporter, ModRods.get("barium_rod"), ModChargedRods.get("charged_barium_rod"));
        chargingRecipe(exporter, ModRods.get("beryllium_rod"), ModChargedRods.get("charged_beryllium_rod"));
        chargingRecipe(exporter, ModRods.get("bismuth_rod"), ModChargedRods.get("charged_bismuth_rod"));
        chargingRecipe(exporter, ModRods.get("cadmium_rod"), ModChargedRods.get("charged_cadmium_rod"));
        chargingRecipe(exporter, ModRods.get("calcium_rod"), ModChargedRods.get("charged_calcium_rod"));
        chargingRecipe(exporter, ModRods.get("copper_rod"), ModChargedRods.get("charged_copper_rod"));
        chargingRecipe(exporter, ModRods.get("lithium_rod"), ModChargedRods.get("charged_lithium_rod"));
        chargingRecipe(exporter, ModRods.get("molybdenum_rod"), ModChargedRods.get("charged_molybdenum_rod"));
        chargingRecipe(exporter, ModRods.get("naquadriah_rod"), ModChargedRods.get("charged_naquadriah_rod"));
        chargingRecipe(exporter, ModRods.get("niobium_rod"), ModChargedRods.get("charged_niobium_rod"));
        chargingRecipe(exporter, ModRods.get("osmium_rod"), ModChargedRods.get("charged_osmium_rod"));
        chargingRecipe(exporter, ModRods.get("palladium_rod"), ModChargedRods.get("charged_palladium_rod"));
        chargingRecipe(exporter, ModRods.get("platinum_rod"), ModChargedRods.get("charged_platinum_rod"));
        chargingRecipe(exporter, ModRods.get("polonium_rod"), ModChargedRods.get("charged_polonium_rod"));
        chargingRecipe(exporter, ModRods.get("rhenium_rod"), ModChargedRods.get("charged_rhenium_rod"));
        chargingRecipe(exporter, ModRods.get("rhodium_rod"), ModChargedRods.get("charged_rhodium_rod"));
        chargingRecipe(exporter, ModRods.get("ruthenium_rod"), ModChargedRods.get("charged_ruthenium_rod"));
        chargingRecipe(exporter, ModRods.get("scandium_rod"), ModChargedRods.get("charged_scandium_rod"));
        chargingRecipe(exporter, ModRods.get("sodium_rod"), ModChargedRods.get("charged_sodium_rod"));
        chargingRecipe(exporter, ModRods.get("strontium_rod"), ModChargedRods.get("charged_strontium_rod"));
        chargingRecipe(exporter, ModRods.get("tantalum_rod"), ModChargedRods.get("charged_tantalum_rod"));
        chargingRecipe(exporter, ModRods.get("thallium_rod"), ModChargedRods.get("charged_thallium_rod"));
        chargingRecipe(exporter, ModRods.get("thorium_rod"), ModChargedRods.get("charged_thorium_rod"));
        chargingRecipe(exporter, ModRods.get("tin_rod"), ModChargedRods.get("charged_tin_rod"));
        chargingRecipe(exporter, ModRods.get("uranium_rod"), ModChargedRods.get("charged_uranium_rod"));
        chargingRecipe(exporter, ModRods.get("zirconium_rod"), ModChargedRods.get("charged_zirconium_rod"));

        createStairsRecipe(ModBlocks.get("pulverent_stairs"), Ingredient.ofItems(ModBlocks.get("pulverent_planks").asItem()))
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks")))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_stairs"))));
        createDoorRecipe(ModBlocks.get("pulverent_door"), Ingredient.ofItems(ModBlocks.get("pulverent_planks").asItem()))
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks")))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_door"))));
        createFenceRecipe(ModBlocks.get("pulverent_fence"), Ingredient.ofItems(ModBlocks.get("pulverent_planks").asItem()))
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks")))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_fence"))));
        createFenceGateRecipe(ModBlocks.get("pulverent_fence_gate"), Ingredient.ofItems(ModBlocks.get("pulverent_planks").asItem()))
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks")))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_fence_gate"))));
        createTrapdoorRecipe(ModBlocks.get("pulverent_trapdoor"), Ingredient.ofItems(ModBlocks.get("pulverent_planks").asItem()))
                .criterion(hasItem(ModBlocks.get("pulverent_planks").asItem()), conditionsFromItem(ModBlocks.get("pulverent_planks")))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.get("pulverent_trapdoor"))));



        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.get("pulverent_slab"), ModBlocks.get("pulverent_planks"));
        offerPressurePlateRecipe(exporter, ModBlocks.get("pulverent_pressure_plate"), ModBlocks.get("pulverent_planks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModTools.get("mythril_sword"), 1)
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .input('M', ModIngots.get("mythril_ingot"))
                .input('S', Items.STICK)
                .criterion(hasItem(ModIngots.get("mythril_ingot")), conditionsFromItem(ModIngots.get("mythril_ingot")))
                .offerTo(exporter, new Identifier(getRecipeName(ModTools.get("mythril_sword"))));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModTools.get("mythril_axe"), 1)
                .pattern("MM")
                .pattern("SM")
                .pattern("S ")
                .input('M', ModIngots.get("mythril_ingot"))
                .input('S', Items.STICK)
                .criterion(hasItem(ModIngots.get("mythril_ingot")), conditionsFromItem(ModIngots.get("mythril_ingot")))
                .offerTo(exporter, new Identifier(getRecipeName(ModTools.get("mythril_axe"))));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModTools.get("mythril_pickaxe"), 1)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .input('M', ModIngots.get("mythril_ingot"))
                .input('S', Items.STICK)
                .criterion(hasItem(ModIngots.get("mythril_ingot")), conditionsFromItem(ModIngots.get("mythril_ingot")))
                .offerTo(exporter, new Identifier(getRecipeName(ModTools.get("mythril_pickaxe"))));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModTools.get("mythril_shovel"), 1)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .input('M', ModIngots.get("mythril_ingot"))
                .input('S', Items.STICK)
                .criterion(hasItem(ModIngots.get("mythril_ingot")), conditionsFromItem(ModIngots.get("mythril_ingot")))
                .offerTo(exporter, new Identifier(getRecipeName(ModTools.get("mythril_shovel"))));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModTools.get("mythril_hoe"), 1)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .input('M', ModIngots.get("mythril_ingot"))
                .input('S', Items.STICK)
                .criterion(hasItem(ModIngots.get("mythril_ingot")), conditionsFromItem(ModIngots.get("mythril_ingot")))
                .offerTo(exporter, new Identifier(getRecipeName(ModTools.get("mythril_hoe"))));

    }
}
