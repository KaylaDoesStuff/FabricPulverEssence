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
		} else if (stack.getItem() == ModItems.INDIUM_INGOT) {
			tooltip.add(Text.literal("In").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.INDIUM_ROD) {
			tooltip.add(Text.literal("In").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_INDIUM) {
			tooltip.add(Text.literal("In").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.INDIUM_NUGGET) {
			tooltip.add(Text.literal("In").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_INDIUM_ROD) {
			tooltip.add(Text.literal("In").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.TUNGSTEN_INGOT) {
			tooltip.add(Text.literal("W").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.TUNGSTEN_ROD) {
			tooltip.add(Text.literal("W").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_TUNGSTEN) {
			tooltip.add(Text.literal("W").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.TUNGSTEN_NUGGET) {
			tooltip.add(Text.literal("W").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_TUNGSTEN_ROD) {
			tooltip.add(Text.literal("W").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.ENERGIUM_SHARD) {
			tooltip.add(Text.literal("En").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.ENERGIUM_ROD) {
			tooltip.add(Text.literal("En").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_ENERGIUM) {
			tooltip.add(Text.literal("En").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_ENERGIUM_ROD) {
			tooltip.add(Text.literal("En").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.SILVER_INGOT) {
			tooltip.add(Text.literal("Ag").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.SILVER_ROD) {
			tooltip.add(Text.literal("Ag").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_SILVER) {
			tooltip.add(Text.literal("Ag").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.SILVER_NUGGET) {
			tooltip.add(Text.literal("Ag").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_SILVER_ROD) {
			tooltip.add(Text.literal("Ag").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.LEAD_INGOT) {
			tooltip.add(Text.literal("Pb").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.LEAD_ROD) {
			tooltip.add(Text.literal("Pb").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.RAW_LEAD) {
			tooltip.add(Text.literal("Pb").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.LEAD_NUGGET) {
			tooltip.add(Text.literal("Pb").formatted(Formatting.DARK_GRAY));
		} else if (stack.getItem() == ModItems.CHARGED_LEAD_ROD) {
			tooltip.add(Text.literal("Pb").formatted(Formatting.DARK_GRAY));
		}
	}
}