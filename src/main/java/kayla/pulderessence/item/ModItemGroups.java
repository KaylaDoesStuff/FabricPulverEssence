package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PULVERENT_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.items"))
                    .icon(() -> new ItemStack(IngotItem.MYTHRIL_INGOT)).entries((displayContext, entries) -> {
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
                        entries.add(ModItems.INDIUM_DUST);
                        entries.add(ModItems.RAW_INDIUM);
                        entries.add(ModItems.INDIUM_ROD);
                        entries.add(ModItems.CHARGED_INDIUM_ROD);

                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModItems.LEAD_DUST);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_ROD);
                        entries.add(ModItems.CHARGED_LEAD_ROD);

                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModItems.SILVER_DUST);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_ROD);
                        entries.add(ModItems.CHARGED_SILVER_ROD);

                        entries.add(ModItems.YTTRIUM_NUGGET);
                        entries.add(ModItems.YTTRIUM_DUST);
                        entries.add(ModItems.RAW_YTTRIUM);
                        entries.add(ModItems.YTTRIUM_ROD);
                        entries.add(ModItems.CHARGED_YTTRIUM_ROD);

                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.TUNGSTEN_DUST);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_ROD);
                        entries.add(ModItems.CHARGED_TUNGSTEN_ROD);

                        entries.add(ModItems.ENERGIUM_SHARD);
                        entries.add(ModItems.ENERGIUM_DUST);
                        entries.add(ModItems.RAW_ENERGIUM);
                        entries.add(ModItems.ENERGIUM_ROD);
                        entries.add(ModItems.CHARGED_ENERGIUM_ROD);

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

    public static final ItemGroup INGOTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PulderEssence.MOD_ID, "ingots"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("group.ingots"))
                    .icon(() -> new ItemStack(IngotItem.IRON_INGOT)).entries((displayContext, entries) -> {
                        // INGOTS BY ATOMIC NUMBER ORDER (1-118, solid metals only + fictional)
                        entries.add(IngotItem.LITHIUM_INGOT);      // 3: Li
                        entries.add(IngotItem.BERYLLIUM_INGOT);    // 4: Be
                        entries.add(IngotItem.SODIUM_INGOT);       // 11: Na
                        entries.add(IngotItem.MAGNESIUM_INGOT);    // 12: Mg
                        entries.add(IngotItem.CALCIUM_INGOT);      // 20: Ca
                        entries.add(IngotItem.SCANDIUM_INGOT);     // 21: Sc
                        entries.add(IngotItem.TITANIUM_INGOT);     // 22: Ti
                        entries.add(IngotItem.VANADIUM_INGOT);     // 23: V
                        entries.add(IngotItem.CHROMIUM_INGOT);     // 24: Cr
                        entries.add(IngotItem.MANGANESE_INGOT);    // 25: Mn
                        entries.add(IngotItem.IRON_INGOT);         // 26: Fe
                        entries.add(IngotItem.COBALT_INGOT);       // 27: Co
                        entries.add(IngotItem.NICKEL_INGOT);       // 28: Ni
                        entries.add(IngotItem.COPPER_INGOT);       // 29: Cu
                        entries.add(IngotItem.ZINC_INGOT);         // 30: Zn
                        entries.add(IngotItem.GALLIUM_INGOT);      // 31: Ga
                        entries.add(IngotItem.STRONTIUM_INGOT);    // 38: Sr
                        entries.add(IngotItem.YTTRIUM_INGOT);      // 39: Y
                        entries.add(IngotItem.ZIRCONIUM_INGOT);    // 40: Zr
                        entries.add(IngotItem.NIOBIUM_INGOT);      // 41: Nb
                        entries.add(IngotItem.MOLYBDENUM_INGOT);   // 42: Mo
                        entries.add(IngotItem.RHENIUM_INGOT);      // 75: Re
                        entries.add(IngotItem.OSMIUM_INGOT);       // 76: Os
                        entries.add(IngotItem.IRIDIUM_INGOT);      // 77: Ir
                        entries.add(IngotItem.PLATINUM_INGOT);     // 78: Pt
                        entries.add(IngotItem.GOLD_INGOT);         // 79: Au
                        entries.add(IngotItem.MERCURY_INGOT);      // 80: Hg (mp  -39°C, but included)
                        entries.add(IngotItem.THALLIUM_INGOT);     // 81: Tl
                        entries.add(IngotItem.LEAD_INGOT);         // 82: Pb
                        entries.add(IngotItem.BISMUTH_INGOT);      // 83: Bi
                        entries.add(IngotItem.POLONIUM_INGOT);     // 84: Po (radioactive)
                        entries.add(IngotItem.BARIUM_INGOT);       // 56: Ba
                        entries.add(IngotItem.TUNGSTEN_INGOT);     // 74: W
                        entries.add(IngotItem.TANTALUM_INGOT);     // 73: Ta
                        entries.add(IngotItem.CADMIUM_INGOT);      // 48: Cd
                        entries.add(IngotItem.INDIUM_INGOT);       // 49: In
                        entries.add(IngotItem.ANTIMONY_INGOT);     // 51: Sb
                        entries.add(IngotItem.TELLURIUM_INGOT);    // 52: Te
                        entries.add(IngotItem.SILVER_INGOT);       // 47: Ag
                        entries.add(IngotItem.PALLADIUM_INGOT);    // 46: Pd
                        entries.add(IngotItem.RHODIUM_INGOT);      // 45: Rh
                        entries.add(IngotItem.RUTHENIUM_INGOT);    // 44: Ru
                        entries.add(IngotItem.THORIUM_INGOT);      // 90: Th
                        entries.add(IngotItem.URANIUM_INGOT);      // 92: U
                        entries.add(IngotItem.SELENIUM_INGOT);     // 34: Se
                        entries.add(IngotItem.ARSENIC_INGOT);      // 33: As

// FICTIONAL (Endgame)
                        entries.add(IngotItem.MYTHRIL_INGOT);      // My
                        entries.add(IngotItem.NAQUADAH_INGOT);     // Nq
                        entries.add(IngotItem.NAQUADRIAH_INGOT);   // Nr
                        entries.add(IngotItem.ENERGIUM_INGOT);     // En
                        entries.add(IngotItem.ERIDIUM_INGOT);      // Er
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

                        entries.add(ModElements.ERIDIUM);
                        entries.add(ModElements.NAQUADRIUM);
                    }).build());

    public static void registerItemGroups() {}
}
