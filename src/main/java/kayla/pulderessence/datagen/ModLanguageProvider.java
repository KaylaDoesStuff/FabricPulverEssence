package kayla.pulderessence.datagen;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kayla.pulderessence.item.ModIngots;
import kayla.pulderessence.item.ModWires;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        Path staticFile = Path.of("src/main/resources/assets/pulderessence/lang/en_us.json");
        if (Files.exists(staticFile)) {
            try {
                var reader = Files.newBufferedReader(staticFile);
                Map<String, String> existing = new Gson().fromJson(reader,
                    new TypeToken<Map<String, String>>(){}.getType());
                for (var entry : existing.entrySet()) {
                    builder.add(entry.getKey(), entry.getValue());
                }
            } catch (IOException e) {
                throw new RuntimeException("Failed to read static en_us.json", e);
            }
        }

        builder.add("group.wires", "Wires");

        builder.add(ModIngots.get("niobium_tin_alloy_ingot"), "Niobium-Tin Alloy Ingot");
        builder.add(ModIngots.get("yttrium_barium_cuprate_alloy_ingot"), "Yttrium Barium Cuprate Ingot");
        builder.add(ModIngots.get("mercury_barium_calcium_cuprate_alloy_ingot"), "Mercury Barium Calcium Cuprate Ingot");
        builder.add(ModIngots.get("flux_ybco_alloy_ingot"), "Flux YBCO Alloy Ingot");
        builder.add(ModIngots.get("mercury_barium_calcium_cuprate_1212_alloy_ingot"), "Mercury Barium Calcium Cuprate-1212 Ingot");
        builder.add(ModIngots.get("iron_scandium_alloy_ingot"), "Iron-Scandium Alloy Ingot");
        builder.add(ModIngots.get("barium_iron_arsenide_alloy_ingot"), "Barium Iron Arsenide Ingot");

        for (var block : ModWires.getAllCableBlocks()) {
            String path = block.getTranslationKey();
            String name = path.replace("block.pulderessence.", "");
            String readable = toTitleCase(name.replace("_cable_", " Cable ")
                    .replace("_insulated", " Insulated"));
            builder.add(block, readable);
        }
    }

    private static String toTitleCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = true;
        for (char c : input.toCharArray()) {
            if (c == '_') {
                result.append(' ');
                nextUpper = true;
            } else if (nextUpper) {
                result.append(Character.toUpperCase(c));
                nextUpper = false;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
