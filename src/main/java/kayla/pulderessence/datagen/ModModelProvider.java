package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModItems;
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
        itemModelGenerator.register(ModItems.MYTHRIL_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_MYTHRIL_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_GOLD_ROD, Models.HANDHELD_ROD);

        itemModelGenerator.register(ModItems.IRON_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_IRON_ROD, Models.HANDHELD_ROD);

        itemModelGenerator.register(ModItems.INDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_INDIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_INDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_SILVER_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_LEAD_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_TUNGSTEN_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.YTTRIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YTTRIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.CHARGED_YTTRIUM_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.RAW_YTTRIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.YTTRIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENERGIUM_SHARD, Models.GENERATED);
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
    }
}
