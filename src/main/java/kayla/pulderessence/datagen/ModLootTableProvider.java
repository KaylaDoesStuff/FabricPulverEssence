package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MYTHRIL_BLOCK);
        addDrop(ModBlocks.RAW_MYTHRIL_BLOCK);

        addDrop(ModBlocks.INDIUM_BLOCK);
        addDrop(ModBlocks.RAW_INDIUM_BLOCK);

        addDrop(ModBlocks.TUNGSTEN_BLOCK);
        addDrop(ModBlocks.RAW_TUNGSTEN_BLOCK);

        addDrop(ModBlocks.ENERGIUM_BLOCK);
        addDrop(ModBlocks.RAW_ENERGIUM_BLOCK);

        addDrop(ModBlocks.YTTRIUM_BLOCK);
        addDrop(ModBlocks.RAW_YTTRIUM_BLOCK);

        addDrop(ModBlocks.DEEPSLATE_INDIUM_ORE, ModItems.RAW_INDIUM);
        addDrop(ModBlocks.INDIUM_ORE, ModItems.RAW_INDIUM);

        addDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN);
        addDrop(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN);

        addDrop(ModBlocks.DEEPSLATE_YTTRIUM_ORE, ModItems.RAW_YTTRIUM);
        addDrop(ModBlocks.YTTRIUM_ORE, ModItems.RAW_YTTRIUM);

        addDrop(ModBlocks.PULVERENT_NYLIUM);
        addDrop(ModBlocks.STRIPPED_PULVERENT_LOG);

        addDrop(ModBlocks.PULVERENT_PLANKS);
        addDrop(ModBlocks.PULVERENT_BUTTON);
        addDrop(ModBlocks.PULVERENT_PRESSURE_PLATE);
        addDrop(ModBlocks.PULVERENT_STAIRS);
        addDrop(ModBlocks.PULVERENT_FENCE);
        addDrop(ModBlocks.PULVERENT_FENCE_GATE);
        addDrop(ModBlocks.PULVERENT_TRAPDOOR);

        addDrop(ModBlocks.PULVERENT_DOOR, doorDrops(ModBlocks.PULVERENT_DOOR));
        addDrop(ModBlocks.PULVERENT_SLAB, slabDrops(ModBlocks.PULVERENT_SLAB));

        addDrop(ModBlocks.MYTHRIL_ORE, copperLikeOreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL, 2.0F, 5.0F));
        addDrop(ModBlocks.DEEPSLATE_MYTHRIL_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_MYTHRIL_ORE, ModItems.RAW_MYTHRIL, 3.0F, 7.0F));

        addDrop(ModBlocks.ENERGIUM_ORE, copperLikeOreDrops(ModBlocks.ENERGIUM_ORE, ModItems.RAW_ENERGIUM, 2.0F, 5.0F));
        addDrop(ModBlocks.DEEPSLATE_ENERGIUM_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_ENERGIUM_ORE, ModItems.RAW_ENERGIUM, 3.0F, 7.0F));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item, Float minimum, Float maximum) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(minimum, maximum))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
