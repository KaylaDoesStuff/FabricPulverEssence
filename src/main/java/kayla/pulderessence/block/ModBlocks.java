package kayla.pulderessence.block;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.custom.ModMachineBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));

    public static Block YTTRIUM_BLOCK = registerBlock("yttrium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static Block RAW_YTTRIUM_BLOCK = registerBlock("raw_yttrium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static Block YTTRIUM_ORE = registerBlock("yttrium_ore", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static Block DEEPSLATE_YTTRIUM_ORE = registerBlock("deepslate_yttrium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));

    public static Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static Block SILVER_ORE = registerBlock("silver_ore", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));

    public static Block LEAD_BLOCK = registerBlock("lead_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static Block LEAD_ORE = registerBlock("lead_ore", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));

    public static Block INDIUM_BLOCK = registerBlock("indium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block RAW_INDIUM_BLOCK = registerBlock("raw_indium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block INDIUM_ORE = registerBlock("indium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static Block DEEPSLATE_INDIUM_ORE = registerBlock("deepslate_indium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block TUNGSTEN_ORE = registerBlock("tungsten_ore", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static Block ENERGIUM_BLOCK = registerBlock("energium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block RAW_ENERGIUM_BLOCK = registerBlock("raw_energium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static Block ENERGIUM_ORE = registerBlock("energium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static Block DEEPSLATE_ENERGIUM_ORE = registerBlock("deepslate_energium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static Block PULVERENT_NYLIUM = registerBlock("pulverent_nylium", new NetherrackBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM)));
    public static Block STRIPPED_PULVERENT_LOG = registerBlock("stripped_pulverent_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM)));
    public static Block STRIPPED_PULVERENT_WOOD = registerBlock("stripped_pulverent_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE)));
    public static Block PULVERENT_LOG = registerBlock("pulverent_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM)));
    public static Block PULVERENT_WOOD = registerBlock("pulverent_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));
    public static Block PULVERENT_PLANKS = registerBlock("pulverent_planks", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

    public static Block PULVERENT_STAIRS = registerBlock("pulverent_stairs", new StairsBlock(ModBlocks.PULVERENT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static Block PULVERENT_SLAB = registerBlock("pulverent_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

    public static Block PULVERENT_BUTTON = registerBlock("pulverent_button", new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK, 10, true));
    public static Block PULVERENT_PRESSURE_PLATE = registerBlock("pulverent_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK));

    public static Block PULVERENT_FENCE = registerBlock("pulverent_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static Block PULVERENT_FENCE_GATE = registerBlock("pulverent_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), WoodType.OAK));

    public static Block PULVERENT_DOOR = registerBlock("pulverent_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK));
    public static Block PULVERENT_TRAPDOOR = registerBlock("pulverent_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK));

    public static Block CHARGING_STATION = registerBlock("charging_station", new ModMachineBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static Block ELECTROLYSIS_STATION = registerBlock("electrolysis_station", new ModMachineBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PulderEssence.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {}
}