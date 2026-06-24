package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup INGOTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "ingots"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.ingots"))
                    .icon(() -> new ItemStack(ModIngots.get("iron_ingot"))).entries((displayContext, entries) -> {
                        entries.add(ModIngots.get("lithium_ingot"));
                        entries.add(ModIngots.get("beryllium_ingot"));
                        entries.add(ModIngots.get("sodium_ingot"));
                        entries.add(ModIngots.get("magnesium_ingot"));
                        entries.add(ModIngots.get("aluminum_ingot"));
                        entries.add(ModIngots.get("calcium_ingot"));
                        entries.add(ModIngots.get("scandium_ingot"));
                        entries.add(ModIngots.get("titanium_ingot"));
                        entries.add(ModIngots.get("vanadium_ingot"));
                        entries.add(ModIngots.get("chromium_ingot"));
                        entries.add(ModIngots.get("manganese_ingot"));
                        entries.add(ModIngots.get("iron_ingot"));
                        entries.add(ModIngots.get("cobalt_ingot"));
                        entries.add(ModIngots.get("nickel_ingot"));
                        entries.add(ModIngots.get("copper_ingot"));
                        entries.add(ModIngots.get("zinc_ingot"));
                        entries.add(ModIngots.get("gallium_ingot"));
                        entries.add(ModIngots.get("strontium_ingot"));
                        entries.add(ModIngots.get("yttrium_ingot"));
                        entries.add(ModIngots.get("zirconium_ingot"));
                        entries.add(ModIngots.get("niobium_ingot"));
                        entries.add(ModIngots.get("molybdenum_ingot"));
                        entries.add(ModIngots.get("silver_ingot"));
                        entries.add(ModIngots.get("cadmium_ingot"));
                        entries.add(ModIngots.get("indium_ingot"));
                        entries.add(ModIngots.get("tin_ingot"));
                        entries.add(ModIngots.get("barium_ingot"));
                        entries.add(ModIngots.get("tantalum_ingot"));
                        entries.add(ModIngots.get("tungsten_ingot"));
                        entries.add(ModIngots.get("rhenium_ingot"));
                        entries.add(ModIngots.get("osmium_ingot"));
                        entries.add(ModIngots.get("iridium_ingot"));
                        entries.add(ModIngots.get("platinum_ingot"));
                        entries.add(ModIngots.get("gold_ingot"));
                        entries.add(ModIngots.get("mercury_ingot"));
                        entries.add(ModIngots.get("thallium_ingot"));
                        entries.add(ModIngots.get("lead_ingot"));
                        entries.add(ModIngots.get("bismuth_ingot"));
                        entries.add(ModIngots.get("polonium_ingot"));
                        entries.add(ModIngots.get("selenium_ingot"));
                        entries.add(ModIngots.get("arsenic_ingot"));
                        entries.add(ModIngots.get("antimony_ingot"));
                        entries.add(ModIngots.get("tellurium_ingot"));
                        entries.add(ModIngots.get("ruthenium_ingot"));
                        entries.add(ModIngots.get("rhodium_ingot"));
                        entries.add(ModIngots.get("palladium_ingot"));
                        entries.add(ModIngots.get("thorium_ingot"));
                        entries.add(ModIngots.get("uranium_ingot"));

                        entries.add(ModIngots.get("mythril_ingot"));
                        entries.add(ModIngots.get("naquadah_ingot"));
                        entries.add(ModIngots.get("naquadriah_ingot"));
                        entries.add(ModIngots.get("energium_ingot"));
                        entries.add(ModIngots.get("eridium_ingot"));

                        entries.add(ModIngots.get("alclad_alloy_ingot"));
                        entries.add(ModIngots.get("aldrey_alloy_ingot"));
                        entries.add(ModIngots.get("alloys_8090_alloy_ingot"));
                        entries.add(ModIngots.get("almag_alloy_ingot"));
                        entries.add(ModIngots.get("almelec_alloy_ingot"));
                        entries.add(ModIngots.get("almgsi_alloy_ingot"));
                        entries.add(ModIngots.get("alnimax_alloy_ingot"));
                        entries.add(ModIngots.get("alsimec_alloy_ingot"));
                        entries.add(ModIngots.get("alsin_alloy_ingot"));
                        entries.add(ModIngots.get("aluminium_bronze_alloy_ingot"));
                        entries.add(ModIngots.get("alumel_alloy_ingot"));
                        entries.add(ModIngots.get("alumicrom_alloy_ingot"));
                        entries.add(ModIngots.get("aluminium_galimax_alloy_ingot"));
                        entries.add(ModIngots.get("alusil_alloy_ingot"));
                        entries.add(ModIngots.get("antanium_alloy_ingot"));
                        entries.add(ModIngots.get("ardol_alloy_ingot"));
                        entries.add(ModIngots.get("birmabright_alloy_ingot"));

                        entries.add(ModIngots.get("babbitt_metal_alloy_ingot"));
                        entries.add(ModIngots.get("barium_alloy_ingot"));
                        entries.add(ModIngots.get("barmetal_alloy_ingot"));
                        entries.add(ModIngots.get("bell_metal_alloy_ingot"));
                        entries.add(ModIngots.get("berylco_alloy_ingot"));
                        entries.add(ModIngots.get("beta_brass_alloy_ingot"));
                        entries.add(ModIngots.get("birmingham_gold_alloy_ingot"));
                        entries.add(ModIngots.get("bronze_alloy_ingot"));
                        entries.add(ModIngots.get("brass_alloy_ingot"));

                        entries.add(ModIngots.get("calcusil_alloy_ingot"));
                        entries.add(ModIngots.get("cast_iron_alloy_ingot"));
                        entries.add(ModIngots.get("ccilla_alloy_ingot"));
                        entries.add(ModIngots.get("cervenit_alloy_ingot"));
                        entries.add(ModIngots.get("chrominium_alloy_ingot"));
                        entries.add(ModIngots.get("c_manganese_steel_alloy_ingot"));
                        entries.add(ModIngots.get("constitution_alloy_ingot"));
                        entries.add(ModIngots.get("copernicium_alloy_ingot"));
                        entries.add(ModIngots.get("copper_aluminium_alloy_ingot"));
                        entries.add(ModIngots.get("copper_bismuth_alloy_ingot"));
                        entries.add(ModIngots.get("copper_nickel_alloy_ingot"));
                        entries.add(ModIngots.get("cunal_alloy_ingot"));
                        entries.add(ModIngots.get("cunife_alloy_ingot"));
                        entries.add(ModIngots.get("cusil_alloy_ingot"));

                        entries.add(ModIngots.get("stainless_steel_alloy_ingot"));
                        entries.add(ModIngots.get("tool_steel_alloy_ingot"));
                        entries.add(ModIngots.get("invar_alloy_ingot"));
                        entries.add(ModIngots.get("kovar_alloy_ingot"));
                        entries.add(ModIngots.get("silicon_steel_alloy_ingot"));
                        entries.add(ModIngots.get("ferrochrome_alloy_ingot"));
                        entries.add(ModIngots.get("ferrotitanium_alloy_ingot"));
                        entries.add(ModIngots.get("ferrovanadium_alloy_ingot"));
                        entries.add(ModIngots.get("ferrotungsten_alloy_ingot"));
                        entries.add(ModIngots.get("ferromolybdenum_alloy_ingot"));

                        entries.add(ModIngots.get("inconel_alloy_ingot"));
                        entries.add(ModIngots.get("nichrome_alloy_ingot"));
                        entries.add(ModIngots.get("permalloy_alloy_ingot"));
                        entries.add(ModIngots.get("nickel_silver_alloy_ingot"));
                        entries.add(ModIngots.get("constantan_alloy_ingot"));
                        entries.add(ModIngots.get("manganin_alloy_ingot"));
                        entries.add(ModIngots.get("monel_alloy_ingot"));

                        entries.add(ModIngots.get("ti_6al_4v_alloy_ingot"));
                        entries.add(ModIngots.get("ti_3al_2_5v_alloy_ingot"));
                        entries.add(ModIngots.get("ti_6al_7nb_alloy_ingot"));

                        entries.add(ModIngots.get("az31_magnesium_alloy_ingot"));
                        entries.add(ModIngots.get("elektron_alloy_ingot"));

                        entries.add(ModIngots.get("electrum_alloy_ingot"));
                        entries.add(ModIngots.get("tumbaga_alloy_ingot"));
                        entries.add(ModIngots.get("rose_gold_alloy_ingot"));
                        entries.add(ModIngots.get("white_gold_alloy_ingot"));
                        entries.add(ModIngots.get("sterling_silver_alloy_ingot"));
                        entries.add(ModIngots.get("shibuichi_alloy_ingot"));

                        entries.add(ModIngots.get("roses_metal_alloy_ingot"));
                        entries.add(ModIngots.get("woods_metal_alloy_ingot"));
                        entries.add(ModIngots.get("solder_alloy_ingot"));
                        entries.add(ModIngots.get("pewter_alloy_ingot"));
                        entries.add(ModIngots.get("fields_metal_alloy_ingot"));

                        entries.add(ModIngots.get("silicon_bronze_alloy_ingot"));
                        entries.add(ModIngots.get("manganese_bronze_alloy_ingot"));

                        entries.add(ModIngots.get("zamak_alloy_ingot"));
                        entries.add(ModIngots.get("stellite_alloy_ingot"));
                        entries.add(ModIngots.get("duralumin_alloy_ingot"));
                        entries.add(ModIngots.get("heavy_tungsten_alloy_ingot"));
                        entries.add(ModIngots.get("tungsten_copper_alloy_ingot"));
                        entries.add(ModIngots.get("tzm_molybdenum_alloy_ingot"));
                        entries.add(ModIngots.get("bismuth_tin_alloy_ingot"));
                        entries.add(ModIngots.get("tantalum_tungsten_alloy_ingot"));
                        entries.add(ModIngots.get("niobium_titanium_alloy_ingot"));
                        entries.add(ModIngots.get("depleted_uranium_alloy_ingot"));
                        entries.add(ModIngots.get("galinstan_alloy_ingot"));
                        entries.add(ModIngots.get("germanium_silicon_alloy_ingot"));
                        entries.add(ModIngots.get("sodium_potassium_alloy_ingot"));

                        entries.add(ModIngots.get("mythril_steel_alloy_ingot"));
                        entries.add(ModIngots.get("naquadah_steel_alloy_ingot"));
                        entries.add(ModIngots.get("naquadriah_titanium_alloy_ingot"));
                        entries.add(ModIngots.get("energium_copper_alloy_ingot"));
                        entries.add(ModIngots.get("eridium_gold_alloy_ingot"));
                        entries.add(ModIngots.get("energium_aluminium_alloy_ingot"));
                        entries.add(ModIngots.get("naquadah_mythril_alloy_ingot"));
                        entries.add(ModIngots.get("eridium_tantalum_alloy_ingot"));
                    }).build());

    public static final ItemGroup DUSTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "dusts"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.dusts"))
                    .icon(() -> new ItemStack(ModDusts.get("gold_dust"))).entries((displayContext, entries) -> {
                        entries.add(ModDusts.get("aluminum_dust"));
                        entries.add(ModDusts.get("antimony_dust"));
                        entries.add(ModDusts.get("arsenic_dust"));
                        entries.add(ModDusts.get("barium_dust"));
                        entries.add(ModDusts.get("beryllium_dust"));
                        entries.add(ModDusts.get("bismuth_dust"));
                        entries.add(ModDusts.get("cadmium_dust"));
                        entries.add(ModDusts.get("calcium_dust"));
                        entries.add(ModDusts.get("carbon_dust"));
                        entries.add(ModDusts.get("chromium_dust"));
                        entries.add(ModDusts.get("cobalt_dust"));
                        entries.add(ModDusts.get("copper_dust"));
                        entries.add(ModDusts.get("energium_dust"));
                        entries.add(ModDusts.get("eridium_dust"));
                        entries.add(ModDusts.get("faerie_dust"));
                        entries.add(ModDusts.get("gallium_dust"));
                        entries.add(ModDusts.get("germanium_dust"));
                        entries.add(ModDusts.get("gold_dust"));
                        entries.add(ModDusts.get("indium_dust"));
                        entries.add(ModDusts.get("iridium_dust"));
                        entries.add(ModDusts.get("iron_dust"));
                        entries.add(ModDusts.get("lead_dust"));
                        entries.add(ModDusts.get("lithium_dust"));
                        entries.add(ModDusts.get("magnesium_dust"));
                        entries.add(ModDusts.get("manganese_dust"));
                        entries.add(ModDusts.get("molybdenum_dust"));
                        entries.add(ModDusts.get("mythril_dust"));
                        entries.add(ModDusts.get("naquadah_dust"));
                        entries.add(ModDusts.get("naquadriah_dust"));
                        entries.add(ModDusts.get("nickel_dust"));
                        entries.add(ModDusts.get("niobium_dust"));
                        entries.add(ModDusts.get("osmium_dust"));
                        entries.add(ModDusts.get("palladium_dust"));
                        entries.add(ModDusts.get("platinum_dust"));
                        entries.add(ModDusts.get("polonium_dust"));
                        entries.add(ModDusts.get("rhenium_dust"));
                        entries.add(ModDusts.get("rhodium_dust"));
                        entries.add(ModDusts.get("ruthenium_dust"));
                        entries.add(ModDusts.get("scandium_dust"));
                        entries.add(ModDusts.get("selenium_dust"));
                        entries.add(ModDusts.get("silicon_dust"));
                        entries.add(ModDusts.get("silver_dust"));
                        entries.add(ModDusts.get("sodium_dust"));
                        entries.add(ModDusts.get("strontium_dust"));
                        entries.add(ModDusts.get("tantalum_dust"));
                        entries.add(ModDusts.get("tellurium_dust"));
                        entries.add(ModDusts.get("thallium_dust"));
                        entries.add(ModDusts.get("thorium_dust"));
                        entries.add(ModDusts.get("tin_dust"));
                        entries.add(ModDusts.get("titanium_dust"));
                        entries.add(ModDusts.get("tungsten_dust"));
                        entries.add(ModDusts.get("uranium_dust"));
                        entries.add(ModDusts.get("vanadium_dust"));
                        entries.add(ModDusts.get("yttrium_dust"));
                        entries.add(ModDusts.get("zinc_dust"));
                        entries.add(ModDusts.get("zirconium_dust"));

                        entries.add(ModDusts.get("alclad_dust"));
                        entries.add(ModDusts.get("aldrey_dust"));
                        entries.add(ModDusts.get("alloys_8090_dust"));
                        entries.add(ModDusts.get("almag_dust"));
                        entries.add(ModDusts.get("almelec_dust"));
                        entries.add(ModDusts.get("almgsi_dust"));
                        entries.add(ModDusts.get("alnimax_dust"));
                        entries.add(ModDusts.get("alsimec_dust"));
                        entries.add(ModDusts.get("alsin_dust"));
                        entries.add(ModDusts.get("aluminium_bronze_dust"));
                        entries.add(ModDusts.get("alumel_dust"));
                        entries.add(ModDusts.get("alumicrom_dust"));
                        entries.add(ModDusts.get("aluminium_galimax_dust"));
                        entries.add(ModDusts.get("alusil_dust"));
                        entries.add(ModDusts.get("antanium_dust"));
                        entries.add(ModDusts.get("ardol_dust"));
                        entries.add(ModDusts.get("birmabright_dust"));

                        entries.add(ModDusts.get("babbitt_metal_dust"));
                        entries.add(ModDusts.get("barium_alloy_dust"));
                        entries.add(ModDusts.get("barmetal_dust"));
                        entries.add(ModDusts.get("bell_metal_dust"));
                        entries.add(ModDusts.get("berylco_dust"));
                        entries.add(ModDusts.get("beta_brass_dust"));
                        entries.add(ModDusts.get("birmingham_gold_dust"));
                        entries.add(ModDusts.get("bronze_dust"));
                        entries.add(ModDusts.get("brass_dust"));

                        entries.add(ModDusts.get("calcusil_dust"));
                        entries.add(ModDusts.get("cast_iron_dust"));
                        entries.add(ModDusts.get("ccilla_dust"));
                        entries.add(ModDusts.get("cervenit_dust"));
                        entries.add(ModDusts.get("chrominium_dust"));
                        entries.add(ModDusts.get("c_manganese_steel_dust"));
                        entries.add(ModDusts.get("constitution_dust"));
                        entries.add(ModDusts.get("copernicium_alloy_dust"));
                        entries.add(ModDusts.get("copper_aluminium_dust"));
                        entries.add(ModDusts.get("copper_bismuth_dust"));
                        entries.add(ModDusts.get("copper_nickel_dust"));
                        entries.add(ModDusts.get("cunal_dust"));
                        entries.add(ModDusts.get("cunife_dust"));
                        entries.add(ModDusts.get("cusil_dust"));

                        entries.add(ModDusts.get("stainless_steel_dust"));
                        entries.add(ModDusts.get("tool_steel_dust"));
                        entries.add(ModDusts.get("invar_dust"));
                        entries.add(ModDusts.get("kovar_dust"));
                        entries.add(ModDusts.get("silicon_steel_dust"));
                        entries.add(ModDusts.get("ferrochrome_dust"));
                        entries.add(ModDusts.get("ferrotitanium_dust"));
                        entries.add(ModDusts.get("ferrovanadium_dust"));
                        entries.add(ModDusts.get("ferrotungsten_dust"));
                        entries.add(ModDusts.get("ferromolybdenum_dust"));

                        entries.add(ModDusts.get("inconel_dust"));
                        entries.add(ModDusts.get("nichrome_dust"));
                        entries.add(ModDusts.get("permalloy_dust"));
                        entries.add(ModDusts.get("nickel_silver_dust"));
                        entries.add(ModDusts.get("constantan_dust"));
                        entries.add(ModDusts.get("manganin_dust"));
                        entries.add(ModDusts.get("monel_dust"));

                        entries.add(ModDusts.get("ti_6al_4v_dust"));
                        entries.add(ModDusts.get("ti_3al_2_5v_dust"));
                        entries.add(ModDusts.get("ti_6al_7nb_dust"));

                        entries.add(ModDusts.get("az31_magnesium_dust"));
                        entries.add(ModDusts.get("elektron_dust"));

                        entries.add(ModDusts.get("electrum_dust"));
                        entries.add(ModDusts.get("tumbaga_dust"));
                        entries.add(ModDusts.get("rose_gold_dust"));
                        entries.add(ModDusts.get("white_gold_dust"));
                        entries.add(ModDusts.get("sterling_silver_dust"));
                        entries.add(ModDusts.get("shibuichi_dust"));

                        entries.add(ModDusts.get("roses_metal_dust"));
                        entries.add(ModDusts.get("woods_metal_dust"));
                        entries.add(ModDusts.get("solder_dust"));
                        entries.add(ModDusts.get("pewter_dust"));
                        entries.add(ModDusts.get("fields_metal_dust"));

                        entries.add(ModDusts.get("silicon_bronze_dust"));
                        entries.add(ModDusts.get("manganese_bronze_dust"));

                        entries.add(ModDusts.get("zamak_dust"));
                        entries.add(ModDusts.get("stellite_dust"));
                        entries.add(ModDusts.get("duralumin_dust"));
                        entries.add(ModDusts.get("heavy_tungsten_dust"));
                        entries.add(ModDusts.get("tungsten_copper_dust"));
                        entries.add(ModDusts.get("tzm_molybdenum_dust"));
                        entries.add(ModDusts.get("bismuth_tin_dust"));
                        entries.add(ModDusts.get("tantalum_tungsten_dust"));
                        entries.add(ModDusts.get("niobium_titanium_dust"));
                        entries.add(ModDusts.get("depleted_uranium_dust"));
                        entries.add(ModDusts.get("galinstan_dust"));
                        entries.add(ModDusts.get("germanium_silicon_dust"));
                        entries.add(ModDusts.get("sodium_potassium_dust"));

                        entries.add(ModDusts.get("mythril_steel_dust"));
                        entries.add(ModDusts.get("naquadah_steel_dust"));
                        entries.add(ModDusts.get("naquadriah_titanium_dust"));
                        entries.add(ModDusts.get("energium_copper_dust"));
                        entries.add(ModDusts.get("eridium_gold_dust"));
                        entries.add(ModDusts.get("energium_aluminium_dust"));
                        entries.add(ModDusts.get("naquadah_mythril_dust"));
                        entries.add(ModDusts.get("eridium_tantalum_dust"));
                    }).build());

    public static final ItemGroup RODS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "rods"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.rods"))
                    .icon(() -> new ItemStack(ModRods.get("iron_rod"))).entries((displayContext, entries) -> {
                        entries.add(ModRods.get("aluminum_rod"));
                        entries.add(ModRods.get("barium_rod"));
                        entries.add(ModRods.get("beryllium_rod"));
                        entries.add(ModRods.get("bismuth_rod"));
                        entries.add(ModRods.get("cadmium_rod"));
                        entries.add(ModRods.get("calcium_rod"));
                        entries.add(ModRods.get("carbon_rod"));
                        entries.add(ModRods.get("chromium_rod"));
                        entries.add(ModRods.get("cobalt_rod"));
                        entries.add(ModRods.get("copper_rod"));
                        entries.add(ModRods.get("energium_rod"));
                        entries.add(ModRods.get("eridium_rod"));
                        entries.add(ModRods.get("faerie_rod"));
                        entries.add(ModRods.get("gallium_rod"));
                        entries.add(ModRods.get("germanium_rod"));
                        entries.add(ModRods.get("gold_rod"));
                        entries.add(ModRods.get("indium_rod"));
                        entries.add(ModRods.get("iridium_rod"));
                        entries.add(ModRods.get("iron_rod"));
                        entries.add(ModRods.get("lead_rod"));
                        entries.add(ModRods.get("lithium_rod"));
                        entries.add(ModRods.get("magnesium_rod"));
                        entries.add(ModRods.get("manganese_rod"));
                        entries.add(ModRods.get("molybdenum_rod"));
                        entries.add(ModRods.get("mythril_rod"));
                        entries.add(ModRods.get("naquadah_rod"));
                        entries.add(ModRods.get("naquadriah_rod"));
                        entries.add(ModRods.get("nickel_rod"));
                        entries.add(ModRods.get("niobium_rod"));
                        entries.add(ModRods.get("osmium_rod"));
                        entries.add(ModRods.get("palladium_rod"));
                        entries.add(ModRods.get("platinum_rod"));
                        entries.add(ModRods.get("polonium_rod"));
                        entries.add(ModRods.get("rhenium_rod"));
                        entries.add(ModRods.get("rhodium_rod"));
                        entries.add(ModRods.get("ruthenium_rod"));
                        entries.add(ModRods.get("scandium_rod"));
                        entries.add(ModRods.get("silicon_rod"));
                        entries.add(ModRods.get("silver_rod"));
                        entries.add(ModRods.get("sodium_rod"));
                        entries.add(ModRods.get("strontium_rod"));
                        entries.add(ModRods.get("tantalum_rod"));
                        entries.add(ModRods.get("thallium_rod"));
                        entries.add(ModRods.get("thorium_rod"));
                        entries.add(ModRods.get("tin_rod"));
                        entries.add(ModRods.get("titanium_rod"));
                        entries.add(ModRods.get("tungsten_rod"));
                        entries.add(ModRods.get("uranium_rod"));
                        entries.add(ModRods.get("vanadium_rod"));
                        entries.add(ModRods.get("yttrium_rod"));
                        entries.add(ModRods.get("zinc_rod"));
                        entries.add(ModRods.get("zirconium_rod"));

                        entries.add(ModRods.get("alclad_rod"));
                        entries.add(ModRods.get("aldrey_rod"));
                        entries.add(ModRods.get("alloys_8090_rod"));
                        entries.add(ModRods.get("almag_rod"));
                        entries.add(ModRods.get("almelec_rod"));
                        entries.add(ModRods.get("almgsi_rod"));
                        entries.add(ModRods.get("alnimax_rod"));
                        entries.add(ModRods.get("alsimec_rod"));
                        entries.add(ModRods.get("alsin_rod"));
                        entries.add(ModRods.get("aluminium_bronze_rod"));
                        entries.add(ModRods.get("alumel_rod"));
                        entries.add(ModRods.get("alumicrom_rod"));
                        entries.add(ModRods.get("aluminium_galimax_rod"));
                        entries.add(ModRods.get("alusil_rod"));
                        entries.add(ModRods.get("antanium_rod"));
                        entries.add(ModRods.get("ardol_rod"));
                        entries.add(ModRods.get("birmabright_rod"));

                        entries.add(ModRods.get("babbitt_metal_rod"));
                        entries.add(ModRods.get("barium_alloy_rod"));
                        entries.add(ModRods.get("barmetal_rod"));
                        entries.add(ModRods.get("bell_metal_rod"));
                        entries.add(ModRods.get("berylco_rod"));
                        entries.add(ModRods.get("beta_brass_rod"));
                        entries.add(ModRods.get("birmingham_gold_rod"));
                        entries.add(ModRods.get("brass_rod"));

                        entries.add(ModRods.get("calcusil_rod"));
                        entries.add(ModRods.get("cast_iron_rod"));
                        entries.add(ModRods.get("ccilla_rod"));
                        entries.add(ModRods.get("cervenit_rod"));
                        entries.add(ModRods.get("chrominium_rod"));
                        entries.add(ModRods.get("c_manganese_steel_rod"));
                        entries.add(ModRods.get("constitution_rod"));
                        entries.add(ModRods.get("copernicium_alloy_rod"));
                        entries.add(ModRods.get("copper_aluminium_rod"));
                        entries.add(ModRods.get("copper_bismuth_rod"));
                        entries.add(ModRods.get("copper_nickel_rod"));
                        entries.add(ModRods.get("cunal_rod"));
                        entries.add(ModRods.get("cunife_rod"));
                        entries.add(ModRods.get("cusil_rod"));

                        entries.add(ModRods.get("stainless_steel_rod"));
                        entries.add(ModRods.get("tool_steel_rod"));
                        entries.add(ModRods.get("invar_rod"));
                        entries.add(ModRods.get("kovar_rod"));
                        entries.add(ModRods.get("silicon_steel_rod"));
                        entries.add(ModRods.get("ferrochrome_rod"));
                        entries.add(ModRods.get("ferrotitanium_rod"));
                        entries.add(ModRods.get("ferrovanadium_rod"));
                        entries.add(ModRods.get("ferrotungsten_rod"));
                        entries.add(ModRods.get("ferromolybdenum_rod"));

                        entries.add(ModRods.get("inconel_rod"));
                        entries.add(ModRods.get("nichrome_rod"));
                        entries.add(ModRods.get("permalloy_rod"));
                        entries.add(ModRods.get("nickel_silver_rod"));
                        entries.add(ModRods.get("constantan_rod"));
                        entries.add(ModRods.get("manganin_rod"));
                        entries.add(ModRods.get("monel_rod"));

                        entries.add(ModRods.get("ti_6al_4v_rod"));
                        entries.add(ModRods.get("ti_3al_2_5v_rod"));
                        entries.add(ModRods.get("ti_6al_7nb_rod"));

                        entries.add(ModRods.get("az31_magnesium_rod"));
                        entries.add(ModRods.get("elektron_rod"));

                        entries.add(ModRods.get("electrum_rod"));
                        entries.add(ModRods.get("tumbaga_rod"));
                        entries.add(ModRods.get("rose_gold_rod"));
                        entries.add(ModRods.get("white_gold_rod"));
                        entries.add(ModRods.get("sterling_silver_rod"));
                        entries.add(ModRods.get("shibuichi_rod"));

                        entries.add(ModRods.get("roses_metal_rod"));
                        entries.add(ModRods.get("woods_metal_rod"));
                        entries.add(ModRods.get("solder_rod"));
                        entries.add(ModRods.get("pewter_rod"));
                        entries.add(ModRods.get("fields_metal_rod"));

                        entries.add(ModRods.get("silicon_bronze_rod"));
                        entries.add(ModRods.get("manganese_bronze_rod"));

                        entries.add(ModRods.get("zamak_rod"));
                        entries.add(ModRods.get("stellite_rod"));
                        entries.add(ModRods.get("duralumin_rod"));
                        entries.add(ModRods.get("heavy_tungsten_rod"));
                        entries.add(ModRods.get("tungsten_copper_rod"));
                        entries.add(ModRods.get("tzm_molybdenum_rod"));
                        entries.add(ModRods.get("bismuth_tin_rod"));
                        entries.add(ModRods.get("tantalum_tungsten_rod"));
                        entries.add(ModRods.get("niobium_titanium_rod"));
                        entries.add(ModRods.get("depleted_uranium_rod"));
                        entries.add(ModRods.get("galinstan_rod"));
                        entries.add(ModRods.get("germanium_silicon_rod"));
                        entries.add(ModRods.get("sodium_potassium_rod"));

                        entries.add(ModRods.get("mythril_steel_rod"));
                        entries.add(ModRods.get("naquadah_steel_rod"));
                        entries.add(ModRods.get("naquadriah_titanium_rod"));
                        entries.add(ModRods.get("energium_copper_rod"));
                        entries.add(ModRods.get("eridium_gold_rod"));
                        entries.add(ModRods.get("energium_aluminium_rod"));
                        entries.add(ModRods.get("naquadah_mythril_rod"));
                        entries.add(ModRods.get("eridium_tantalum_rod"));

                        entries.add(ModChargedRods.get("charged_aluminum_rod"));
                        entries.add(ModChargedRods.get("charged_barium_rod"));
                        entries.add(ModChargedRods.get("charged_beryllium_rod"));
                        entries.add(ModChargedRods.get("charged_bismuth_rod"));
                        entries.add(ModChargedRods.get("charged_cadmium_rod"));
                        entries.add(ModChargedRods.get("charged_calcium_rod"));
                        entries.add(ModChargedRods.get("charged_chromium_rod"));
                        entries.add(ModChargedRods.get("charged_cobalt_rod"));
                        entries.add(ModChargedRods.get("charged_copper_rod"));
                        entries.add(ModChargedRods.get("charged_energium_rod"));
                        entries.add(ModChargedRods.get("charged_eridium_rod"));
                        entries.add(ModChargedRods.get("charged_faerie_rod"));
                        entries.add(ModChargedRods.get("charged_gallium_rod"));
                        entries.add(ModChargedRods.get("charged_gold_rod"));
                        entries.add(ModChargedRods.get("charged_indium_rod"));
                        entries.add(ModChargedRods.get("charged_iridium_rod"));
                        entries.add(ModChargedRods.get("charged_iron_rod"));
                        entries.add(ModChargedRods.get("charged_lead_rod"));
                        entries.add(ModChargedRods.get("charged_lithium_rod"));
                        entries.add(ModChargedRods.get("charged_magnesium_rod"));
                        entries.add(ModChargedRods.get("charged_manganese_rod"));
                        entries.add(ModChargedRods.get("charged_molybdenum_rod"));
                        entries.add(ModChargedRods.get("charged_mythril_rod"));
                        entries.add(ModChargedRods.get("charged_naquadah_rod"));
                        entries.add(ModChargedRods.get("charged_naquadriah_rod"));
                        entries.add(ModChargedRods.get("charged_nickel_rod"));
                        entries.add(ModChargedRods.get("charged_niobium_rod"));
                        entries.add(ModChargedRods.get("charged_osmium_rod"));
                        entries.add(ModChargedRods.get("charged_palladium_rod"));
                        entries.add(ModChargedRods.get("charged_platinum_rod"));
                        entries.add(ModChargedRods.get("charged_polonium_rod"));
                        entries.add(ModChargedRods.get("charged_rhenium_rod"));
                        entries.add(ModChargedRods.get("charged_rhodium_rod"));
                        entries.add(ModChargedRods.get("charged_ruthenium_rod"));
                        entries.add(ModChargedRods.get("charged_scandium_rod"));
                        entries.add(ModChargedRods.get("charged_silver_rod"));
                        entries.add(ModChargedRods.get("charged_sodium_rod"));
                        entries.add(ModChargedRods.get("charged_strontium_rod"));
                        entries.add(ModChargedRods.get("charged_tantalum_rod"));
                        entries.add(ModChargedRods.get("charged_thallium_rod"));
                        entries.add(ModChargedRods.get("charged_thorium_rod"));
                        entries.add(ModChargedRods.get("charged_tin_rod"));
                        entries.add(ModChargedRods.get("charged_titanium_rod"));
                        entries.add(ModChargedRods.get("charged_tungsten_rod"));
                        entries.add(ModChargedRods.get("charged_uranium_rod"));
                        entries.add(ModChargedRods.get("charged_vanadium_rod"));
                        entries.add(ModChargedRods.get("charged_yttrium_rod"));
                        entries.add(ModChargedRods.get("charged_zinc_rod"));
                        entries.add(ModChargedRods.get("charged_zirconium_rod"));
                    }).build());

    public static final ItemGroup NUGGETS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "nuggets"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.nuggets"))
                    .icon(() -> new ItemStack(ModNuggets.get("mythril_nugget"))).entries((displayContext, entries) -> {
                        ModNuggets.getAll().forEach(entries::add);
                    }).build());

