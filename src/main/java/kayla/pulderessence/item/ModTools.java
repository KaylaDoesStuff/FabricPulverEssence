package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModTools {

    private static final List<ToolEntry> ENTRIES = List.of(
        new ToolEntry("mythril_sword", new SwordItem(ModToolMaterial.MYTHRIL, 4, 1, new FabricItemSettings().maxCount(1))),
        new ToolEntry("mythril_axe", new AxeItem(ModToolMaterial.MYTHRIL, 6, 0, new FabricItemSettings().maxCount(1))),
        new ToolEntry("mythril_pickaxe", new PickaxeItem(ModToolMaterial.MYTHRIL, 3, 2, new FabricItemSettings().maxCount(1))),
        new ToolEntry("mythril_shovel", new ShovelItem(ModToolMaterial.MYTHRIL, 2, 3, new FabricItemSettings().maxCount(1))),
        new ToolEntry("mythril_hoe", new HoeItem(ModToolMaterial.MYTHRIL, 0, 4, new FabricItemSettings().maxCount(1)))
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerTools() {
        for (ToolEntry e : ENTRIES) {
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), e.item);
            ITEMS.put(e.name, e.item);
        }
    }

    private record ToolEntry(String name, Item item) {}
}
