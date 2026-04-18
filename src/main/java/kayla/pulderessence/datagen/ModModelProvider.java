package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MYTHRIL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_INDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_INDIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TUNGSTEN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ENERGIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENERGIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENERGIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ENERGIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_YTTRIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YTTRIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YTTRIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_YTTRIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);

        blockStateModelGenerator.registerNetherrackBottomCustomTop(ModBlocks.PULVERENT_NYLIUM);
        blockStateModelGenerator.registerLog(ModBlocks.PULVERENT_LOG).log(ModBlocks.PULVERENT_LOG).wood(ModBlocks.PULVERENT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PULVERENT_LOG).log(ModBlocks.STRIPPED_PULVERENT_LOG).wood(ModBlocks.STRIPPED_PULVERENT_WOOD);
        BlockStateModelGenerator.BlockTexturePool planksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PULVERENT_PLANKS);

        planksPool.stairs(ModBlocks.PULVERENT_STAIRS);
        planksPool.slab(ModBlocks.PULVERENT_SLAB);
        planksPool.button(ModBlocks.PULVERENT_BUTTON);
        planksPool.pressurePlate(ModBlocks.PULVERENT_PRESSURE_PLATE);
        planksPool.fence(ModBlocks.PULVERENT_FENCE);
        planksPool.fenceGate(ModBlocks.PULVERENT_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PULVERENT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PULVERENT_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(IngotItem.IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.COPPER_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUMINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.COBALT_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.CHROMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.MANGANESE_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.MOLYBDENUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BISMUTH_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.MAGNESIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.CALCIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BARIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.CADMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.INDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.GALLIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.THALLIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ANTIMONY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.TELLURIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.SELENIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ARSENIC_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.STRONTIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.SCANDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.YTTRIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ZIRCONIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.NIOBIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.TANTALUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.RHENIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.THORIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.RUTHENIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.RHODIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.PALLADIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.OSMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.IRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.NAQUADAH_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.NAQUADRIAH_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ENERGIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ERIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.MYTHRIL_INGOT, Models.GENERATED);

        // "A" ALLOYS MODEL GENERATOR (17 total)
        itemModelGenerator.register(IngotItem.ALCLAD_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALDREY_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALLOYS_8090_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALMAG_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALMELEC_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALMgSi_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALNIMAX_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALSIMEC_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALSIN_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUMINIUM_BRONZE_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUMEL_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUMICROM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUMINIUM_GALIMAX_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ALUSIL_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ANTANIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.ARDOL_ALLOY_INGOT, Models.GENERATED);

        // "B" ALLOYS MODEL GENERATOR (10 total)
        itemModelGenerator.register(IngotItem.BABBITT_METAL_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BARIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BARMETAL_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BELL_METAL_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BERYLCO_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BETA_BRASS_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BIRMABRIGHT_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BIRMINGHAM_GOLD_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BRONZE_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(IngotItem.BRASS_ALLOY_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MYTHRIL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_MYTHRIL_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_GOLD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.GOLD_DUST,Models.GENERATED);

        itemModelGenerator.register(ModItems.IRON_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_IRON_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.IRON_DUST,Models.GENERATED);

        itemModelGenerator.register(ModItems.INDIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_INDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.YTTRIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.YTTRIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_YTTRIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_YTTRIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.YTTRIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENERGIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENERGIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENERGIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_ENERGIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_ENERGIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FAERIE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAERIE_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_FAERIE_ROD, Models.HANDHELD_ROD);

        itemModelGenerator.register(ModItems.SILICON_BOULE, Models.GENERATED);


        itemModelGenerator.register(ModBottleItems.BLEACH_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModBottleItems.CHLOROFORM_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModBucketItems.AMMONIA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModBucketItems.SULFURIC_ACID_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModBucketItems.HYDROCHLORIC_ACID_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.H2O_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.NH3_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.H2SO4_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.HCl_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.NaOCl_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.CHCl3_BOTTLE, Models.GENERATED);
    }
}
