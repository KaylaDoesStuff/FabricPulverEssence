package kayla.pulderessence.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.text.Text;

import java.util.List;

public class ProgressableItem extends Item {
    private final Item resultItem; // Single result item
    private final int clicksRequired;
    private final Block validBlock; // The block that can be right-clicked
    private int progress;

    public ProgressableItem(Settings settings, Item resultItem, int clicksRequired, Block validBlock) {
        super(settings);
        this.resultItem = resultItem;
        this.clicksRequired = clicksRequired;
        this.validBlock = validBlock;
        this.progress = 0;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        BlockState blockState = context.getWorld().getBlockState(pos);
        PlayerEntity user = context.getPlayer();
        ItemStack itemStack = context.getStack();

        if (!context.getWorld().isClient()) {
            if (blockState.getBlock() == validBlock) {
                progress++;
                if (progress >= clicksRequired) {
                    progress = 0;
                    user.getInventory().insertStack(new ItemStack(resultItem));
                    user.getInventory().removeOne(itemStack);
                }
                return ActionResult.success(true);
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        int progressPercentage = (int) ((float) progress / clicksRequired * 100);
        tooltip.add(Text.translatable("Progress: " + progressPercentage + "%"));
    }

}