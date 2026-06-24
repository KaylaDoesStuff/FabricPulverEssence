package kayla.pulderessence.block;

import kayla.pulderessence.PulderEssence;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.function.Supplier;

public class ModBlocks {

    private static final List<BlockEntry> ENTRIES = List.of(
        new BlockEntry("mythril_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))),
        new BlockEntry("yttrium_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))),
        new BlockEntry("silver_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))),
        new BlockEntry("lead_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))),
        new BlockEntry("indium_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))),
        new BlockEntry("tungsten_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))),
        new BlockEntry("energium_block", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK))),
        new BlockEntry("hematite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_hematite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("magnetite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_magnetite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("chalcopyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_chalcopyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("sphalerite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_sphalerite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("cassiterite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_cassiterite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("anthracite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_anthracite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("pentlandite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_pentlandite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("galena_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_galena_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("cobaltite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_cobaltite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("stibnite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_stibnite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("native_gold_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_native_gold_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("argentite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_argentite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("bismuthinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_bismuthinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("cinnabar_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_cinnabar_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("nitratite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_nitratite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("bauxite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_bauxite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("magnesite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_magnesite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("dolomite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_dolomite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("halite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_halite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("sylvite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_sylvite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("spodumene_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_spodumene_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("beryl_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_beryl_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("fluorite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_fluorite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("celestine_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_celestine_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("barite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_barite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("pollucite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_pollucite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("iodyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_iodyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("bromyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE))),
        new BlockEntry("deepslate_bromyrite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE))),
        new BlockEntry("ilmenite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_ilmenite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("quartz_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_quartz_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("kernite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_kernite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("chromite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_chromite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("pyrolusite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_pyrolusite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("columbite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_columbite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("tantalite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_tantalite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("zircon_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_zircon_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("vanadinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_vanadinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("wolframite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_wolframite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("molybdenite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_molybdenite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("rheniite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_rheniite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("apatite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_apatite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("xenotime_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_xenotime_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("bastnaesite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_bastnaesite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("monazite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_monazite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("thorite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_thorite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("uraninite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_uraninite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("lepidolite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_lepidolite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("sperrylite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_sperrylite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("iridosmine_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_iridosmine_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("laurite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_laurite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("hollingsworthite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_hollingsworthite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("stibiopalladinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_stibiopalladinite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("calaverite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_calaverite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("clausthalite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_clausthalite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("thortveitite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_thortveitite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("mythrilite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_mythrilite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("naquadite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_naquadite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("naquadriate_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_naquadriate_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("energite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_energite_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("eridium_vein_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE))),
        new BlockEntry("deepslate_eridium_vein_ore", () -> new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE))),
        new BlockEntry("pulverent_nylium", () -> new NetherrackBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM))),
        new BlockEntry("stripped_pulverent_log", () -> new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM))),
        new BlockEntry("stripped_pulverent_wood", () -> new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE))),
        new BlockEntry("pulverent_log", () -> new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM))),
        new BlockEntry("pulverent_wood", () -> new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE))),
        new BlockEntry("pulverent_planks", () -> new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS))),
        new BlockEntry("pulverent_stairs", () -> new StairsBlock(ModBlocks.get("pulverent_planks").getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS))),
        new BlockEntry("pulverent_slab", () -> new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS))),
        new BlockEntry("pulverent_button", () -> new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK, 10, true)),
        new BlockEntry("pulverent_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK)),
        new BlockEntry("pulverent_fence", () -> new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS))),
        new BlockEntry("pulverent_fence_gate", () -> new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), WoodType.OAK)),
        new BlockEntry("pulverent_door", () -> new DoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK)),
        new BlockEntry("pulverent_trapdoor", () -> new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.OAK))
    );

    private static final Map<String, Block> BLOCKS = new LinkedHashMap<>();
    private static final Map<String, Item> BLOCK_ITEMS = new LinkedHashMap<>();

    public static Block get(String name) {
        return BLOCKS.get(name);
    }

    public static Item getBlockItem(String name) {
        return BLOCK_ITEMS.get(name);
    }

    public static Collection<Block> getAll() {
        return Collections.unmodifiableCollection(BLOCKS.values());
    }

    public static Collection<Item> getAllBlockItems() {
        return Collections.unmodifiableCollection(BLOCK_ITEMS.values());
    }

    public static void registerModBlocks() {
        for (BlockEntry e : ENTRIES) {
            Block block = e.factory.get();
            Registry.register(Registries.BLOCK, new Identifier(PulderEssence.MOD_ID, e.name), block);
            BLOCKS.put(e.name, block);

            Item blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), blockItem);
            BLOCK_ITEMS.put(e.name, blockItem);
        }
    }

    private record BlockEntry(String name, Supplier<Block> factory) {}
}
