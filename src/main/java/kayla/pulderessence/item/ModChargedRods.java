package kayla.pulderessence.item;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.item.custom.ChargedItem;
import kayla.pulderessence.item.types.ElementType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModChargedRods {

    private static final List<ChargedRodEntry> ENTRIES = List.of(
        new ChargedRodEntry("charged_gold_rod", 6, ElementType.GOLD),
        new ChargedRodEntry("charged_iron_rod", 4, ElementType.IRON),
        new ChargedRodEntry("charged_faerie_rod", 8, null),
        new ChargedRodEntry("charged_energium_rod", 16, ElementType.ENERGIUM),
        new ChargedRodEntry("charged_lead_rod", 6, ElementType.LEAD),
        new ChargedRodEntry("charged_silver_rod", 20, ElementType.SILVER),
        new ChargedRodEntry("charged_tungsten_rod", 4, ElementType.TUNGSTEN),
        new ChargedRodEntry("charged_indium_rod", 14, ElementType.INDIUM),
        new ChargedRodEntry("charged_mythril_rod", 2, ElementType.MYTHRIL),
        new ChargedRodEntry("charged_yttrium_rod", 12, ElementType.YTTRIUM),
        new ChargedRodEntry("charged_aluminum_rod", 15, ElementType.ALUMINUM),
        new ChargedRodEntry("charged_chromium_rod", 6, ElementType.CHROMIUM),
        new ChargedRodEntry("charged_cobalt_rod", 9, ElementType.COBALT),
        new ChargedRodEntry("charged_eridium_rod", 3, ElementType.ERIDIUM),
        new ChargedRodEntry("charged_gallium_rod", 13, ElementType.GALLIUM),
        new ChargedRodEntry("charged_iridium_rod", 19, ElementType.IRIDIUM),
        new ChargedRodEntry("charged_magnesium_rod", 14, ElementType.MAGNESIUM),
        new ChargedRodEntry("charged_manganese_rod", 7, ElementType.MANGANESE),
        new ChargedRodEntry("charged_naquadah_rod", 5, ElementType.NAQUADAH),
        new ChargedRodEntry("charged_nickel_rod", 10, ElementType.NICKEL),
        new ChargedRodEntry("charged_titanium_rod", 4, ElementType.TITANIUM),
        new ChargedRodEntry("charged_vanadium_rod", 5, ElementType.VANADIUM),
        new ChargedRodEntry("charged_zinc_rod", 12, ElementType.ZINC),
        new ChargedRodEntry("charged_barium_rod", 18, ElementType.BARIUM),
        new ChargedRodEntry("charged_beryllium_rod", 6, ElementType.BERYLLIUM),
        new ChargedRodEntry("charged_bismuth_rod", 5, ElementType.BISMUTH),
        new ChargedRodEntry("charged_cadmium_rod", 10, ElementType.CADMIUM),
        new ChargedRodEntry("charged_calcium_rod", 2, ElementType.CALCIUM),
        new ChargedRodEntry("charged_copper_rod", 11, ElementType.COPPER),
        new ChargedRodEntry("charged_lithium_rod", 5, ElementType.LITHIUM),
        new ChargedRodEntry("charged_molybdenum_rod", 4, ElementType.MOLYBDENUM),
        new ChargedRodEntry("charged_naquadriah_rod", 21, ElementType.NAQUADRIUM),
        new ChargedRodEntry("charged_niobium_rod", 3, ElementType.NIOBIUM),
        new ChargedRodEntry("charged_osmium_rod", 18, ElementType.OSMIUM),
        new ChargedRodEntry("charged_palladium_rod", 8, ElementType.PALLADIUM),
        new ChargedRodEntry("charged_platinum_rod", 20, ElementType.PLATINUM),
        new ChargedRodEntry("charged_polonium_rod", 6, ElementType.POLONIUM),
        new ChargedRodEntry("charged_rhenium_rod", 17, ElementType.RHENIUM),
        new ChargedRodEntry("charged_rhodium_rod", 7, ElementType.RHODIUM),
        new ChargedRodEntry("charged_ruthenium_rod", 6, ElementType.RUTHENIUM),
        new ChargedRodEntry("charged_scandium_rod", 3, ElementType.SCANDIUM),
        new ChargedRodEntry("charged_sodium_rod", 13, ElementType.SODIUM),
        new ChargedRodEntry("charged_strontium_rod", 20, ElementType.STRONTIUM),
        new ChargedRodEntry("charged_tantalum_rod", 15, ElementType.TANTALUM),
        new ChargedRodEntry("charged_thallium_rod", 3, ElementType.THALLIUM),
        new ChargedRodEntry("charged_thorium_rod", 12, ElementType.THORIUM),
        new ChargedRodEntry("charged_tin_rod", 12, ElementType.TIN),
        new ChargedRodEntry("charged_uranium_rod", 14, ElementType.URANIUM),
        new ChargedRodEntry("charged_zirconium_rod", 2, ElementType.ZIRCONIUM)
    );

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    public static Collection<Item> getAll() {
        return Collections.unmodifiableCollection(ITEMS.values());
    }

    public static void registerChargedRods() {
        for (ChargedRodEntry e : ENTRIES) {
            Item item;
            if (e.element != null) {
                item = new ChargedItem(new FabricItemSettings(), e.charge, List.of(e.element), List.of(1));
            } else {
                item = new ChargedItem(new FabricItemSettings(), e.charge);
            }
            Registry.register(Registries.ITEM, new Identifier(PulderEssence.MOD_ID, e.name), item);
            ITEMS.put(e.name, item);
        }
    }

    private record ChargedRodEntry(String name, int charge, ElementType element) {}
}
