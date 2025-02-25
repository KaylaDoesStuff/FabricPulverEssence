package kayla.pulderessence.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ProgressableItem extends Item {
    private int progress;
    private final int finalProgress;
    private final Item result;

    public ProgressableItem(Settings settings, int finalProgress, Item resultItem) {
        super(settings);
        this.progress = 0;
        this.finalProgress = finalProgress;
        this.result = resultItem;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ItemStack selectedSlot = context.getPlayer().getMainHandStack();
        if (!context.getWorld().isClient()) {
            if (this.progress >= this.finalProgress) {
                if (!selectedSlot.isEmpty() && selectedSlot.getCount() > 0) {
                    if (selectedSlot.getCount() == 1) {
                        context.getPlayer().getInventory().removeOne(selectedSlot);
                    } else {
                        selectedSlot.decrement(1);
                    }
                    context.getPlayer().giveItemStack(new ItemStack(this.result));
                    setProgress(0);
                }
            } else {
                setProgress(this.progress + 1);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(progressTooltip());
        tooltip.add(progressDescription());
        super.appendTooltip(stack, world, tooltip, context);
    }

    public MutableText progressTooltip() {
        float progressLevel = getProgress();
        float progressPercentage;
        if(progressLevel/this.finalProgress > 1 || progressLevel/this.finalProgress < 0) {
            progressPercentage = 0;
        } else {
            progressPercentage = progressLevel/this.finalProgress;
        };
        MutableText tooltipText = Text.literal("Progress: "+ progressPercentage*100 + "%");
        tooltipText.formatted(Formatting.DARK_RED);
        return tooltipText;
    }

    public MutableText progressDescription() {
        MutableText tooltipText = Text.translatable("progress.description.tooltip");
        tooltipText.formatted((Formatting.DARK_GRAY));
        return tooltipText;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int input) {
        this.progress = input;
    }


}
