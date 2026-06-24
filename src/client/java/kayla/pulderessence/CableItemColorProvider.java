package kayla.pulderessence;

import kayla.pulderessence.block.custom.CableBlock;
import kayla.pulderessence.item.ModWires;
import net.minecraft.block.Block;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class CableItemColorProvider implements ItemColorProvider {
    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        if (tintIndex == 0 && stack.getItem() instanceof BlockItem bi) {
            Block block = bi.getBlock();
            if (block instanceof CableBlock cable) {
                return ModWires.getMaterialColor(cable) | 0xFF000000;
            }
        }
        return 0xFFFFFFFF;
    }
}
