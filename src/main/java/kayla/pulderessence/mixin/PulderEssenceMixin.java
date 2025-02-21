package kayla.pulderessence.mixin;

import kayla.pulderessence.item.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(Item.class)
public abstract class PulderEssenceMixin {

	@Inject(method = "appendTooltip", at = @At("HEAD"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void addCustomTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context, CallbackInfo ci) {
		if (stack.getItem() == Items.DIAMOND) { // Change this to the item you want
			tooltip.add(Text.literal("C").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.COAL) { // Change this to the item you want
			tooltip.add(Text.literal("C").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.IRON_INGOT) {
			tooltip.add(Text.literal("Fe").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.IRON_NUGGET) {
			tooltip.add(Text.literal("Fe").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.RAW_IRON) {
			tooltip.add(Text.literal("Fe").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.COPPER_INGOT) {
			tooltip.add(Text.literal("Cu").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == Items.RAW_COPPER) {
			tooltip.add(Text.literal("Cu").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.MYTHRIL_INGOT) {
			tooltip.add(Text.literal("My").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.MYTHRIL_ROD) {
			tooltip.add(Text.literal("My").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_MYTHRIL) {
			tooltip.add(Text.literal("My").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.MYTHRIL_NUGGET) {
			tooltip.add(Text.literal("My").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_MYTHRIL_ROD) {
			tooltip.add(Text.literal("My").formatted(Formatting.DARK_GRAY));
		}
	}
}