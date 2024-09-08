package kayla.pulderessence;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModItems;
import kayla.pulderessence.item.ModItemGroups;
import kayla.pulderessence.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

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

		ModWorldGeneration.generateModWorldGen();
	}
}