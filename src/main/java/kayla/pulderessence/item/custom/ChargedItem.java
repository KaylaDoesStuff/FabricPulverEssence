package kayla.pulderessence.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChargedItem extends Item {
    private final int charge;

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
        MutableText tooltipText = Text.literal("Charge value: "+ chargeLevel+ "V");
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
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
