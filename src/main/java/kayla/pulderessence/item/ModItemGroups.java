package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PULVERENT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.items"))
                    .icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.MYTHRIL_DUST);
                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_HOE);
                        entries.add(ModItems.MYTHRIL_NUGGET);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModItems.MYTHRIL_ROD);
                        entries.add(ModItems.CHARGED_MYTHRIL_ROD);

                        entries.add(ModItems.INDIUM_NUGGET);
                        entries.add(ModItems.INDIUM_INGOT);
                        entries.add(ModItems.INDIUM_DUST);
                        entries.add(ModItems.RAW_INDIUM);
                        entries.add(ModItems.INDIUM_ROD);
                        entries.add(ModItems.CHARGED_INDIUM_ROD);

                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_DUST);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_ROD);
                        entries.add(ModItems.CHARGED_LEAD_ROD);

                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_DUST);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_ROD);
                        entries.add(ModItems.CHARGED_SILVER_ROD);

                        entries.add(ModItems.YTTRIUM_NUGGET);
                        entries.add(ModItems.YTTRIUM_INGOT);
                        entries.add(ModItems.YTTRIUM_DUST);
                        entries.add(ModItems.RAW_YTTRIUM);
                        entries.add(ModItems.YTTRIUM_ROD);
                        entries.add(ModItems.CHARGED_YTTRIUM_ROD);

                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_DUST);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_ROD);
                        entries.add(ModItems.CHARGED_TUNGSTEN_ROD);

                        entries.add(ModItems.ENERGIUM_SHARD);
                        entries.add(ModItems.ENERGIUM_DUST);
                        entries.add(ModItems.RAW_ENERGIUM);
                        entries.add(ModItems.ENERGIUM_ROD);
                        entries.add(ModItems.CHARGED_ENERGIUM_ROD);

                        entries.add(ModItems.SILICON_INGOT);
                        entries.add(ModItems.SILICON_BOULE);

                        entries.add(ModItems.FAERIE_DUST);
                        entries.add(ModItems.FAERIE_ROD);
                        entries.add(ModItems.CHARGED_FAERIE_ROD);

                        entries.add(ModItems.IRON_ROD);
                        entries.add(ModItems.IRON_DUST);
                        entries.add(ModItems.CHARGED_IRON_ROD);

                        entries.add(ModItems.GOLD_ROD);
                        entries.add(ModItems.GOLD_DUST);
                        entries.add(ModItems.CHARGED_GOLD_ROD);
                    }).build());

    public static final ItemGroup PULVERENT_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "blocks"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.PULVERENT_NYLIUM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.RAW_MYTHRIL_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);

                        entries.add(ModBlocks.INDIUM_BLOCK);
                        entries.add(ModBlocks.RAW_INDIUM_BLOCK);
                        entries.add(ModBlocks.INDIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_INDIUM_ORE);

                        entries.add(ModBlocks.YTTRIUM_BLOCK);
                        entries.add(ModBlocks.RAW_YTTRIUM_BLOCK);
                        entries.add(ModBlocks.YTTRIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_YTTRIUM_ORE);

                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);

                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);

                        entries.add(ModBlocks.ENERGIUM_BLOCK);
                        entries.add(ModBlocks.RAW_ENERGIUM_BLOCK);
                        entries.add(ModBlocks.ENERGIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ENERGIUM_ORE);

                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.RAW_TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

                        entries.add(ModBlocks.PULVERENT_NYLIUM);
                        entries.add(ModBlocks.PULVERENT_LOG);
                        entries.add(ModBlocks.PULVERENT_PLANKS);
                        entries.add(ModBlocks.PULVERENT_STAIRS);
                        entries.add(ModBlocks.PULVERENT_SLAB);
                        entries.add(ModBlocks.PULVERENT_FENCE);
                        entries.add(ModBlocks.PULVERENT_FENCE_GATE);
                        entries.add(ModBlocks.PULVERENT_BUTTON);
                        entries.add(ModBlocks.PULVERENT_PRESSURE_PLATE);
                        entries.add(ModBlocks.PULVERENT_DOOR);
                        entries.add(ModBlocks.PULVERENT_TRAPDOOR);
                        entries.add(ModBlocks.PULVERENT_WOOD);
                        entries.add(ModBlocks.STRIPPED_PULVERENT_LOG);
                        entries.add(ModBlocks.STRIPPED_PULVERENT_WOOD);
                    }).build());

    /*public static final ItemGroup MACHINE_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "machines"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.machines"))
                    .icon(() -> new ItemStack(ModBlocks.CHARGING_STATION)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHARGING_STATION);
                    }).build());
    */

    public static void registerItemGroups() {}
}
