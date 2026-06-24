package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.item.custom.ProgressableItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.*;

public class ChemicalReactionItems {

    private static final List<ReactionEntry> ENTRIES = List.of(
        new ReactionEntry("dihydrogen_monoxide_bucket_reaction", Items.WATER_BUCKET, 4, "yttrium_block"),
//        new ReactionEntry("hydrogen_nitride_bucket_reaction", "ammonia_bucket", 2, "mythril_block"),
        new ReactionEntry("dihydrogen_sulfate_bucket_reaction", "sulfuric_acid_bucket", 2, "mythril_block"),
        new ReactionEntry("hydrogen_chloride_bucket_reaction", "hydrochloric_acid_bucket", 2, "mythril_block"),
        new ReactionEntry("sodium_hypochlorite_bottle_reaction", "bleach_bottle", 6, "mythril_block"),
        new ReactionEntry("trichloromethane_bottle_reaction", "chloroform_bottle", 6, "mythril_block")
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerCrafts() {
        for (ReactionEntry e : ENTRIES) {
            Item result = resolveResult(e);
            Block catalyst = ModBlocks.get(e.catalystBlock);
            if (catalyst == null) {
                throw new RuntimeException("Unknown catalyst block: " + e.catalystBlock);
            }
            Item item = new ProgressableItem(new FabricItemSettings(), result, e.progress, catalyst);
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), item);
            ITEMS.put(e.name, item);
        }
    }

    private static Item resolveResult(ReactionEntry e) {
        if (e.resultItem != null) return (Item) e.resultItem;
        Item found = ModBucketItems.get(e.resultName);
        if (found != null) return found;
        found = ModBottleItems.get(e.resultName);
        if (found != null) return found;
        throw new RuntimeException("Unknown result item: " + e.resultName);
    }

    private record ReactionEntry(String name, ItemConvertible resultItem, int progress, String catalystBlock, String resultName) {
        ReactionEntry(String name, ItemConvertible resultItem, int progress, String catalystBlock) {
            this(name, resultItem, progress, catalystBlock, null);
        }
        ReactionEntry(String name, String resultName, int progress, String catalystBlock) {
            this(name, null, progress, catalystBlock, resultName);
        }
    }
}
