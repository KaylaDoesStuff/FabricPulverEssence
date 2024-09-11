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
    private int charge;

    public ChargedItem(Settings settings, int initialCharge) {
        super(settings);
        this.charge = initialCharge;
    }

    @Override

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(chargeTooltip());
        super.appendTooltip(stack, world, tooltip, context);
    }

    public MutableText chargeTooltip() {
        int chargeLevel = getCharge(); // Call the method to get the charge level
        MutableText tooltipText = Text.translatable("Charge value: "+ chargeLevel+ "J");
        tooltipText.formatted(Formatting.RED);
        return tooltipText;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
