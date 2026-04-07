package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.IngotItem;
import kayla.pulderessence.item.ModElements;
import kayla.pulderessence.item.ChemicalReactionItems;
import kayla.pulderessence.item.ModItems;
import kayla.pulderessence.item.custom.CompoundItem;
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

    private void convertableNuggetIngot(Consumer<RecipeJsonProvider> exporter, CompoundItem ingot, Item nugget) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, nugget, 9)
                .input(ingot, 1)
                .criterion(hasItem(ingot), conditionsFromItem(ingot))
                .offerTo(exporter, new Identifier(nugget.getTranslationKey() + "s_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ingot, 1)
                .input(nugget, 9)
                .criterion(hasItem(nugget), conditionsFromItem(nugget))
                .offerTo(exporter, new Identifier(ingot.getTranslationKey() + "_from_nugget"));
    }

    private void rodRecipe(Consumer<RecipeJsonProvider> exporter, CompoundItem item, Item output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .pattern("M")
                .pattern("M")
                .input('M', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    @Override    
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        bucketElementRecipe(exporter, ModElements.HYDROGEN, 2, ModElements.OXYGEN, 1, ChemicalReactionItems.H2O_BUCKET);
        bucketElementRecipe(exporter, ModElements.HYDROGEN, 1, ModElements.CHLORINE, 1, ChemicalReactionItems.HCl_BUCKET);
        bucketElementRecipe(exporter, ModElements.NITROGEN, 1, ModElements.HYDROGEN, 3, ChemicalReactionItems.NH3_BUCKET);
        bucketElementRecipe(exporter, ModElements.HYDROGEN, 2, ModElements.SULFUR, 1, ModElements.OXYGEN, 4, ChemicalReactionItems.H2SO4_BUCKET);

        bottleElementRecipe(exporter, ModElements.SODIUM, 1, ModElements.OXYGEN, 1, ModElements.CHLORINE, 1, ChemicalReactionItems.NaOCl_BOTTLE);
        bottleElementRecipe(exporter, ModElements.CARBON, 1, ModElements.HYDROGEN, 1, ModElements.CHLORINE, 3, ChemicalReactionItems.CHCl3_BOTTLE);

        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, IngotItem.MYTHRIL_INGOT, 0.7f, 200, "mythril");
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, IngotItem.MYTHRIL_INGOT, 0.7f, 100, "mythril");

        offerSmelting(exporter, INDIUM_SMELTABLES, RecipeCategory.MISC, IngotItem.INDIUM_INGOT, 0.7f, 200, "indium");
        offerBlasting(exporter, INDIUM_SMELTABLES, RecipeCategory.MISC, IngotItem.INDIUM_INGOT, 0.7f, 100, "indium");

        offerSmelting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, IngotItem.TUNGSTEN_INGOT, 0.7f, 200, "tungsten");
        offerBlasting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, IngotItem.TUNGSTEN_INGOT, 0.7f, 100, "tungsten");

        offerSmelting(exporter, ENERGIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGIUM_SHARD, 0.7f, 200, "energium");
        offerBlasting(exporter, ENERGIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGIUM_SHARD, 0.7f, 100, "energium");

        offerSmelting(exporter, YTTRIUM_SMELTABLES, RecipeCategory.MISC, IngotItem.YTTRIUM_INGOT, 0.7f, 200, "yttrium");
        offerBlasting(exporter, YTTRIUM_SMELTABLES, RecipeCategory.MISC, IngotItem.YTTRIUM_INGOT, 0.7f, 100, "yttrium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, IngotItem.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MYTHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MYTHRIL_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, IngotItem.INDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.INDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_INDIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_INDIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, IngotItem.TUNGSTEN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TUNGSTEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TUNGSTEN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TUNGSTEN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, IngotItem.YTTRIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.YTTRIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_YTTRIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_YTTRIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENERGIUM_SHARD, RecipeCategory.DECORATIONS, ModBlocks.ENERGIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ENERGIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_ENERGIUM_BLOCK);

        convertableNuggetIngot(exporter, IngotItem.MYTHRIL_INGOT, ModItems.MYTHRIL_NUGGET);
        convertableNuggetIngot(exporter, IngotItem.YTTRIUM_INGOT, ModItems.YTTRIUM_NUGGET);
        convertableNuggetIngot(exporter, IngotItem.INDIUM_INGOT, ModItems.INDIUM_NUGGET);
        convertableNuggetIngot(exporter, IngotItem.TUNGSTEN_INGOT, ModItems.TUNGSTEN_NUGGET);

        rodRecipe(exporter, IngotItem.MYTHRIL_INGOT, ModItems.MYTHRIL_ROD);
        rodRecipe(exporter, IngotItem.YTTRIUM_INGOT, ModItems.YTTRIUM_ROD);
        rodRecipe(exporter, IngotItem.INDIUM_INGOT, ModItems.INDIUM_ROD);
        rodRecipe(exporter, IngotItem.TUNGSTEN_INGOT, ModItems.TUNGSTEN_ROD);
        rodRecipe(exporter, IngotItem.ENERGIUM_INGOT, ModItems.ENERGIUM_ROD);
        rodRecipe(exporter, IngotItem.SILVER_INGOT, ModItems.SILVER_ROD);
        rodRecipe(exporter, IngotItem.LEAD_INGOT, ModItems.LEAD_ROD);
        rodRecipe(exporter, IngotItem.IRON_INGOT, ModItems.IRON_ROD);
        rodRecipe(exporter, IngotItem.GOLD_INGOT, ModItems.GOLD_ROD);

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
                .input('M', IngotItem.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(IngotItem.MYTHRIL_INGOT), conditionsFromItem(IngotItem.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_AXE, 1)
                .pattern("MM")
                .pattern("SM")
                .pattern("S ")
                .input('M', IngotItem.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(IngotItem.MYTHRIL_INGOT), conditionsFromItem(IngotItem.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .input('M', IngotItem.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(IngotItem.MYTHRIL_INGOT), conditionsFromItem(IngotItem.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SHOVEL, 1)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .input('M', IngotItem.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(IngotItem.MYTHRIL_INGOT), conditionsFromItem(IngotItem.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_HOE, 1)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .input('M', IngotItem.MYTHRIL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(IngotItem.MYTHRIL_INGOT), conditionsFromItem(IngotItem.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_HOE)));

    }
}
