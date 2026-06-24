package kayla.pulderessence.datagen;

import kayla.pulderessence.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.get("mythril_block"), ModBlocks.get("yttrium_block"), ModBlocks.get("silver_block"), ModBlocks.get("lead_block"), ModBlocks.get("indium_block"), ModBlocks.get("tungsten_block"), ModBlocks.get("energium_block"))
                // SMELTABLE 0-9
                .add(ModBlocks.get("hematite_ore"), ModBlocks.get("deepslate_hematite_ore"), ModBlocks.get("magnetite_ore"), ModBlocks.get("deepslate_magnetite_ore"), ModBlocks.get("chalcopyrite_ore"), ModBlocks.get("deepslate_chalcopyrite_ore"), ModBlocks.get("sphalerite_ore"), ModBlocks.get("deepslate_sphalerite_ore"), ModBlocks.get("cassiterite_ore"), ModBlocks.get("deepslate_cassiterite_ore"))
                .add(ModBlocks.get("anthracite_ore"), ModBlocks.get("deepslate_anthracite_ore"), ModBlocks.get("pentlandite_ore"), ModBlocks.get("deepslate_pentlandite_ore"), ModBlocks.get("galena_ore"), ModBlocks.get("deepslate_galena_ore"), ModBlocks.get("cobaltite_ore"), ModBlocks.get("deepslate_cobaltite_ore"), ModBlocks.get("stibnite_ore"), ModBlocks.get("deepslate_stibnite_ore"))
                // ULV 10-14 + MLV 15-19
                .add(ModBlocks.get("native_gold_ore"), ModBlocks.get("deepslate_native_gold_ore"), ModBlocks.get("argentite_ore"), ModBlocks.get("deepslate_argentite_ore"), ModBlocks.get("bismuthinite_ore"), ModBlocks.get("deepslate_bismuthinite_ore"), ModBlocks.get("cinnabar_ore"), ModBlocks.get("deepslate_cinnabar_ore"), ModBlocks.get("nitratite_ore"), ModBlocks.get("deepslate_nitratite_ore"))
                .add(ModBlocks.get("bauxite_ore"), ModBlocks.get("deepslate_bauxite_ore"), ModBlocks.get("magnesite_ore"), ModBlocks.get("deepslate_magnesite_ore"), ModBlocks.get("dolomite_ore"), ModBlocks.get("deepslate_dolomite_ore"), ModBlocks.get("halite_ore"), ModBlocks.get("deepslate_halite_ore"), ModBlocks.get("sylvite_ore"), ModBlocks.get("deepslate_sylvite_ore"))
                // MLV 20-27 + LV 28-29
                .add(ModBlocks.get("spodumene_ore"), ModBlocks.get("deepslate_spodumene_ore"), ModBlocks.get("beryl_ore"), ModBlocks.get("deepslate_beryl_ore"), ModBlocks.get("fluorite_ore"), ModBlocks.get("deepslate_fluorite_ore"), ModBlocks.get("celestine_ore"), ModBlocks.get("deepslate_celestine_ore"), ModBlocks.get("barite_ore"), ModBlocks.get("deepslate_barite_ore"))
                .add(ModBlocks.get("pollucite_ore"), ModBlocks.get("deepslate_pollucite_ore"), ModBlocks.get("iodyrite_ore"), ModBlocks.get("deepslate_iodyrite_ore"), ModBlocks.get("bromyrite_ore"), ModBlocks.get("deepslate_bromyrite_ore"), ModBlocks.get("ilmenite_ore"), ModBlocks.get("deepslate_ilmenite_ore"), ModBlocks.get("quartz_ore"), ModBlocks.get("deepslate_quartz_ore"))
                // LV/LLV 30-39
                .add(ModBlocks.get("kernite_ore"), ModBlocks.get("deepslate_kernite_ore"), ModBlocks.get("chromite_ore"), ModBlocks.get("deepslate_chromite_ore"), ModBlocks.get("pyrolusite_ore"), ModBlocks.get("deepslate_pyrolusite_ore"), ModBlocks.get("columbite_ore"), ModBlocks.get("deepslate_columbite_ore"), ModBlocks.get("tantalite_ore"), ModBlocks.get("deepslate_tantalite_ore"))
                .add(ModBlocks.get("zircon_ore"), ModBlocks.get("deepslate_zircon_ore"), ModBlocks.get("vanadinite_ore"), ModBlocks.get("deepslate_vanadinite_ore"), ModBlocks.get("wolframite_ore"), ModBlocks.get("deepslate_wolframite_ore"), ModBlocks.get("molybdenite_ore"), ModBlocks.get("deepslate_molybdenite_ore"), ModBlocks.get("rheniite_ore"), ModBlocks.get("deepslate_rheniite_ore"))
                // MV/HV 40-49
                .add(ModBlocks.get("apatite_ore"), ModBlocks.get("deepslate_apatite_ore"), ModBlocks.get("xenotime_ore"), ModBlocks.get("deepslate_xenotime_ore"), ModBlocks.get("bastnaesite_ore"), ModBlocks.get("deepslate_bastnaesite_ore"), ModBlocks.get("monazite_ore"), ModBlocks.get("deepslate_monazite_ore"), ModBlocks.get("thorite_ore"), ModBlocks.get("deepslate_thorite_ore"))
                .add(ModBlocks.get("uraninite_ore"), ModBlocks.get("deepslate_uraninite_ore"), ModBlocks.get("lepidolite_ore"), ModBlocks.get("deepslate_lepidolite_ore"), ModBlocks.get("sperrylite_ore"), ModBlocks.get("deepslate_sperrylite_ore"), ModBlocks.get("iridosmine_ore"), ModBlocks.get("deepslate_iridosmine_ore"), ModBlocks.get("laurite_ore"), ModBlocks.get("deepslate_laurite_ore"))
                // SHV/UHV/VHV 50-59
                .add(ModBlocks.get("hollingsworthite_ore"), ModBlocks.get("deepslate_hollingsworthite_ore"), ModBlocks.get("stibiopalladinite_ore"), ModBlocks.get("deepslate_stibiopalladinite_ore"), ModBlocks.get("calaverite_ore"), ModBlocks.get("deepslate_calaverite_ore"), ModBlocks.get("clausthalite_ore"), ModBlocks.get("deepslate_clausthalite_ore"), ModBlocks.get("thortveitite_ore"), ModBlocks.get("deepslate_thortveitite_ore"))
                .add(ModBlocks.get("mythrilite_ore"), ModBlocks.get("deepslate_mythrilite_ore"), ModBlocks.get("naquadite_ore"), ModBlocks.get("deepslate_naquadite_ore"), ModBlocks.get("naquadriate_ore"), ModBlocks.get("deepslate_naquadriate_ore"), ModBlocks.get("energite_ore"), ModBlocks.get("deepslate_energite_ore"), ModBlocks.get("eridium_vein_ore"), ModBlocks.get("deepslate_eridium_vein_ore"))
                .add(ModBlocks.get("pulverent_nylium"));

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.get("pulverent_log"))
                .add(ModBlocks.get("stripped_pulverent_log"));

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.get("mythril_block"), ModBlocks.get("yttrium_block"), ModBlocks.get("silver_block"), ModBlocks.get("lead_block"), ModBlocks.get("indium_block"), ModBlocks.get("tungsten_block"), ModBlocks.get("energium_block"))
                // Groups 1-3 (indices 0-29)
                .add(ModBlocks.get("hematite_ore"), ModBlocks.get("deepslate_hematite_ore"), ModBlocks.get("magnetite_ore"), ModBlocks.get("deepslate_magnetite_ore"), ModBlocks.get("chalcopyrite_ore"), ModBlocks.get("deepslate_chalcopyrite_ore"), ModBlocks.get("sphalerite_ore"), ModBlocks.get("deepslate_sphalerite_ore"), ModBlocks.get("cassiterite_ore"), ModBlocks.get("deepslate_cassiterite_ore"))
                .add(ModBlocks.get("anthracite_ore"), ModBlocks.get("deepslate_anthracite_ore"), ModBlocks.get("pentlandite_ore"), ModBlocks.get("deepslate_pentlandite_ore"), ModBlocks.get("galena_ore"), ModBlocks.get("deepslate_galena_ore"), ModBlocks.get("cobaltite_ore"), ModBlocks.get("deepslate_cobaltite_ore"), ModBlocks.get("stibnite_ore"), ModBlocks.get("deepslate_stibnite_ore"))
                .add(ModBlocks.get("native_gold_ore"), ModBlocks.get("deepslate_native_gold_ore"), ModBlocks.get("argentite_ore"), ModBlocks.get("deepslate_argentite_ore"), ModBlocks.get("bismuthinite_ore"), ModBlocks.get("deepslate_bismuthinite_ore"), ModBlocks.get("cinnabar_ore"), ModBlocks.get("deepslate_cinnabar_ore"), ModBlocks.get("nitratite_ore"), ModBlocks.get("deepslate_nitratite_ore"))
                .add(ModBlocks.get("bauxite_ore"), ModBlocks.get("deepslate_bauxite_ore"), ModBlocks.get("magnesite_ore"), ModBlocks.get("deepslate_magnesite_ore"), ModBlocks.get("dolomite_ore"), ModBlocks.get("deepslate_dolomite_ore"), ModBlocks.get("halite_ore"), ModBlocks.get("deepslate_halite_ore"), ModBlocks.get("sylvite_ore"), ModBlocks.get("deepslate_sylvite_ore"))
                .add(ModBlocks.get("spodumene_ore"), ModBlocks.get("deepslate_spodumene_ore"), ModBlocks.get("beryl_ore"), ModBlocks.get("deepslate_beryl_ore"), ModBlocks.get("fluorite_ore"), ModBlocks.get("deepslate_fluorite_ore"), ModBlocks.get("celestine_ore"), ModBlocks.get("deepslate_celestine_ore"), ModBlocks.get("barite_ore"), ModBlocks.get("deepslate_barite_ore"))
                .add(ModBlocks.get("pollucite_ore"), ModBlocks.get("deepslate_pollucite_ore"), ModBlocks.get("iodyrite_ore"), ModBlocks.get("deepslate_iodyrite_ore"), ModBlocks.get("bromyrite_ore"), ModBlocks.get("deepslate_bromyrite_ore"), ModBlocks.get("ilmenite_ore"), ModBlocks.get("deepslate_ilmenite_ore"), ModBlocks.get("quartz_ore"), ModBlocks.get("deepslate_quartz_ore"));

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                // Group 4 (indices 30-39)
                .add(ModBlocks.get("kernite_ore"), ModBlocks.get("deepslate_kernite_ore"), ModBlocks.get("chromite_ore"), ModBlocks.get("deepslate_chromite_ore"), ModBlocks.get("pyrolusite_ore"), ModBlocks.get("deepslate_pyrolusite_ore"), ModBlocks.get("columbite_ore"), ModBlocks.get("deepslate_columbite_ore"), ModBlocks.get("tantalite_ore"), ModBlocks.get("deepslate_tantalite_ore"))
                .add(ModBlocks.get("zircon_ore"), ModBlocks.get("deepslate_zircon_ore"), ModBlocks.get("vanadinite_ore"), ModBlocks.get("deepslate_vanadinite_ore"), ModBlocks.get("wolframite_ore"), ModBlocks.get("deepslate_wolframite_ore"), ModBlocks.get("molybdenite_ore"), ModBlocks.get("deepslate_molybdenite_ore"), ModBlocks.get("rheniite_ore"), ModBlocks.get("deepslate_rheniite_ore"));

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                // Group 5 (indices 40-49)
                .add(ModBlocks.get("apatite_ore"), ModBlocks.get("deepslate_apatite_ore"), ModBlocks.get("xenotime_ore"), ModBlocks.get("deepslate_xenotime_ore"), ModBlocks.get("bastnaesite_ore"), ModBlocks.get("deepslate_bastnaesite_ore"), ModBlocks.get("monazite_ore"), ModBlocks.get("deepslate_monazite_ore"), ModBlocks.get("thorite_ore"), ModBlocks.get("deepslate_thorite_ore"))
                .add(ModBlocks.get("uraninite_ore"), ModBlocks.get("deepslate_uraninite_ore"), ModBlocks.get("lepidolite_ore"), ModBlocks.get("deepslate_lepidolite_ore"), ModBlocks.get("sperrylite_ore"), ModBlocks.get("deepslate_sperrylite_ore"), ModBlocks.get("iridosmine_ore"), ModBlocks.get("deepslate_iridosmine_ore"), ModBlocks.get("laurite_ore"), ModBlocks.get("deepslate_laurite_ore"));

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")))
                // Group 6 (indices 50-59)
                .add(ModBlocks.get("hollingsworthite_ore"), ModBlocks.get("deepslate_hollingsworthite_ore"), ModBlocks.get("stibiopalladinite_ore"), ModBlocks.get("deepslate_stibiopalladinite_ore"), ModBlocks.get("calaverite_ore"), ModBlocks.get("deepslate_calaverite_ore"), ModBlocks.get("clausthalite_ore"), ModBlocks.get("deepslate_clausthalite_ore"), ModBlocks.get("thortveitite_ore"), ModBlocks.get("deepslate_thortveitite_ore"))
                .add(ModBlocks.get("mythrilite_ore"), ModBlocks.get("deepslate_mythrilite_ore"), ModBlocks.get("naquadite_ore"), ModBlocks.get("deepslate_naquadite_ore"), ModBlocks.get("naquadriate_ore"), ModBlocks.get("deepslate_naquadriate_ore"), ModBlocks.get("energite_ore"), ModBlocks.get("deepslate_energite_ore"), ModBlocks.get("eridium_vein_ore"), ModBlocks.get("deepslate_eridium_vein_ore"));

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.get("pulverent_fence"));

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.get("pulverent_fence_gate"));
    }
}
