package kayla.pulderessence.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ElementItem extends Item {
    private final String elementID;
    private final float atomicMass;
    private final int atomicNumber;

    public ElementItem(Settings settings, String element, int number, float mass) {
        super(settings);
        this.elementID = element;
        this.atomicMass = mass;
        this.atomicNumber = number;
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal(elementID).formatted(Formatting.DARK_GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
