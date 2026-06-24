package kayla.pulderessence;

import kayla.pulderessence.block.custom.CableBlock;
import kayla.pulderessence.item.ModWires;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

public class CableBlockColorProvider implements BlockColorProvider {
    @Override
    public int getColor(BlockState state, BlockRenderView world, BlockPos pos, int tintIndex) {
        if (state.getBlock() instanceof CableBlock cable) {
            if (tintIndex == 0 && cable.isInsulated()) {
                return 0xFF666666;
            }
            return ModWires.getMaterialColor(cable) | 0xFF000000;
        }
        return 0xFFFFFFFF;
    }
}
