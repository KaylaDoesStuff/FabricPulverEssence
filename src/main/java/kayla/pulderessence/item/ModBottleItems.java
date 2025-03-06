package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBottleItems {

    public static final Item BLEACH_BOTTLE = registerBottleItem("bleach_bottle", new GlassBottleItem(new FabricItemSettings()));
    public static final Item CHLOROFORM_BOTTLE = registerBottleItem("chloroform_bottle", new GlassBottleItem(new FabricItemSettings()));

    private static Item registerBottleItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerBottles() {}
}
