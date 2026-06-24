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

public class ModRods {

    private static final List<RodEntry> ENTRIES = List.of(
        new RodEntry("gold_rod", Arrays.asList(ElementType.GOLD), Arrays.asList(1)),
        new RodEntry("iron_rod", Arrays.asList(ElementType.IRON), Arrays.asList(1)),
        new RodEntry("faerie_rod", null, null),
        new RodEntry("energium_rod", Arrays.asList(ElementType.ENERGIUM), Arrays.asList(1)),
        new RodEntry("lead_rod", Arrays.asList(ElementType.LEAD), Arrays.asList(1)),
        new RodEntry("silver_rod", Arrays.asList(ElementType.SILVER), Arrays.asList(1)),
        new RodEntry("yttrium_rod", Arrays.asList(ElementType.YTTRIUM), Arrays.asList(1)),
        new RodEntry("tungsten_rod", Arrays.asList(ElementType.TUNGSTEN), Arrays.asList(1)),
        new RodEntry("mythril_rod", Arrays.asList(ElementType.MYTHRIL), Arrays.asList(1)),
        new RodEntry("indium_rod", Arrays.asList(ElementType.INDIUM), Arrays.asList(1)),
        new RodEntry("aluminum_rod", Arrays.asList(ElementType.ALUMINUM), Arrays.asList(1)),
        new RodEntry("bronze_rod", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(88, 12)),
        new RodEntry("carbon_rod", Arrays.asList(ElementType.CARBON), Arrays.asList(1)),
        new RodEntry("chromium_rod", Arrays.asList(ElementType.CHROMIUM), Arrays.asList(1)),
        new RodEntry("cobalt_rod", Arrays.asList(ElementType.COBALT), Arrays.asList(1)),
        new RodEntry("eridium_rod", Arrays.asList(ElementType.ERIDIUM), Arrays.asList(1)),
        new RodEntry("gallium_rod", Arrays.asList(ElementType.GALLIUM), Arrays.asList(1)),
        new RodEntry("germanium_rod", Arrays.asList(ElementType.GERMANIUM), Arrays.asList(1)),
        new RodEntry("iridium_rod", Arrays.asList(ElementType.IRIDIUM), Arrays.asList(1)),
        new RodEntry("magnesium_rod", Arrays.asList(ElementType.MAGNESIUM), Arrays.asList(1)),
        new RodEntry("manganese_rod", Arrays.asList(ElementType.MANGANESE), Arrays.asList(1)),
        new RodEntry("naquadah_rod", Arrays.asList(ElementType.NAQUADAH), Arrays.asList(1)),
        new RodEntry("nickel_rod", Arrays.asList(ElementType.NICKEL), Arrays.asList(1)),
        new RodEntry("silicon_rod", Arrays.asList(ElementType.SILICON), Arrays.asList(1)),
        new RodEntry("titanium_rod", Arrays.asList(ElementType.TITANIUM), Arrays.asList(1)),
        new RodEntry("vanadium_rod", Arrays.asList(ElementType.VANADIUM), Arrays.asList(1)),
        new RodEntry("zinc_rod", Arrays.asList(ElementType.ZINC), Arrays.asList(1)),
        new RodEntry("barium_rod", Arrays.asList(ElementType.BARIUM), Arrays.asList(1)),
        new RodEntry("beryllium_rod", Arrays.asList(ElementType.BERYLLIUM), Arrays.asList(1)),
        new RodEntry("bismuth_rod", Arrays.asList(ElementType.BISMUTH), Arrays.asList(1)),
        new RodEntry("cadmium_rod", Arrays.asList(ElementType.CADMIUM), Arrays.asList(1)),
        new RodEntry("calcium_rod", Arrays.asList(ElementType.CALCIUM), Arrays.asList(1)),
        new RodEntry("copper_rod", Arrays.asList(ElementType.COPPER), Arrays.asList(1)),
        new RodEntry("lithium_rod", Arrays.asList(ElementType.LITHIUM), Arrays.asList(1)),
        new RodEntry("molybdenum_rod", Arrays.asList(ElementType.MOLYBDENUM), Arrays.asList(1)),
        new RodEntry("naquadriah_rod", Arrays.asList(ElementType.NAQUADRIUM), Arrays.asList(1)),
        new RodEntry("niobium_rod", Arrays.asList(ElementType.NIOBIUM), Arrays.asList(1)),
        new RodEntry("osmium_rod", Arrays.asList(ElementType.OSMIUM), Arrays.asList(1)),
        new RodEntry("palladium_rod", Arrays.asList(ElementType.PALLADIUM), Arrays.asList(1)),
        new RodEntry("platinum_rod", Arrays.asList(ElementType.PLATINUM), Arrays.asList(1)),
        new RodEntry("polonium_rod", Arrays.asList(ElementType.POLONIUM), Arrays.asList(1)),
        new RodEntry("rhenium_rod", Arrays.asList(ElementType.RHENIUM), Arrays.asList(1)),
        new RodEntry("rhodium_rod", Arrays.asList(ElementType.RHODIUM), Arrays.asList(1)),
        new RodEntry("ruthenium_rod", Arrays.asList(ElementType.RUTHENIUM), Arrays.asList(1)),
        new RodEntry("scandium_rod", Arrays.asList(ElementType.SCANDIUM), Arrays.asList(1)),
        new RodEntry("sodium_rod", Arrays.asList(ElementType.SODIUM), Arrays.asList(1)),
        new RodEntry("strontium_rod", Arrays.asList(ElementType.STRONTIUM), Arrays.asList(1)),
        new RodEntry("tantalum_rod", Arrays.asList(ElementType.TANTALUM), Arrays.asList(1)),
        new RodEntry("thallium_rod", Arrays.asList(ElementType.THALLIUM), Arrays.asList(1)),
        new RodEntry("thorium_rod", Arrays.asList(ElementType.THORIUM), Arrays.asList(1)),
        new RodEntry("tin_rod", Arrays.asList(ElementType.TIN), Arrays.asList(1)),
        new RodEntry("uranium_rod", Arrays.asList(ElementType.URANIUM), Arrays.asList(1)),
        new RodEntry("zirconium_rod", Arrays.asList(ElementType.ZIRCONIUM), Arrays.asList(1)),
        new RodEntry("alclad_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(99, 1)),
        new RodEntry("aldrey_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(95, 4, 1)),
        new RodEntry("alloys_8090_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.LITHIUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(78, 22, 13, 1)),
        new RodEntry("almag_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM), Arrays.asList(92, 8)),
        new RodEntry("almelec_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(98, 1, 1)),
        new RodEntry("almgsi_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(97, 2, 1)),
        new RodEntry("alnimax_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.NICKEL), Arrays.asList(95, 5)),
        new RodEntry("alsimec_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(87, 13)),
        new RodEntry("alsin_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(80, 20)),
        new RodEntry("aluminium_bronze_rod", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM, ElementType.IRON), Arrays.asList(81, 9, 5)),
        new RodEntry("alumel_rod", Arrays.asList(ElementType.NICKEL, ElementType.MANGANESE, ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(90, 2, 2, 1)),
        new RodEntry("alumicrom_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.CHROMIUM), Arrays.asList(98, 2)),
        new RodEntry("aluminium_galimax_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.GALLIUM), Arrays.asList(99, 1)),
        new RodEntry("alusil_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(77, 23)),
        new RodEntry("antanium_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.TANTALUM), Arrays.asList(95, 5)),
        new RodEntry("ardol_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(94, 5, 1)),
        new RodEntry("birmabright_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(98, 1, 1)),
        new RodEntry("babbitt_metal_rod", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(89, 7, 4)),
        new RodEntry("barium_alloy_rod", Arrays.asList(ElementType.BARIUM, ElementType.ALUMINUM), Arrays.asList(50, 50)),
        new RodEntry("barmetal_rod", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.LEAD), Arrays.asList(55, 43, 2)),
        new RodEntry("bell_metal_rod", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(78, 22)),
        new RodEntry("berylco_rod", Arrays.asList(ElementType.COPPER, ElementType.BERYLLIUM, ElementType.COBALT), Arrays.asList(97, 2, 1)),
        new RodEntry("beta_brass_rod", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(50, 50)),
        new RodEntry("birmingham_gold_rod", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.GOLD), Arrays.asList(91, 8, 1)),
        new RodEntry("brass_rod", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(70, 30)),
        new RodEntry("calcusil_rod", Arrays.asList(ElementType.COPPER, ElementType.CALCIUM, ElementType.SILICON), Arrays.asList(95, 3, 2)),
        new RodEntry("cast_iron_rod", Arrays.asList(ElementType.IRON, ElementType.CARBON), Arrays.asList(96, 4)),
        new RodEntry("ccilla_rod", Arrays.asList(ElementType.COPPER, ElementType.CADMIUM, ElementType.SILVER), Arrays.asList(98, 1, 1)),
        new RodEntry("cervenit_rod", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.LEAD, ElementType.ZINC), Arrays.asList(60, 20, 15, 5)),
        new RodEntry("chrominium_rod", Arrays.asList(ElementType.CHROMIUM, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 30, 10)),
        new RodEntry("c_manganese_steel_rod", Arrays.asList(ElementType.IRON, ElementType.MANGANESE, ElementType.CARBON), Arrays.asList(86, 13, 1)),
        new RodEntry("constitution_rod", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.ZINC), Arrays.asList(88, 10, 2)),
        new RodEntry("copernicium_alloy_rod", Arrays.asList(ElementType.COPERNICIUM, ElementType.GOLD), Arrays.asList(50, 50)),
        new RodEntry("copper_aluminium_rod", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM), Arrays.asList(90, 10)),
        new RodEntry("copper_bismuth_rod", Arrays.asList(ElementType.COPPER, ElementType.BISMUTH), Arrays.asList(98, 2)),
        new RodEntry("copper_nickel_rod", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(70, 30)),
        new RodEntry("cunal_rod", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ALUMINUM), Arrays.asList(89, 10, 1)),
        new RodEntry("cunife_rod", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 20, 20)),
        new RodEntry("cusil_rod", Arrays.asList(ElementType.COPPER, ElementType.SILVER, ElementType.TITANIUM), Arrays.asList(63, 35, 2)),
        new RodEntry("stainless_steel_rod", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM, ElementType.NICKEL), Arrays.asList(74, 18, 8)),
        new RodEntry("tool_steel_rod", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN, ElementType.CHROMIUM, ElementType.VANADIUM), Arrays.asList(95, 2, 2, 1)),
        new RodEntry("invar_rod", Arrays.asList(ElementType.IRON, ElementType.NICKEL), Arrays.asList(64, 36)),
        new RodEntry("kovar_rod", Arrays.asList(ElementType.IRON, ElementType.NICKEL, ElementType.COBALT), Arrays.asList(54, 29, 17)),
        new RodEntry("silicon_steel_rod", Arrays.asList(ElementType.IRON, ElementType.SILICON), Arrays.asList(97, 3)),
        new RodEntry("ferrochrome_rod", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 30)),
        new RodEntry("ferrotitanium_rod", Arrays.asList(ElementType.IRON, ElementType.TITANIUM), Arrays.asList(70, 30)),
        new RodEntry("ferrovanadium_rod", Arrays.asList(ElementType.IRON, ElementType.VANADIUM), Arrays.asList(83, 17)),
        new RodEntry("ferrotungsten_rod", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN), Arrays.asList(78, 22)),
        new RodEntry("ferromolybdenum_rod", Arrays.asList(ElementType.IRON, ElementType.MOLYBDENUM), Arrays.asList(80, 20)),
        new RodEntry("inconel_rod", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM, ElementType.IRON), Arrays.asList(50, 30, 20)),
        new RodEntry("nichrome_rod", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM), Arrays.asList(80, 20)),
        new RodEntry("permalloy_rod", Arrays.asList(ElementType.NICKEL, ElementType.IRON), Arrays.asList(80, 20)),
        new RodEntry("nickel_silver_rod", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ZINC), Arrays.asList(60, 20, 20)),
        new RodEntry("constantan_rod", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(55, 45)),
        new RodEntry("manganin_rod", Arrays.asList(ElementType.COPPER, ElementType.MANGANESE, ElementType.NICKEL), Arrays.asList(86, 12, 2)),
        new RodEntry("monel_rod", Arrays.asList(ElementType.NICKEL, ElementType.COPPER), Arrays.asList(65, 35)),
        new RodEntry("ti_6al_4v_rod", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(90, 6, 4)),
        new RodEntry("ti_3al_2_5v_rod", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(95, 3, 2)),
        new RodEntry("ti_6al_7nb_rod", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.NIOBIUM), Arrays.asList(87, 6, 7)),
        new RodEntry("az31_magnesium_rod", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(96, 3, 1)),
        new RodEntry("elektron_rod", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC, ElementType.MANGANESE), Arrays.asList(96, 2, 1, 1)),
        new RodEntry("electrum_rod", Arrays.asList(ElementType.GOLD, ElementType.SILVER), Arrays.asList(50, 50)),
        new RodEntry("tumbaga_rod", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(60, 40)),
        new RodEntry("rose_gold_rod", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(75, 25)),
        new RodEntry("white_gold_rod", Arrays.asList(ElementType.GOLD, ElementType.NICKEL), Arrays.asList(90, 10)),
        new RodEntry("sterling_silver_rod", Arrays.asList(ElementType.SILVER, ElementType.COPPER), Arrays.asList(93, 7)),
        new RodEntry("shibuichi_rod", Arrays.asList(ElementType.COPPER, ElementType.SILVER), Arrays.asList(75, 25)),
        new RodEntry("roses_metal_rod", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN), Arrays.asList(50, 25, 25)),
        new RodEntry("woods_metal_rod", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN, ElementType.CADMIUM), Arrays.asList(50, 25, 13, 12)),
        new RodEntry("solder_rod", Arrays.asList(ElementType.TIN, ElementType.LEAD), Arrays.asList(60, 40)),
        new RodEntry("pewter_rod", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(85, 10, 5)),
        new RodEntry("fields_metal_rod", Arrays.asList(ElementType.BISMUTH, ElementType.INDIUM, ElementType.TIN), Arrays.asList(33, 33, 34)),
        new RodEntry("silicon_bronze_rod", Arrays.asList(ElementType.COPPER, ElementType.SILICON, ElementType.MANGANESE), Arrays.asList(96, 3, 1)),
        new RodEntry("manganese_bronze_rod", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.MANGANESE, ElementType.ALUMINUM), Arrays.asList(70, 25, 3, 2)),
        new RodEntry("zamak_rod", Arrays.asList(ElementType.ZINC, ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.COPPER), Arrays.asList(93, 4, 1, 2)),
        new RodEntry("stellite_rod", Arrays.asList(ElementType.COBALT, ElementType.CHROMIUM, ElementType.TUNGSTEN), Arrays.asList(60, 30, 10)),
        new RodEntry("duralumin_rod", Arrays.asList(ElementType.ALUMINUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(95, 4, 1)),
        new RodEntry("heavy_tungsten_rod", Arrays.asList(ElementType.TUNGSTEN, ElementType.NICKEL, ElementType.IRON), Arrays.asList(90, 6, 4)),
        new RodEntry("tungsten_copper_rod", Arrays.asList(ElementType.TUNGSTEN, ElementType.COPPER), Arrays.asList(80, 20)),
        new RodEntry("tzm_molybdenum_rod", Arrays.asList(ElementType.MOLYBDENUM, ElementType.TITANIUM, ElementType.ZIRCONIUM), Arrays.asList(98, 1, 1)),
        new RodEntry("bismuth_tin_rod", Arrays.asList(ElementType.BISMUTH, ElementType.TIN), Arrays.asList(58, 42)),
        new RodEntry("tantalum_tungsten_rod", Arrays.asList(ElementType.TANTALUM, ElementType.TUNGSTEN), Arrays.asList(90, 10)),
        new RodEntry("niobium_titanium_rod", Arrays.asList(ElementType.NIOBIUM, ElementType.TITANIUM), Arrays.asList(47, 53)),
        new RodEntry("depleted_uranium_rod", Arrays.asList(ElementType.URANIUM, ElementType.TITANIUM), Arrays.asList(95, 5)),
        new RodEntry("galinstan_rod", Arrays.asList(ElementType.GALLIUM, ElementType.INDIUM, ElementType.TIN), Arrays.asList(68, 22, 10)),
        new RodEntry("germanium_silicon_rod", Arrays.asList(ElementType.GERMANIUM, ElementType.SILICON), Arrays.asList(70, 30)),
        new RodEntry("sodium_potassium_rod", Arrays.asList(ElementType.SODIUM, ElementType.POTASSIUM), Arrays.asList(78, 22)),
        new RodEntry("mythril_steel_rod", Arrays.asList(ElementType.MYTHRIL, ElementType.IRON, ElementType.CARBON), Arrays.asList(85, 14, 1)),
        new RodEntry("naquadah_steel_rod", Arrays.asList(ElementType.NAQUADAH, ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 25, 5)),
        new RodEntry("naquadriah_titanium_rod", Arrays.asList(ElementType.NAQUADRIUM, ElementType.TITANIUM, ElementType.ALUMINUM), Arrays.asList(50, 40, 10)),
        new RodEntry("energium_copper_rod", Arrays.asList(ElementType.ENERGIUM, ElementType.COPPER, ElementType.TIN), Arrays.asList(25, 70, 5)),
        new RodEntry("eridium_gold_rod", Arrays.asList(ElementType.ERIDIUM, ElementType.GOLD, ElementType.SILVER), Arrays.asList(20, 60, 20)),
        new RodEntry("energium_aluminium_rod", Arrays.asList(ElementType.ENERGIUM, ElementType.ALUMINUM), Arrays.asList(20, 80)),
        new RodEntry("naquadah_mythril_rod", Arrays.asList(ElementType.NAQUADAH, ElementType.MYTHRIL), Arrays.asList(50, 50)),
        new RodEntry("eridium_tantalum_rod", Arrays.asList(ElementType.ERIDIUM, ElementType.TANTALUM), Arrays.asList(30, 70))
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerRods() {
        for (RodEntry e : ENTRIES) {
            Item item;
            if (e.elements != null) {
                item = new CompoundItem(new FabricItemSettings(), e.elements, e.amounts);
            } else {
                item = new Item(new FabricItemSettings());
            }
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), item);
            ITEMS.put(e.name, item);
        }
    }

    private record RodEntry(String name, List<ElementType> elements, List<Integer> amounts) {}
}
