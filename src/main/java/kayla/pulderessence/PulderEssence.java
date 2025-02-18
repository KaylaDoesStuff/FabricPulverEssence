package kayla.pulderessence;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.block.entity.ModBlockEntities;
import kayla.pulderessence.item.CompoundItems;
import kayla.pulderessence.item.ModItems;
import kayla.pulderessence.item.ModItemGroups;
import kayla.pulderessence.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PulderEssence implements ModInitializer {
	public static final String MOD_ID = "pulderessence";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		CompoundItems.registerCompounds();

		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.PULVERENT_LOG, ModBlocks.STRIPPED_PULVERENT_LOG);
		StrippableBlockRegistry.register(ModBlocks.PULVERENT_WOOD, ModBlocks.STRIPPED_PULVERENT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PULVERENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PULVERENT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PULVERENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PULVERENT_WOOD, 5, 5);
	}
}