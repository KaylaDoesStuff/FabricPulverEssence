package kayla.pulderessence.block;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherrackBlock;
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
    public static Block PULVERENT_NYLIUM = registerBlock("pulverent_nylium", new NetherrackBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM)));

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