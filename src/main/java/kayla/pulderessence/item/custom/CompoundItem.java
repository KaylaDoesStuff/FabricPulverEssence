package kayla.pulderessence.item.custom;

import kayla.pulderessence.item.types.ElementType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CompoundItem extends Item {

    public final List<ElementType> elementId;
    public final List<Integer> elementAmount;

    public CompoundItem(Settings settings, List<ElementType> elementId, List<Integer> elementAmount) {
        super(settings);
        this.elementId = elementId;
        this.elementAmount = elementAmount;
    }

    public static String buildFormula(List<ElementType> elements, List<Integer> counts) {
        StringBuilder formula = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            if (counts.get(i) == 1) {
                formula.append(elements.get(i).getAtomicSymbol());
            } else {
                formula.append(elements.get(i).getAtomicSymbol()).append(toSubscript(counts.get(i)));
            }
        }
        return formula.toString();
    }

    private static String toSubscript(int number) {
        String[] subscriptDigits = {"₀", "₁", "₂", "₃", "₄", "₅", "₆", "₇", "₈", "₉"};

        String numStr = String.valueOf(number);
        StringBuilder subscript = new StringBuilder();
        for (char digit : numStr.toCharArray()) {
            int digitValue = digit - '0';
            subscript.append(subscriptDigits[digitValue]);
        }
        return subscript.toString();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal(buildFormula(elementId, elementAmount)).formatted(Formatting.DARK_GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
