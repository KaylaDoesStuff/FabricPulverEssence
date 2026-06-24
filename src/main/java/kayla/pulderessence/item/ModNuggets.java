package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModNuggets {

    private static final List<String> ENTRIES = List.of(
        "lead_nugget", "yttrium_nugget", "tungsten_nugget",
        "indium_nugget", "mythril_nugget", "silver_nugget"
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerNuggets() {
        for (String name : ENTRIES) {
            Item item = new Item(new FabricItemSettings());
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
            ITEMS.put(name, item);
        }
    }
}
