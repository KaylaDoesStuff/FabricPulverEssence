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

    public static final Item H2O_BUCKET = registerCraftItem("water_bucket_reaction", new ProgressableItem(new FabricItemSettings(), Items.WATER_BUCKET, 4, ModBlocks.YTTRIUM_BLOCK));
    public static final Item NH4_BUCKET = registerCraftItem("ammonia_bucket_reaction", new ProgressableItem(new FabricItemSettings(), ModBucketItems.BLEACH_BUCKET, 6, ModBlocks.MYTHRIL_BLOCK));

    private static Item registerCraftItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerCrafts() {}
}
