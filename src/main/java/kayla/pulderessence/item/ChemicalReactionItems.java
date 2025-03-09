package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.custom.ProgressableItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ChemicalReactionItems {

    public static final Item H2O_BUCKET = registerCraftItem("dihydrogen_monoxide_bucket_reaction", new ProgressableItem(new FabricItemSettings(), Items.WATER_BUCKET, 4, ModBlocks.YTTRIUM_BLOCK));
    public static final Item NH3_BUCKET = registerCraftItem("ammonia_bucket_reaction", new ProgressableItem(new FabricItemSettings(), ModBucketItems.AMMONIA_BUCKET, 2, ModBlocks.MYTHRIL_BLOCK));
    public static final Item H2SO4_BUCKET = registerCraftItem("dihydrogen_sulfate_bucket_reaction", new ProgressableItem(new FabricItemSettings(), ModBucketItems.SULFURIC_ACID_BUCKET, 2, ModBlocks.MYTHRIL_BLOCK));
    public static final Item HCl_BUCKET = registerCraftItem("hydrogen_chloride_bucket_reaction", new ProgressableItem(new FabricItemSettings(), ModBucketItems.HYDROCHLORIC_ACID_BUCKET, 2, ModBlocks.MYTHRIL_BLOCK));

    public static final Item NaOCl_BOTTLE = registerCraftItem("sodium_hypochlorite_bottle_reaction", new ProgressableItem(new FabricItemSettings(), ModBottleItems.BLEACH_BOTTLE, 6, ModBlocks.MYTHRIL_BLOCK));
    public static final Item CHCl3_BOTTLE = registerCraftItem("trichloromethane_bottle_reaction", new ProgressableItem(new FabricItemSettings(), ModBottleItems.CHLOROFORM_BOTTLE, 6, ModBlocks.MYTHRIL_BLOCK));

    private static Item registerCraftItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerCrafts() {}
}
