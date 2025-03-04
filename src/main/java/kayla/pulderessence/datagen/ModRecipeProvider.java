package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModElements;
import kayla.pulderessence.item.ChemicalReactionItems;
import kayla.pulderessence.item.ModItems;
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
    private static final List<ItemConvertible> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL, ModBlocks.MYTHRIL_ORE, ModBlocks.DEEPSLATE_MYTHRIL_ORE);
    private static final List<ItemConvertible> INDIUM_SMELTABLES = List.of(ModItems.RAW_INDIUM, ModBlocks.INDIUM_ORE, ModBlocks.DEEPSLATE_INDIUM_ORE);
    private static final List<ItemConvertible> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN, ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
    private static final List<ItemConvertible> ENERGIUM_SMELTABLES = List.of(ModItems.RAW_ENERGIUM, ModBlocks.ENERGIUM_ORE, ModBlocks.DEEPSLATE_ENERGIUM_ORE);
    private static final List<ItemConvertible> YTTRIUM_SMELTABLES = List.of(ModItems.RAW_YTTRIUM, ModBlocks.YTTRIUM_ORE, ModBlocks.DEEPSLATE_YTTRIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    private void chargingRecipe(Consumer<RecipeJsonProvider> exporter, Item input, Item output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .pattern("IFF")
                .pattern("FF ")
                .input('I', input)
                .input('F', ModItems.FAERIE_DUST)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private void bucketElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(Items.BUCKET, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    private void bucketElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item input3, int inputCount3, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(input3, inputCount3)
                .input(Items.BUCKET, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    private void bucketElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item input3, int inputCount3, Item input4, int inputCount4, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(input3, inputCount3)
                .input(input4, inputCount4)
                .input(Items.BUCKET, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    private void bottleElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(Items.GLASS_BOTTLE, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    private void bottleElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item input3, int inputCount3, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(input3, inputCount3)
                .input(Items.GLASS_BOTTLE, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    private void bottleElementRecipe(Consumer<RecipeJsonProvider> exporter, Item input1, int inputCount1, Item input2, int inputCount2, Item input3, int inputCount3, Item input4, int inputCount4, Item output) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input(input1, inputCount1)
                .input(input2, inputCount2)
                .input(input3, inputCount3)
                .input(input4, inputCount4)
                .input(Items.GLASS_BOTTLE, 1)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .offerTo(exporter, new Identifier("progressable_" + output.getTranslationKey()));
    }

    @Override    
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        bucketElementRecipe(exporter, ModElements.HYDROGEN, 2, ModElements.OXYGEN, 1, ChemicalReactionItems.H2O_BUCKET);
        bucketElementRecipe(exporter, ModElements.NITROGEN, 1, ModElements.HYDROGEN, 3, ChemicalReactionItems.NH3_BUCKET);

        bottleElementRecipe(exporter, ModElements.SODIUM, 1, ModElements.OXYGEN, 1, ModElements.CHLORINE, 1, ChemicalReactionItems.NaOCl_BOTTLE);

        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.7f, 200, "mythril");
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.7f, 100, "mythril");


        offerSmelting(exporter, INDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INDIUM_INGOT, 0.7f, 200, "indium");
        offerBlasting(exporter, INDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INDIUM_INGOT, 0.7f, 100, "indium");

        offerSmelting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.7f, 200, "tungsten");
        offerBlasting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 0.7f, 100, "tungsten");

        offerSmelting(exporter, ENERGIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGIUM_SHARD, 0.7f, 200, "energium");
        offerBlasting(exporter, ENERGIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGIUM_SHARD, 0.7f, 100, "energium");

        offerSmelting(exporter, YTTRIUM_SMELTABLES, RecipeCategory.MISC, ModItems.YTTRIUM_INGOT, 0.7f, 200, "yttrium");
        offerBlasting(exporter, YTTRIUM_SMELTABLES, RecipeCategory.MISC, ModItems.YTTRIUM_INGOT, 0.7f, 100, "yttrium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MYTHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MYTHRIL_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.INDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.INDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_INDIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_INDIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TUNGSTEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TUNGSTEN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TUNGSTEN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.YTTRIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.YTTRIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_YTTRIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_YTTRIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENERGIUM_SHARD, RecipeCategory.DECORATIONS, ModBlocks.ENERGIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ENERGIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_ENERGIUM_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_NUGGET, 9)
                .input(ModItems.MYTHRIL_INGOT, 1)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier("mythril_nuggets_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 1)
                .input(ModItems.MYTHRIL_NUGGET, 9)
                .criterion(hasItem(ModItems.MYTHRIL_NUGGET), conditionsFromItem(ModItems.MYTHRIL_NUGGET))
                .offerTo(exporter, new Identifier("mythril_ingot_from_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YTTRIUM_NUGGET, 9)
                .input(ModItems.YTTRIUM_INGOT, 1)
                .criterion(hasItem(ModItems.YTTRIUM_INGOT), conditionsFromItem(ModItems.YTTRIUM_INGOT))
                .offerTo(exporter, new Identifier("yttrium_nuggets_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YTTRIUM_INGOT, 1)
                .input(ModItems.YTTRIUM_NUGGET, 9)
                .criterion(hasItem(ModItems.YTTRIUM_NUGGET), conditionsFromItem(ModItems.YTTRIUM_NUGGET))
                .offerTo(exporter, new Identifier("yttrium_ingot_from_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDIUM_NUGGET, 9)
                .input(ModItems.INDIUM_INGOT, 1)
                .criterion(hasItem(ModItems.INDIUM_INGOT), conditionsFromItem(ModItems.INDIUM_INGOT))
                .offerTo(exporter, new Identifier("indium_nuggets_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDIUM_INGOT, 1)
                .input(ModItems.INDIUM_NUGGET, 9)
                .criterion(hasItem(ModItems.INDIUM_NUGGET), conditionsFromItem(ModItems.INDIUM_NUGGET))
                .offerTo(exporter, new Identifier("indium_ingot_from_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET, 9)
                .input(ModItems.TUNGSTEN_INGOT, 1)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.INDIUM_INGOT))
                .offerTo(exporter, new Identifier("tungsten_nuggets_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 1)
                .input(ModItems.TUNGSTEN_NUGGET, 9)
                .criterion(hasItem(ModItems.TUNGSTEN_NUGGET), conditionsFromItem(ModItems.TUNGSTEN_NUGGET))
                .offerTo(exporter, new Identifier("tungsten_ingot_from_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.MYTHRIL_NUGGET)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YTTRIUM_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.YTTRIUM_NUGGET)
                .criterion(hasItem(ModItems.YTTRIUM_INGOT), conditionsFromItem(ModItems.YTTRIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YTTRIUM_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDIUM_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.INDIUM_NUGGET)
                .criterion(hasItem(ModItems.INDIUM_INGOT), conditionsFromItem(ModItems.INDIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.INDIUM_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.TUNGSTEN_NUGGET)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TUNGSTEN_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENERGIUM_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.ENERGIUM_SHARD)
                .criterion(hasItem(ModItems.ENERGIUM_SHARD), conditionsFromItem(ModItems.ENERGIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENERGIUM_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.SILVER_NUGGET)
                .criterion(hasItem(ModItems.SILVER_NUGGET), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVER_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAD_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.LEAD_NUGGET)
                .criterion(hasItem(ModItems.LEAD_NUGGET), conditionsFromItem(ModItems.LEAD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEAD_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAERIE_ROD, 4)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.FAERIE_DUST)
                .criterion(hasItem(ModItems.FAERIE_DUST), conditionsFromItem(ModItems.FAERIE_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FAERIE_ROD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PULVERENT_PLANKS, 4)
                .input(ModBlocks.PULVERENT_LOG, 1)
                .criterion(hasItem(ModBlocks.PULVERENT_LOG.asItem()), conditionsFromItem(ModBlocks.PULVERENT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PULVERENT_BUTTON, 1)
                .input(ModBlocks.PULVERENT_PLANKS, 1)
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_BUTTON)));

        chargingRecipe(exporter, ModItems.MYTHRIL_ROD, ModItems.CHARGED_MYTHRIL_ROD);
        chargingRecipe(exporter, ModItems.FAERIE_ROD, ModItems.CHARGED_FAERIE_ROD);
        chargingRecipe(exporter, ModItems.INDIUM_ROD, ModItems.CHARGED_INDIUM_ROD);
        chargingRecipe(exporter, ModItems.TUNGSTEN_ROD, ModItems.CHARGED_TUNGSTEN_ROD);
        chargingRecipe(exporter, ModItems.ENERGIUM_ROD, ModItems.CHARGED_ENERGIUM_ROD);
        chargingRecipe(exporter, ModItems.YTTRIUM_ROD, ModItems.CHARGED_YTTRIUM_ROD);
        chargingRecipe(exporter, ModItems.SILVER_ROD, ModItems.CHARGED_SILVER_ROD);
        chargingRecipe(exporter, ModItems.LEAD_ROD, ModItems.CHARGED_LEAD_ROD);
        chargingRecipe(exporter, ModItems.IRON_ROD, ModItems.CHARGED_IRON_ROD);
        chargingRecipe(exporter, ModItems.GOLD_ROD, ModItems.CHARGED_GOLD_ROD);

        createStairsRecipe(ModBlocks.PULVERENT_STAIRS, Ingredient.ofItems(ModBlocks.PULVERENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_STAIRS)));
        createDoorRecipe(ModBlocks.PULVERENT_DOOR, Ingredient.ofItems(ModBlocks.PULVERENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_DOOR)));
        createFenceRecipe(ModBlocks.PULVERENT_FENCE, Ingredient.ofItems(ModBlocks.PULVERENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_FENCE)));
        createFenceGateRecipe(ModBlocks.PULVERENT_FENCE_GATE, Ingredient.ofItems(ModBlocks.PULVERENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_FENCE_GATE)));
        createTrapdoorRecipe(ModBlocks.PULVERENT_TRAPDOOR, Ingredient.ofItems(ModBlocks.PULVERENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.PULVERENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.PULVERENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PULVERENT_TRAPDOOR)));



        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PULVERENT_SLAB, ModBlocks.PULVERENT_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.PULVERENT_PRESSURE_PLATE, ModBlocks.PULVERENT_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SWORD, 1)
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .input('M', ModItems.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_AXE, 1)
                .pattern("MM")
                .pattern("SM")
                .pattern("S ")
                .input('M', ModItems.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .input('M', ModItems.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SHOVEL, 1)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .input('M', ModItems.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_HOE, 1)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .input('M', ModItems.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_HOE)));

    }
}
