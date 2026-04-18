package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.CompoundItem;
import kayla.pulderessence.item.types.ElementType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;


public class IngotItem {

    // EVERY SINGLE SOLID METAL INGOT + FICTIONAL (47 TOTALUMINUM)
    public static final Item LITHIUM_INGOT = registerIngot("lithium_ingot", Arrays.asList(ElementType.LITHIUM), Arrays.asList(1));
    public static final Item BERYLLIUM_INGOT = registerIngot("beryllium_ingot", Arrays.asList(ElementType.BERYLLIUM), Arrays.asList(1));
    public static final Item SODIUM_INGOT = registerIngot("sodium_ingot", Arrays.asList(ElementType.SODIUM), Arrays.asList(1));
    public static final Item VANADIUM_INGOT = registerIngot("vanadium_ingot", Arrays.asList(ElementType.VANADIUM), Arrays.asList(1));
    public static final Item MERCURY_INGOT = registerIngot("mercury_ingot", Arrays.asList(ElementType.MERCURY), Arrays.asList(1));
    public static final Item POLONIUM_INGOT = registerIngot("polonium_ingot", Arrays.asList(ElementType.POLONIUM), Arrays.asList(1));
    public static final Item IRON_INGOT = registerIngot("iron_ingot", Arrays.asList(ElementType.IRON), Arrays.asList(1));
    public static final Item COPPER_INGOT = registerIngot("copper_ingot", Arrays.asList(ElementType.COPPER), Arrays.asList(1));
    public static final Item GOLD_INGOT = registerIngot("gold_ingot", Arrays.asList(ElementType.GOLD), Arrays.asList(1));
    public static final Item ALUMINUM_INGOT = registerIngot("aluminum_ingot", Arrays.asList(ElementType.ALUMINUM), Arrays.asList(1));
    public static final Item LEAD_INGOT = registerIngot("lead_ingot", Arrays.asList(ElementType.LEAD), Arrays.asList(1));
    public static final Item TIN_INGOT = registerIngot("tin_ingot", Arrays.asList(ElementType.TIN), Arrays.asList(1));
    public static final Item TITANIUM_INGOT = registerIngot("titanium_ingot", Arrays.asList(ElementType.TITANIUM), Arrays.asList(1));
    public static final Item ZINC_INGOT = registerIngot("zinc_ingot", Arrays.asList(ElementType.ZINC), Arrays.asList(1));
    public static final Item SILVER_INGOT = registerIngot("silver_ingot", Arrays.asList(ElementType.SILVER), Arrays.asList(1));
    public static final Item NICKEL_INGOT = registerIngot("nickel_ingot", Arrays.asList(ElementType.NICKEL), Arrays.asList(1));
    public static final Item COBALT_INGOT = registerIngot("cobalt_ingot", Arrays.asList(ElementType.COBALT), Arrays.asList(1));
    public static final Item CHROMIUM_INGOT = registerIngot("chromium_ingot", Arrays.asList(ElementType.CHROMIUM), Arrays.asList(1));
    public static final Item MANGANESE_INGOT = registerIngot("manganese_ingot", Arrays.asList(ElementType.MANGANESE), Arrays.asList(1));
    public static final Item MOLYBDENUM_INGOT = registerIngot("molybdenum_ingot", Arrays.asList(ElementType.MOLYBDENUM), Arrays.asList(1));
    public static final Item TUNGSTEN_INGOT = registerIngot("tungsten_ingot", Arrays.asList(ElementType.TUNGSTEN), Arrays.asList(1));
    public static final Item PLATINUM_INGOT = registerIngot("platinum_ingot", Arrays.asList(ElementType.PLATINUM), Arrays.asList(1));
    public static final Item BISMUTH_INGOT = registerIngot("bismuth_ingot", Arrays.asList(ElementType.BISMUTH), Arrays.asList(1));
    public static final Item MAGNESIUM_INGOT = registerIngot("magnesium_ingot", Arrays.asList(ElementType.MAGNESIUM), Arrays.asList(1));
    public static final Item CALCIUM_INGOT = registerIngot("calcium_ingot", Arrays.asList(ElementType.CALCIUM), Arrays.asList(1));
    public static final Item BARIUM_INGOT = registerIngot("barium_ingot", Arrays.asList(ElementType.BARIUM), Arrays.asList(1));
    public static final Item CADMIUM_INGOT = registerIngot("cadmium_ingot", Arrays.asList(ElementType.CADMIUM), Arrays.asList(1));
    public static final Item INDIUM_INGOT = registerIngot("indium_ingot", Arrays.asList(ElementType.INDIUM), Arrays.asList(1));
    public static final Item GALLIUM_INGOT = registerIngot("gallium_ingot", Arrays.asList(ElementType.GALLIUM), Arrays.asList(1));
    public static final Item THALLIUM_INGOT = registerIngot("thallium_ingot", Arrays.asList(ElementType.THULIUM), Arrays.asList(1));
    public static final Item ANTIMONY_INGOT = registerIngot("antimony_ingot", Arrays.asList(ElementType.ANTIMONY), Arrays.asList(1));
    public static final Item TELLURIUM_INGOT = registerIngot("tellurium_ingot", Arrays.asList(ElementType.TELLURIUM), Arrays.asList(1));
    public static final Item SELENIUM_INGOT = registerIngot("selenium_ingot", Arrays.asList(ElementType.SELENIUM), Arrays.asList(1));
    public static final Item ARSENIC_INGOT = registerIngot("arsenic_ingot", Arrays.asList(ElementType.ARSENIC), Arrays.asList(1));
    public static final Item STRONTIUM_INGOT = registerIngot("strontium_ingot", Arrays.asList(ElementType.STRONTIUM), Arrays.asList(1));
    public static final Item SCANDIUM_INGOT = registerIngot("scandium_ingot", Arrays.asList(ElementType.SCANDIUM), Arrays.asList(1));
    public static final Item YTTRIUM_INGOT = registerIngot("yttrium_ingot", Arrays.asList(ElementType.YTTRIUM), Arrays.asList(1));
    public static final Item ZIRCONIUM_INGOT = registerIngot("zirconium_ingot", Arrays.asList(ElementType.ZIRCONIUM), Arrays.asList(1));
    public static final Item NIOBIUM_INGOT = registerIngot("niobium_ingot", Arrays.asList(ElementType.NIOBIUM), Arrays.asList(1));
    public static final Item TANTALUM_INGOT = registerIngot("tantalum_ingot", Arrays.asList(ElementType.TANTALUM), Arrays.asList(1));
    public static final Item RHENIUM_INGOT = registerIngot("rhenium_ingot", Arrays.asList(ElementType.RHENIUM), Arrays.asList(1));
    public static final Item THORIUM_INGOT = registerIngot("thorium_ingot", Arrays.asList(ElementType.THORIUM), Arrays.asList(1));
    public static final Item URANIUM_INGOT = registerIngot("uranium_ingot", Arrays.asList(ElementType.URANIUM), Arrays.asList(1));
    public static final Item RUTHENIUM_INGOT = registerIngot("ruthenium_ingot", Arrays.asList(ElementType.RUTHENIUM), Arrays.asList(1));
    public static final Item RHODIUM_INGOT = registerIngot("rhodium_ingot", Arrays.asList(ElementType.RHODIUM), Arrays.asList(1));
    public static final Item PALLADIUM_INGOT = registerIngot("palladium_ingot", Arrays.asList(ElementType.PALLADIUM), Arrays.asList(1));
    public static final Item OSMIUM_INGOT = registerIngot("osmium_ingot", Arrays.asList(ElementType.OSMIUM), Arrays.asList(1));
    public static final Item IRIDIUM_INGOT = registerIngot("iridium_ingot", Arrays.asList(ElementType.IRIDIUM), Arrays.asList(1));

