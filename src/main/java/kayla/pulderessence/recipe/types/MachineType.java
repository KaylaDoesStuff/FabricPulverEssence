package kayla.pulderessence.recipe.types;

public enum MachineType {
    MIX(5, 3),
    ELECTROLYZE(1, 6),
    BLAST(4, 4),
    CENTRIFUGE(1, 6),
    SMELT(1, 1);

    private int inputs;
    private int outputs;
    private boolean supportsFluid;
    private int fluidSlots;

    MachineType(int inputs, int outputs) {
        this.inputs = inputs;
        this.outputs = outputs;
    }

    public int getInputs() {
        return inputs;
    }

    public int getOutputs() {
        return outputs;
    }
}
