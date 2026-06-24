package kayla.pulderessence.recipe.types;

public enum MachineType {
    SMELT(1, 1),
    MACERATOR(1, 3),
    ORE_WASHER(1, 3),
    THERMAL_CENTRIFUGE(1, 4),
    ELECTROLYZER(2, 4),
    BLAST_FURNACE(4, 4),
    CHEMICAL_REACTOR(4, 4),
    DISTILLATION_TOWER(1, 6),
    CRYSTALLIZER(2, 2),
    MIXER(6, 3),
    VACUUM_FURNACE(2, 2),
    COMPRESSOR(1, 1),
    ALLOY_SMELTER(4, 2);

    private int inputs;
    private int outputs;

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
