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

public class ModDusts {

    private static final List<DustEntry> ENTRIES = List.of(
        new DustEntry("gold_dust", Arrays.asList(ElementType.GOLD), Arrays.asList(1)),
        new DustEntry("iron_dust", Arrays.asList(ElementType.IRON), Arrays.asList(1)),
        new DustEntry("energium_dust", Arrays.asList(ElementType.ENERGIUM), Arrays.asList(1)),
        new DustEntry("lead_dust", Arrays.asList(ElementType.LEAD), Arrays.asList(1)),
        new DustEntry("silver_dust", Arrays.asList(ElementType.SILVER), Arrays.asList(1)),
        new DustEntry("yttrium_dust", Arrays.asList(ElementType.YTTRIUM), Arrays.asList(1)),
        new DustEntry("indium_dust", Arrays.asList(ElementType.INDIUM), Arrays.asList(1)),
        new DustEntry("mythril_dust", Arrays.asList(ElementType.MYTHRIL), Arrays.asList(1)),
        new DustEntry("faerie_dust", null, null),
        new DustEntry("tungsten_dust", Arrays.asList(ElementType.TUNGSTEN), Arrays.asList(1)),
        new DustEntry("aluminum_dust", Arrays.asList(ElementType.ALUMINUM), Arrays.asList(1)),
        new DustEntry("carbon_dust", Arrays.asList(ElementType.CARBON), Arrays.asList(1)),
        new DustEntry("chromium_dust", Arrays.asList(ElementType.CHROMIUM), Arrays.asList(1)),
        new DustEntry("cobalt_dust", Arrays.asList(ElementType.COBALT), Arrays.asList(1)),
        new DustEntry("eridium_dust", Arrays.asList(ElementType.ERIDIUM), Arrays.asList(1)),
        new DustEntry("gallium_dust", Arrays.asList(ElementType.GALLIUM), Arrays.asList(1)),
        new DustEntry("germanium_dust", Arrays.asList(ElementType.GERMANIUM), Arrays.asList(1)),
        new DustEntry("iridium_dust", Arrays.asList(ElementType.IRIDIUM), Arrays.asList(1)),
        new DustEntry("magnesium_dust", Arrays.asList(ElementType.MAGNESIUM), Arrays.asList(1)),
        new DustEntry("manganese_dust", Arrays.asList(ElementType.MANGANESE), Arrays.asList(1)),
        new DustEntry("naquadah_dust", Arrays.asList(ElementType.NAQUADAH), Arrays.asList(1)),
        new DustEntry("nickel_dust", Arrays.asList(ElementType.NICKEL), Arrays.asList(1)),
        new DustEntry("silicon_dust", Arrays.asList(ElementType.SILICON), Arrays.asList(1)),
        new DustEntry("titanium_dust", Arrays.asList(ElementType.TITANIUM), Arrays.asList(1)),
        new DustEntry("vanadium_dust", Arrays.asList(ElementType.VANADIUM), Arrays.asList(1)),
        new DustEntry("zinc_dust", Arrays.asList(ElementType.ZINC), Arrays.asList(1)),
        new DustEntry("antimony_dust", Arrays.asList(ElementType.ANTIMONY), Arrays.asList(1)),
        new DustEntry("arsenic_dust", Arrays.asList(ElementType.ARSENIC), Arrays.asList(1)),
        new DustEntry("barium_dust", Arrays.asList(ElementType.BARIUM), Arrays.asList(1)),
        new DustEntry("beryllium_dust", Arrays.asList(ElementType.BERYLLIUM), Arrays.asList(1)),
        new DustEntry("bismuth_dust", Arrays.asList(ElementType.BISMUTH), Arrays.asList(1)),
        new DustEntry("cadmium_dust", Arrays.asList(ElementType.CADMIUM), Arrays.asList(1)),
        new DustEntry("calcium_dust", Arrays.asList(ElementType.CALCIUM), Arrays.asList(1)),
        new DustEntry("copper_dust", Arrays.asList(ElementType.COPPER), Arrays.asList(1)),
        new DustEntry("lithium_dust", Arrays.asList(ElementType.LITHIUM), Arrays.asList(1)),
        new DustEntry("molybdenum_dust", Arrays.asList(ElementType.MOLYBDENUM), Arrays.asList(1)),
        new DustEntry("naquadriah_dust", Arrays.asList(ElementType.NAQUADRIUM), Arrays.asList(1)),
        new DustEntry("niobium_dust", Arrays.asList(ElementType.NIOBIUM), Arrays.asList(1)),
        new DustEntry("osmium_dust", Arrays.asList(ElementType.OSMIUM), Arrays.asList(1)),
        new DustEntry("palladium_dust", Arrays.asList(ElementType.PALLADIUM), Arrays.asList(1)),
        new DustEntry("platinum_dust", Arrays.asList(ElementType.PLATINUM), Arrays.asList(1)),
        new DustEntry("polonium_dust", Arrays.asList(ElementType.POLONIUM), Arrays.asList(1)),
        new DustEntry("rhenium_dust", Arrays.asList(ElementType.RHENIUM), Arrays.asList(1)),
        new DustEntry("rhodium_dust", Arrays.asList(ElementType.RHODIUM), Arrays.asList(1)),
        new DustEntry("ruthenium_dust", Arrays.asList(ElementType.RUTHENIUM), Arrays.asList(1)),
        new DustEntry("scandium_dust", Arrays.asList(ElementType.SCANDIUM), Arrays.asList(1)),
        new DustEntry("selenium_dust", Arrays.asList(ElementType.SELENIUM), Arrays.asList(1)),
        new DustEntry("sodium_dust", Arrays.asList(ElementType.SODIUM), Arrays.asList(1)),
        new DustEntry("strontium_dust", Arrays.asList(ElementType.STRONTIUM), Arrays.asList(1)),
        new DustEntry("tantalum_dust", Arrays.asList(ElementType.TANTALUM), Arrays.asList(1)),
        new DustEntry("tellurium_dust", Arrays.asList(ElementType.TELLURIUM), Arrays.asList(1)),
        new DustEntry("thallium_dust", Arrays.asList(ElementType.THALLIUM), Arrays.asList(1)),
        new DustEntry("thorium_dust", Arrays.asList(ElementType.THORIUM), Arrays.asList(1)),
        new DustEntry("tin_dust", Arrays.asList(ElementType.TIN), Arrays.asList(1)),
        new DustEntry("uranium_dust", Arrays.asList(ElementType.URANIUM), Arrays.asList(1)),
        new DustEntry("zirconium_dust", Arrays.asList(ElementType.ZIRCONIUM), Arrays.asList(1)),
        new DustEntry("alclad_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(99, 1)),
        new DustEntry("aldrey_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(95, 4, 1)),
        new DustEntry("alloys_8090_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.LITHIUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(78, 22, 13, 1)),
        new DustEntry("almag_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM), Arrays.asList(92, 8)),
        new DustEntry("almelec_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(98, 1, 1)),
        new DustEntry("almgsi_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(97, 2, 1)),
        new DustEntry("alnimax_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.NICKEL), Arrays.asList(95, 5)),
        new DustEntry("alsimec_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(87, 13)),
        new DustEntry("alsin_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(80, 20)),
        new DustEntry("aluminium_bronze_dust", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM, ElementType.IRON), Arrays.asList(81, 9, 5)),
        new DustEntry("alumel_dust", Arrays.asList(ElementType.NICKEL, ElementType.MANGANESE, ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(90, 2, 2, 1)),
        new DustEntry("alumicrom_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.CHROMIUM), Arrays.asList(98, 2)),
        new DustEntry("aluminium_galimax_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.GALLIUM), Arrays.asList(99, 1)),
        new DustEntry("alusil_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(77, 23)),
        new DustEntry("antanium_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.TANTALUM), Arrays.asList(95, 5)),
        new DustEntry("ardol_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(94, 5, 1)),
        new DustEntry("birmabright_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(98, 1, 1)),
        new DustEntry("babbitt_metal_dust", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(89, 7, 4)),
        new DustEntry("barium_alloy_dust", Arrays.asList(ElementType.BARIUM, ElementType.ALUMINUM), Arrays.asList(50, 50)),
        new DustEntry("barmetal_dust", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.LEAD), Arrays.asList(55, 43, 2)),
        new DustEntry("bell_metal_dust", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(78, 22)),
        new DustEntry("berylco_dust", Arrays.asList(ElementType.COPPER, ElementType.BERYLLIUM, ElementType.COBALT), Arrays.asList(97, 2, 1)),
        new DustEntry("beta_brass_dust", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(50, 50)),
        new DustEntry("birmingham_gold_dust", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.GOLD), Arrays.asList(91, 8, 1)),
        new DustEntry("bronze_dust", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(88, 12)),
        new DustEntry("brass_dust", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(70, 30)),
        new DustEntry("calcusil_dust", Arrays.asList(ElementType.COPPER, ElementType.CALCIUM, ElementType.SILICON), Arrays.asList(95, 3, 2)),
        new DustEntry("cast_iron_dust", Arrays.asList(ElementType.IRON, ElementType.CARBON), Arrays.asList(96, 4)),
        new DustEntry("ccilla_dust", Arrays.asList(ElementType.COPPER, ElementType.CADMIUM, ElementType.SILVER), Arrays.asList(98, 1, 1)),
        new DustEntry("cervenit_dust", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.LEAD, ElementType.ZINC), Arrays.asList(60, 20, 15, 5)),
        new DustEntry("chrominium_dust", Arrays.asList(ElementType.CHROMIUM, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 30, 10)),
        new DustEntry("c_manganese_steel_dust", Arrays.asList(ElementType.IRON, ElementType.MANGANESE, ElementType.CARBON), Arrays.asList(86, 13, 1)),
        new DustEntry("constitution_dust", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.ZINC), Arrays.asList(88, 10, 2)),
        new DustEntry("copernicium_alloy_dust", Arrays.asList(ElementType.COPERNICIUM, ElementType.GOLD), Arrays.asList(50, 50)),
        new DustEntry("copper_aluminium_dust", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM), Arrays.asList(90, 10)),
        new DustEntry("copper_bismuth_dust", Arrays.asList(ElementType.COPPER, ElementType.BISMUTH), Arrays.asList(98, 2)),
        new DustEntry("copper_nickel_dust", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(70, 30)),
        new DustEntry("cunal_dust", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ALUMINUM), Arrays.asList(89, 10, 1)),
        new DustEntry("cunife_dust", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 20, 20)),
        new DustEntry("cusil_dust", Arrays.asList(ElementType.COPPER, ElementType.SILVER, ElementType.TITANIUM), Arrays.asList(63, 35, 2)),
        new DustEntry("stainless_steel_dust", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM, ElementType.NICKEL), Arrays.asList(74, 18, 8)),
        new DustEntry("tool_steel_dust", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN, ElementType.CHROMIUM, ElementType.VANADIUM), Arrays.asList(95, 2, 2, 1)),
        new DustEntry("invar_dust", Arrays.asList(ElementType.IRON, ElementType.NICKEL), Arrays.asList(64, 36)),
        new DustEntry("kovar_dust", Arrays.asList(ElementType.IRON, ElementType.NICKEL, ElementType.COBALT), Arrays.asList(54, 29, 17)),
        new DustEntry("silicon_steel_dust", Arrays.asList(ElementType.IRON, ElementType.SILICON), Arrays.asList(97, 3)),
        new DustEntry("ferrochrome_dust", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 30)),
        new DustEntry("ferrotitanium_dust", Arrays.asList(ElementType.IRON, ElementType.TITANIUM), Arrays.asList(70, 30)),
        new DustEntry("ferrovanadium_dust", Arrays.asList(ElementType.IRON, ElementType.VANADIUM), Arrays.asList(83, 17)),
        new DustEntry("ferrotungsten_dust", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN), Arrays.asList(78, 22)),
        new DustEntry("ferromolybdenum_dust", Arrays.asList(ElementType.IRON, ElementType.MOLYBDENUM), Arrays.asList(80, 20)),
        new DustEntry("inconel_dust", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM, ElementType.IRON), Arrays.asList(50, 30, 20)),
        new DustEntry("nichrome_dust", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM), Arrays.asList(80, 20)),
        new DustEntry("permalloy_dust", Arrays.asList(ElementType.NICKEL, ElementType.IRON), Arrays.asList(80, 20)),
        new DustEntry("nickel_silver_dust", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ZINC), Arrays.asList(60, 20, 20)),
        new DustEntry("constantan_dust", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(55, 45)),
        new DustEntry("manganin_dust", Arrays.asList(ElementType.COPPER, ElementType.MANGANESE, ElementType.NICKEL), Arrays.asList(86, 12, 2)),
        new DustEntry("monel_dust", Arrays.asList(ElementType.NICKEL, ElementType.COPPER), Arrays.asList(65, 35)),
        new DustEntry("ti_6al_4v_dust", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(90, 6, 4)),
        new DustEntry("ti_3al_2_5v_dust", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(95, 3, 2)),
        new DustEntry("ti_6al_7nb_dust", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.NIOBIUM), Arrays.asList(87, 6, 7)),
        new DustEntry("az31_magnesium_dust", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(96, 3, 1)),
        new DustEntry("elektron_dust", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC, ElementType.MANGANESE), Arrays.asList(96, 2, 1, 1)),
        new DustEntry("electrum_dust", Arrays.asList(ElementType.GOLD, ElementType.SILVER), Arrays.asList(50, 50)),
        new DustEntry("tumbaga_dust", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(60, 40)),
        new DustEntry("rose_gold_dust", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(75, 25)),
        new DustEntry("white_gold_dust", Arrays.asList(ElementType.GOLD, ElementType.NICKEL), Arrays.asList(90, 10)),
        new DustEntry("sterling_silver_dust", Arrays.asList(ElementType.SILVER, ElementType.COPPER), Arrays.asList(93, 7)),
        new DustEntry("shibuichi_dust", Arrays.asList(ElementType.COPPER, ElementType.SILVER), Arrays.asList(75, 25)),
        new DustEntry("roses_metal_dust", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN), Arrays.asList(50, 25, 25)),
        new DustEntry("woods_metal_dust", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN, ElementType.CADMIUM), Arrays.asList(50, 25, 13, 12)),
        new DustEntry("solder_dust", Arrays.asList(ElementType.TIN, ElementType.LEAD), Arrays.asList(60, 40)),
        new DustEntry("pewter_dust", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(85, 10, 5)),
        new DustEntry("fields_metal_dust", Arrays.asList(ElementType.BISMUTH, ElementType.INDIUM, ElementType.TIN), Arrays.asList(33, 33, 34)),
        new DustEntry("silicon_bronze_dust", Arrays.asList(ElementType.COPPER, ElementType.SILICON, ElementType.MANGANESE), Arrays.asList(96, 3, 1)),
        new DustEntry("manganese_bronze_dust", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.MANGANESE, ElementType.ALUMINUM), Arrays.asList(70, 25, 3, 2)),
        new DustEntry("zamak_dust", Arrays.asList(ElementType.ZINC, ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.COPPER), Arrays.asList(93, 4, 1, 2)),
        new DustEntry("stellite_dust", Arrays.asList(ElementType.COBALT, ElementType.CHROMIUM, ElementType.TUNGSTEN), Arrays.asList(60, 30, 10)),
        new DustEntry("duralumin_dust", Arrays.asList(ElementType.ALUMINUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(95, 4, 1)),
        new DustEntry("heavy_tungsten_dust", Arrays.asList(ElementType.TUNGSTEN, ElementType.NICKEL, ElementType.IRON), Arrays.asList(90, 6, 4)),
        new DustEntry("tungsten_copper_dust", Arrays.asList(ElementType.TUNGSTEN, ElementType.COPPER), Arrays.asList(80, 20)),
        new DustEntry("tzm_molybdenum_dust", Arrays.asList(ElementType.MOLYBDENUM, ElementType.TITANIUM, ElementType.ZIRCONIUM), Arrays.asList(98, 1, 1)),
        new DustEntry("bismuth_tin_dust", Arrays.asList(ElementType.BISMUTH, ElementType.TIN), Arrays.asList(58, 42)),
        new DustEntry("tantalum_tungsten_dust", Arrays.asList(ElementType.TANTALUM, ElementType.TUNGSTEN), Arrays.asList(90, 10)),
        new DustEntry("niobium_titanium_dust", Arrays.asList(ElementType.NIOBIUM, ElementType.TITANIUM), Arrays.asList(47, 53)),
        new DustEntry("depleted_uranium_dust", Arrays.asList(ElementType.URANIUM, ElementType.TITANIUM), Arrays.asList(95, 5)),
        new DustEntry("galinstan_dust", Arrays.asList(ElementType.GALLIUM, ElementType.INDIUM, ElementType.TIN), Arrays.asList(68, 22, 10)),
        new DustEntry("germanium_silicon_dust", Arrays.asList(ElementType.GERMANIUM, ElementType.SILICON), Arrays.asList(70, 30)),
        new DustEntry("sodium_potassium_dust", Arrays.asList(ElementType.SODIUM, ElementType.POTASSIUM), Arrays.asList(78, 22)),
        new DustEntry("mythril_steel_dust", Arrays.asList(ElementType.MYTHRIL, ElementType.IRON, ElementType.CARBON), Arrays.asList(85, 14, 1)),
        new DustEntry("naquadah_steel_dust", Arrays.asList(ElementType.NAQUADAH, ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 25, 5)),
        new DustEntry("naquadriah_titanium_dust", Arrays.asList(ElementType.NAQUADRIUM, ElementType.TITANIUM, ElementType.ALUMINUM), Arrays.asList(50, 40, 10)),
        new DustEntry("energium_copper_dust", Arrays.asList(ElementType.ENERGIUM, ElementType.COPPER, ElementType.TIN), Arrays.asList(25, 70, 5)),
        new DustEntry("eridium_gold_dust", Arrays.asList(ElementType.ERIDIUM, ElementType.GOLD, ElementType.SILVER), Arrays.asList(20, 60, 20)),
        new DustEntry("energium_aluminium_dust", Arrays.asList(ElementType.ENERGIUM, ElementType.ALUMINUM), Arrays.asList(20, 80)),
        new DustEntry("naquadah_mythril_dust", Arrays.asList(ElementType.NAQUADAH, ElementType.MYTHRIL), Arrays.asList(50, 50)),
        new DustEntry("eridium_tantalum_dust", Arrays.asList(ElementType.ERIDIUM, ElementType.TANTALUM), Arrays.asList(30, 70))
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerDusts() {
        for (DustEntry e : ENTRIES) {
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

    private record DustEntry(String name, List<ElementType> elements, List<Integer> amounts) {}
}