    // FICTIONAL ENDGAME INGOTS
    public static final Item NAQUADAH_INGOT = registerIngot("naquadah_ingot", Arrays.asList(ElementType.NAQUADAH), Arrays.asList(1));
    public static final Item NAQUADRIAH_INGOT = registerIngot("naquadriah_ingot", Arrays.asList(ElementType.NAQUADRIUM), Arrays.asList(1));
    public static final Item ENERGIUM_INGOT = registerIngot("energium_ingot", Arrays.asList(ElementType.ENERGIUM), Arrays.asList(1));
    public static final Item ERIDIUM_INGOT = registerIngot("eridium_ingot", Arrays.asList(ElementType.ERIDIUM), Arrays.asList(1));
    public static final Item MYTHRIL_INGOT = registerIngot("mythril_ingot", Arrays.asList(ElementType.MYTHRIL), Arrays.asList(1));

    // ALUMINIUM ALLOYS (Starting with A)
    public static final Item ALCLAD_ALLOY_INGOT = registerIngot("alclad_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.ZINC), Arrays.asList(99, 1));
    public static final Item ALDREY_ALLOY_INGOT = registerIngot("aldrey_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(95, 4, 1));
    public static final Item ALLOYS_8090_ALLOY_INGOT = registerIngot("alloys_8090_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.LITHIUM, ElementType.COPPER, ElementType.MAGNESIUM), Arrays.asList(78, 22, 13, 1));
    public static final Item ALMAG_ALLOY_INGOT = registerIngot("almag_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM), Arrays.asList(92, 8));
    public static final Item ALMELEC_ALLOY_INGOT = registerIngot("almelec_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(98, 1, 1));
    public static final Item ALMgSi_ALLOY_INGOT = registerIngot("almgsi_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(97, 2, 1));
    public static final Item ALNIMAX_ALLOY_INGOT = registerIngot("alnimax_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.NICKEL), Arrays.asList(95, 5));
    public static final Item ALSIMEC_ALLOY_INGOT = registerIngot("alsimec_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(87, 13));
    public static final Item ALSIN_ALLOY_INGOT = registerIngot("alsin_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(80, 20));
    public static final Item ALUMINIUM_BRONZE_ALLOY_INGOT = registerIngot("aluminium_bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM, ElementType.IRON), Arrays.asList(81, 9, 5));
    public static final Item ALUMEL_ALLOY_INGOT = registerIngot("alumel_alloy_ingot", Arrays.asList(ElementType.NICKEL, ElementType.MANGANESE, ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(90, 2, 2, 1));
    public static final Item ALUMICROM_ALLOY_INGOT = registerIngot("alumicrom_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.CHROMIUM), Arrays.asList(98, 2));
    public static final Item ALUMINIUM_GALIMAX_ALLOY_INGOT = registerIngot("aluminium_galimax_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.GALLIUM), Arrays.asList(99, 1));
    public static final Item ALUSIL_ALLOY_INGOT = registerIngot("alusil_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.SILICON), Arrays.asList(77, 23));
    public static final Item ANTANIUM_ALLOY_INGOT = registerIngot("antanium_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.TANTALUM), Arrays.asList(95, 5));
    public static final Item ARDOL_ALLOY_INGOT = registerIngot("ardol_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.SILICON), Arrays.asList(94, 5, 1));

    // BRONZE & BRASS ALLOYS (Starting with B)
    public static final Item BABBITT_METAL_ALLOY_INGOT = registerIngot("babbitt_metal_alloy_ingot", Arrays.asList(ElementType.TIN, ElementType.ANTIMONY, ElementType.COPPER), Arrays.asList(89, 7, 4));
    public static final Item BARIUM_ALLOY_INGOT = registerIngot("barium_alloy_ingot", Arrays.asList(ElementType.BARIUM, ElementType.ALUMINUM), Arrays.asList(50, 50));
    public static final Item BARMETAL_ALLOY_INGOT = registerIngot("barmetal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.LEAD), Arrays.asList(55, 43, 2));
    public static final Item BELL_METAL_ALLOY_INGOT = registerIngot("bell_metal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(78, 22));
    public static final Item BERYLCO_ALLOY_INGOT = registerIngot("berylco_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.BERYLLIUM, ElementType.COBALT), Arrays.asList(97, 2, 1));
    public static final Item BETA_BRASS_ALLOY_INGOT = registerIngot("beta_brass_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(50, 50));
    public static final Item BIRMABRIGHT_ALLOY_INGOT = registerIngot("birmabright_alloy_ingot", Arrays.asList(ElementType.ALUMINUM, ElementType.MAGNESIUM, ElementType.MANGANESE), Arrays.asList(98, 1, 1));
    public static final Item BIRMINGHAM_GOLD_ALLOY_INGOT = registerIngot("birmingham_gold_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC, ElementType.GOLD), Arrays.asList(91, 8, 1));
    public static final Item BRONZE_ALLOY_INGOT = registerIngot("bronze_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN), Arrays.asList(88, 12));
    public static final Item BRASS_ALLOY_INGOT = registerIngot("brass_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ZINC), Arrays.asList(70, 30));

    // ALLOYS STARTING WITH "C"
    public static final Item CALCUSIL_ALLOY_INGOT = registerIngot("calcusil_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.CALCIUM, ElementType.SILICON), Arrays.asList(95, 3, 2));
    public static final Item CAST_IRON_ALLOY_INGOT = registerIngot("cast_iron_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.CARBON), Arrays.asList(96, 4));
    public static final Item CCILLA_ALLOY_INGOT = registerIngot("ccilla_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.CADMIUM, ElementType.SILVER), Arrays.asList(98, 1, 1));
    public static final Item CERVENIT_ALLOY_INGOT = registerIngot("cervenit_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.LEAD, ElementType.ZINC), Arrays.asList(60, 20, 15, 5));
    public static final Item CHROMINIUM_ALLOY_INGOT = registerIngot("chrominium_alloy_ingot", Arrays.asList(ElementType.CHROMIUM, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 30, 10));
    public static final Item C_MANGANESE_STEEL_ALLOY_INGOT = registerIngot("c_manganese_steel_alloy_ingot", Arrays.asList(ElementType.IRON, ElementType.MANGANESE, ElementType.CARBON), Arrays.asList(86, 13, 1));
    public static final Item CONSTITUTION_ALLOY_INGOT = registerIngot("constitution_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.TIN, ElementType.ZINC), Arrays.asList(88, 10, 2));
    public static final Item COPERNICIUM_ALLOY_INGOT = registerIngot("copernicium_alloy_ingot", Arrays.asList(ElementType.COPERNICIUM, ElementType.GOLD), Arrays.asList(50, 50));
    public static final Item COPPER_ALUMINIUM_ALLOY_INGOT = registerIngot("copper_aluminium_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.ALUMINUM), Arrays.asList(90, 10));
    public static final Item COPPER_BISMUTH_ALLOY_INGOT = registerIngot("copper_bismuth_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.BISMUTH), Arrays.asList(98, 2));
    public static final Item COPPER_NICKEL_ALLOY_INGOT = registerIngot("copper_nickel_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL), Arrays.asList(70, 30));
    public static final Item CUNAL_ALLOY_INGOT = registerIngot("cunal_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.ALUMINUM), Arrays.asList(89, 10, 1));
    public static final Item CUNIFE_ALLOY_INGOT = registerIngot("cunife_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.NICKEL, ElementType.IRON), Arrays.asList(60, 20, 20));
    public static final Item CUSIL_ALLOY_INGOT = registerIngot("cusil_alloy_ingot", Arrays.asList(ElementType.COPPER, ElementType.SILVER, ElementType.TITANIUM), Arrays.asList(63, 35, 2));

    public static Item registerIngot(String name, List<ElementType> compound, List<Integer> amount) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name), new CompoundItem(new FabricItemSettings(), compound, amount));
    }
    
    public static void registerIngotItems() {}
}
