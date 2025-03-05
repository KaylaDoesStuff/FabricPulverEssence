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

    public static final ItemGroup ELEMENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "elements"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.elements"))
                    .icon(() -> new ItemStack(ModElements.HYDROGEN)).entries((displayContext, entries) -> {
                        entries.add(ModElements.HYDROGEN);
                        entries.add(ModElements.HELIUM);
                        entries.add(ModElements.LITHIUM);
                        entries.add(ModElements.BERYLLIUM);
                        entries.add(ModElements.BORON);
                        entries.add(ModElements.CARBON);
                        entries.add(ModElements.NITROGEN);
                        entries.add(ModElements.OXYGEN);
                        entries.add(ModElements.FLUORINE);
                        entries.add(ModElements.NEON);
                        entries.add(ModElements.SODIUM);
                        entries.add(ModElements.MAGNESIUM);
                        entries.add(ModElements.ALUMINUM);
                        entries.add(ModElements.SILICON);
                        entries.add(ModElements.PHOSPHOR);
                        entries.add(ModElements.SULFUR);
                        entries.add(ModElements.CHLORINE);
                        entries.add(ModElements.ARGON);
                        entries.add(ModElements.POTASSIUM);
                        entries.add(ModElements.CALCIUM);
                        entries.add(ModElements.SCANDIUM);
                        entries.add(ModElements.TITANIUM);
                        entries.add(ModElements.VANADIUM);
                        entries.add(ModElements.CHROMIUM);
                        entries.add(ModElements.MANGANESE);
                        entries.add(ModElements.IRON);
                        entries.add(ModElements.COBALT);
                        entries.add(ModElements.NICKEL);
                        entries.add(ModElements.COPPER);
                        entries.add(ModElements.ZINC);
                        entries.add(ModElements.GALLIUM);
                        entries.add(ModElements.GERMANIUM);
                        entries.add(ModElements.ARSENIC);
                        entries.add(ModElements.SELENIUM);
                        entries.add(ModElements.BROMINE);
                        entries.add(ModElements.KRYPTON);
                        entries.add(ModElements.RUBIDIUM);
                        entries.add(ModElements.STRONTIUM);
                        entries.add(ModElements.YTTRIUM);
                        entries.add(ModElements.ZIRCONIUM);
                        entries.add(ModElements.NIOBIUM);
                        entries.add(ModElements.MOLYBDENUM);
                        entries.add(ModElements.TECHNETIUM);
                        entries.add(ModElements.RUTHENIUM);
                        entries.add(ModElements.RHODIUM);
                        entries.add(ModElements.PALLADIUM);
                        entries.add(ModElements.SILVER);
                        entries.add(ModElements.CADMIUM);
                        entries.add(ModElements.INDIUM);
                        entries.add(ModElements.TIN);
                        entries.add(ModElements.ANTIMONY);
                        entries.add(ModElements.TELLURIUM);
                        entries.add(ModElements.IODINE);
                        entries.add(ModElements.XENON);
                        entries.add(ModElements.CAESIUM);
                        entries.add(ModElements.BARIUM);
                        entries.add(ModElements.LANTHANIUM);
                        entries.add(ModElements.CERIUM);
                        entries.add(ModElements.PRASEODYMIUM);
                        entries.add(ModElements.NEODYMIUM);
                        entries.add(ModElements.PROMETHIUM);
                        entries.add(ModElements.SAMARIUM);
                        entries.add(ModElements.EUROPIUM);
                        entries.add(ModElements.GADOLINIUM);
                        entries.add(ModElements.TERBIUM);
                        entries.add(ModElements.DYSPROSIUM);
                        entries.add(ModElements.HOLMIUM);
                        entries.add(ModElements.ERBIUM);
                        entries.add(ModElements.THULLIUM);
                        entries.add(ModElements.YTTERBIUM);
                        entries.add(ModElements.LUTETIUM);
                        entries.add(ModElements.HAFNIUM);
                        entries.add(ModElements.TANTALUM);
                        entries.add(ModElements.TUNGSTEN);
                        entries.add(ModElements.RHENIUM);
                        entries.add(ModElements.OSMIUM);
                        entries.add(ModElements.IRIDIUM);
                        entries.add(ModElements.PLATINUM);
                        entries.add(ModElements.GOLD);
                        entries.add(ModElements.MERCURY);
                        entries.add(ModElements.THALLIUM);
                        entries.add(ModElements.LEAD);
                        entries.add(ModElements.BISMUTH);
                        entries.add(ModElements.POLONIUM);
                        entries.add(ModElements.ASTATINE);
                        entries.add(ModElements.RADON);
                        entries.add(ModElements.FRANCIUM);
                        entries.add(ModElements.RADIUM);
                        entries.add(ModElements.ACTINIUM);
                        entries.add(ModElements.THORIUM);
                        entries.add(ModElements.PROTACTINIUM);
                        entries.add(ModElements.URANIUM);
                        entries.add(ModElements.NEPTUNIUM);
                        entries.add(ModElements.PLUTONIUM);
                        entries.add(ModElements.AMERICIUM);
                        entries.add(ModElements.CURIUM);
                        entries.add(ModElements.BERKELLIUM);
                        entries.add(ModElements.CALIFORNIUM);
                        entries.add(ModElements.EINSTEINIUM);
                        entries.add(ModElements.FERMIUM);
                        entries.add(ModElements.MENDELEVLUM);
                        entries.add(ModElements.NOBELIUM);
                        entries.add(ModElements.LAWRENCIUM);
                        entries.add(ModElements.RUTHERFORDIUM);
                        entries.add(ModElements.DUBNIUM);
                        entries.add(ModElements.SEABORGIUM);
                        entries.add(ModElements.BOHRIUM);
                        entries.add(ModElements.HASSIUM);
                        entries.add(ModElements.MEITNERIUM);
                        entries.add(ModElements.DARMSTADTIUM);
                        entries.add(ModElements.ROENTGENIUM);
                        entries.add(ModElements.COPERNICIUM);
                        entries.add(ModElements.NIHONIUM);
                        entries.add(ModElements.FLEVORIUM);
                        entries.add(ModElements.MOSCOVIUM);
                        entries.add(ModElements.LIVERMORIUM);
                        entries.add(ModElements.TENNESSINE);
                        entries.add(ModElements.OGANESSON);
                    }).build());

    public static void registerItemGroups() {}
}