//    public static final ItemGroup BOTTLES = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(PulderEssence.MOD_ID, "bottles"),
//            FabricItemGroup.builder()
//                    .displayName(Text.translatable("group.bottles"))
//                    .icon(() -> new ItemStack(ModBottleItems.get("bleach_bottle"))).entries((displayContext, entries) -> {
//                        ModBottleItems.getAll().forEach(entries::add);
//                        entries.add(ChemicalReactionItems.get("sodium_hypochlorite_bottle_reaction"));
//                        entries.add(ChemicalReactionItems.get("trichloromethane_bottle_reaction"));
//                    }).build());
//
//    public static final ItemGroup BUCKETS = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(PulderEssence.MOD_ID, "buckets"),
//            FabricItemGroup.builder()
//                    .displayName(Text.translatable("group.buckets"))
//                    .icon(() -> new ItemStack(ModBucketItems.get("ammonia_bucket"))).entries((displayContext, entries) -> {
//                        ModBucketItems.getAll().forEach(entries::add);
//                        entries.add(ChemicalReactionItems.get("dihydrogen_monoxide_bucket_reaction"));
//                        entries.add(ChemicalReactionItems.get("hydrogen_nitride_bucket_reaction"));
//                        entries.add(ChemicalReactionItems.get("dihydrogen_sulfate_bucket_reaction"));
//                        entries.add(ChemicalReactionItems.get("hydrogen_chloride_bucket_reaction"));
//                    }).build());

    public static final ItemGroup ORES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "ores"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.ores"))
                    .icon(() -> new ItemStack(ModOres.get("hematite"))).entries((displayContext, entries) -> {
                        entries.add(ModOres.get("hematite"));
                        entries.add(ModOres.get("magnetite"));
                        entries.add(ModOres.get("chalcopyrite"));
                        entries.add(ModOres.get("sphalerite"));
                        entries.add(ModOres.get("cassiterite"));
                        entries.add(ModOres.get("anthracite"));
                        entries.add(ModOres.get("pentlandite"));
                        entries.add(ModOres.get("galena"));
                        entries.add(ModOres.get("cobaltite"));
                        entries.add(ModOres.get("stibnite"));

                        entries.add(ModOres.get("native_gold"));
                        entries.add(ModOres.get("argentite"));
                        entries.add(ModOres.get("bismuthinite"));
                        entries.add(ModOres.get("cinnabar"));
                        entries.add(ModOres.get("nitratite"));

                        entries.add(ModOres.get("bauxite"));
                        entries.add(ModOres.get("magnesite"));
                        entries.add(ModOres.get("dolomite"));
                        entries.add(ModOres.get("halite"));
                        entries.add(ModOres.get("sylvite"));
                        entries.add(ModOres.get("spodumene"));
                        entries.add(ModOres.get("beryl"));
                        entries.add(ModOres.get("fluorite"));
                        entries.add(ModOres.get("celestine"));
                        entries.add(ModOres.get("barite"));
                        entries.add(ModOres.get("pollucite"));
                        entries.add(ModOres.get("iodyrite"));
                        entries.add(ModOres.get("bromyrite"));

                        entries.add(ModOres.get("ilmenite"));
                        entries.add(ModOres.get("quartz"));
                        entries.add(ModOres.get("kernite"));

                        entries.add(ModOres.get("chromite"));
                        entries.add(ModOres.get("pyrolusite"));
                        entries.add(ModOres.get("columbite"));
                        entries.add(ModOres.get("tantalite"));
                        entries.add(ModOres.get("zircon"));
                        entries.add(ModOres.get("vanadinite"));

                        entries.add(ModOres.get("wolframite"));
                        entries.add(ModOres.get("molybdenite"));
                        entries.add(ModOres.get("rheniite"));
                        entries.add(ModOres.get("apatite"));
                        entries.add(ModOres.get("xenotime"));
                        entries.add(ModOres.get("bastnaesite"));
                        entries.add(ModOres.get("monazite"));
                        entries.add(ModOres.get("thorite"));
                        entries.add(ModOres.get("uraninite"));
                        entries.add(ModOres.get("lepidolite"));

                        entries.add(ModOres.get("sperrylite"));
                        entries.add(ModOres.get("iridosmine"));
                        entries.add(ModOres.get("laurite"));
                        entries.add(ModOres.get("hollingsworthite"));
                        entries.add(ModOres.get("stibiopalladinite"));
                        entries.add(ModOres.get("calaverite"));
                        entries.add(ModOres.get("clausthalite"));
                        entries.add(ModOres.get("thortveitite"));

                        entries.add(ModOres.get("mythrilite"));
                        entries.add(ModOres.get("naquadite"));

                        entries.add(ModOres.get("naquadriate"));
                        entries.add(ModOres.get("energite"));

                        entries.add(ModOres.get("eridium_vein"));

                        entries.add(ModBlocks.get("hematite_ore"));
                        entries.add(ModBlocks.get("deepslate_hematite_ore"));
                        entries.add(ModBlocks.get("magnetite_ore"));
                        entries.add(ModBlocks.get("deepslate_magnetite_ore"));
                        entries.add(ModBlocks.get("chalcopyrite_ore"));
                        entries.add(ModBlocks.get("deepslate_chalcopyrite_ore"));
                        entries.add(ModBlocks.get("sphalerite_ore"));
                        entries.add(ModBlocks.get("deepslate_sphalerite_ore"));
                        entries.add(ModBlocks.get("cassiterite_ore"));
                        entries.add(ModBlocks.get("deepslate_cassiterite_ore"));
                        entries.add(ModBlocks.get("anthracite_ore"));
                        entries.add(ModBlocks.get("deepslate_anthracite_ore"));
                        entries.add(ModBlocks.get("pentlandite_ore"));
                        entries.add(ModBlocks.get("deepslate_pentlandite_ore"));
                        entries.add(ModBlocks.get("galena_ore"));
                        entries.add(ModBlocks.get("deepslate_galena_ore"));
                        entries.add(ModBlocks.get("cobaltite_ore"));
                        entries.add(ModBlocks.get("deepslate_cobaltite_ore"));
                        entries.add(ModBlocks.get("stibnite_ore"));
                        entries.add(ModBlocks.get("deepslate_stibnite_ore"));

                        entries.add(ModBlocks.get("native_gold_ore"));
                        entries.add(ModBlocks.get("deepslate_native_gold_ore"));
                        entries.add(ModBlocks.get("argentite_ore"));
                        entries.add(ModBlocks.get("deepslate_argentite_ore"));
                        entries.add(ModBlocks.get("bismuthinite_ore"));
                        entries.add(ModBlocks.get("deepslate_bismuthinite_ore"));
                        entries.add(ModBlocks.get("cinnabar_ore"));
                        entries.add(ModBlocks.get("deepslate_cinnabar_ore"));
                        entries.add(ModBlocks.get("nitratite_ore"));
                        entries.add(ModBlocks.get("deepslate_nitratite_ore"));

                        entries.add(ModBlocks.get("bauxite_ore"));
                        entries.add(ModBlocks.get("deepslate_bauxite_ore"));
                        entries.add(ModBlocks.get("magnesite_ore"));
                        entries.add(ModBlocks.get("deepslate_magnesite_ore"));
                        entries.add(ModBlocks.get("dolomite_ore"));
                        entries.add(ModBlocks.get("deepslate_dolomite_ore"));
                        entries.add(ModBlocks.get("halite_ore"));
                        entries.add(ModBlocks.get("deepslate_halite_ore"));
                        entries.add(ModBlocks.get("sylvite_ore"));
                        entries.add(ModBlocks.get("deepslate_sylvite_ore"));
                        entries.add(ModBlocks.get("spodumene_ore"));
                        entries.add(ModBlocks.get("deepslate_spodumene_ore"));
                        entries.add(ModBlocks.get("beryl_ore"));
                        entries.add(ModBlocks.get("deepslate_beryl_ore"));
                        entries.add(ModBlocks.get("fluorite_ore"));
                        entries.add(ModBlocks.get("deepslate_fluorite_ore"));
                        entries.add(ModBlocks.get("celestine_ore"));
                        entries.add(ModBlocks.get("deepslate_celestine_ore"));
                        entries.add(ModBlocks.get("barite_ore"));
                        entries.add(ModBlocks.get("deepslate_barite_ore"));
                        entries.add(ModBlocks.get("pollucite_ore"));
                        entries.add(ModBlocks.get("deepslate_pollucite_ore"));
                        entries.add(ModBlocks.get("iodyrite_ore"));
                        entries.add(ModBlocks.get("deepslate_iodyrite_ore"));
                        entries.add(ModBlocks.get("bromyrite_ore"));
                        entries.add(ModBlocks.get("deepslate_bromyrite_ore"));

                        entries.add(ModBlocks.get("ilmenite_ore"));
                        entries.add(ModBlocks.get("deepslate_ilmenite_ore"));
                        entries.add(ModBlocks.get("quartz_ore"));
                        entries.add(ModBlocks.get("deepslate_quartz_ore"));
                        entries.add(ModBlocks.get("kernite_ore"));
                        entries.add(ModBlocks.get("deepslate_kernite_ore"));

                        entries.add(ModBlocks.get("chromite_ore"));
                        entries.add(ModBlocks.get("deepslate_chromite_ore"));
                        entries.add(ModBlocks.get("pyrolusite_ore"));
                        entries.add(ModBlocks.get("deepslate_pyrolusite_ore"));
                        entries.add(ModBlocks.get("columbite_ore"));
                        entries.add(ModBlocks.get("deepslate_columbite_ore"));
                        entries.add(ModBlocks.get("tantalite_ore"));
                        entries.add(ModBlocks.get("deepslate_tantalite_ore"));
                        entries.add(ModBlocks.get("zircon_ore"));
                        entries.add(ModBlocks.get("deepslate_zircon_ore"));
                        entries.add(ModBlocks.get("vanadinite_ore"));
                        entries.add(ModBlocks.get("deepslate_vanadinite_ore"));

                        entries.add(ModBlocks.get("wolframite_ore"));
                        entries.add(ModBlocks.get("deepslate_wolframite_ore"));
                        entries.add(ModBlocks.get("molybdenite_ore"));
                        entries.add(ModBlocks.get("deepslate_molybdenite_ore"));
                        entries.add(ModBlocks.get("rheniite_ore"));
                        entries.add(ModBlocks.get("deepslate_rheniite_ore"));
                        entries.add(ModBlocks.get("apatite_ore"));
                        entries.add(ModBlocks.get("deepslate_apatite_ore"));
                        entries.add(ModBlocks.get("xenotime_ore"));
                        entries.add(ModBlocks.get("deepslate_xenotime_ore"));
                        entries.add(ModBlocks.get("bastnaesite_ore"));
                        entries.add(ModBlocks.get("deepslate_bastnaesite_ore"));
                        entries.add(ModBlocks.get("monazite_ore"));
                        entries.add(ModBlocks.get("deepslate_monazite_ore"));
                        entries.add(ModBlocks.get("thorite_ore"));
                        entries.add(ModBlocks.get("deepslate_thorite_ore"));
                        entries.add(ModBlocks.get("uraninite_ore"));
                        entries.add(ModBlocks.get("deepslate_uraninite_ore"));
                        entries.add(ModBlocks.get("lepidolite_ore"));
                        entries.add(ModBlocks.get("deepslate_lepidolite_ore"));

                        entries.add(ModBlocks.get("sperrylite_ore"));
                        entries.add(ModBlocks.get("deepslate_sperrylite_ore"));
                        entries.add(ModBlocks.get("iridosmine_ore"));
                        entries.add(ModBlocks.get("deepslate_iridosmine_ore"));
                        entries.add(ModBlocks.get("laurite_ore"));
                        entries.add(ModBlocks.get("deepslate_laurite_ore"));
                        entries.add(ModBlocks.get("hollingsworthite_ore"));
                        entries.add(ModBlocks.get("deepslate_hollingsworthite_ore"));
                        entries.add(ModBlocks.get("stibiopalladinite_ore"));
                        entries.add(ModBlocks.get("deepslate_stibiopalladinite_ore"));
                        entries.add(ModBlocks.get("calaverite_ore"));
                        entries.add(ModBlocks.get("deepslate_calaverite_ore"));
                        entries.add(ModBlocks.get("clausthalite_ore"));
                        entries.add(ModBlocks.get("deepslate_clausthalite_ore"));
                        entries.add(ModBlocks.get("thortveitite_ore"));
                        entries.add(ModBlocks.get("deepslate_thortveitite_ore"));

                        entries.add(ModBlocks.get("mythrilite_ore"));
                        entries.add(ModBlocks.get("deepslate_mythrilite_ore"));
                        entries.add(ModBlocks.get("naquadite_ore"));
                        entries.add(ModBlocks.get("deepslate_naquadite_ore"));

                        entries.add(ModBlocks.get("naquadriate_ore"));
                        entries.add(ModBlocks.get("deepslate_naquadriate_ore"));
                        entries.add(ModBlocks.get("energite_ore"));
                        entries.add(ModBlocks.get("deepslate_energite_ore"));

                        entries.add(ModBlocks.get("eridium_vein_ore"));
                        entries.add(ModBlocks.get("deepslate_eridium_vein_ore"));
                    }).build());

    public static final ItemGroup PULVERENT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.items"))
                    .icon(() -> new ItemStack(ModCraftingItems.get("energium_shard"))).entries((displayContext, entries) -> {
                        ModCraftingItems.getAll().forEach(entries::add);
                        ModTools.getAll().forEach(entries::add);
                    }).build());

    public static final ItemGroup PULVERENT_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "blocks"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.get("pulverent_nylium"))).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.get("energium_block"));
                        entries.add(ModBlocks.get("indium_block"));
                        entries.add(ModBlocks.get("lead_block"));
                        entries.add(ModBlocks.get("mythril_block"));
                        entries.add(ModBlocks.get("silver_block"));
                        entries.add(ModBlocks.get("tungsten_block"));
                        entries.add(ModBlocks.get("yttrium_block"));

                        entries.add(ModBlocks.get("pulverent_nylium"));
                        entries.add(ModBlocks.get("pulverent_log"));
                        entries.add(ModBlocks.get("stripped_pulverent_log"));
                        entries.add(ModBlocks.get("pulverent_wood"));
                        entries.add(ModBlocks.get("stripped_pulverent_wood"));
                        entries.add(ModBlocks.get("pulverent_planks"));
                        entries.add(ModBlocks.get("pulverent_stairs"));
                        entries.add(ModBlocks.get("pulverent_slab"));
                        entries.add(ModBlocks.get("pulverent_fence"));
                        entries.add(ModBlocks.get("pulverent_fence_gate"));
                        entries.add(ModBlocks.get("pulverent_button"));
                        entries.add(ModBlocks.get("pulverent_pressure_plate"));
                        entries.add(ModBlocks.get("pulverent_door"));
                        entries.add(ModBlocks.get("pulverent_trapdoor"));
                    }).build());

    public static final ItemGroup WIRES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "wires"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.wires"))
                    .icon(() -> new ItemStack(ModWires.getWireItem("copper", 1)))
                    .entries((displayContext, entries) -> {
                        ModWires.getAllWireItems().forEach(entries::add);
                    }).build());

    public static void registerItemGroups() {}
}
