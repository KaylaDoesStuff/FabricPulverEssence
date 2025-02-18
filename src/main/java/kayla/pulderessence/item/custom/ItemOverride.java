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

public class ItemOverride extends Item {
    private final MutableText compound;
    public ItemOverride(Settings settings, MutableText input) {
        super(settings);
        this.compound = input;
    }

    @Override

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(compoundTooltip());
        super.appendTooltip(stack, world, tooltip, context);
    }

    private MutableText compoundTooltip() {
        MutableText compoundName = getCompound();
        compoundName.formatted(Formatting.DARK_GRAY);
        return compoundName;
    }

    public MutableText getCompound() {
        return this.compound;
    }
}
