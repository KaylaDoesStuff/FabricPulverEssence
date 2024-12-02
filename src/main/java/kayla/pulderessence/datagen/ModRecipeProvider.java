package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL, ModBlocks.MYTHRIL_ORE, ModBlocks.DEEPSLATE_MYTHRIL_ORE);

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

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.7f, 200, "mythril");
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.7f, 100, "mythril");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MYTHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MYTHRIL_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_NUGGET, 9)
                .input(ModItems.MYTHRIL_INGOT, 1)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier("mythril_nuggets_from_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 1)
                .input(ModItems.MYTHRIL_NUGGET, 9)
                .criterion(hasItem(ModItems.MYTHRIL_NUGGET), conditionsFromItem(ModItems.MYTHRIL_NUGGET))
                .offerTo(exporter, new Identifier("mythril_ingot_from_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_ROD, 1)
                .pattern("M")
                .pattern("M")
                .input('M', ModItems.MYTHRIL_NUGGET)
                .criterion(hasItem(ModItems.MYTHRIL_INGOT), conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_ROD)));

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
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PULVERENT_WALL, ModBlocks.PULVERENT_PLANKS);

    }
}
