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

public class ModIngots {

    private static final List<IngotEntry> ENTRIES = List.of(
        new IngotEntry("lithium_ingot", Arrays.asList(ElementType.LITHIUM), Arrays.asList(1)),
        new IngotEntry("beryllium_ingot", Arrays.asList(ElementType.BERYLLIUM), Arrays.asList(1)),
        new IngotEntry("sodium_ingot", Arrays.asList(ElementType.SODIUM), Arrays.asList(1)),
        new IngotEntry("vanadium_ingot", Arrays.asList(ElementType.VANADIUM), Arrays.asList(1)),
        new IngotEntry("mercury_ingot", Arrays.asList(ElementType.MERCURY), Arrays.asList(1)),
        new IngotEntry("polonium_ingot", Arrays.asList(ElementType.POLONIUM), Arrays.asList(1)),
        new IngotEntry("iron_ingot", Arrays.asList(ElementType.IRON), Arrays.asList(1)),
        new IngotEntry("copper_ingot", Arrays.asList(ElementType.COPPER), Arrays.asList(1)),
        new IngotEntry("gold_ingot", Arrays.asList(ElementType.GOLD), Arrays.asList(1)),
        new IngotEntry("aluminum_ingot", Arrays.asList(ElementType.ALUMINUM), Arrays.asList(1)),
        new IngotEntry("lead_ingot", Arrays.asList(ElementType.LEAD), Arrays.asList(1)),
        new IngotEntry("tin_ingot", Arrays.asList(ElementType.TIN), Arrays.asList(1)),
        new IngotEntry("titanium_ingot", Arrays.asList(ElementType.TITANIUM), Arrays.asList(1)),
        new IngotEntry("zinc_ingot", Arrays.asList(ElementType.ZINC), Arrays.asList(1)),
        new IngotEntry("silver_ingot", Arrays.asList(ElementType.SILVER), Arrays.asList(1)),
        new IngotEntry("nickel_ingot", Arrays.asList(ElementType.NICKEL), Arrays.asList(1)),
        new IngotEntry("cobalt_ingot", Arrays.asList(ElementType.COBALT), Arrays.asList(1)),
        new IngotEntry("chromium_ingot", Arrays.asList(ElementType.CHROMIUM), Arrays.asList(1)),
        new IngotEntry("manganese_ingot", Arrays.asList(ElementType.MANGANESE), Arrays.asList(1)),
        new IngotEntry("molybdenum_ingot", Arrays.asList(ElementType.MOLYBDENUM), Arrays.asList(1)),
        new IngotEntry("tungsten_ingot", Arrays.asList(ElementType.TUNGSTEN), Arrays.asList(1)),
        new IngotEntry("platinum_ingot", Arrays.asList(ElementType.PLATINUM), Arrays.asList(1)),
        new IngotEntry("bismuth_ingot", Arrays.asList(ElementType.BISMUTH), Arrays.asList(1)),
        new IngotEntry("magnesium_ingot", Arrays.asList(ElementType.MAGNESIUM), Arrays.asList(1)),
        new IngotEntry("calcium_ingot", Arrays.asList(ElementType.CALCIUM), Arrays.asList(1)),
        new IngotEntry("barium_ingot", Arrays.asList(ElementType.BARIUM), Arrays.asList(1)),
        new IngotEntry("cadmium_ingot", Arrays.asList(ElementType.CADMIUM), Arrays.asList(1)),
        new IngotEntry("indium_ingot", Arrays.asList(ElementType.INDIUM), Arrays.asList(1)),
        new IngotEntry("gallium_ingot", Arrays.asList(ElementType.GALLIUM), Arrays.asList(1)),
        new IngotEntry("thallium_ingot", Arrays.asList(ElementType.THALLIUM), Arrays.asList(1)),
        new IngotEntry("antimony_ingot", Arrays.asList(ElementType.ANTIMONY), Arrays.asList(1)),
        new IngotEntry("tellurium_ingot", Arrays.asList(ElementType.TELLURIUM), Arrays.asList(1)),
        new IngotEntry("selenium_ingot", Arrays.asList(ElementType.SELENIUM), Arrays.asList(1)),
        new IngotEntry("arsenic_ingot", Arrays.asList(ElementType.ARSENIC), Arrays.asList(1)),
        new IngotEntry("strontium_ingot", Arrays.asList(ElementType.STRONTIUM), Arrays.asList(1)),
        new IngotEntry("scandium_ingot", Arrays.asList(ElementType.SCANDIUM), Arrays.asList(1)),
        new IngotEntry("yttrium_ingot", Arrays.asList(ElementType.YTTRIUM), Arrays.asList(1)),
        new IngotEntry("zirconium_ingot", Arrays.asList(ElementType.ZIRCONIUM), Arrays.asList(1)),
        new IngotEntry("niobium_ingot", Arrays.asList(ElementType.NIOBIUM), Arrays.asList(1)),
        new IngotEntry("tantalum_ingot", Arrays.asList(ElementType.TANTALUM), Arrays.asList(1)),
        new IngotEntry("rhenium_ingot", Arrays.asList(ElementType.RHENIUM), Arrays.asList(1)),
        new IngotEntry("thorium_ingot", Arrays.asList(ElementType.THORIUM), Arrays.asList(1)),
        new IngotEntry("uranium_ingot", Arrays.asList(ElementType.URANIUM), Arrays.asList(1)),
        new IngotEntry("ruthenium_ingot", Arrays.asList(ElementType.RUTHENIUM), Arrays.asList(1)),
        new IngotEntry("rhodium_ingot", Arrays.asList(ElementType.RHODIUM), Arrays.asList(1)),
        new IngotEntry("palladium_ingot", Arrays.asList(ElementType.PALLADIUM), Arrays.asList(1)),
        new IngotEntry("osmium_ingot", Arrays.asList(ElementType.OSMIUM), Arrays.asList(1)),
        new IngotEntry("iridium_ingot", Arrays.asList(ElementType.IRIDIUM), Arrays.asList(1)),
        new IngotEntry("naquadah_ingot", Arrays.asList(ElementType.NAQUADAH), Arrays.asList(1)),
        new IngotEntry("naquadriah_ingot", Arrays.asList(ElementType.NAQUADRIUM), Arrays.asList(1)),
        new IngotEntry("energium_ingot", Arrays.asList(ElementType.ENERGIUM), Arrays.asList(1)),
        new IngotEntry("eridium_ingot", Arrays.asList(ElementType.ERIDIUM), Arrays.asList(1)),
        new IngotEntry("mythril_ingot", Arrays.asList(ElementType.MYTHRIL), Arrays.asList(1)),
        new IngotEntry("alclad_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(99, 1)),
        new IngotEntry("aldrey_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(95, 4, 1)),
        new IngotEntry("alloys_8090_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.LITHIUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(78, 22, 13, 1)),
        new IngotEntry("almag_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM), Arrays.asList(92, 8)),
        new IngotEntry("almelec_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(98, 1, 1)),
        new IngotEntry("almgsi_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(97, 2, 1)),
        new IngotEntry("alnimax_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.NICKEL), Arrays.asList(95, 5)),
        new IngotEntry("alsimec_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(87, 13)),
        new IngotEntry("alsin_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(80, 20)),
        new IngotEntry("aluminium_bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM, ElementType.IRON), Arrays.asList(81, 9, 5)),
        new IngotEntry("alumel_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.MANGANESE, ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(90, 2, 2, 1)),
        new IngotEntry("alumicrom_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.CHROMIUM), Arrays.asList(98, 2)),
        new IngotEntry("aluminium_galimax_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.GALLIUM), Arrays.asList(99, 1)),
        new IngotEntry("alusil_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(77, 23)),
        new IngotEntry("antanium_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.TANTALUM), Arrays.asList(95, 5)),
        new IngotEntry("ardol_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(94, 5, 1)),
        new IngotEntry("babbitt_metal_alloy_ingot", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(89, 7, 4)),
        new IngotEntry("barium_alloy_ingot", Arrays.asList(ElementType.BARIUM, ElementType.ALUMINUM), Arrays.asList(50, 50)),
        new IngotEntry("barmetal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.LEAD), Arrays.asList(55, 43, 2)),
        new IngotEntry("bell_metal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(78, 22)),
        new IngotEntry("berylco_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.BERYLLIUM, ElementType.COBALT), Arrays.asList(97, 2, 1)),
        new IngotEntry("beta_brass_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(50, 50)),
        new IngotEntry("birmabright_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(98, 1, 1)),
        new IngotEntry("birmingham_gold_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.GOLD), Arrays.asList(91, 8, 1)),
        new IngotEntry("bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(88, 12)),
        new IngotEntry("brass_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(70, 30)),
        new IngotEntry("calcusil_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.CALCIUM, ElementType.SILICON), Arrays.asList(95, 3, 2)),
        new IngotEntry("cast_iron_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.CARBON), Arrays.asList(96, 4)),
        new IngotEntry("ccilla_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.CADMIUM, ElementType.SILVER), Arrays.asList(98, 1, 1)),
        new IngotEntry("cervenit_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.LEAD, ElementType.ZINC), Arrays.asList(60, 20, 15, 5)),
        new IngotEntry("chrominium_alloy_ingot", Arrays.asList(ElementType.CHROMIUM, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 30, 10)),
        new IngotEntry("c_manganese_steel_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.MANGANESE, ElementType.CARBON), Arrays.asList(86, 13, 1)),
        new IngotEntry("constitution_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.ZINC), Arrays.asList(88, 10, 2)),
        new IngotEntry("copernicium_alloy_ingot", Arrays.asList(ElementType.COPERNICIUM, ElementType.GOLD), Arrays.asList(50, 50)),
        new IngotEntry("copper_aluminium_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM), Arrays.asList(90, 10)),
        new IngotEntry("copper_bismuth_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.BISMUTH), Arrays.asList(98, 2)),
        new IngotEntry("copper_nickel_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(70, 30)),
        new IngotEntry("cunal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ALUMINUM), Arrays.asList(89, 10, 1)),
        new IngotEntry("cunife_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 20, 20)),
        new IngotEntry("cusil_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.SILVER, ElementType.TITANIUM), Arrays.asList(63, 35, 2)),
        new IngotEntry("stainless_steel_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM, ElementType.NICKEL), Arrays.asList(74, 18, 8)),
        new IngotEntry("tool_steel_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN, ElementType.CHROMIUM, ElementType.VANADIUM), Arrays.asList(95, 2, 2, 1)),
        new IngotEntry("invar_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.NICKEL), Arrays.asList(64, 36)),
        new IngotEntry("kovar_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.NICKEL, ElementType.COBALT), Arrays.asList(54, 29, 17)),
        new IngotEntry("silicon_steel_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.SILICON), Arrays.asList(97, 3)),
        new IngotEntry("ferrochrome_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 30)),
        new IngotEntry("ferrotitanium_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.TITANIUM), Arrays.asList(70, 30)),
        new IngotEntry("ferrovanadium_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.VANADIUM), Arrays.asList(83, 17)),
        new IngotEntry("ferrotungsten_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.TUNGSTEN), Arrays.asList(78, 22)),
        new IngotEntry("ferromolybdenum_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.MOLYBDENUM), Arrays.asList(80, 20)),
        new IngotEntry("inconel_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM, ElementType.IRON), Arrays.asList(50, 30, 20)),
        new IngotEntry("nichrome_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.CHROMIUM), Arrays.asList(80, 20)),
        new IngotEntry("permalloy_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.IRON), Arrays.asList(80, 20)),
        new IngotEntry("nickel_silver_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ZINC), Arrays.asList(60, 20, 20)),
        new IngotEntry("constantan_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(55, 45)),
        new IngotEntry("manganin_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.MANGANESE, ElementType.NICKEL), Arrays.asList(86, 12, 2)),
        new IngotEntry("monel_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.COPPER), Arrays.asList(65, 35)),
        new IngotEntry("ti_6al_4v_alloy_ingot", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(90, 6, 4)),
        new IngotEntry("ti_3al_2_5v_alloy_ingot", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.VANADIUM), Arrays.asList(95, 3, 2)),
        new IngotEntry("ti_6al_7nb_alloy_ingot", Arrays.asList(ElementType.TITANIUM, ElementType.ALUMINUM, ElementType.NIOBIUM), Arrays.asList(87, 6, 7)),
        new IngotEntry("az31_magnesium_alloy_ingot", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(96, 3, 1)),
        new IngotEntry("elektron_alloy_ingot", Arrays.asList(ElementType.MAGNESIUM, ElementType.ALUMINUM, ElementType.ZINC, ElementType.MANGANESE), Arrays.asList(96, 2, 1, 1)),
        new IngotEntry("electrum_alloy_ingot", Arrays.asList(ElementType.GOLD, ElementType.SILVER), Arrays.asList(50, 50)),
        new IngotEntry("tumbaga_alloy_ingot", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(60, 40)),
        new IngotEntry("rose_gold_alloy_ingot", Arrays.asList(ElementType.GOLD, ElementType.COPPER), Arrays.asList(75, 25)),
        new IngotEntry("white_gold_alloy_ingot", Arrays.asList(ElementType.GOLD, ElementType.NICKEL), Arrays.asList(90, 10)),
        new IngotEntry("sterling_silver_alloy_ingot", Arrays.asList(ElementType.SILVER, ElementType.COPPER), Arrays.asList(93, 7)),
        new IngotEntry("shibuichi_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.SILVER), Arrays.asList(75, 25)),
        new IngotEntry("roses_metal_alloy_ingot", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN), Arrays.asList(50, 25, 25)),
        new IngotEntry("woods_metal_alloy_ingot", Arrays.asList(ElementType.BISMUTH, ElementType.LEAD, ElementType.TIN, ElementType.CADMIUM), Arrays.asList(50, 25, 13, 12)),
        new IngotEntry("solder_alloy_ingot", Arrays.asList(ElementType.TIN, ElementType.LEAD), Arrays.asList(60, 40)),
        new IngotEntry("pewter_alloy_ingot", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(85, 10, 5)),
        new IngotEntry("fields_metal_alloy_ingot", Arrays.asList(ElementType.BISMUTH, ElementType.INDIUM, ElementType.TIN), Arrays.asList(33, 33, 34)),
        new IngotEntry("silicon_bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.SILICON, ElementType.MANGANESE), Arrays.asList(96, 3, 1)),
        new IngotEntry("manganese_bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.MANGANESE, ElementType.ALUMINUM), Arrays.asList(70, 25, 3, 2)),
        new IngotEntry("zamak_alloy_ingot", Arrays.asList(ElementType.ZINC, ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.COPPER), Arrays.asList(93, 4, 1, 2)),
        new IngotEntry("stellite_alloy_ingot", Arrays.asList(ElementType.COBALT, ElementType.CHROMIUM, ElementType.TUNGSTEN), Arrays.asList(60, 30, 10)),
        new IngotEntry("duralumin_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(95, 4, 1)),
        new IngotEntry("heavy_tungsten_alloy_ingot", Arrays.asList(ElementType.TUNGSTEN, ElementType.NICKEL, ElementType.IRON), Arrays.asList(90, 6, 4)),
        new IngotEntry("tungsten_copper_alloy_ingot", Arrays.asList(ElementType.TUNGSTEN, ElementType.COPPER), Arrays.asList(80, 20)),
        new IngotEntry("tzm_molybdenum_alloy_ingot", Arrays.asList(ElementType.MOLYBDENUM, ElementType.TITANIUM, ElementType.ZIRCONIUM), Arrays.asList(98, 1, 1)),
        new IngotEntry("bismuth_tin_alloy_ingot", Arrays.asList(ElementType.BISMUTH, ElementType.TIN), Arrays.asList(58, 42)),
        new IngotEntry("tantalum_tungsten_alloy_ingot", Arrays.asList(ElementType.TANTALUM, ElementType.TUNGSTEN), Arrays.asList(90, 10)),
        new IngotEntry("niobium_titanium_alloy_ingot", Arrays.asList(ElementType.NIOBIUM, ElementType.TITANIUM), Arrays.asList(47, 53)),
        new IngotEntry("depleted_uranium_alloy_ingot", Arrays.asList(ElementType.URANIUM, ElementType.TITANIUM), Arrays.asList(95, 5)),
        new IngotEntry("galinstan_alloy_ingot", Arrays.asList(ElementType.GALLIUM, ElementType.INDIUM, ElementType.TIN), Arrays.asList(68, 22, 10)),
        new IngotEntry("germanium_silicon_alloy_ingot", Arrays.asList(ElementType.GERMANIUM, ElementType.SILICON), Arrays.asList(70, 30)),
        new IngotEntry("sodium_potassium_alloy_ingot", Arrays.asList(ElementType.SODIUM, ElementType.POTASSIUM), Arrays.asList(78, 22)),
        new IngotEntry("niobium_tin_alloy_ingot", Arrays.asList(ElementType.NIOBIUM, ElementType.TIN), Arrays.asList(3, 1)),
        new IngotEntry("yttrium_barium_cuprate_alloy_ingot", Arrays.asList(ElementType.YTTRIUM, ElementType.BARIUM, ElementType.COPPER, ElementType.OXYGEN), Arrays.asList(1, 2, 3, 7)),
        new IngotEntry("mercury_barium_calcium_cuprate_alloy_ingot", Arrays.asList(ElementType.MERCURY, ElementType.BARIUM, ElementType.CALCIUM, ElementType.COPPER, ElementType.OXYGEN), Arrays.asList(1, 2, 2, 3, 8)),
        new IngotEntry("flux_ybco_alloy_ingot", Arrays.asList(ElementType.YTTRIUM, ElementType.BARIUM, ElementType.COPPER, ElementType.OXYGEN), Arrays.asList(1, 2, 3, 7)),
        new IngotEntry("mercury_barium_calcium_cuprate_1212_alloy_ingot", Arrays.asList(ElementType.MERCURY, ElementType.BARIUM, ElementType.CALCIUM, ElementType.COPPER, ElementType.OXYGEN), Arrays.asList(1, 2, 1, 2, 6)),
        new IngotEntry("iron_scandium_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.SCANDIUM), Arrays.asList(1, 1)),
        new IngotEntry("barium_iron_arsenide_alloy_ingot", Arrays.asList(ElementType.BARIUM, ElementType.IRON, ElementType.ARSENIC, ElementType.CARBON), Arrays.asList(1, 2, 2, 1)),
        new IngotEntry("mythril_steel_alloy_ingot", Arrays.asList(ElementType.MYTHRIL, ElementType.IRON, ElementType.CARBON), Arrays.asList(85, 14, 1)),
        new IngotEntry("naquadah_steel_alloy_ingot", Arrays.asList(ElementType.NAQUADAH, ElementType.IRON, ElementType.CHROMIUM), Arrays.asList(70, 25, 5)),
        new IngotEntry("naquadriah_titanium_alloy_ingot", Arrays.asList(ElementType.NAQUADRIUM, ElementType.TITANIUM, ElementType.ALUMINUM), Arrays.asList(50, 40, 10)),
        new IngotEntry("energium_copper_alloy_ingot", Arrays.asList(ElementType.ENERGIUM, ElementType.COPPER, ElementType.TIN), Arrays.asList(25, 70, 5)),
        new IngotEntry("eridium_gold_alloy_ingot", Arrays.asList(ElementType.ERIDIUM, ElementType.GOLD, ElementType.SILVER), Arrays.asList(20, 60, 20)),
        new IngotEntry("energium_aluminium_alloy_ingot", Arrays.asList(ElementType.ENERGIUM, ElementType.ALUMINUM), Arrays.asList(20, 80)),
        new IngotEntry("naquadah_mythril_alloy_ingot", Arrays.asList(ElementType.NAQUADAH, ElementType.MYTHRIL), Arrays.asList(50, 50)),
        new IngotEntry("eridium_tantalum_alloy_ingot", Arrays.asList(ElementType.ERIDIUM, ElementType.TANTALUM), Arrays.asList(30, 70))
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerIngots() {
        for (IngotEntry e : ENTRIES) {
            Item item = new CompoundItem(new FabricItemSettings(), e.elements, e.amounts);
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), item);
            ITEMS.put(e.name, item);
        }
    }

    private record IngotEntry(String name, List<ElementType> elements, List<Integer> amounts) {}
}
