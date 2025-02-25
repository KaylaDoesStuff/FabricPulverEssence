package kayla.pulderessence.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChargedItem extends Item {
    private int charge;

    public ChargedItem(Settings settings, int initialCharge) {
        super(settings);
        this.charge = initialCharge;
    }

    @Override

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(chargeTooltip());
        tooltip.add(chargeDescription());
        super.appendTooltip(stack, world, tooltip, context);
    }

    public MutableText chargeTooltip() {
        int chargeLevel = getCharge(); // Call the method to get the charge level
        MutableText tooltipText = Text.literal("Charge value: "+ chargeLevel + " eV");
        tooltipText.formatted(Formatting.BLUE);
        return tooltipText;
    }

    public MutableText chargeDescription() {
        MutableText tooltipText = Text.translatable("charge.description.tooltip");
        tooltipText.formatted((Formatting.DARK_GRAY));
        return tooltipText;
    }

    public int getCharge() {
        return this.charge;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            setCharge(this.charge+1);
        }
        return ActionResult.SUCCESS;
    }


    public void setCharge(int input) {
        this.charge = input;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }


}
