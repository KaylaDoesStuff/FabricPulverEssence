package kayla.pulderessence.mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
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
		// Attempt to retrieve the copper ingot item from the registry
		Item copperIngot = Registries.ITEM.get(Identifier.tryParse("minecraft:copper_ingot"));
		if (copperIngot != null) {
			TOOLTIP_MAP.put(copperIngot, Text.literal("Cu"));
		} else {
			System.err.println("Copper ingot not found in the registry!");
		}

	}

	private static void printAllRegisteredItems() {
		Registries.ITEM.forEach(itemEntry -> {
			Identifier id = Registries.ITEM.getId(itemEntry);
			System.out.println("Registered item: " + id.toString());
		});
	}

	@Inject(method = "appendTooltip", at = @At("HEAD"))
	private void appendCustomTooltip(ItemStack stack, @Nullable World world, List<Text> list, TooltipContext tooltip, CallbackInfo info) {
		// No need to check if stack is null; it should not be null when this method is called
		Item item = stack.getItem();
		MutableText customTooltip = TOOLTIP_MAP.get(item);

		if (customTooltip != null) {
			// Format the tooltip and add it to the list
			customTooltip = customTooltip.formatted(Formatting.DARK_GRAY);
			list.add(customTooltip);
		} else {
			// Optional: Uncomment for debugging
			// System.out.println("Custom tooltip not found for item: " + item);
		}
	}
}