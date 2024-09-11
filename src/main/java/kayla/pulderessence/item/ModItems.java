package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ChargedItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItems("mythril_ingot", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_NUGGET = registerItems("mythril_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_MYTHRIL = registerItems("raw_mythril", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_ROD = registerItems("mythril_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_MYTHRIL_ROD = registerItems("charged_mythril_rod", new ChargedItem(new FabricItemSettings(), 4));

    public static final Item FAERIE_DUST = registerItems("faerie_dust", new Item(new FabricItemSettings()));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerModItems() {}
}
