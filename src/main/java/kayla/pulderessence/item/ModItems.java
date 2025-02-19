package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ChargedItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItems("mythril_ingot", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_NUGGET = registerItems("mythril_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_MYTHRIL = registerItems("raw_mythril", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_ROD = registerItems("mythril_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_MYTHRIL_ROD = registerItems("charged_mythril_rod", new ChargedItem(new FabricItemSettings(), 2));

    public static final Item INDIUM_INGOT = registerItems("indium_ingot", new Item(new FabricItemSettings()));
    public static final Item INDIUM_NUGGET = registerItems("indium_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_INDIUM = registerItems("raw_indium", new Item(new FabricItemSettings()));
    public static final Item INDIUM_ROD = registerItems("indium_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_INDIUM_ROD = registerItems("charged_indium_rod", new ChargedItem(new FabricItemSettings(), 14));

    public static final Item TUNGSTEN_INGOT = registerItems("tungsten_ingot", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_NUGGET = registerItems("tungsten_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_TUNGSTEN = registerItems("raw_tungsten", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_ROD = registerItems("tungsten_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_TUNGSTEN_ROD = registerItems("charged_tungsten_rod", new ChargedItem(new FabricItemSettings(), 4));

    public static final Item YTTRIUM_INGOT = registerItems("yttrium_ingot", new Item(new FabricItemSettings()));
    public static final Item YTTRIUM_NUGGET = registerItems("yttrium_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_YTTRIUM = registerItems("raw_yttrium", new Item(new FabricItemSettings()));
    public static final Item YTTRIUM_ROD = registerItems("yttrium_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_YTTRIUM_ROD = registerItems("charged_yttrium_rod", new ChargedItem(new FabricItemSettings(), 12));

    public static final Item ENERGIUM_SHARD = registerItems("energium_shard", new Item(new FabricItemSettings()));
    public static final Item RAW_ENERGIUM = registerItems("raw_energium", new Item(new FabricItemSettings()));
    public static final Item ENERGIUM_ROD = registerItems("energium_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_ENERGIUM_ROD = registerItems("charged_energium_rod", new ChargedItem(new FabricItemSettings(), 16));

    public static final Item FAERIE_DUST = registerItems("faerie_dust", new Item(new FabricItemSettings()));
    public static final Item FAERIE_ROD = registerItems("faerie_rod", new Item(new FabricItemSettings()));
    public static final Item CHARGED_FAERIE_ROD = registerItems("charged_faerie_rod", new ChargedItem(new FabricItemSettings(), 8));

    public static final Item MYTHRIL_SWORD = registerItems("mythril_sword", new SwordItem(ModToolMaterial.MYTHRIL, 4, 1, new FabricItemSettings().maxCount(1)));
    public static final Item MYTHRIL_AXE = registerItems("mythril_axe", new AxeItem(ModToolMaterial.MYTHRIL, 6, 0, new FabricItemSettings().maxCount(1)));
    public static final Item MYTHRIL_PICKAXE = registerItems("mythril_pickaxe", new PickaxeItem(ModToolMaterial.MYTHRIL, 3, 2, new FabricItemSettings().maxCount(1)));
    public static final Item MYTHRIL_SHOVEL = registerItems("mythril_shovel", new ShovelItem(ModToolMaterial.MYTHRIL, 2, 3, new FabricItemSettings().maxCount(1)));
    public static final Item MYTHRIL_HOE = registerItems("mythril_hoe", new HoeItem(ModToolMaterial.MYTHRIL, 0, 4, new FabricItemSettings().maxCount(1)));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerModItems() {}
}
