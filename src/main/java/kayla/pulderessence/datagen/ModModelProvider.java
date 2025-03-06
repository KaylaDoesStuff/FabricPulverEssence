package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARGING_STATION);

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

        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
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

        itemModelGenerator.register(ModItems.INDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_INDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.YTTRIUM_INGOT, Models.GENERATED);
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

        itemModelGenerator.register(ModItems.SILICON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILICON_BOULE, Models.GENERATED);


        itemModelGenerator.register(ModBottleItems.BLEACH_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModBottleItems.CHLOROFORM_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModBucketItems.AMMONIA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModBucketItems.SULFURIC_ACID_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.H2O_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.NH3_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.H2SO4_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ChemicalReactionItems.NaOCl_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ChemicalReactionItems.CHCl3_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModElements.HYDROGEN, Models.GENERATED);
        itemModelGenerator.register(ModElements.HELIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LITHIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BERYLLIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BORON, Models.GENERATED);
        itemModelGenerator.register(ModElements.CARBON, Models.GENERATED);
        itemModelGenerator.register(ModElements.NITROGEN, Models.GENERATED);
        itemModelGenerator.register(ModElements.OXYGEN, Models.GENERATED);
        itemModelGenerator.register(ModElements.FLUORINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.NEON, Models.GENERATED);
        itemModelGenerator.register(ModElements.SODIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MAGNESIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ALUMINUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.SILICON, Models.GENERATED);
        itemModelGenerator.register(ModElements.PHOSPHOR, Models.GENERATED);
        itemModelGenerator.register(ModElements.SULFUR, Models.GENERATED);
        itemModelGenerator.register(ModElements.CHLORINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.ARGON, Models.GENERATED);
        itemModelGenerator.register(ModElements.POTASSIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.CALCIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.SCANDIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.VANADIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.CHROMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MANGANESE, Models.GENERATED);
        itemModelGenerator.register(ModElements.IRON, Models.GENERATED);
        itemModelGenerator.register(ModElements.COBALT, Models.GENERATED);
        itemModelGenerator.register(ModElements.NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModElements.COPPER, Models.GENERATED);
        itemModelGenerator.register(ModElements.ZINC, Models.GENERATED);
        itemModelGenerator.register(ModElements.GALLIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.GERMANIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ARSENIC, Models.GENERATED);
        itemModelGenerator.register(ModElements.SELENIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BROMINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.KRYPTON, Models.GENERATED);
        itemModelGenerator.register(ModElements.RUBIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.STRONTIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.YTTRIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ZIRCONIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.NIOBIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MOLYBDENUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TECHNETIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.RUTHENIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.RHODIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PALLADIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.SILVER, Models.GENERATED);
        itemModelGenerator.register(ModElements.CADMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.INDIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TIN, Models.GENERATED);
        itemModelGenerator.register(ModElements.ANTIMONY, Models.GENERATED);
        itemModelGenerator.register(ModElements.TELLURIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.IODINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.XENON, Models.GENERATED);
        itemModelGenerator.register(ModElements.CAESIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BARIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LANTHANIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.CERIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PRASEODYMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.NEODYMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PROMETHIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.SAMARIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.EUROPIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.GADOLINIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TERBIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.DYSPROSIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.HOLMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ERBIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.THULLIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.YTTERBIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LUTETIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.HAFNIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TANTALUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModElements.RHENIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.OSMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.GOLD, Models.GENERATED);
        itemModelGenerator.register(ModElements.MERCURY, Models.GENERATED);
        itemModelGenerator.register(ModElements.THALLIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LEAD, Models.GENERATED);
        itemModelGenerator.register(ModElements.BISMUTH, Models.GENERATED);
        itemModelGenerator.register(ModElements.POLONIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ASTATINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.RADON, Models.GENERATED);
        itemModelGenerator.register(ModElements.FRANCIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.RADIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ACTINIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.THORIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PROTACTINIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.NEPTUNIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.PLUTONIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.AMERICIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.CURIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BERKELLIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.CALIFORNIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.EINSTEINIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.FERMIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MENDELEVLUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.NOBELIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LAWRENCIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.RUTHERFORDIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.DUBNIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.SEABORGIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.BOHRIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.HASSIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MEITNERIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.DARMSTADTIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.ROENTGENIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.COPERNICIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.NIHONIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.MOSCOVIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.LIVERMORIUM, Models.GENERATED);
        itemModelGenerator.register(ModElements.TENNESSINE, Models.GENERATED);
        itemModelGenerator.register(ModElements.OGANESSON, Models.GENERATED);
    }
}
