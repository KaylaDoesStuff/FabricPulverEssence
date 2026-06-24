package kayla.pulderessence.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.block.custom.CableBlock;
import kayla.pulderessence.item.*;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModModelProvider extends FabricModelProvider {
    private final FabricDataOutput output;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    public ModModelProvider(FabricDataOutput output) {
        super(output);
        this.output = output;
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("hematite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_hematite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("magnetite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_magnetite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("chalcopyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_chalcopyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("sphalerite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_sphalerite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("cassiterite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_cassiterite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("anthracite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_anthracite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("pentlandite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_pentlandite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("galena_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_galena_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("cobaltite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_cobaltite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("stibnite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_stibnite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("native_gold_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_native_gold_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("argentite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_argentite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("bismuthinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_bismuthinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("cinnabar_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_cinnabar_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("nitratite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_nitratite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("bauxite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_bauxite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("magnesite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_magnesite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("dolomite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_dolomite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("halite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_halite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("sylvite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_sylvite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("spodumene_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_spodumene_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("beryl_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_beryl_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("fluorite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_fluorite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("celestine_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_celestine_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("barite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_barite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("pollucite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_pollucite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("iodyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_iodyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("bromyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_bromyrite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("ilmenite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_ilmenite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("quartz_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_quartz_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("kernite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_kernite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("chromite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_chromite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("pyrolusite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_pyrolusite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("columbite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_columbite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("tantalite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_tantalite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("zircon_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_zircon_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("vanadinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_vanadinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("wolframite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_wolframite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("molybdenite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_molybdenite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("rheniite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_rheniite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("apatite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_apatite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("xenotime_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_xenotime_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("bastnaesite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_bastnaesite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("monazite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_monazite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("thorite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_thorite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("uraninite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_uraninite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("lepidolite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_lepidolite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("sperrylite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_sperrylite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("iridosmine_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_iridosmine_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("laurite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_laurite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("hollingsworthite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_hollingsworthite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("stibiopalladinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_stibiopalladinite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("calaverite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_calaverite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("clausthalite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_clausthalite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("thortveitite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_thortveitite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("mythrilite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_mythrilite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("naquadite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_naquadite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("naquadriate_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_naquadriate_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("energite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_energite_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("eridium_vein_ore"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("deepslate_eridium_vein_ore"));

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("mythril_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("yttrium_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("silver_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("lead_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("indium_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("tungsten_block"));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.get("energium_block"));

        blockStateModelGenerator.registerNetherrackBottomCustomTop(ModBlocks.get("pulverent_nylium"));
        blockStateModelGenerator.registerLog(ModBlocks.get("pulverent_log")).log(ModBlocks.get("pulverent_log")).wood(ModBlocks.get("pulverent_wood"));
        blockStateModelGenerator.registerLog(ModBlocks.get("stripped_pulverent_log")).log(ModBlocks.get("stripped_pulverent_log")).wood(ModBlocks.get("stripped_pulverent_wood"));
        BlockStateModelGenerator.BlockTexturePool planksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.get("pulverent_planks"));

        planksPool.stairs(ModBlocks.get("pulverent_stairs"));
        planksPool.slab(ModBlocks.get("pulverent_slab"));
        planksPool.button(ModBlocks.get("pulverent_button"));
        planksPool.pressurePlate(ModBlocks.get("pulverent_pressure_plate"));
        planksPool.fence(ModBlocks.get("pulverent_fence"));
        planksPool.fenceGate(ModBlocks.get("pulverent_fence_gate"));

        blockStateModelGenerator.registerDoor(ModBlocks.get("pulverent_door"));
        blockStateModelGenerator.registerTrapdoor(ModBlocks.get("pulverent_trapdoor"));

        generateCableModels(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModIngots.get("iron_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("copper_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("gold_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("aluminum_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("lead_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tin_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("titanium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("zinc_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("silver_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("nickel_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("cobalt_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("chromium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("manganese_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("molybdenum_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tungsten_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("platinum_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("bismuth_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("magnesium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("calcium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("barium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("cadmium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("indium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("gallium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("thallium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("antimony_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tellurium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("selenium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("arsenic_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("strontium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("scandium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("yttrium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("zirconium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("niobium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tantalum_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("rhenium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("thorium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("uranium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ruthenium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("rhodium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("palladium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("osmium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("iridium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("naquadah_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("naquadriah_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("energium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("eridium_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("mythril_ingot"), Models.GENERATED);

        // "A" ALLOYS MODEL GENERATOR (17 total)
        itemModelGenerator.register(ModIngots.get("alclad_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("aldrey_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alloys_8090_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("almag_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("almelec_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("almgsi_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alnimax_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alsimec_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alsin_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("aluminium_bronze_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alumel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alumicrom_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("aluminium_galimax_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("alusil_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("antanium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ardol_alloy_ingot"), Models.GENERATED);

        // "B" ALLOYS MODEL GENERATOR (10 total)
        itemModelGenerator.register(ModIngots.get("babbitt_metal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("barium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("barmetal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("bell_metal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("berylco_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("beta_brass_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("birmabright_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("birmingham_gold_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("bronze_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("brass_alloy_ingot"), Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("mythril_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("mythril_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_mythril_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("mythril_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModRods.get("gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModDusts.get("gold_dust"),Models.GENERATED);

        itemModelGenerator.register(ModRods.get("iron_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_iron_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModDusts.get("iron_dust"),Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("indium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("indium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_indium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("indium_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("silver_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("silver_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_silver_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("silver_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("lead_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("lead_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_lead_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("lead_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("tungsten_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("tungsten_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_tungsten_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("tungsten_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModDusts.get("yttrium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("yttrium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_yttrium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModNuggets.get("yttrium_nugget"), Models.GENERATED);

        itemModelGenerator.register(ModCraftingItems.get("energium_shard"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("energium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("energium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_energium_rod"), Models.HANDHELD_ROD);

        // Mineral ore items
        itemModelGenerator.register(ModOres.get("hematite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("magnetite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("chalcopyrite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("sphalerite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("cassiterite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("anthracite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("pentlandite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("galena"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("cobaltite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("stibnite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("native_gold"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("argentite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("bismuthinite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("cinnabar"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("nitratite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("bauxite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("magnesite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("dolomite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("halite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("sylvite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("spodumene"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("beryl"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("fluorite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("celestine"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("barite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("pollucite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("iodyrite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("bromyrite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("ilmenite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("quartz"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("kernite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("chromite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("pyrolusite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("columbite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("tantalite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("zircon"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("vanadinite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("wolframite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("molybdenite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("rheniite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("apatite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("xenotime"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("bastnaesite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("monazite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("thorite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("uraninite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("lepidolite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("sperrylite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("iridosmine"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("laurite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("hollingsworthite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("stibiopalladinite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("calaverite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("clausthalite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("thortveitite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("mythrilite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("naquadite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("naquadriate"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("energite"), Models.GENERATED);
        itemModelGenerator.register(ModOres.get("eridium_vein"), Models.GENERATED);

        itemModelGenerator.register(ModTools.get("mythril_sword"), Models.HANDHELD);
        itemModelGenerator.register(ModTools.get("mythril_axe"), Models.HANDHELD);
        itemModelGenerator.register(ModTools.get("mythril_pickaxe"), Models.HANDHELD);
        itemModelGenerator.register(ModTools.get("mythril_shovel"), Models.HANDHELD);
        itemModelGenerator.register(ModTools.get("mythril_hoe"), Models.HANDHELD);

        itemModelGenerator.register(ModDusts.get("faerie_dust"), Models.GENERATED);
        itemModelGenerator.register(ModRods.get("faerie_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_faerie_rod"), Models.HANDHELD_ROD);

        itemModelGenerator.register(ModCraftingItems.get("silicon_boule"), Models.GENERATED);


        itemModelGenerator.register(ModBottleItems.get("bleach_bottle"), Models.GENERATED);
        itemModelGenerator.register(ModBottleItems.get("chloroform_bottle"), Models.GENERATED);

        itemModelGenerator.register(ModBucketItems.get("ammonia_bucket"), Models.GENERATED);
        itemModelGenerator.register(ModBucketItems.get("sulfuric_acid_bucket"), Models.GENERATED);
        itemModelGenerator.register(ModBucketItems.get("hydrochloric_acid_bucket"), Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.get("dihydrogen_monoxide_bucket_reaction"), Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.get("hydrogen_nitride_bucket_reaction"), Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.get("dihydrogen_sulfate_bucket_reaction"), Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.get("hydrogen_chloride_bucket_reaction"), Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.get("sodium_hypochlorite_bottle_reaction"), Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.get("trichloromethane_bottle_reaction"), Models.GENERATED);

        // NEW ALLOY INGOT MODELS
        itemModelGenerator.register(ModIngots.get("stainless_steel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tool_steel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("invar_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("kovar_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("silicon_steel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ferrochrome_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ferrotitanium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ferrovanadium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ferrotungsten_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ferromolybdenum_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("inconel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("nichrome_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("permalloy_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("nickel_silver_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("constantan_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("manganin_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("monel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ti_6al_4v_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ti_3al_2_5v_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("ti_6al_7nb_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("az31_magnesium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("elektron_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("electrum_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tumbaga_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("rose_gold_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("white_gold_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("sterling_silver_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("shibuichi_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("roses_metal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("woods_metal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("solder_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("pewter_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("fields_metal_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("silicon_bronze_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("manganese_bronze_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("zamak_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("stellite_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("duralumin_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("heavy_tungsten_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tungsten_copper_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tzm_molybdenum_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("bismuth_tin_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("tantalum_tungsten_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("niobium_titanium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("depleted_uranium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("galinstan_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("germanium_silicon_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("sodium_potassium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("mythril_steel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("naquadah_steel_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("naquadriah_titanium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("energium_copper_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("eridium_gold_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("energium_aluminium_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("naquadah_mythril_alloy_ingot"), Models.GENERATED);
        itemModelGenerator.register(ModIngots.get("eridium_tantalum_alloy_ingot"), Models.GENERATED);

        // NEW ELEMENTAL DUST MODELS
        itemModelGenerator.register(ModDusts.get("antimony_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("arsenic_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("barium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("beryllium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("bismuth_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cadmium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("calcium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("copper_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("lithium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("molybdenum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("naquadriah_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("niobium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("osmium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("palladium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("platinum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("polonium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("rhenium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("rhodium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ruthenium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("scandium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("selenium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("sodium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("strontium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tantalum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tellurium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("thallium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("thorium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tin_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("uranium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("zirconium_dust"), Models.GENERATED);

        // ALLOY DUST MODELS
        itemModelGenerator.register(ModDusts.get("alclad_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("aldrey_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alloys_8090_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("almag_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("almelec_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("almgsi_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alnimax_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alsimec_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alsin_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("aluminium_bronze_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alumel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alumicrom_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("aluminium_galimax_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("alusil_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("antanium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ardol_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("birmabright_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("babbitt_metal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("barium_alloy_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("barmetal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("bell_metal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("berylco_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("beta_brass_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("birmingham_gold_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("brass_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("calcusil_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cast_iron_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ccilla_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cervenit_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("chrominium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("c_manganese_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("constitution_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("copernicium_alloy_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("copper_aluminium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("copper_bismuth_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("copper_nickel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cunal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cunife_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("cusil_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("stainless_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tool_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("invar_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("kovar_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("silicon_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ferrochrome_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ferrotitanium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ferrovanadium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ferrotungsten_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ferromolybdenum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("inconel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("nichrome_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("permalloy_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("nickel_silver_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("constantan_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("manganin_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("monel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ti_6al_4v_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ti_3al_2_5v_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("ti_6al_7nb_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("az31_magnesium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("elektron_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("electrum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tumbaga_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("rose_gold_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("white_gold_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("sterling_silver_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("shibuichi_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("roses_metal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("woods_metal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("solder_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("pewter_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("fields_metal_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("silicon_bronze_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("manganese_bronze_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("zamak_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("stellite_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("duralumin_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("heavy_tungsten_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tungsten_copper_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tzm_molybdenum_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("bismuth_tin_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("tantalum_tungsten_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("niobium_titanium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("depleted_uranium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("galinstan_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("germanium_silicon_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("sodium_potassium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("mythril_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("naquadah_steel_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("naquadriah_titanium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("energium_copper_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("eridium_gold_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("energium_aluminium_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("naquadah_mythril_dust"), Models.GENERATED);
        itemModelGenerator.register(ModDusts.get("eridium_tantalum_dust"), Models.GENERATED);

        // NEW ELEMENTAL ROD MODELS
        itemModelGenerator.register(ModRods.get("barium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("beryllium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("bismuth_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cadmium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("calcium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("copper_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("lithium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("molybdenum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("naquadriah_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("niobium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("osmium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("palladium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("platinum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("polonium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("rhenium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("rhodium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ruthenium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("scandium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("sodium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("strontium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tantalum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("thallium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("thorium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("uranium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("zirconium_rod"), Models.HANDHELD_ROD);

        // ALLOY ROD MODELS
        itemModelGenerator.register(ModRods.get("alclad_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("aldrey_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alloys_8090_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("almag_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("almelec_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("almgsi_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alnimax_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alsimec_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alsin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("aluminium_bronze_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alumel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alumicrom_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("aluminium_galimax_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("alusil_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("antanium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ardol_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("birmabright_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("babbitt_metal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("barium_alloy_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("barmetal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("bell_metal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("berylco_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("beta_brass_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("birmingham_gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("brass_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("calcusil_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cast_iron_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ccilla_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cervenit_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("chrominium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("c_manganese_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("constitution_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("copernicium_alloy_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("copper_aluminium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("copper_bismuth_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("copper_nickel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cunal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cunife_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("cusil_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("stainless_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tool_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("invar_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("kovar_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("silicon_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ferrochrome_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ferrotitanium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ferrovanadium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ferrotungsten_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ferromolybdenum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("inconel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("nichrome_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("permalloy_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("nickel_silver_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("constantan_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("manganin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("monel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ti_6al_4v_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ti_3al_2_5v_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("ti_6al_7nb_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("az31_magnesium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("elektron_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("electrum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tumbaga_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("rose_gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("white_gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("sterling_silver_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("shibuichi_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("roses_metal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("woods_metal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("solder_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("pewter_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("fields_metal_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("silicon_bronze_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("manganese_bronze_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("zamak_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("stellite_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("duralumin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("heavy_tungsten_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tungsten_copper_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tzm_molybdenum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("bismuth_tin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("tantalum_tungsten_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("niobium_titanium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("depleted_uranium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("galinstan_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("germanium_silicon_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("sodium_potassium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("mythril_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("naquadah_steel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("naquadriah_titanium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("energium_copper_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("eridium_gold_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("energium_aluminium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("naquadah_mythril_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModRods.get("eridium_tantalum_rod"), Models.HANDHELD_ROD);

        // NEW CHARGED ROD MODELS
        itemModelGenerator.register(ModChargedRods.get("charged_aluminum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_chromium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_cobalt_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_eridium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_gallium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_iridium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_magnesium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_manganese_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_naquadah_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_nickel_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_titanium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_vanadium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_zinc_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_barium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_beryllium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_bismuth_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_cadmium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_calcium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_copper_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_lithium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_molybdenum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_naquadriah_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_niobium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_osmium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_palladium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_platinum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_polonium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_rhenium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_rhodium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_ruthenium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_scandium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_sodium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_strontium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_tantalum_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_thallium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_thorium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_tin_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_uranium_rod"), Models.HANDHELD_ROD);
        itemModelGenerator.register(ModChargedRods.get("charged_zirconium_rod"), Models.HANDHELD_ROD);

        // Wire item models are generated in generateBlockStateModels
        // via modelCollector to use a shared wire texture
    }

    private void generateCableModels(BlockStateModelGenerator gen) {
        BiConsumer<Identifier, Supplier<JsonElement>> models = gen.modelCollector;
        Consumer<BlockStateSupplier> bs = gen.blockStateCollector;

        Identifier centerTex = Identifier.of(PulderEssence.MOD_ID, "block/cable/center");
        Identifier armTex = Identifier.of(PulderEssence.MOD_ID, "block/cable/arm");

        // Generate shared models per thickness (10 total: 5 center + 4 arm)
        int[] thicknesses = {1, 2, 4, 8, 16};
        for (int thickness : thicknesses) {
            int half = Math.max(1, thickness / 2);
            int from = 8 - half;
            int to = 8 + half;
            String size = thickness + "x";

            Identifier centerId = Identifier.of(PulderEssence.MOD_ID, "block/cable_center_" + size);
            JsonObject centerJson = buildModelJson(centerTex, 0, from, from, from, to, to, to);
            models.accept(centerId, () -> centerJson);

            if (thickness < 16) {
                Identifier armId = Identifier.of(PulderEssence.MOD_ID, "block/cable_arm_" + size);
                // Arm extends from center's top face (y=to) to block boundary (y=16)
                // from_y = to means the arm starts at the center's top face even for rotated arms
                JsonObject armJson = buildModelJson(armTex, 1, from, to, from, to, 16, to);
                models.accept(armId, () -> armJson);
            }
        }

        // Generate per-cable blockstates and item models
        for (var block : ModWires.getAllCableBlocks()) {
            Identifier blockId = Registries.BLOCK.getId(block);
            String name = blockId.getPath();
            int thickness = block.getThickness();
            String size = thickness + "x";

            // Blockstate
            JsonObject bsJson = buildBlockStateJson(size, thickness < 16);
            bs.accept(new BlockStateSupplier() {
                @Override public Block getBlock() { return block; }
                @Override public JsonElement get() { return bsJson; }
            });

            // Item model — all wire items use the shared grayscale texture
            Identifier itemModelId = Identifier.of(PulderEssence.MOD_ID, "item/" + name);
            JsonObject itemJson = buildItemModelJson();
            models.accept(itemModelId, () -> itemJson);
        }
    }

    private JsonObject buildModelJson(Identifier textureId, int tintIndex, int fx, int fy, int fz, int tx, int ty, int tz) {
        JsonObject root = new JsonObject();
        root.addProperty("ambientocclusion", false);
        JsonObject textures = new JsonObject();
        textures.addProperty("particle", textureId.toString());
        textures.addProperty("cable", textureId.toString());
        root.add("textures", textures);
        JsonArray elements = new JsonArray();
        JsonObject element = new JsonObject();
        element.add("from", jarr(fx, fy, fz));
        element.add("to", jarr(tx, ty, tz));
        JsonObject faces = new JsonObject();
        for (String face : new String[]{"down", "up", "north", "south", "west", "east"}) {
            JsonObject f = new JsonObject();
            f.addProperty("texture", "#cable");
            f.addProperty("tintindex", tintIndex);
            faces.add(face, f);
        }
        element.add("faces", faces);
        elements.add(element);
        root.add("elements", elements);
        return root;
    }

    private JsonObject buildBlockStateJson(String size, boolean hasArm) {
        JsonObject root = new JsonObject();
        JsonArray multipart = new JsonArray();
        JsonObject centerEntry = new JsonObject();
        JsonArray centerApply = new JsonArray();
        JsonObject centerModel = new JsonObject();
        centerModel.addProperty("model", PulderEssence.MOD_ID + ":block/cable_center_" + size);
        centerApply.add(centerModel);
        centerEntry.add("apply", centerApply);
        multipart.add(centerEntry);
        if (hasArm) {
            for (String[] d : new String[][]{
                {"north", "90", "0"}, {"south", "90", "180"},
                {"east", "90", "90"}, {"west", "90", "270"},
                {"up", "0", "0"}, {"down", "180", "0"},
            }) {
                JsonObject entry = new JsonObject();
                JsonObject when = new JsonObject();
                when.addProperty(d[0], "true");
                entry.add("when", when);
                JsonArray apply = new JsonArray();
                JsonObject model = new JsonObject();
                model.addProperty("model", PulderEssence.MOD_ID + ":block/cable_arm_" + size);
                if (!d[1].equals("0")) model.addProperty("x", Integer.parseInt(d[1]));
                if (!d[2].equals("0")) model.addProperty("y", Integer.parseInt(d[2]));
                apply.add(model);
                entry.add("apply", apply);
                multipart.add(entry);
            }
        }
        root.add("multipart", multipart);
        return root;
    }

    private JsonObject buildItemModelJson() {
        JsonObject root = new JsonObject();
        root.addProperty("parent", "minecraft:item/generated");
        JsonObject textures = new JsonObject();
        textures.addProperty("layer0", PulderEssence.MOD_ID + ":item/wire");
        root.add("textures", textures);
        return root;
    }

    private static JsonArray jarr(int... values) {
        JsonArray a = new JsonArray();
        for (int v : values) a.add(v);
        return a;
    }
}
