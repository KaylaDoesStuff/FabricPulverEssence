package kayla.pulderessence;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModWires;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;

public class PulderEssenceClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.get("pulverent_trapdoor"), RenderLayer.getCutout());

		Block[] allCables = ModWires.getAllCableBlocks().toArray(new Block[0]);
		Item[] allWireItems = ModWires.getAllWireItems().toArray(new Item[0]);

		ColorProviderRegistry.BLOCK.register(new CableBlockColorProvider(), allCables);
		ColorProviderRegistry.ITEM.register(new CableItemColorProvider(), allWireItems);
	}
}