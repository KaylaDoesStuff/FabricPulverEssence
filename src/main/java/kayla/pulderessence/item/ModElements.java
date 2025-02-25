package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ElementItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModElements {

    public static final Item HYDROGEN = registerElement("hydrogen", new ElementItem(new FabricItemSettings(), "H"));

    private static Item registerElement(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, id), item);
    }

    public static void registerElementItems(){}
}
