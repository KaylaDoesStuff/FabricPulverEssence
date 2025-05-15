package kayla.pulderessence.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RecipeManager {
    private static final Map<Identifier, MachineRecipe> recipes = new HashMap<>();

    // Load recipes from JSON files
    public static void loadRecipes(ResourceManager resourceManager) {
        recipes.clear(); // Clear existing recipes

        // Load the recipes from the data folder
        ResourceManagerHelper.get(ResourceType.RECIPES).registerReloadListener((manager, resourceType, resourceManager) -> {
            for (Identifier id : manager.findResources("recipes", path -> path.endsWith(".json"))) {
                try {
                    Resource resource = manager.getResource(id);
                    JsonObject json = JsonHelper.deserialize(new InputStreamReader(resource.getInputStream()));
                    parseRecipeJson(id, json);
                } catch (Exception e) {
                    throw new JsonParseException("Failed to load recipe: " + id, e);
                }
            }
        });
    }

    public static void addRecipe(Identifier id, ItemStack input, ItemStack output, int requiredVoltage) {
        MachineRecipe recipe = new MachineRecipe(id, input, output, requiredVoltage);
        recipes.put(id, recipe);
    }

    public static MachineRecipe getRecipe(String machineName, ItemStack input) {
        for (MachineRecipe recipe : recipes.values()) {
            if (recipe.getInput().isItemEqual(input) && recipe.getId().getPath().equals(machineName)) {
                return recipe;
            }
        }
        return null; // No matching recipe found
    }

    public static void parseRecipeJson(Identifier id, JsonObject json) {
        JsonElement inputElement = json.get("input");
        JsonElement outputElement = json.get("output");
        int requiredVoltage = JsonHelper.getInt(json, "required_voltage");

        // Parse input item and amount
        ItemStack inputItem = ItemStack.fromJson(JsonHelper.getObject(inputElement.getAsJsonObject()));
        int inputAmount = JsonHelper.getInt(inputElement.getAsJsonObject(), "count", 1);
        inputItem.setCount(inputAmount);

        // Parse output item and amount
        ItemStack outputItem = ItemStack.fromJson(JsonHelper.getObject(outputElement.getAsJsonObject()));
        int outputAmount = JsonHelper.getInt(outputElement.getAsJsonObject(), "count", 1);
        outputItem.setCount(outputAmount);

        // Add the recipe to the manager
        addRecipe(id, inputItem, outputItem, requiredVoltage);
    }
}
