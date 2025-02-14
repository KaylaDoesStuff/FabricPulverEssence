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
                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_HOE);
                        entries.add(ModItems.MYTHRIL_NUGGET);
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModItems.MYTHRIL_ROD);
                        entries.add(ModItems.CHARGED_MYTHRIL_ROD);

                        entries.add(ModItems.FAERIE_DUST);
                        entries.add(ModItems.FAERIE_ROD);
                        entries.add(ModItems.CHARGED_FAERIE_ROD);

                        entries.add(ModItems.INDIUM_NUGGET);
                        entries.add(ModItems.INDIUM_INGOT);
                        entries.add(ModItems.RAW_INDIUM);
                        entries.add(ModItems.INDIUM_ROD);
                        entries.add(ModItems.CHARGED_INDIUM_ROD);
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

                        entries.add(ModBlocks.PULVERENT_NYLIUM);
                        entries.add(ModBlocks.PULVERENT_LOG);
                        entries.add(ModBlocks.PULVERENT_PLANKS);
                        entries.add(ModBlocks.PULVERENT_STAIRS);
                        entries.add(ModBlocks.PULVERENT_SLAB);
                        entries.add(ModBlocks.PULVERENT_FENCE);
                        entries.add(ModBlocks.PULVERENT_WALL);
                        entries.add(ModBlocks.PULVERENT_FENCE_GATE);
                        entries.add(ModBlocks.PULVERENT_BUTTON);
                        entries.add(ModBlocks.PULVERENT_PRESSURE_PLATE);
                        entries.add(ModBlocks.PULVERENT_DOOR);
                        entries.add(ModBlocks.PULVERENT_TRAPDOOR);
                        entries.add(ModBlocks.PULVERENT_WOOD);
                        entries.add(ModBlocks.STRIPPED_PULVERENT_LOG);
                        entries.add(ModBlocks.STRIPPED_PULVERENT_WOOD);
                    }).build());

    public static final ItemGroup MACHINE_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "machines"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.machines"))
                    .icon(() -> new ItemStack(ModBlocks.CHARGING_STATION)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHARGING_STATION);
                    }).build());


    public static void registerItemGroups() {}
}
