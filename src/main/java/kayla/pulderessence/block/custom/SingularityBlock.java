package kayla.pulderessence.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SingularityBlock extends Block implements BlockEntityProvider {

    public SingularityBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SingularityBlockEntity(pos, state);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient) {
            BlockEntity be = world.getBlockEntity(pos);
            if (be instanceof SingularityBlockEntity sbe) {
                net.minecraft.nbt.NbtCompound nbt = itemStack.getNbt();
                if (nbt != null) {
                    net.minecraft.nbt.NbtCompound data = nbt.contains("BlockEntityTag", 10)
                        ? nbt.getCompound("BlockEntityTag")
                        : nbt;
                    if (data.contains("mass")) {
                        sbe.setMass(data.getDouble("mass"));
                    }
                    if (data.contains("spin")) {
                        sbe.setSpin(data.getDouble("spin"));
                    }
                }
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient && player.isSneaking()) {
            BlockEntity be = world.getBlockEntity(pos);
            if (be instanceof SingularityBlockEntity sbe) {
                player.sendMessage(Text.literal("Mass: " + sbe.getMass() + ", Spin: " + sbe.getSpin() + " (TODO)"), true);
                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
