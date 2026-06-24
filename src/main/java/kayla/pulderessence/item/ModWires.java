package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.custom.CableBlock;
import kayla.pulderessence.block.custom.CableBlockEntity;
import kayla.pulderessence.block.custom.ModBlockEntities;
import kayla.pulderessence.item.custom.WireBlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModWires {

    private static final Map<String, CableBlock[]> CABLE_BLOCKS = new LinkedHashMap<>();
    private static final Map<String, WireBlockItem[]> WIRE_ITEMS = new LinkedHashMap<>();
    private static final Map<CableBlock, Integer> MATERIAL_COLORS = new HashMap<>();
    private static final Map<String, Integer> MATERIAL_COLOR_VALUES = new LinkedHashMap<>();
    static {
        MATERIAL_COLOR_VALUES.put("copper", 0xB87333);
        MATERIAL_COLOR_VALUES.put("silver", 0xE0E0E0);
        MATERIAL_COLOR_VALUES.put("gold", 0xFFD700);
        MATERIAL_COLOR_VALUES.put("aluminum", 0xA8A8A8);
        MATERIAL_COLOR_VALUES.put("tin", 0xD0D0E0);
        MATERIAL_COLOR_VALUES.put("lead", 0x404850);
        MATERIAL_COLOR_VALUES.put("iron", 0x808080);
        MATERIAL_COLOR_VALUES.put("nickel", 0xB0B8B0);
        MATERIAL_COLOR_VALUES.put("platinum", 0xE8E8E0);
        MATERIAL_COLOR_VALUES.put("palladium", 0xD0D0C8);
        MATERIAL_COLOR_VALUES.put("zinc", 0xB0B8A8);
        MATERIAL_COLOR_VALUES.put("tungsten", 0x585858);
        MATERIAL_COLOR_VALUES.put("titanium", 0xA8A8B0);
        MATERIAL_COLOR_VALUES.put("chromium", 0xC0C0C0);
        MATERIAL_COLOR_VALUES.put("cobalt", 0x8090B0);
        MATERIAL_COLOR_VALUES.put("manganese", 0x909890);
        MATERIAL_COLOR_VALUES.put("molybdenum", 0x888888);
        MATERIAL_COLOR_VALUES.put("magnesium", 0xC8D0C8);
        MATERIAL_COLOR_VALUES.put("vanadium", 0x787878);
        MATERIAL_COLOR_VALUES.put("zirconium", 0xA0A0A0);
        MATERIAL_COLOR_VALUES.put("niobium", 0xB8B8A0);
        MATERIAL_COLOR_VALUES.put("tantalum", 0x787880);
        MATERIAL_COLOR_VALUES.put("rhodium", 0xD8D8E0);
        MATERIAL_COLOR_VALUES.put("ruthenium", 0x909898);
        MATERIAL_COLOR_VALUES.put("osmium", 0x404848);
        MATERIAL_COLOR_VALUES.put("iridium", 0xC8C8C0);
        MATERIAL_COLOR_VALUES.put("rhenium", 0x808888);
        MATERIAL_COLOR_VALUES.put("bismuth", 0xA07878);
        MATERIAL_COLOR_VALUES.put("cadmium", 0xA8B8A8);
        MATERIAL_COLOR_VALUES.put("gallium", 0xB8B8B8);
        MATERIAL_COLOR_VALUES.put("indium", 0x989898);
        MATERIAL_COLOR_VALUES.put("yttrium", 0x888898);
        MATERIAL_COLOR_VALUES.put("scandium", 0x9898A0);
        MATERIAL_COLOR_VALUES.put("beryllium", 0x98A898);
        MATERIAL_COLOR_VALUES.put("antimony", 0x686868);
        MATERIAL_COLOR_VALUES.put("bronze", 0xCD7F32);
        MATERIAL_COLOR_VALUES.put("brass", 0xC3B050);
        MATERIAL_COLOR_VALUES.put("electrum", 0xD4AF37);
        MATERIAL_COLOR_VALUES.put("constantan", 0x8A7A6A);
        MATERIAL_COLOR_VALUES.put("invar", 0x7A8A8A);
        MATERIAL_COLOR_VALUES.put("nichrome", 0x8A8A7A);
        MATERIAL_COLOR_VALUES.put("stainless_steel", 0xB0B0B0);
        MATERIAL_COLOR_VALUES.put("tool_steel", 0x686868);
        MATERIAL_COLOR_VALUES.put("cupronickel", 0x9A8A7A);
        MATERIAL_COLOR_VALUES.put("manganin", 0x9A8A88);
        MATERIAL_COLOR_VALUES.put("monel", 0x889A88);
        MATERIAL_COLOR_VALUES.put("inconel", 0x888888);
        MATERIAL_COLOR_VALUES.put("stellite", 0x788A98);
        MATERIAL_COLOR_VALUES.put("ti_6al_4v", 0x989898);
        MATERIAL_COLOR_VALUES.put("niobium_titanium", 0x887898);
        MATERIAL_COLOR_VALUES.put("niobium_tin", 0x8888A0);
        MATERIAL_COLOR_VALUES.put("yttrium_barium_cuprate", 0x384838);
        MATERIAL_COLOR_VALUES.put("mercury_barium_calcium_cuprate", 0x483838);
        MATERIAL_COLOR_VALUES.put("flux_ybco", 0x584838);
        MATERIAL_COLOR_VALUES.put("mercury_barium_calcium_cuprate_1212", 0x384848);
        MATERIAL_COLOR_VALUES.put("iron_scandium", 0x685858);
        MATERIAL_COLOR_VALUES.put("barium_iron_arsenide", 0x383850);
        MATERIAL_COLOR_VALUES.put("naquadah_mythril", 0x584888);
        MATERIAL_COLOR_VALUES.put("energium_aluminium", 0x789848);
        MATERIAL_COLOR_VALUES.put("eridium_tantalum", 0x784838);
        MATERIAL_COLOR_VALUES.put("energium_copper", 0x783878);
    }

    public static CableBlock getCableBlock(String material, int thickness, boolean insulated) {
        int idx = thickness == 1 ? 0 : thickness == 2 ? 1 : thickness == 4 ? 2 : thickness == 8 ? 3 : 4;
        return CABLE_BLOCKS.get(material)[insulated ? idx + 5 : idx];
    }

    public static WireBlockItem getWireItem(String material, int thickness) {
        int idx = thickness == 1 ? 0 : thickness == 2 ? 1 : thickness == 4 ? 2 : thickness == 8 ? 3 : 4;
        return WIRE_ITEMS.get(material)[idx];
    }

    public static Collection<WireBlockItem> getAllWireItems() {
        return WIRE_ITEMS.values().stream().flatMap(Arrays::stream).toList();
    }

    public static Collection<CableBlock> getAllCableBlocks() {
        return CABLE_BLOCKS.values().stream().flatMap(Arrays::stream).toList();
    }

    public static int getMaterialColor(CableBlock block) {
        return MATERIAL_COLORS.getOrDefault(block, 0xFF888888);
    }

    public static void registerAll() {
        List<CableBlock> allBlocks = new ArrayList<>();

        allBlocks.addAll(registerSet("copper", 64, 3, 0.4));
        allBlocks.addAll(registerSet("silver", 128, 4, 0.25));
        allBlocks.addAll(registerSet("gold", 256, 2, 0.2));
        allBlocks.addAll(registerSet("aluminum", 32, 2, 0.5));
        allBlocks.addAll(registerSet("tin", 8, 1, 1.2));
        allBlocks.addAll(registerSet("lead", 8, 0.5, 2.0));
        allBlocks.addAll(registerSet("iron", 16, 1, 1.0));
        allBlocks.addAll(registerSet("nickel", 32, 1, 0.8));
        allBlocks.addAll(registerSet("platinum", 512, 3, 0.15));
        allBlocks.addAll(registerSet("palladium", 256, 2, 0.18));
        allBlocks.addAll(registerSet("zinc", 16, 1, 1.1));
        allBlocks.addAll(registerSet("tungsten", 1024, 4, 0.1));
        allBlocks.addAll(registerSet("titanium", 128, 2, 0.6));
        allBlocks.addAll(registerSet("chromium", 64, 1, 0.7));
        allBlocks.addAll(registerSet("cobalt", 32, 1, 0.8));
        allBlocks.addAll(registerSet("manganese", 16, 0.5, 1.5));
        allBlocks.addAll(registerSet("molybdenum", 256, 2, 0.3));
        allBlocks.addAll(registerSet("magnesium", 16, 1, 1.3));
        allBlocks.addAll(registerSet("vanadium", 64, 1, 0.9));
        allBlocks.addAll(registerSet("zirconium", 64, 1, 0.8));
        allBlocks.addAll(registerSet("niobium", 128, 2, 0.3));
        allBlocks.addAll(registerSet("tantalum", 256, 3, 0.2));
        allBlocks.addAll(registerSet("rhodium", 1024, 3, 0.12));
        allBlocks.addAll(registerSet("ruthenium", 512, 2, 0.18));
        allBlocks.addAll(registerSet("osmium", 2048, 4, 0.08));
        allBlocks.addAll(registerSet("iridium", 4096, 5, 0.05));
        allBlocks.addAll(registerSet("rhenium", 1024, 3, 0.1));
        allBlocks.addAll(registerSet("bismuth", 8, 0.5, 2.5));
        allBlocks.addAll(registerSet("cadmium", 8, 1, 1.8));
        allBlocks.addAll(registerSet("gallium", 8, 0.5, 3.0));
        allBlocks.addAll(registerSet("indium", 8, 1, 1.5));
        allBlocks.addAll(registerSet("yttrium", 64, 1, 1.0));
        allBlocks.addAll(registerSet("scandium", 64, 1, 1.0));
        allBlocks.addAll(registerSet("beryllium", 256, 2, 0.4));
        allBlocks.addAll(registerSet("antimony", 16, 0.5, 2.0));

        // Alloys (14)
        allBlocks.addAll(registerSet("bronze", 64, 2, 0.6));
        allBlocks.addAll(registerSet("brass", 32, 2, 0.7));
        allBlocks.addAll(registerSet("electrum", 512, 3, 0.15));
        allBlocks.addAll(registerSet("constantan", 128, 2, 0.3));
        allBlocks.addAll(registerSet("invar", 32, 1, 0.9));
        allBlocks.addAll(registerSet("nichrome", 128, 2, 0.4));
        allBlocks.addAll(registerSet("stainless_steel", 64, 2, 0.6));
        allBlocks.addAll(registerSet("tool_steel", 128, 3, 0.3));
        allBlocks.addAll(registerSet("cupronickel", 64, 2, 0.5));
        allBlocks.addAll(registerSet("manganin", 32, 1, 0.8));
        allBlocks.addAll(registerSet("monel", 128, 2, 0.3));
        allBlocks.addAll(registerSet("inconel", 256, 3, 0.25));
        allBlocks.addAll(registerSet("stellite", 512, 3, 0.2));
        allBlocks.addAll(registerSet("ti_6al_4v", 256, 2, 0.5));

        // Superconductor alloys (8 — loss=0)
        allBlocks.addAll(registerSet("niobium_titanium", 8, 8, 0));
        allBlocks.addAll(registerSet("niobium_tin", 64, 16, 0));
        allBlocks.addAll(registerSet("yttrium_barium_cuprate", 512, 32, 0));
        allBlocks.addAll(registerSet("mercury_barium_calcium_cuprate", 4096, 64, 0));
        allBlocks.addAll(registerSet("flux_ybco", 32768, 128, 0));
        allBlocks.addAll(registerSet("mercury_barium_calcium_cuprate_1212", 262144, 256, 0));
        allBlocks.addAll(registerSet("iron_scandium", 2097152, 512, 0));
        allBlocks.addAll(registerSet("barium_iron_arsenide", 16777216, 1024, 0));

        // Fictional superconductor alloys (4 — loss=0)
        allBlocks.addAll(registerSet("naquadah_mythril", 132217728, 2048, 0));
        allBlocks.addAll(registerSet("energium_aluminium", 1057741824, 4096, 0));
        allBlocks.addAll(registerSet("eridium_tantalum", 8461934592d, 8192, 0));
        allBlocks.addAll(registerSet("energium_copper", 67695466736d, 16384, 0));

        // Populate material color mapping
        for (var entry : CABLE_BLOCKS.entrySet()) {
            int color = MATERIAL_COLOR_VALUES.getOrDefault(entry.getKey(), 0xFF888888);
            for (CableBlock block : entry.getValue()) {
                MATERIAL_COLORS.put(block, color);
            }
        }

        // Register block entity type with all cable blocks
        ModBlockEntities.init(FabricBlockEntityTypeBuilder.create(CableBlockEntity::new, allBlocks.toArray(new CableBlock[0])).build());
    }

    private static Collection<CableBlock> registerSet(String baseName, double voltage, double amp, double loss) {
        int[] sizes = {1, 2, 4, 8, 16};
        CableBlock[] blocks = new CableBlock[10];
        WireBlockItem[] items = new WireBlockItem[5];

        for (int i = 0; i < 5; i++) {
            int t = sizes[i];

            // Bare cable block
            CableBlock bare = new CableBlock(
                FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(),
                voltage, amp, loss, t, false);
            Registry.register(Registries.BLOCK, id(baseName + "_cable_" + t + "x"), bare);
            blocks[i] = bare;

            // Insulated cable block
            CableBlock insulated = new CableBlock(
                FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(),
                voltage, amp, loss, t, true);
            Registry.register(Registries.BLOCK, id(baseName + "_cable_" + t + "x_insulated"), insulated);
            blocks[i + 5] = insulated;

            // WireBlockItem (places the bare cable block on right-click)
            WireBlockItem wireItem = new WireBlockItem(bare,
                new FabricItemSettings().maxCount(64),
                voltage, amp, loss, t);
            Registry.register(Registries.ITEM, id(baseName + "_cable_" + t + "x"), wireItem);
            items[i] = wireItem;

            // Also register an item for the insulated variant
            WireBlockItem insulatedItem = new WireBlockItem(insulated,
                new FabricItemSettings().maxCount(64),
                voltage, amp, loss, t);
            Registry.register(Registries.ITEM, id(baseName + "_cable_" + t + "x_insulated"), insulatedItem);
        }

        CABLE_BLOCKS.put(baseName, blocks);
        WIRE_ITEMS.put(baseName, items);
        return Arrays.asList(blocks);
    }

    private static Identifier id(String path) {
        return new Identifier(PulderEssence.MOD_ID, path);
    }
}
