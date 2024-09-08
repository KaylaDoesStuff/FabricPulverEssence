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

        addDrop(ModBlocks.PULVERENT_NYLIUM);

        addDrop(ModBlocks.MYTHRIL_ORE, copperLikeOreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL, 2.0F, 5.0F));
        addDrop(ModBlocks.DEEPSLATE_MYTHRIL_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_MYTHRIL_ORE, ModItems.RAW_MYTHRIL, 3.0F, 7.0F));
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