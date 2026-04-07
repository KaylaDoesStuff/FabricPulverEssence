package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.CompoundItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;


public class IngotItem {

    public static final CompoundItem IRON_INGOT = registerIngot("iron_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe"), Arrays.asList(1)));
    public static final CompoundItem COPPER_INGOT = registerIngot("copper_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu"), Arrays.asList(1)));
    public static final CompoundItem GOLD_INGOT = registerIngot("gold_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Au"), Arrays.asList(1)));
    public static final CompoundItem CUPRONICKEL_INGOT = registerIngot("cupronickel_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "Ni"), Arrays.asList(1, 1)));
    public static final CompoundItem LEAD_INGOT = registerIngot("lead_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb"), Arrays.asList(1)));
    public static final CompoundItem SILICON_INGOT = registerIngot("silicon_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Si"), Arrays.asList(1)));
    public static final CompoundItem SILVER_INGOT = registerIngot("silver_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ag"), Arrays.asList(1)));
    public static final CompoundItem YTTRIUM_INGOT = registerIngot("yttrium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Y"), Arrays.asList(1)));
    public static final CompoundItem INDIUM_INGOT = registerIngot("indium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("In"), Arrays.asList(1)));
    public static final CompoundItem TUNGSTEN_INGOT = registerIngot("tungsten_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("W"), Arrays.asList(1)));
    public static final CompoundItem MYTHRIL_INGOT = registerIngot("mythril_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("My"), Arrays.asList(1)));
    public static final CompoundItem ALUMINUM_INGOT = registerIngot("aluminum_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Al"), Arrays.asList(1)));
    public static final CompoundItem BRONZE_INGOT = registerIngot("bronze_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Sn", "Cu"), Arrays.asList(1, 3)));
    public static final CompoundItem CARBON_INGOT = registerIngot("carbon_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("C"), Arrays.asList(1)));
    public static final CompoundItem CHROMIUM_INGOT = registerIngot("chromium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cr"), Arrays.asList(1)));
    public static final CompoundItem COBALT_INGOT = registerIngot("cobalt_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Co"), Arrays.asList(1)));
    public static final CompoundItem ERIDIUM_INGOT = registerIngot("eridium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ed"), Arrays.asList(1)));
    public static final CompoundItem GALLIUM_INGOT = registerIngot("gallium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ga"), Arrays.asList(1)));
    public static final CompoundItem GERMANIUM_INGOT = registerIngot("germanium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ge"), Arrays.asList(1)));
    public static final CompoundItem IRIDIUM_INGOT = registerIngot("iridium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ir"), Arrays.asList(1)));
    public static final CompoundItem MAGNESIUM_INGOT = registerIngot("magnesium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mg"), Arrays.asList(1)));
    public static final CompoundItem MANGANESE_INGOT = registerIngot("manganese_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mn"), Arrays.asList(1)));
    public static final CompoundItem NAQUADAH_INGOT = registerIngot("naquadah_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Nq", "Ir", "Tc", "3H"), Arrays.asList(75, 8, 3, 12)));
    public static final CompoundItem NICKEL_INGOT = registerIngot("nickel_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ni"), Arrays.asList(1)));
    public static final CompoundItem TITANIUM_INGOT = registerIngot("titanium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ti"), Arrays.asList(1)));
    public static final CompoundItem VANADIUM_INGOT = registerIngot("vanadium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("V"), Arrays.asList(1)));
    public static final CompoundItem ZINC_INGOT = registerIngot("zinc_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Zn"), Arrays.asList(1)));
    public static final CompoundItem BERYLLIUM_INGOT = registerIngot("beryllium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Be"), Arrays.asList(1)));
    public static final CompoundItem DUBNIUM_INGOT = registerIngot("dubnium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Db"), Arrays.asList(1)));
    public static final CompoundItem DYSPROSIUM_INGOT = registerIngot("dysprosium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Dy"), Arrays.asList(1)));
    public static final CompoundItem ENERGIUM_INGOT = registerIngot("energium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Eg"), Arrays.asList(1)));
    public static final CompoundItem RUBIDIUM_INGOT = registerIngot("rubidium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Rb"), Arrays.asList(1)));
    public static final CompoundItem RUTHENIUM_INGOT = registerIngot("ruthenium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ru"), Arrays.asList(1)));
    public static final CompoundItem RUTHERFORDIUM_INGOT = registerIngot("rutherfordium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Rf"), Arrays.asList(1)));
    public static final CompoundItem STRONTIUM_INGOT = registerIngot("strontium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Sr"), Arrays.asList(1)));
    public static final CompoundItem TANTALUM_INGOT = registerIngot("tantalum_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ta"), Arrays.asList(1)));
    public static final CompoundItem THORIUM_INGOT = registerIngot("thorium_ingot", new CompoundItem(new FabricItemSettings(), Arrays.asList("Th"), Arrays.asList(1)));
    public static CompoundItem registerIngot(String name, CompoundItem item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }
    
    public static void registerIngotItems() {}
}
