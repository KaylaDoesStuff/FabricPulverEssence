package kayla.pulderessence.item.custom;

import kayla.pulderessence.item.types.ElementType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class ReactionItem extends Item {

    private final List<ElementType> elementType;
    private final List<Integer> elementCount;
    private final int clicksRequired;
    private int progress;

    public ReactionItem(Settings settings, List<ElementType> elementType, List<Integer> elementCount, int progress, int clicksRequired) {
        super(settings);
        this.elementType = elementType;
        this.elementCount = elementCount;
        this.clicksRequired = clicksRequired;
        this.progress = 0;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        BlockState blockState = context.getWorld().getBlockState(pos);
        PlayerEntity user = context.getPlayer();
        ItemStack itemStack = context.getStack();

        if (!context.getWorld().isClient()) {
            if (blockState.getBlock() == Blocks.AIR) {
                progress++;
                if (progress >= clicksRequired) {
                    progress = 0;
                    user.getInventory().insertStack(new ItemStack(registerNewCompound("temp", elementType, elementCount)));
                    user.getInventory().removeOne(itemStack);
                }
                return ActionResult.success(true);
            }
        }
        return ActionResult.PASS;

    }

    public final CompoundItem registerNewCompound(String name, List<ElementType> inputElement, List<Integer> inputCount) {
        return Registry.register(Registries.ITEM, name, new CompoundItem(new FabricItemSettings(), inputElement, inputCount));
    }

}
