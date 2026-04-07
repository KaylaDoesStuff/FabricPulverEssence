package kayla.pulderessence.item.ore;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.CompoundItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;

public class RawOreItem {

    public static final CompoundItem RAW_HEMATITE_ORE = registerCompoundItem("raw_hematite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "O"), Arrays.asList(2, 3)));
    public static final CompoundItem RAW_MAGNETITE_ORE = registerCompoundItem("raw_magnetite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "O"), Arrays.asList(3, 4)));

    private static CompoundItem registerCompoundItem(String name, CompoundItem item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }
}
