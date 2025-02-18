package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ItemOverride;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CompoundItems {

    public static Item IRON_INGOT = registerCompound("iron_ingot", new ItemOverride(new FabricItemSettings(), Text.literal("Fe")));
    public static Item COPPER_INGOT = registerCompound("copper_ingot", new ItemOverride(new FabricItemSettings(), Text.literal("Cu")));

    private static Item registerCompound(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerCompounds() {}
}
