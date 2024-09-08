package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL, ModBlocks.MYTHRIL_ORE, ModBlocks.DEEPSLATE_MYTHRIL_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
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

    }
}
