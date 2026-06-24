package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.ModOres;
import kayla.pulderessence.item.ModWires;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Metal storage blocks
        addDrop(ModBlocks.get("mythril_block"));
        addDrop(ModBlocks.get("yttrium_block"));
        addDrop(ModBlocks.get("silver_block"));
        addDrop(ModBlocks.get("lead_block"));
        addDrop(ModBlocks.get("indium_block"));
        addDrop(ModBlocks.get("tungsten_block"));
        addDrop(ModBlocks.get("energium_block"));

        // Smeltable ores (HEMATITE through STIBNITE) — simple drops
        addDrop(ModBlocks.get("hematite_ore"), ModOres.get("hematite"));
        addDrop(ModBlocks.get("deepslate_hematite_ore"), ModOres.get("hematite"));
        addDrop(ModBlocks.get("magnetite_ore"), ModOres.get("magnetite"));
        addDrop(ModBlocks.get("deepslate_magnetite_ore"), ModOres.get("magnetite"));
        addDrop(ModBlocks.get("chalcopyrite_ore"), ModOres.get("chalcopyrite"));
        addDrop(ModBlocks.get("deepslate_chalcopyrite_ore"), ModOres.get("chalcopyrite"));
        addDrop(ModBlocks.get("sphalerite_ore"), ModOres.get("sphalerite"));
        addDrop(ModBlocks.get("deepslate_sphalerite_ore"), ModOres.get("sphalerite"));
        addDrop(ModBlocks.get("cassiterite_ore"), ModOres.get("cassiterite"));
        addDrop(ModBlocks.get("deepslate_cassiterite_ore"), ModOres.get("cassiterite"));
        addDrop(ModBlocks.get("anthracite_ore"), ModOres.get("anthracite"));
        addDrop(ModBlocks.get("deepslate_anthracite_ore"), ModOres.get("anthracite"));
        addDrop(ModBlocks.get("pentlandite_ore"), ModOres.get("pentlandite"));
        addDrop(ModBlocks.get("deepslate_pentlandite_ore"), ModOres.get("pentlandite"));
        addDrop(ModBlocks.get("galena_ore"), ModOres.get("galena"));
        addDrop(ModBlocks.get("deepslate_galena_ore"), ModOres.get("galena"));
        addDrop(ModBlocks.get("cobaltite_ore"), ModOres.get("cobaltite"));
        addDrop(ModBlocks.get("deepslate_cobaltite_ore"), ModOres.get("cobaltite"));
        addDrop(ModBlocks.get("stibnite_ore"), ModOres.get("stibnite"));
        addDrop(ModBlocks.get("deepslate_stibnite_ore"), ModOres.get("stibnite"));

        // ULV ores
        addDrop(ModBlocks.get("native_gold_ore"), ModOres.get("native_gold"));
        addDrop(ModBlocks.get("deepslate_native_gold_ore"), ModOres.get("native_gold"));
        addDrop(ModBlocks.get("argentite_ore"), ModOres.get("argentite"));
        addDrop(ModBlocks.get("deepslate_argentite_ore"), ModOres.get("argentite"));
        addDrop(ModBlocks.get("bismuthinite_ore"), ModOres.get("bismuthinite"));
        addDrop(ModBlocks.get("deepslate_bismuthinite_ore"), ModOres.get("bismuthinite"));
        addDrop(ModBlocks.get("cinnabar_ore"), ModOres.get("cinnabar"));
        addDrop(ModBlocks.get("deepslate_cinnabar_ore"), ModOres.get("cinnabar"));
        addDrop(ModBlocks.get("nitratite_ore"), ModOres.get("nitratite"));
        addDrop(ModBlocks.get("deepslate_nitratite_ore"), ModOres.get("nitratite"));

        // MLV ores
        addDrop(ModBlocks.get("bauxite_ore"), ModOres.get("bauxite"));
        addDrop(ModBlocks.get("deepslate_bauxite_ore"), ModOres.get("bauxite"));
        addDrop(ModBlocks.get("magnesite_ore"), ModOres.get("magnesite"));
        addDrop(ModBlocks.get("deepslate_magnesite_ore"), ModOres.get("magnesite"));
        addDrop(ModBlocks.get("dolomite_ore"), ModOres.get("dolomite"));
        addDrop(ModBlocks.get("deepslate_dolomite_ore"), ModOres.get("dolomite"));
        addDrop(ModBlocks.get("halite_ore"), ModOres.get("halite"));
        addDrop(ModBlocks.get("deepslate_halite_ore"), ModOres.get("halite"));
        addDrop(ModBlocks.get("sylvite_ore"), ModOres.get("sylvite"));
        addDrop(ModBlocks.get("deepslate_sylvite_ore"), ModOres.get("sylvite"));
        addDrop(ModBlocks.get("spodumene_ore"), ModOres.get("spodumene"));
        addDrop(ModBlocks.get("deepslate_spodumene_ore"), ModOres.get("spodumene"));
        addDrop(ModBlocks.get("beryl_ore"), ModOres.get("beryl"));
        addDrop(ModBlocks.get("deepslate_beryl_ore"), ModOres.get("beryl"));
        addDrop(ModBlocks.get("fluorite_ore"), ModOres.get("fluorite"));
        addDrop(ModBlocks.get("deepslate_fluorite_ore"), ModOres.get("fluorite"));
        addDrop(ModBlocks.get("celestine_ore"), ModOres.get("celestine"));
        addDrop(ModBlocks.get("deepslate_celestine_ore"), ModOres.get("celestine"));
        addDrop(ModBlocks.get("barite_ore"), ModOres.get("barite"));
        addDrop(ModBlocks.get("deepslate_barite_ore"), ModOres.get("barite"));
        addDrop(ModBlocks.get("pollucite_ore"), ModOres.get("pollucite"));
        addDrop(ModBlocks.get("deepslate_pollucite_ore"), ModOres.get("pollucite"));
        addDrop(ModBlocks.get("iodyrite_ore"), ModOres.get("iodyrite"));
        addDrop(ModBlocks.get("deepslate_iodyrite_ore"), ModOres.get("iodyrite"));
        addDrop(ModBlocks.get("bromyrite_ore"), ModOres.get("bromyrite"));
        addDrop(ModBlocks.get("deepslate_bromyrite_ore"), ModOres.get("bromyrite"));

        // LV ores
        addDrop(ModBlocks.get("ilmenite_ore"), ModOres.get("ilmenite"));
        addDrop(ModBlocks.get("deepslate_ilmenite_ore"), ModOres.get("ilmenite"));
        addDrop(ModBlocks.get("quartz_ore"), ModOres.get("quartz"));
        addDrop(ModBlocks.get("deepslate_quartz_ore"), ModOres.get("quartz"));
        addDrop(ModBlocks.get("kernite_ore"), ModOres.get("kernite"));
        addDrop(ModBlocks.get("deepslate_kernite_ore"), ModOres.get("kernite"));

        // LLV ores
        addDrop(ModBlocks.get("chromite_ore"), ModOres.get("chromite"));
        addDrop(ModBlocks.get("deepslate_chromite_ore"), ModOres.get("chromite"));
        addDrop(ModBlocks.get("pyrolusite_ore"), ModOres.get("pyrolusite"));
        addDrop(ModBlocks.get("deepslate_pyrolusite_ore"), ModOres.get("pyrolusite"));
        addDrop(ModBlocks.get("columbite_ore"), ModOres.get("columbite"));
        addDrop(ModBlocks.get("deepslate_columbite_ore"), ModOres.get("columbite"));
        addDrop(ModBlocks.get("tantalite_ore"), ModOres.get("tantalite"));
        addDrop(ModBlocks.get("deepslate_tantalite_ore"), ModOres.get("tantalite"));
        addDrop(ModBlocks.get("zircon_ore"), ModOres.get("zircon"));
        addDrop(ModBlocks.get("deepslate_zircon_ore"), ModOres.get("zircon"));
        addDrop(ModBlocks.get("vanadinite_ore"), ModOres.get("vanadinite"));
        addDrop(ModBlocks.get("deepslate_vanadinite_ore"), ModOres.get("vanadinite"));

        // MV ores
        addDrop(ModBlocks.get("wolframite_ore"), ModOres.get("wolframite"));
        addDrop(ModBlocks.get("deepslate_wolframite_ore"), ModOres.get("wolframite"));
        addDrop(ModBlocks.get("molybdenite_ore"), ModOres.get("molybdenite"));
        addDrop(ModBlocks.get("deepslate_molybdenite_ore"), ModOres.get("molybdenite"));
        addDrop(ModBlocks.get("rheniite_ore"), ModOres.get("rheniite"));
        addDrop(ModBlocks.get("deepslate_rheniite_ore"), ModOres.get("rheniite"));
        addDrop(ModBlocks.get("apatite_ore"), ModOres.get("apatite"));
        addDrop(ModBlocks.get("deepslate_apatite_ore"), ModOres.get("apatite"));
        addDrop(ModBlocks.get("xenotime_ore"), ModOres.get("xenotime"));
        addDrop(ModBlocks.get("deepslate_xenotime_ore"), ModOres.get("xenotime"));
        addDrop(ModBlocks.get("bastnaesite_ore"), ModOres.get("bastnaesite"));
        addDrop(ModBlocks.get("deepslate_bastnaesite_ore"), ModOres.get("bastnaesite"));
        addDrop(ModBlocks.get("monazite_ore"), ModOres.get("monazite"));
        addDrop(ModBlocks.get("deepslate_monazite_ore"), ModOres.get("monazite"));
        addDrop(ModBlocks.get("thorite_ore"), ModOres.get("thorite"));
        addDrop(ModBlocks.get("deepslate_thorite_ore"), ModOres.get("thorite"));
        addDrop(ModBlocks.get("uraninite_ore"), ModOres.get("uraninite"));
        addDrop(ModBlocks.get("deepslate_uraninite_ore"), ModOres.get("uraninite"));
        addDrop(ModBlocks.get("lepidolite_ore"), ModOres.get("lepidolite"));
        addDrop(ModBlocks.get("deepslate_lepidolite_ore"), ModOres.get("lepidolite"));

        // HV ores
        addDrop(ModBlocks.get("sperrylite_ore"), ModOres.get("sperrylite"));
        addDrop(ModBlocks.get("deepslate_sperrylite_ore"), ModOres.get("sperrylite"));
        addDrop(ModBlocks.get("iridosmine_ore"), ModOres.get("iridosmine"));
        addDrop(ModBlocks.get("deepslate_iridosmine_ore"), ModOres.get("iridosmine"));
        addDrop(ModBlocks.get("laurite_ore"), ModOres.get("laurite"));
        addDrop(ModBlocks.get("deepslate_laurite_ore"), ModOres.get("laurite"));
        addDrop(ModBlocks.get("hollingsworthite_ore"), ModOres.get("hollingsworthite"));
        addDrop(ModBlocks.get("deepslate_hollingsworthite_ore"), ModOres.get("hollingsworthite"));
        addDrop(ModBlocks.get("stibiopalladinite_ore"), ModOres.get("stibiopalladinite"));
        addDrop(ModBlocks.get("deepslate_stibiopalladinite_ore"), ModOres.get("stibiopalladinite"));
        addDrop(ModBlocks.get("calaverite_ore"), ModOres.get("calaverite"));
        addDrop(ModBlocks.get("deepslate_calaverite_ore"), ModOres.get("calaverite"));
        addDrop(ModBlocks.get("clausthalite_ore"), ModOres.get("clausthalite"));
        addDrop(ModBlocks.get("deepslate_clausthalite_ore"), ModOres.get("clausthalite"));
        addDrop(ModBlocks.get("thortveitite_ore"), ModOres.get("thortveitite"));
        addDrop(ModBlocks.get("deepslate_thortveitite_ore"), ModOres.get("thortveitite"));

        // UHV ores
        addDrop(ModBlocks.get("naquadriate_ore"), ModOres.get("naquadriate"));
        addDrop(ModBlocks.get("deepslate_naquadriate_ore"), ModOres.get("naquadriate"));
        addDrop(ModBlocks.get("energite_ore"), ModOres.get("energite"));
        addDrop(ModBlocks.get("deepslate_energite_ore"), ModOres.get("energite"));

        // VHV ores
        addDrop(ModBlocks.get("eridium_vein_ore"), ModOres.get("eridium_vein"));
        addDrop(ModBlocks.get("deepslate_eridium_vein_ore"), ModOres.get("eridium_vein"));

        // Mythrilite and Naquadite — copper-like drops with fortune
        addDrop(ModBlocks.get("mythrilite_ore"), copperLikeOreDrops(ModBlocks.get("mythrilite_ore"), ModOres.get("mythrilite"), 2.0F, 5.0F));
        addDrop(ModBlocks.get("deepslate_mythrilite_ore"), copperLikeOreDrops(ModBlocks.get("deepslate_mythrilite_ore"), ModOres.get("mythrilite"), 3.0F, 7.0F));
        addDrop(ModBlocks.get("naquadite_ore"), copperLikeOreDrops(ModBlocks.get("naquadite_ore"), ModOres.get("naquadite"), 2.0F, 5.0F));
        addDrop(ModBlocks.get("deepslate_naquadite_ore"), copperLikeOreDrops(ModBlocks.get("deepslate_naquadite_ore"), ModOres.get("naquadite"), 3.0F, 7.0F));

        // Pulverent blocks
        addDrop(ModBlocks.get("pulverent_nylium"));
        addDrop(ModBlocks.get("stripped_pulverent_log"));
        addDrop(ModBlocks.get("stripped_pulverent_wood"));
        addDrop(ModBlocks.get("pulverent_log"));
        addDrop(ModBlocks.get("pulverent_wood"));
        addDrop(ModBlocks.get("pulverent_planks"));
        addDrop(ModBlocks.get("pulverent_button"));
        addDrop(ModBlocks.get("pulverent_pressure_plate"));
        addDrop(ModBlocks.get("pulverent_stairs"));
        addDrop(ModBlocks.get("pulverent_fence"));
        addDrop(ModBlocks.get("pulverent_fence_gate"));
        addDrop(ModBlocks.get("pulverent_trapdoor"));
        addDrop(ModBlocks.get("pulverent_door"), doorDrops(ModBlocks.get("pulverent_door")));
        addDrop(ModBlocks.get("pulverent_slab"), slabDrops(ModBlocks.get("pulverent_slab")));

        // Cable block drops
        ModWires.getAllCableBlocks().forEach(block ->
            addDrop(block));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item, Float minimum, Float maximum) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(minimum, maximum))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
