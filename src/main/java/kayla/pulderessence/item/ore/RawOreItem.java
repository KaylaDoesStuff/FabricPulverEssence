package kayla.pulderessence.item.ore;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.CompoundItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;

public class RawOreItem {

    // ALKALI & ALKALINE EARTH METALS
    public static final CompoundItem RAW_SPODUMENE_ORE = registerCompoundItem("raw_spodumene_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Li", "Al", "Si", "O"), Arrays.asList(1, 1, 2, 6)));
    public static final CompoundItem RAW_PETALITE_ORE = registerCompoundItem("raw_petalite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Li", "Al", "Si", "O"), Arrays.asList(1, 1, 4, 10)));
    public static final CompoundItem RAW_AMBLYGONITE_ORE = registerCompoundItem("raw_amblygonite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Li", "Al", "P", "O", "F"), Arrays.asList(1, 1, 1, 4, 1)));
    public static final CompoundItem RAW_BERYL_ORE = registerCompoundItem("raw_beryl_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Be", "Al", "Si", "O"), Arrays.asList(3, 2, 6, 18)));
    public static final CompoundItem RAW_PHENAKITE_ORE = registerCompoundItem("raw_phenakite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Be", "Si", "O"), Arrays.asList(2, 1, 4)));
    public static final CompoundItem RAW_HALITE_ORE = registerCompoundItem("raw_halite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Na", "Cl"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_TRONA_ORE = registerCompoundItem("raw_trona_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Na", "C", "O", "H"), Arrays.asList(3, 2, 10, 2)));
    public static final CompoundItem RAW_MAGNESITE_ORE = registerCompoundItem("raw_magnesite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mg", "C", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_DOLOMITE_ORE = registerCompoundItem("raw_dolomite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "Mg", "C", "O"), Arrays.asList(1, 1, 2, 6)));
    public static final CompoundItem RAW_BRUCIITE_ORE = registerCompoundItem("raw_brucite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mg", "O", "H"), Arrays.asList(1, 2, 2)));
    public static final CompoundItem RAW_SYLVITE_ORE = registerCompoundItem("raw_sylvite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("K", "Cl"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_CARNALLITE_ORE = registerCompoundItem("raw_carnallite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("K", "Mg", "Cl", "O", "H"), Arrays.asList(1, 1, 3, 6, 6)));
    public static final CompoundItem RAW_LIMESTONE_ORE = registerCompoundItem("raw_limestone_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "C", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_GYPSUM_ORE = registerCompoundItem("raw_gypsum_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "S", "O", "H"), Arrays.asList(1, 1, 4, 2)));
    public static final CompoundItem RAW_ANHYDRITE_ORE = registerCompoundItem("raw_anhydrite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "S", "O"), Arrays.asList(1, 1, 4)));
    public static final CompoundItem RAW_LEPIDOLITE_ORE = registerCompoundItem("raw_lepidolite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("K", "Li", "Al", "Si", "O", "F"), Arrays.asList(1, 1, 3, 4, 10, 2)));
    public static final CompoundItem RAW_POLLUCITE_ORE = registerCompoundItem("raw_pollucite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cs", "Na", "Al", "Si", "O"), Arrays.asList(1, 1, 2, 2, 6)));
    public static final CompoundItem RAW_CELESTITE_ORE = registerCompoundItem("raw_celestite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Sr", "S", "O"), Arrays.asList(1, 1, 4)));
    public static final CompoundItem RAW_STRONITIANITE_ORE = registerCompoundItem("raw_strontianite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Sr", "C", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_BARITE_ORE = registerCompoundItem("raw_barite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ba", "S", "O"), Arrays.asList(1, 1, 4)));
    public static final CompoundItem RAW_WITHERITE_ORE = registerCompoundItem("raw_witherite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ba", "C", "O"), Arrays.asList(1, 1, 3)));

    // CHROMIUM ORES
    public static final CompoundItem RAW_CHROMITE_ORE = registerCompoundItem("raw_chromite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "Cr", "O"), Arrays.asList(1, 2, 4)));
    public static final CompoundItem RAW_CROCOITE_ORE = registerCompoundItem("raw_crocoite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "Cr", "O"), Arrays.asList(1, 1, 4)));

    // MANGANESE ORES
    public static final CompoundItem RAW_PYROLUSITE_ORE = registerCompoundItem("raw_pyrolusite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mn", "O"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_PSILOMELANE_ORE = registerCompoundItem("raw_psilomelane_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ba", "Mn", "O"), Arrays.asList(1, 9, 16)));
    public static final CompoundItem RAW_RHODOCHROSITE_ORE = registerCompoundItem("raw_rhodochrosite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mn", "C", "O"), Arrays.asList(1, 1, 3)));

    // COBALT ORES
    public static final CompoundItem RAW_ERYTHRITE_ORE = registerCompoundItem("raw_erythrite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Co", "As", "O", "H"), Arrays.asList(3, 2, 8, 8)));

    // TITANIUM ORES
    public static final CompoundItem RAW_ILMENITE_ORE = registerCompoundItem("raw_ilmenite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "Ti", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_RUTILE_ORE = registerCompoundItem("raw_rutile_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ti", "O"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_ANATASE_ORE = registerCompoundItem("raw_anatase_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ti", "O"), Arrays.asList(1, 2)));

    // NICKEL ORES
    public static final CompoundItem RAW_PENTLANDITE_ORE = registerCompoundItem("raw_pentlandite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "Ni", "S"), Arrays.asList(9, 9, 8)));
    public static final CompoundItem RAW_MILLERITE_ORE = registerCompoundItem("raw_millerite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ni", "S"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_NICCOLITE_ORE = registerCompoundItem("raw_niccolite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ni", "As"), Arrays.asList(1, 1)));

    // VANADIUM ORES
    public static final CompoundItem RAW_VANADINITE_ORE = registerCompoundItem("raw_vanadinite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "V", "O", "Cl"), Arrays.asList(5, 3, 12, 1)));
    public static final CompoundItem RAW_CARNOTITE_ORE = registerCompoundItem("raw_carnotite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("K", "U", "V", "O"), Arrays.asList(2, 2, 2, 14)));

    // COBALT ORES
    public static final CompoundItem RAW_COBALTITE_ORE = registerCompoundItem("raw_cobaltite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Co", "As", "S"), Arrays.asList(1, 1, 1)));
    // ZINC ORES
    public static final CompoundItem RAW_SPHALERITE_ORE = registerCompoundItem("raw_sphalerite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Zn", "S"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_SMITHSONITE_ORE = registerCompoundItem("raw_smithsonite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Zn", "C", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_HEMIMORPHITE_ORE = registerCompoundItem("raw_hemimorphite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Zn", "Si", "O", "H"), Arrays.asList(4, 2, 7, 2)));

    // MOLYBDENUM ORES
    public static final CompoundItem RAW_MOLYBDENITE_ORE = registerCompoundItem("raw_molybdenite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Mo", "S"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_WULFENITE_ORE = registerCompoundItem("raw_wulfenite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "Mo", "O"), Arrays.asList(1, 1, 4)));

    // SILVER ORES
    public static final CompoundItem RAW_ARGENTITE_ORE = registerCompoundItem("raw_argentite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ag"), Arrays.asList(2)));
    public static final CompoundItem RAW_CERARGYRITE_ORE = registerCompoundItem("raw_cerargyrite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ag", "Cl"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_POLYBASITE_ORE = registerCompoundItem("raw_polybasite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ag", "Cu", "Sb", "S"), Arrays.asList(16, 1, 2, 11)));

    // TUNGSTEN ORES
    public static final CompoundItem RAW_WOLFRAMITE_ORE = registerCompoundItem("raw_wolframite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "Mn", "W", "O"), Arrays.asList(1, 1, 2, 8)));
    public static final CompoundItem RAW_SCHEELITE_ORE = registerCompoundItem("raw_scheelite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "W", "O"), Arrays.asList(1, 1, 4)));

    // TIN ORES
    public static final CompoundItem RAW_CASSITERITE_ORE = registerCompoundItem("raw_cassiterite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Sn", "O"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_STANNITE_ORE = registerCompoundItem("raw_stannite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "Fe", "Sn", "S"), Arrays.asList(2, 1, 1, 4)));

    // NON-METALS
    public static final CompoundItem RAW_SULFUR_ORE = registerCompoundItem("raw_sulfur_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("S"), Arrays.asList(8)));
    public static final CompoundItem RAW_PYRITE_ORE = registerCompoundItem("raw_pyrite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "S"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_FLUORITE_ORE = registerCompoundItem("raw_fluorite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "F"), Arrays.asList(1, 2)));
    public static final CompoundItem RAW_CRYOLITE_ORE = registerCompoundItem("raw_cryolite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Na", "Al", "F"), Arrays.asList(3, 1, 6)));
    public static final CompoundItem RAW_APATITE_ORE = registerCompoundItem("raw_apatite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "P", "O", "F"), Arrays.asList(5, 3, 12, 1)));
    public static final CompoundItem RAW_PHOSPHORITE_ORE = registerCompoundItem("raw_phosphorite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Ca", "P", "O", "F"), Arrays.asList(5, 3, 12, 1)));

    // IRON ORES (Most Important)
    public static final CompoundItem RAW_HEMATITE_ORE = registerCompoundItem("raw_hematite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "O"), Arrays.asList(2, 3)));
    public static final CompoundItem RAW_MAGNETITE_ORE = registerCompoundItem("raw_magnetite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "O"), Arrays.asList(3, 4)));
    public static final CompoundItem RAW_LIMONITE_ORE = registerCompoundItem("raw_limonite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "O", "H"), Arrays.asList(1, 2, 1)));
    public static final CompoundItem RAW_SIDERITE_ORE = registerCompoundItem("raw_siderite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Fe", "C", "O"), Arrays.asList(1, 1, 3)));

    // COPPER ORES (Most Important)
    public static final CompoundItem RAW_CHALCOPYRITE_ORE = registerCompoundItem("raw_chalcopyrite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "Fe", "S"), Arrays.asList(1, 1, 2)));
    public static final CompoundItem RAW_MALACHITE_ORE = registerCompoundItem("raw_malachite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "C", "O", "H"), Arrays.asList(2, 1, 3, 2)));
    public static final CompoundItem RAW_AZURITE_ORE = registerCompoundItem("raw_azurite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "C", "O", "H"), Arrays.asList(3, 2, 7, 2)));
    public static final CompoundItem RAW_BORNITE_ORE = registerCompoundItem("raw_bornite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Cu", "Fe", "S"), Arrays.asList(5, 1, 4)));

    // LEAD ORES (Most Important)
    public static final CompoundItem RAW_GALENA_ORE = registerCompoundItem("raw_galena_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "S"), Arrays.asList(1, 1)));
    public static final CompoundItem RAW_CERUSSITE_ORE = registerCompoundItem("raw_cerussite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "C", "O"), Arrays.asList(1, 1, 3)));
    public static final CompoundItem RAW_ANGLESITE_ORE = registerCompoundItem("raw_anglesite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Pb", "S", "O"), Arrays.asList(1, 1, 4)));

    // ALUMINUM ORES (Most Important)
    public static final CompoundItem RAW_BAUXITE_ORE = registerCompoundItem("raw_bauxite_ore", new CompoundItem(new FabricItemSettings(), Arrays.asList("Al", "O", "H"), Arrays.asList(1, 3, 3)));

    private static CompoundItem registerCompoundItem(String name, CompoundItem item) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), item);
    }

    public static void registerModCompoundItems() {}
}
