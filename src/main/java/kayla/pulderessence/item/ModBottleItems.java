package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModBottleItems {

    private static final List<String> ENTRIES = List.of(
        "bleach_bottle", "chloroform_bottle"
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerBottles() {
        for (String name : ENTRIES) {
            Item item = new GlassBottleItem(new FabricItemSettings());
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
            ITEMS.put(name, item);
        }
    }
}
