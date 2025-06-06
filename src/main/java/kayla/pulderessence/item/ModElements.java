package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ElementItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class ModElements {


    private static final Map<Integer, ElementItem> ELEMENT_NUMBER_MAP = new HashMap<>();
    private static final Map<Integer, ElementItem> ELEMENT_MASS_MAP = new HashMap<>();
    private static final Map<ElementItem, Integer> NUMBER_ELEMENT_MAP = new HashMap<>();
    private static final Map<ElementItem, Float> MASS_ELEMENT_MAP = new HashMap<>();

    public static final ElementItem PROTON = registerElement("proton", new ElementItem(new FabricItemSettings(), "p", 1, 1.6728f));
    public static final ElementItem NEUTRON = registerElement("neutron", new ElementItem(new FabricItemSettings(), "n", 0, 1.6749f));
    public static final ElementItem ELECTRON = registerElement("electron", new ElementItem(new FabricItemSettings(), "e", 0, 0.0000019f));

    public static final ElementItem ALPHA = registerElement("alpha_particle", new ElementItem(new FabricItemSettings(), "a", 2, 6.6447f));
    public static final ElementItem BETA = registerElement("beta_particle", new ElementItem(new FabricItemSettings(), "b", 0, 0.0000019f));
    public static final ElementItem GAMMA = registerElement("gamma_photon", new ElementItem(new FabricItemSettings(), "g", 0, 0));

    public static final ElementItem HYDROGEN = registerElement("element_1", new ElementItem(new FabricItemSettings(), "H", 1, 1.008f));
    public static final ElementItem HELIUM = registerElement("element_2", new ElementItem(new FabricItemSettings(), "He", 2, 4.003f));
    public static final ElementItem LITHIUM = registerElement("element_3", new ElementItem(new FabricItemSettings(), "Li", 3, 6.941f));
    public static final ElementItem BERYLLIUM = registerElement("element_4", new ElementItem(new FabricItemSettings(), "Be", 4, 9.0122f));
    public static final ElementItem BORON = registerElement("element_5", new ElementItem(new FabricItemSettings(), "B", 5, 10.811f));
    public static final ElementItem CARBON = registerElement("element_6", new ElementItem(new FabricItemSettings(), "C", 6, 12.011f));
    public static final ElementItem NITROGEN = registerElement("element_7", new ElementItem(new FabricItemSettings(), "N", 7, 14.007f));
    public static final ElementItem OXYGEN = registerElement("element_8", new ElementItem(new FabricItemSettings(), "O", 8, 15.999f));
    public static final ElementItem FLUORINE = registerElement("element_9", new ElementItem(new FabricItemSettings(), "F", 9, 18.998f));
    public static final ElementItem NEON = registerElement("element_10", new ElementItem(new FabricItemSettings(), "Ne", 10, 20.179f));
    public static final ElementItem SODIUM = registerElement("element_11", new ElementItem(new FabricItemSettings(), "Na", 11, 22.99f));
    public static final ElementItem MAGNESIUM = registerElement("element_12", new ElementItem(new FabricItemSettings(), "Mg", 12, 24.305f));
    public static final ElementItem ALUMINUM = registerElement("element_13", new ElementItem(new FabricItemSettings(), "Al",13, 26.982f));
    public static final ElementItem SILICON = registerElement("element_14", new ElementItem(new FabricItemSettings(), "Si", 14, 28.086f));
    public static final ElementItem PHOSPHOR = registerElement("element_15", new ElementItem(new FabricItemSettings(), "P", 15, 30.974f));
    public static final ElementItem SULFUR = registerElement("element_16", new ElementItem(new FabricItemSettings(), "S", 16, 32.065f));
    public static final ElementItem CHLORINE = registerElement("element_17", new ElementItem(new FabricItemSettings(), "Cl", 17, 35.453f));
    public static final ElementItem ARGON = registerElement("element_18", new ElementItem(new FabricItemSettings(), "Ar", 18, 39.948f));
    public static final ElementItem POTASSIUM = registerElement("element_19", new ElementItem(new FabricItemSettings(), "K", 19, 39.098f));
    public static final ElementItem CALCIUM = registerElement("element_20", new ElementItem(new FabricItemSettings(), "Ca", 20, 40.078f));
    public static final ElementItem SCANDIUM = registerElement("element_21", new ElementItem(new FabricItemSettings(), "Sc", 21, 44.956f));
    public static final ElementItem TITANIUM = registerElement("element_22", new ElementItem(new FabricItemSettings(), "Ti", 22, 47.867f));
    public static final ElementItem VANADIUM = registerElement("element_23", new ElementItem(new FabricItemSettings(), "V", 23, 50.942f));
    public static final ElementItem CHROMIUM = registerElement("element_24", new ElementItem(new FabricItemSettings(), "Cr", 24, 51.996f));
    public static final ElementItem MANGANESE = registerElement("element_25", new ElementItem(new FabricItemSettings(), "Mn", 25, 54.938f));
    public static final ElementItem IRON = registerElement("element_26", new ElementItem(new FabricItemSettings(), "Fe", 26, 55.845f));
    public static final ElementItem COBALT = registerElement("element_27", new ElementItem(new FabricItemSettings(), "Co", 27, 58.933f));
    public static final ElementItem NICKEL = registerElement("element_28", new ElementItem(new FabricItemSettings(), "Ni", 28, 58.963f));
    public static final ElementItem COPPER = registerElement("element_29", new ElementItem(new FabricItemSettings(), "Cu", 29, 63.546f));
    public static final ElementItem ZINC = registerElement("element_30", new ElementItem(new FabricItemSettings(), "Zn", 30, 65.39f));
    public static final ElementItem GALLIUM = registerElement("element_31", new ElementItem(new FabricItemSettings(), "Ga", 31, 69.723f));
    public static final ElementItem GERMANIUM = registerElement("element_32", new ElementItem(new FabricItemSettings(), "Ge",32, 72.64f));
    public static final ElementItem ARSENIC = registerElement("element_33", new ElementItem(new FabricItemSettings(), "As", 33,74.922f));
    public static final ElementItem SELENIUM = registerElement("element_34", new ElementItem(new FabricItemSettings(), "Se", 34, 78.96f));
    public static final ElementItem BROMINE = registerElement("element_35", new ElementItem(new FabricItemSettings(), "Br",35, 79.904f));
    public static final ElementItem KRYPTON = registerElement("element_36", new ElementItem(new FabricItemSettings(), "Kr", 36, 83.8f));
    public static final ElementItem RUBIDIUM = registerElement("element_37", new ElementItem(new FabricItemSettings(), "Rb", 37, 85.468f));
    public static final ElementItem STRONTIUM = registerElement("element_38", new ElementItem(new FabricItemSettings(), "Sr", 38, 87.62f));
    public static final ElementItem YTTRIUM = registerElement("element_39", new ElementItem(new FabricItemSettings(), "Y", 39, 88.906f));
    public static final ElementItem ZIRCONIUM = registerElement("element_40", new ElementItem(new FabricItemSettings(), "Zr", 40, 91.224f));
    public static final ElementItem NIOBIUM = registerElement("element_41", new ElementItem(new FabricItemSettings(), "Nb", 41, 92.906f));
    public static final ElementItem MOLYBDENUM = registerElement("element_42", new ElementItem(new FabricItemSettings(), "Mo", 42, 95.94f));
    public static final ElementItem TECHNETIUM = registerElement("element_43", new ElementItem(new FabricItemSettings(), "Tc", 43, 98));
    public static final ElementItem RUTHENIUM = registerElement("element_44", new ElementItem(new FabricItemSettings(), "Ru", 44, 101.07f));
    public static final ElementItem RHODIUM = registerElement("element_45", new ElementItem(new FabricItemSettings(), "Rh", 45, 102.91f));
    public static final ElementItem PALLADIUM = registerElement("element_46", new ElementItem(new FabricItemSettings(), "Pd", 46, 106.42f));
    public static final ElementItem SILVER = registerElement("element_47", new ElementItem(new FabricItemSettings(), "Ag", 47, 107.87f));
    public static final ElementItem CADMIUM = registerElement("element_48", new ElementItem(new FabricItemSettings(), "Cd", 48, 112.41f));
    public static final ElementItem INDIUM = registerElement("element_49", new ElementItem(new FabricItemSettings(), "In", 49,114.82f));
    public static final ElementItem TIN = registerElement("element_50", new ElementItem(new FabricItemSettings(), "Sn", 50, 118.71f));
    public static final ElementItem ANTIMONY = registerElement("element_51", new ElementItem(new FabricItemSettings(), "Sb", 51, 121.76f));
    public static final ElementItem TELLURIUM = registerElement("element_52", new ElementItem(new FabricItemSettings(), "Te", 52, 127.6f));
    public static final ElementItem IODINE = registerElement("element_53", new ElementItem(new FabricItemSettings(), "I", 53, 126.9f));
    public static final ElementItem XENON = registerElement("element_54", new ElementItem(new FabricItemSettings(), "Xe", 54, 131.29f));
    public static final ElementItem CAESIUM = registerElement("element_55", new ElementItem(new FabricItemSettings(), "Cs", 55, 132.91f));
    public static final ElementItem BARIUM = registerElement("element_56", new ElementItem(new FabricItemSettings(), "Ba", 56, 137.33f));
    public static final ElementItem LANTHANIUM = registerElement("element_57", new ElementItem(new FabricItemSettings(), "La", 57, 138.91f));
    public static final ElementItem CERIUM = registerElement("element_58", new ElementItem(new FabricItemSettings(), "Ce", 58, 140.12f));
    public static final ElementItem PRASEODYMIUM = registerElement("element_59", new ElementItem(new FabricItemSettings(), "Pr", 59, 140.91f));
    public static final ElementItem NEODYMIUM = registerElement("element_60", new ElementItem(new FabricItemSettings(), "Nd", 60, 144.24f));
    public static final ElementItem PROMETHIUM = registerElement("element_61", new ElementItem(new FabricItemSettings(), "Pm", 61, 145));
    public static final ElementItem SAMARIUM = registerElement("element_62", new ElementItem(new FabricItemSettings(), "Sm", 62, 150.36f));
    public static final ElementItem EUROPIUM = registerElement("element_63", new ElementItem(new FabricItemSettings(), "Eu", 63, 151.96f));
    public static final ElementItem GADOLINIUM = registerElement("element_64", new ElementItem(new FabricItemSettings(), "Gd", 64, 157.25f));
    public static final ElementItem TERBIUM = registerElement("element_65", new ElementItem(new FabricItemSettings(), "Tb", 65, 158.93f));
    public static final ElementItem DYSPROSIUM = registerElement("element_66", new ElementItem(new FabricItemSettings(), "Dy", 66, 162.5f));
    public static final ElementItem HOLMIUM = registerElement("element_67", new ElementItem(new FabricItemSettings(), "Ho", 67, 164.93f));
    public static final ElementItem ERBIUM = registerElement("element_68", new ElementItem(new FabricItemSettings(), "Er", 68, 167.26f));
    public static final ElementItem THULLIUM = registerElement("element_69", new ElementItem(new FabricItemSettings(), "Tm", 69, 168.93f));
    public static final ElementItem YTTERBIUM = registerElement("element_70", new ElementItem(new FabricItemSettings(), "Yb", 70, 173.04f));
    public static final ElementItem LUTETIUM = registerElement("element_71", new ElementItem(new FabricItemSettings(), "Lu", 71, 174.97f));
    public static final ElementItem HAFNIUM = registerElement("element_72", new ElementItem(new FabricItemSettings(), "Hf", 72, 178.49f));
    public static final ElementItem TANTALUM = registerElement("element_73", new ElementItem(new FabricItemSettings(), "Ta", 73, 180.95f));
    public static final ElementItem TUNGSTEN = registerElement("element_74", new ElementItem(new FabricItemSettings(), "W", 74, 183.84f));
    public static final ElementItem RHENIUM = registerElement("element_75", new ElementItem(new FabricItemSettings(), "Re", 75, 186.21f));
    public static final ElementItem OSMIUM = registerElement("element_76", new ElementItem(new FabricItemSettings(), "Os", 76, 190.23f));
    public static final ElementItem IRIDIUM = registerElement("element_77", new ElementItem(new FabricItemSettings(), "Ir", 77, 192.22f));
    public static final ElementItem PLATINUM = registerElement("element_78", new ElementItem(new FabricItemSettings(), "Pt", 78, 195.08f));
    public static final ElementItem GOLD = registerElement("element_79", new ElementItem(new FabricItemSettings(), "Au", 79, 196.97f));
    public static final ElementItem MERCURY = registerElement("element_80", new ElementItem(new FabricItemSettings(), "Hg", 80, 200.59f));
    public static final ElementItem THALLIUM = registerElement("element_81", new ElementItem(new FabricItemSettings(), "Tl", 81, 204.38f));
    public static final ElementItem LEAD = registerElement("element_82", new ElementItem(new FabricItemSettings(), "Pb", 82, 207.2f));
    public static final ElementItem BISMUTH = registerElement("element_83", new ElementItem(new FabricItemSettings(), "Bi", 83, 208.98f));
    public static final ElementItem POLONIUM = registerElement("element_84", new ElementItem(new FabricItemSettings(), "Po", 84, 209));
    public static final ElementItem ASTATINE = registerElement("element_85", new ElementItem(new FabricItemSettings(), "At", 85, 210));
    public static final ElementItem RADON = registerElement("element_86", new ElementItem(new FabricItemSettings(), "Rn", 86, 222));
    public static final ElementItem FRANCIUM = registerElement("element_87", new ElementItem(new FabricItemSettings(), "Fr", 87, 223));
    public static final ElementItem RADIUM = registerElement("element_88", new ElementItem(new FabricItemSettings(), "Ra", 88, 226));
    public static final ElementItem ACTINIUM = registerElement("element_89", new ElementItem(new FabricItemSettings(), "Ac", 89, 227));
    public static final ElementItem THORIUM = registerElement("element_90", new ElementItem(new FabricItemSettings(), "Th", 90, 232.04f));
    public static final ElementItem PROTACTINIUM = registerElement("element_91", new ElementItem(new FabricItemSettings(), "Pa", 91, 231.04f));
    public static final ElementItem URANIUM = registerElement("element_92", new ElementItem(new FabricItemSettings(), "U", 92, 238.03f));
    public static final ElementItem NEPTUNIUM = registerElement("element_93", new ElementItem(new FabricItemSettings(), "Np", 93, 237));
    public static final ElementItem PLUTONIUM = registerElement("element_94", new ElementItem(new FabricItemSettings(), "Pu", 94, 244));
    public static final ElementItem AMERICIUM = registerElement("element_95", new ElementItem(new FabricItemSettings(), "Am", 95, 243));
    public static final ElementItem CURIUM = registerElement("element_96", new ElementItem(new FabricItemSettings(), "Cm", 96, 247));
    public static final ElementItem BERKELLIUM = registerElement("element_97", new ElementItem(new FabricItemSettings(), "Bk", 97, 247));
    public static final ElementItem CALIFORNIUM = registerElement("element_98", new ElementItem(new FabricItemSettings(), "Cf", 98, 251));
    public static final ElementItem EINSTEINIUM = registerElement("element_99", new ElementItem(new FabricItemSettings(), "Es", 99, 252));
    public static final ElementItem FERMIUM = registerElement("element_100", new ElementItem(new FabricItemSettings(), "Fm", 100, 257));
    public static final ElementItem MENDELEVLUM = registerElement("element_101", new ElementItem(new FabricItemSettings(), "Md", 101, 258));
    public static final ElementItem NOBELIUM = registerElement("element_102", new ElementItem(new FabricItemSettings(), "No", 102, 259));
    public static final ElementItem LAWRENCIUM = registerElement("element_103", new ElementItem(new FabricItemSettings(), "Lr", 103, 262));
    public static final ElementItem RUTHERFORDIUM = registerElement("element_104", new ElementItem(new FabricItemSettings(), "Rf", 104, 261));
    public static final ElementItem DUBNIUM = registerElement("element_105", new ElementItem(new FabricItemSettings(), "Db", 105, 262));
    public static final ElementItem SEABORGIUM = registerElement("element_106", new ElementItem(new FabricItemSettings(), "Sg", 106, 266));
    public static final ElementItem BOHRIUM = registerElement("element_107", new ElementItem(new FabricItemSettings(), "Bh", 107, 264));
    public static final ElementItem HASSIUM = registerElement("element_108", new ElementItem(new FabricItemSettings(), "Hs", 108, 277));
    public static final ElementItem MEITNERIUM = registerElement("element_109", new ElementItem(new FabricItemSettings(), "Mt", 109, 268));
    public static final ElementItem DARMSTADTIUM = registerElement("element_110", new ElementItem(new FabricItemSettings(), "Ds", 110, 281));
    public static final ElementItem ROENTGENIUM = registerElement("element_111", new ElementItem(new FabricItemSettings(), "Rg", 111, 272));
    public static final ElementItem COPERNICIUM = registerElement("element_112", new ElementItem(new FabricItemSettings(), "Cn", 112, 285));
    public static final ElementItem NIHONIUM = registerElement("element_113", new ElementItem(new FabricItemSettings(), "Nh", 113, 284));
    public static final ElementItem FLEVORIUM = registerElement("element_114", new ElementItem(new FabricItemSettings(), "Fl", 114, 289));
    public static final ElementItem MOSCOVIUM = registerElement("element_115", new ElementItem(new FabricItemSettings(), "Mc", 115, 288));
    public static final ElementItem LIVERMORIUM = registerElement("element_116", new ElementItem(new FabricItemSettings(), "Lv", 116, 291));
    public static final ElementItem TENNESSINE = registerElement("element_117", new ElementItem(new FabricItemSettings(), "Ts", 117, 294));
    public static final ElementItem OGANESSON = registerElement("element_118", new ElementItem(new FabricItemSettings(), "Og", 118, 294));

    //Fictional Elements
    public static final ElementItem ERIDIUM = registerElement("felement_1", new ElementItem(new FabricItemSettings(), "Ed", 40,91.82f));

    public float getMass(ElementItem element) {
        return element.atomicMass;
    }
    public static int getAtomicNumber(ElementItem element) {
        return element.atomicNumber;
    }

    public static ElementItem getElementFromNumber(int atomicNumber) {
        return ELEMENT_NUMBER_MAP.get(atomicNumber);
    }
    public static int getNumberFromElement(ElementItem element) {
        return NUMBER_ELEMENT_MAP.get(element);
    }
    public static ElementItem getElementFromMass(float mass) {
        return ELEMENT_MASS_MAP.get(Math.round(mass));
    }
    public static float getMassFromElement(ElementItem element) {
        return MASS_ELEMENT_MAP.get(element);
    }

    private static ElementItem registerElement(String id, ElementItem item) {
        ElementItem registeredItem = (ElementItem) Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, id), item);

        ELEMENT_NUMBER_MAP.put(item.atomicNumber, registeredItem);
        ELEMENT_MASS_MAP.put(Math.round(item.atomicMass), registeredItem);
        NUMBER_ELEMENT_MAP.put(registeredItem, item.atomicNumber);
        MASS_ELEMENT_MAP.put(registeredItem, item.atomicMass);

        return registeredItem;
    }

    public static void registerElementItems(){}
}
