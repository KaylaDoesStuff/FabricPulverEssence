package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBucketItems {

    public static final Item AMMONIA_BUCKET = registerBucketItem("ammonia_bucket", new Item(new FabricItemSettings()));
    public static final Item SULFURIC_ACID_BUCKET = registerBucketItem("sulfuric_acid_bucket", new Item(new FabricItemSettings()));

    private static Item registerBucketItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerBuckets() {}
}
