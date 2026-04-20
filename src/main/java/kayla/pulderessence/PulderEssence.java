package kayla.pulderessence;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.*;
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
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
        ChemicalReactionItems.registerCrafts();
		ModBucketItems.registerBuckets();
		ModBottleItems.registerBottles();
		IngotItem.registerIngotItems();

		StrippableBlockRegistry.register(ModBlocks.PULVERENT_LOG, ModBlocks.STRIPPED_PULVERENT_LOG);
		StrippableBlockRegistry.register(ModBlocks.PULVERENT_WOOD, ModBlocks.STRIPPED_PULVERENT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PULVERENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PULVERENT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PULVERENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PULVERENT_WOOD, 5, 5);
	}
}