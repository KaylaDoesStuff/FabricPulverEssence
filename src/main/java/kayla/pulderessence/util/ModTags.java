package kayla.pulderessence.util;

import kayla.pulderessence.PulderEssence;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(PulderEssence.MOD_ID, name));
        }

        public static TagKey<Item> chargeableItem = createItemTag("chargeable");
    }
}
