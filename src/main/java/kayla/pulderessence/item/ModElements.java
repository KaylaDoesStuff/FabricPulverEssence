package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ElementItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModElements {

    public static final Item HYDROGEN = registerElement("element_1", new ElementItem(new FabricItemSettings(), "H", 1, 1.008f));
    public static final Item HELIUM = registerElement("element_2", new ElementItem(new FabricItemSettings(), "He", 2, 4.003f));
    public static final Item LITHIUM = registerElement("element_3", new ElementItem(new FabricItemSettings(), "Li", 3, 6.941f));
    public static final Item BERYLLIUM = registerElement("element_4", new ElementItem(new FabricItemSettings(), "Be", 4, 9.0122f));
    public static final Item BORON = registerElement("element_5", new ElementItem(new FabricItemSettings(), "B", 5, 10.811f));
    public static final Item CARBON = registerElement("element_6", new ElementItem(new FabricItemSettings(), "C", 6, 12.011f));
    public static final Item NITROGEN = registerElement("element_7", new ElementItem(new FabricItemSettings(), "N", 7, 14.007f));
    public static final Item OXYGEN = registerElement("element_8", new ElementItem(new FabricItemSettings(), "O", 8, 15.999f));
    public static final Item FLUORINE = registerElement("element_9", new ElementItem(new FabricItemSettings(), "F", 9, 18.998f));
    public static final Item NEON = registerElement("element_10", new ElementItem(new FabricItemSettings(), "Ne", 10, 20.179f));
    public static final Item SODIUM = registerElement("element_11", new ElementItem(new FabricItemSettings(), "Na", 11, 22.99f));
    public static final Item MAGNESIUM = registerElement("element_12", new ElementItem(new FabricItemSettings(), "Mg", 12, 24.305f));
    public static final Item ALUMINUM = registerElement("element_13", new ElementItem(new FabricItemSettings(), "Al",13, 26.982f));
    public static final Item SILICON = registerElement("element_14", new ElementItem(new FabricItemSettings(), "Si", 14, 28.086f));
    public static final Item PHOSPHOR = registerElement("element_15", new ElementItem(new FabricItemSettings(), "P", 15, 30.974f));
    public static final Item SULFUR = registerElement("element_16", new ElementItem(new FabricItemSettings(), "S", 16, 32.065f));
    public static final Item CHLORINE = registerElement("element_17", new ElementItem(new FabricItemSettings(), "Cl", 17, 35.453f));
    public static final Item ARGON = registerElement("element_18", new ElementItem(new FabricItemSettings(), "Ar", 18, 39.948f));
    public static final Item POTASSIUM = registerElement("element_19", new ElementItem(new FabricItemSettings(), "K", 19, 39.098f));
    public static final Item CALCIUM = registerElement("element_20", new ElementItem(new FabricItemSettings(), "Ca", 20, 40.078f));
    public static final Item SCANDIUM = registerElement("element_21", new ElementItem(new FabricItemSettings(), "Sc", 21, 44.956f));
    public static final Item TITANIUM = registerElement("element_22", new ElementItem(new FabricItemSettings(), "Ti", 22));
    public static final Item VANADIUM = registerElement("element_23", new ElementItem(new FabricItemSettings(), "V", 23));
    public static final Item CHROMIUM = registerElement("element_24", new ElementItem(new FabricItemSettings(), "Cr", 24));
    public static final Item MANGANESE = registerElement("element_25", new ElementItem(new FabricItemSettings(), "Mn", 25));
    public static final Item IRON = registerElement("element_26", new ElementItem(new FabricItemSettings(), "Fe"));
    public static final Item COBALT = registerElement("element_27", new ElementItem(new FabricItemSettings(), "Co"));
    public static final Item NICKEL = registerElement("element_28", new ElementItem(new FabricItemSettings(), "Ni"));
    public static final Item COPPER = registerElement("element_29", new ElementItem(new FabricItemSettings(), "Cu"));
    public static final Item ZINC = registerElement("element_30", new ElementItem(new FabricItemSettings(), "Zn"));
    public static final Item GALLIUM = registerElement("element_31", new ElementItem(new FabricItemSettings(), "Ga"));
    public static final Item GERMANIUM = registerElement("element_32", new ElementItem(new FabricItemSettings(), "Ge"));
    public static final Item ARSENIC = registerElement("element_33", new ElementItem(new FabricItemSettings(), "As"));
    public static final Item SELENIUM = registerElement("element_34", new ElementItem(new FabricItemSettings(), "Se"));
    public static final Item BROMINE = registerElement("element_35", new ElementItem(new FabricItemSettings(), "Br"));
    public static final Item KRYPTON = registerElement("element_36", new ElementItem(new FabricItemSettings(), "Kr"));
    public static final Item RUBIDIUM = registerElement("element_37", new ElementItem(new FabricItemSettings(), "Rb"));
    public static final Item STRONTIUM = registerElement("element_38", new ElementItem(new FabricItemSettings(), "Sr"));
    public static final Item YTTRIUM = registerElement("element_39", new ElementItem(new FabricItemSettings(), "Y"));
    public static final Item ZIRCONIUM = registerElement("element_40", new ElementItem(new FabricItemSettings(), "Zr"));
    public static final Item NIOBIUM = registerElement("element_41", new ElementItem(new FabricItemSettings(), "Nb"));
    public static final Item MOLYBDENUM = registerElement("element_42", new ElementItem(new FabricItemSettings(), "Mo"));
    public static final Item TECHNETIUM = registerElement("element_43", new ElementItem(new FabricItemSettings(), "Tc"));
    public static final Item RUTHENIUM = registerElement("element_44", new ElementItem(new FabricItemSettings(), "Ru"));
    public static final Item RHODIUM = registerElement("element_45", new ElementItem(new FabricItemSettings(), "Rh"));
    public static final Item PALLADIUM = registerElement("element_46", new ElementItem(new FabricItemSettings(), "Pd"));
    public static final Item SILVER = registerElement("element_47", new ElementItem(new FabricItemSettings(), "Ag"));
    public static final Item CADMIUM = registerElement("element_48", new ElementItem(new FabricItemSettings(), "Cd"));
    public static final Item INDIUM = registerElement("element_49", new ElementItem(new FabricItemSettings(), "In"));
    public static final Item TIN = registerElement("element_50", new ElementItem(new FabricItemSettings(), "Sn"));
    public static final Item ANTIMONY = registerElement("element_51", new ElementItem(new FabricItemSettings(), "Sb"));
    public static final Item TELLURIUM = registerElement("element_52", new ElementItem(new FabricItemSettings(), "Te"));
    public static final Item IODINE = registerElement("element_53", new ElementItem(new FabricItemSettings(), "I"));
    public static final Item XENON = registerElement("element_54", new ElementItem(new FabricItemSettings(), "Xe"));
    public static final Item CAESIUM = registerElement("element_55", new ElementItem(new FabricItemSettings(), "Cs"));
    public static final Item BARIUM = registerElement("element_56", new ElementItem(new FabricItemSettings(), "Ba"));
    public static final Item LANTHANIUM = registerElement("element_57", new ElementItem(new FabricItemSettings(), "Lz"));
    public static final Item CERIUM = registerElement("element_58", new ElementItem(new FabricItemSettings(), "Ce"));
    public static final Item PRASEODYMIUM = registerElement("element_59", new ElementItem(new FabricItemSettings(), "Pr"));
    public static final Item NEODYMIUM = registerElement("element_60", new ElementItem(new FabricItemSettings(), "Nd"));
    public static final Item PROMETHIUM = registerElement("element_61", new ElementItem(new FabricItemSettings(), "Pm"));
    public static final Item SAMARIUM = registerElement("element_62", new ElementItem(new FabricItemSettings(), "Sm"));
    public static final Item EUROPIUM = registerElement("element_63", new ElementItem(new FabricItemSettings(), "Eu"));
    public static final Item GADOLINIUM = registerElement("element_64", new ElementItem(new FabricItemSettings(), "Gd"));
    public static final Item TERBIUM = registerElement("element_65", new ElementItem(new FabricItemSettings(), "Tb"));
    public static final Item DYSPROSIUM = registerElement("element_66", new ElementItem(new FabricItemSettings(), "Dy"));
    public static final Item HOLMIUM = registerElement("element_67", new ElementItem(new FabricItemSettings(), "Ho"));
    public static final Item ERBIUM = registerElement("element_68", new ElementItem(new FabricItemSettings(), "Er"));
    public static final Item THULLIUM = registerElement("element_69", new ElementItem(new FabricItemSettings(), "Tm"));
    public static final Item YTTERBIUM = registerElement("element_70", new ElementItem(new FabricItemSettings(), "Yb"));
    public static final Item LUTETIUM = registerElement("element_71", new ElementItem(new FabricItemSettings(), "Lu"));
    public static final Item HAFNIUM = registerElement("element_72", new ElementItem(new FabricItemSettings(), "Hf"));
    public static final Item TANTALUM = registerElement("element_73", new ElementItem(new FabricItemSettings(), "Ta"));
    public static final Item TUNGSTEN = registerElement("element_74", new ElementItem(new FabricItemSettings(), "W"));
    public static final Item RHENIUM = registerElement("element_75", new ElementItem(new FabricItemSettings(), "Re"));
    public static final Item OSMIUM = registerElement("element_76", new ElementItem(new FabricItemSettings(), "Os"));
    public static final Item IRIDIUM = registerElement("element_77", new ElementItem(new FabricItemSettings(), "Ir"));
    public static final Item PLATINUM = registerElement("element_78", new ElementItem(new FabricItemSettings(), "Pt"));
    public static final Item GOLD = registerElement("element_79", new ElementItem(new FabricItemSettings(), "Au"));
    public static final Item MERCURY = registerElement("element_80", new ElementItem(new FabricItemSettings(), "Hg"));
    public static final Item THALLIUM = registerElement("element_81", new ElementItem(new FabricItemSettings(), "Tl"));
    public static final Item LEAD = registerElement("element_82", new ElementItem(new FabricItemSettings(), "Pb"));
    public static final Item BISMUTH = registerElement("element_83", new ElementItem(new FabricItemSettings(), "Bi"));
    public static final Item POLONIUM = registerElement("element_84", new ElementItem(new FabricItemSettings(), "Po"));
    public static final Item ASTATINE = registerElement("element_85", new ElementItem(new FabricItemSettings(), "At"));
    public static final Item RADON = registerElement("element_86", new ElementItem(new FabricItemSettings(), "Rn"));
    public static final Item FRANCIUM = registerElement("element_87", new ElementItem(new FabricItemSettings(), "Fr"));
    public static final Item RADIUM = registerElement("element_88", new ElementItem(new FabricItemSettings(), "Ra"));
    public static final Item ACTINIUM = registerElement("element_89", new ElementItem(new FabricItemSettings(), "Ac"));
    public static final Item THORIUM = registerElement("element_90", new ElementItem(new FabricItemSettings(), "Th"));
    public static final Item PROTACTINIUM = registerElement("element_91", new ElementItem(new FabricItemSettings(), "Pa"));
    public static final Item URANIUM = registerElement("element_92", new ElementItem(new FabricItemSettings(), "U"));
    public static final Item NEPTUNIUM = registerElement("element_93", new ElementItem(new FabricItemSettings(), "Np"));
    public static final Item PLUTONIUM = registerElement("element_94", new ElementItem(new FabricItemSettings(), "Pu"));
    public static final Item AMERICIUM = registerElement("element_95", new ElementItem(new FabricItemSettings(), "Am"));
    public static final Item CURIUM = registerElement("element_96", new ElementItem(new FabricItemSettings(), "Cm"));
    public static final Item BERKELLIUM = registerElement("element_97", new ElementItem(new FabricItemSettings(), "Bk"));
    public static final Item CALIFORNIUM = registerElement("element_98", new ElementItem(new FabricItemSettings(), "Cf"));
    public static final Item EINSTEINIUM = registerElement("element_99", new ElementItem(new FabricItemSettings(), "En"));
    public static final Item FERMIUM = registerElement("element_100", new ElementItem(new FabricItemSettings(), "Fm"));
    public static final Item MENDELEVLUM = registerElement("element_101", new ElementItem(new FabricItemSettings(), "Md"));
    public static final Item NOBELIUM = registerElement("element_102", new ElementItem(new FabricItemSettings(), "No"));
    public static final Item LAWRENCIUM = registerElement("element_103", new ElementItem(new FabricItemSettings(), "Lr"));
    public static final Item RUTHERFORDIUM = registerElement("element_104", new ElementItem(new FabricItemSettings(), "Rf"));
    public static final Item DUBNIUM = registerElement("element_105", new ElementItem(new FabricItemSettings(), "Db"));
    public static final Item SEABORGIUM = registerElement("element_106", new ElementItem(new FabricItemSettings(), "Sg"));
    public static final Item BOHRIUM = registerElement("element_107", new ElementItem(new FabricItemSettings(), "Bh"));
    public static final Item HASSIUM = registerElement("element_108", new ElementItem(new FabricItemSettings(), "Hs"));
    public static final Item MEITNERIUM = registerElement("element_109", new ElementItem(new FabricItemSettings(), "Mt"));
    public static final Item DARMSTADTIUM = registerElement("element_110", new ElementItem(new FabricItemSettings(), "Ds"));
    public static final Item ROENTGENIUM = registerElement("element_111", new ElementItem(new FabricItemSettings(), "Rg"));
    public static final Item COPERNICIUM = registerElement("element_112", new ElementItem(new FabricItemSettings(), "Cn"));
    public static final Item NIHONIUM = registerElement("element_113", new ElementItem(new FabricItemSettings(), "Nh"));
    public static final Item FLEVORIUM = registerElement("element_114", new ElementItem(new FabricItemSettings(), "Fl"));
    public static final Item MOSCOVLUM = registerElement("element_115", new ElementItem(new FabricItemSettings(), "Mc"));
    public static final Item LIVENMORIUM = registerElement("element_116", new ElementItem(new FabricItemSettings(), "Lv"));
    public static final Item TENNESSINE = registerElement("element_117", new ElementItem(new FabricItemSettings(), "Ts"));
    public static final Item OGANESSON = registerElement("element_118", new ElementItem(new FabricItemSettings(), "Og"));

    private static Item registerElement(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, id), item);
    }

    public static void registerElementItems(){}
}
