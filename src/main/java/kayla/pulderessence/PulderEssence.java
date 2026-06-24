package kayla.pulderessence;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.*;
import kayla.pulderessence.voltage.TierTypes;
import kayla.pulderessence.world.VoidChunkGenerator;
import kayla.pulderessence.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PulderEssence implements ModInitializer {
	public static final String MOD_ID = "pulderessence";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Registry.register(Registries.CHUNK_GENERATOR, new Identifier(MOD_ID, "void_chunk_generator"), VoidChunkGenerator.CODEC);
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModIngots.registerIngots();
		ModRods.registerRods();
		ModChargedRods.registerChargedRods();
		ModDusts.registerDusts();
		ModNuggets.registerNuggets();
		ModOres.registerOres();
		ModCraftingItems.registerCraftingItems();
		ModTools.registerTools();
//        ChemicalReactionItems.registerCrafts();
		ModBucketItems.registerBuckets();
		ModBottleItems.registerBottles();
		ModWires.registerAll();
		TierTypes.init();

		StrippableBlockRegistry.register(ModBlocks.get("pulverent_log"), ModBlocks.get("stripped_pulverent_log"));
		StrippableBlockRegistry.register(ModBlocks.get("pulverent_wood"), ModBlocks.get("stripped_pulverent_wood"));

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.get("pulverent_log"), 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.get("pulverent_wood"), 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.get("stripped_pulverent_log"), 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.get("stripped_pulverent_wood"), 5, 5);
	}
}