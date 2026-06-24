package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.CompoundItem;
import kayla.pulderessence.item.types.ElementType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModOres {

    private static final List<OreEntry> ENTRIES = List.of(
        new OreEntry("hematite", Arrays.asList(ElementType.IRON, ElementType.OXYGEN), Arrays.asList(2, 3)),
        new OreEntry("magnetite", Arrays.asList(ElementType.IRON, ElementType.OXYGEN), Arrays.asList(3, 4)),
        new OreEntry("chalcopyrite", Arrays.asList(ElementType.COPPER, ElementType.IRON, ElementType.SULFUR), Arrays.asList(1, 1, 2)),
        new OreEntry("sphalerite", Arrays.asList(ElementType.ZINC, ElementType.SULFUR, ElementType.GERMANIUM, ElementType.CADMIUM, ElementType.INDIUM, ElementType.THALLIUM), Arrays.asList(1, 1, 1, 1, 1, 1)),
        new OreEntry("cassiterite", Arrays.asList(ElementType.TIN, ElementType.OXYGEN), Arrays.asList(1, 2)),
        new OreEntry("anthracite", Arrays.asList(ElementType.CARBON), Arrays.asList(1)),
        new OreEntry("pentlandite", Arrays.asList(ElementType.NICKEL, ElementType.IRON, ElementType.SULFUR), Arrays.asList(5, 4, 8)),
        new OreEntry("galena", Arrays.asList(ElementType.LEAD, ElementType.SULFUR), Arrays.asList(1, 1)),
        new OreEntry("cobaltite", Arrays.asList(ElementType.COBALT, ElementType.ARSENIC, ElementType.SULFUR), Arrays.asList(1, 1, 1)),
        new OreEntry("stibnite", Arrays.asList(ElementType.ANTIMONY, ElementType.SULFUR), Arrays.asList(2, 3)),
        new OreEntry("native_gold", Arrays.asList(ElementType.GOLD), Arrays.asList(1)),
        new OreEntry("argentite", Arrays.asList(ElementType.SILVER, ElementType.SULFUR), Arrays.asList(2, 1)),
        new OreEntry("bismuthinite", Arrays.asList(ElementType.BISMUTH, ElementType.SULFUR), Arrays.asList(2, 3)),
        new OreEntry("cinnabar", Arrays.asList(ElementType.MERCURY, ElementType.SULFUR), Arrays.asList(1, 1)),
        new OreEntry("nitratite", Arrays.asList(ElementType.SODIUM, ElementType.NITROGEN, ElementType.OXYGEN), Arrays.asList(1, 1, 3)),
        new OreEntry("bauxite", Arrays.asList(ElementType.ALUMINUM, ElementType.OXYGEN, ElementType.HYDROGEN, ElementType.GALLIUM), Arrays.asList(1, 2, 1, 1)),
        new OreEntry("magnesite", Arrays.asList(ElementType.MAGNESIUM, ElementType.CARBON, ElementType.OXYGEN), Arrays.asList(1, 1, 3)),
        new OreEntry("dolomite", Arrays.asList(ElementType.CALCIUM, ElementType.MAGNESIUM, ElementType.CARBON, ElementType.OXYGEN), Arrays.asList(1, 1, 2, 6)),
        new OreEntry("halite", Arrays.asList(ElementType.SODIUM, ElementType.CHLORINE, ElementType.BROMINE), Arrays.asList(1, 1, 1)),
        new OreEntry("sylvite", Arrays.asList(ElementType.POTASSIUM, ElementType.CHLORINE), Arrays.asList(1, 1)),
        new OreEntry("spodumene", Arrays.asList(ElementType.LITHIUM, ElementType.ALUMINUM, ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(1, 1, 2, 6)),
        new OreEntry("beryl", Arrays.asList(ElementType.BERYLLIUM, ElementType.ALUMINUM, ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(3, 2, 6, 18)),
        new OreEntry("fluorite", Arrays.asList(ElementType.CALCIUM, ElementType.FLUORINE), Arrays.asList(1, 2)),
        new OreEntry("celestine", Arrays.asList(ElementType.STRONTIUM, ElementType.SULFUR, ElementType.OXYGEN), Arrays.asList(1, 1, 4)),
        new OreEntry("barite", Arrays.asList(ElementType.BARIUM, ElementType.SULFUR, ElementType.OXYGEN), Arrays.asList(1, 1, 4)),
        new OreEntry("pollucite", Arrays.asList(ElementType.CAESIUM, ElementType.ALUMINUM, ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(1, 1, 2, 6)),
        new OreEntry("iodyrite", Arrays.asList(ElementType.SILVER, ElementType.IODINE), Arrays.asList(1, 1)),
        new OreEntry("bromyrite", Arrays.asList(ElementType.SILVER, ElementType.BROMINE), Arrays.asList(1, 1)),
        new OreEntry("ilmenite", Arrays.asList(ElementType.IRON, ElementType.TITANIUM, ElementType.OXYGEN), Arrays.asList(1, 1, 3)),
        new OreEntry("quartz", Arrays.asList(ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(1, 2)),
        new OreEntry("kernite", Arrays.asList(ElementType.SODIUM, ElementType.BORON, ElementType.OXYGEN, ElementType.HYDROGEN), Arrays.asList(2, 4, 7, 4)),
        new OreEntry("chromite", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM, ElementType.OXYGEN), Arrays.asList(1, 2, 4)),
        new OreEntry("pyrolusite", Arrays.asList(ElementType.MANGANESE, ElementType.OXYGEN), Arrays.asList(1, 2)),
        new OreEntry("columbite", Arrays.asList(ElementType.IRON, ElementType.NIOBIUM, ElementType.OXYGEN), Arrays.asList(1, 2, 6)),
        new OreEntry("tantalite", Arrays.asList(ElementType.IRON, ElementType.TANTALUM, ElementType.OXYGEN), Arrays.asList(1, 2, 6)),
        new OreEntry("zircon", Arrays.asList(ElementType.ZIRCONIUM, ElementType.SILICON, ElementType.OXYGEN, ElementType.HAFNIUM), Arrays.asList(1, 1, 4, 1)),
        new OreEntry("vanadinite", Arrays.asList(ElementType.LEAD, ElementType.VANADIUM, ElementType.OXYGEN, ElementType.CHLORINE), Arrays.asList(5, 3, 12, 1)),
        new OreEntry("wolframite", Arrays.asList(ElementType.IRON, ElementType.MANGANESE, ElementType.TUNGSTEN, ElementType.OXYGEN), Arrays.asList(1, 1, 1, 4)),
        new OreEntry("molybdenite", Arrays.asList(ElementType.MOLYBDENUM, ElementType.SULFUR), Arrays.asList(1, 2)),
        new OreEntry("rheniite", Arrays.asList(ElementType.RHENIUM, ElementType.SULFUR), Arrays.asList(1, 2)),
        new OreEntry("apatite", Arrays.asList(ElementType.CALCIUM, ElementType.PHOSPHORUS, ElementType.OXYGEN, ElementType.FLUORINE), Arrays.asList(5, 3, 12, 1)),
        new OreEntry("xenotime", Arrays.asList(ElementType.YTTRIUM, ElementType.PHOSPHORUS, ElementType.OXYGEN, ElementType.ERBIUM, ElementType.YTTERBIUM), Arrays.asList(1, 1, 4, 1, 1)),
        new OreEntry("bastnaesite", Arrays.asList(ElementType.CERIUM, ElementType.LANTHANUM, ElementType.CARBON, ElementType.OXYGEN, ElementType.FLUORINE, ElementType.NEODYMIUM, ElementType.PRASEODYMIUM), Arrays.asList(1, 1, 1, 3, 1, 1, 1)),
        new OreEntry("monazite", Arrays.asList(ElementType.LANTHANUM, ElementType.CERIUM, ElementType.NEODYMIUM, ElementType.PRASEODYMIUM, ElementType.THORIUM, ElementType.SAMARIUM, ElementType.EUROPIUM, ElementType.GADOLINIUM, ElementType.TERBIUM, ElementType.DYSPROSIUM, ElementType.HOLMIUM, ElementType.ERBIUM, ElementType.THULIUM, ElementType.YTTERBIUM, ElementType.LUTETIUM, ElementType.PHOSPHORUS, ElementType.OXYGEN), Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4)),
        new OreEntry("thorite", Arrays.asList(ElementType.THORIUM, ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(1, 1, 4)),
        new OreEntry("uraninite", Arrays.asList(ElementType.URANIUM, ElementType.OXYGEN, ElementType.POLONIUM, ElementType.RADIUM, ElementType.ACTINIUM, ElementType.PROTACTINIUM), Arrays.asList(1, 2, 1, 1, 1, 1)),
        new OreEntry("lepidolite", Arrays.asList(ElementType.POTASSIUM, ElementType.LITHIUM, ElementType.ALUMINUM, ElementType.SILICON, ElementType.OXYGEN, ElementType.FLUORINE, ElementType.HYDROGEN, ElementType.RUBIDIUM), Arrays.asList(1, 2, 1, 4, 10, 1, 2, 1)),
        new OreEntry("sperrylite", Arrays.asList(ElementType.PLATINUM, ElementType.ARSENIC), Arrays.asList(1, 2)),
        new OreEntry("iridosmine", Arrays.asList(ElementType.OSMIUM, ElementType.IRIDIUM), Arrays.asList(1, 1)),
        new OreEntry("laurite", Arrays.asList(ElementType.RUTHENIUM, ElementType.SULFUR), Arrays.asList(1, 2)),
        new OreEntry("hollingsworthite", Arrays.asList(ElementType.RHODIUM, ElementType.ARSENIC, ElementType.SULFUR), Arrays.asList(1, 1, 1)),
        new OreEntry("stibiopalladinite", Arrays.asList(ElementType.PALLADIUM, ElementType.ANTIMONY), Arrays.asList(5, 2)),
        new OreEntry("calaverite", Arrays.asList(ElementType.GOLD, ElementType.TELLURIUM), Arrays.asList(1, 2)),
        new OreEntry("clausthalite", Arrays.asList(ElementType.LEAD, ElementType.SELENIUM), Arrays.asList(1, 1)),
        new OreEntry("thortveitite", Arrays.asList(ElementType.SCANDIUM, ElementType.SILICON, ElementType.OXYGEN), Arrays.asList(2, 2, 7)),
        new OreEntry("mythrilite", Arrays.asList(ElementType.MYTHRIL), Arrays.asList(1)),
        new OreEntry("naquadite", Arrays.asList(ElementType.NAQUADAH), Arrays.asList(1)),
        new OreEntry("naquadriate", Arrays.asList(ElementType.NAQUADRIUM), Arrays.asList(1)),
        new OreEntry("energite", Arrays.asList(ElementType.ENERGIUM), Arrays.asList(1)),
        new OreEntry("eridium_vein", Arrays.asList(ElementType.ERIDIUM), Arrays.asList(1))
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerOres() {
        for (OreEntry e : ENTRIES) {
            Item item = new CompoundItem(new FabricItemSettings(), e.elements, e.amounts);
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), item);
            ITEMS.put(e.name, item);
        }
    }

    private record OreEntry(String name, List<ElementType> elements, List<Integer> amounts) {}
}
