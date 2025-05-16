package kayla.pulderessence.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class MachineRecipe {
    private final Identifier id; // Unique identifier for the recipe
    private final List<ItemStack> inputs; // List of input items
    private final List<ItemStack> outputs; // List of output items
    private final int requiredVoltage; // Required voltage

    public MachineRecipe(Identifier id, List<ItemStack> inputs, List<ItemStack> outputs, int requiredVoltage) {
        this.id = id;
        this.inputs = inputs;
        this.outputs = outputs;
        this.requiredVoltage = requiredVoltage;
    }

    public Identifier getId() {
        return id;
    }

    public List<ItemStack> getInputs() {
        return inputs;
    }

    public List<ItemStack> getOutputs() {
        return outputs;
    }

    public int getRequiredVoltage() {
        return requiredVoltage;
    }
}
