package kayla.pulderessence.mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mixin(Item.class)
public class PulderEssenceMixin {

	private static final Map<Item, MutableText> TOOLTIP_MAP = new HashMap<>();

	static {
		itemTooltipAdd("minecraft:iron_ingot", "Fe");
		itemTooltipAdd("minecraft:copper_ingot", "Cu");
	}

	@Inject(method = "appendTooltip", at = @At("TAIL"))
	private void addCustomTooltip(ItemStack stack, World world, List<Text> list, TooltipContext tooltip, CallbackInfo info) {
		MutableText customTooltip = TOOLTIP_MAP.get(stack.getItem());
		customTooltip.formatted(Formatting.DARK_GRAY);
	}

	@Inject(method = "appendTooltip", at = @At("HEAD"))
	private static void itemTooltipAdd(String id, String tooltip) {
		TOOLTIP_MAP.put(Registries.ITEM.get(new Identifier(id)), Text.literal(tooltip));
	}
}