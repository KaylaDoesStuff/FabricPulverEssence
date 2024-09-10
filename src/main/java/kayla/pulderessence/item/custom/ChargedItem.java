package kayla.pulderessence.item.custom;

import kayla.pulderessence.util.ModTags;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.item.TooltipData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class ChargedItem extends Item {
    public ChargedItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.charge"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    private Optional<TooltipData> isCharged(Item item, Integer charge) {
        return item.getTooltipData(new ItemStack(item));
    }
}
