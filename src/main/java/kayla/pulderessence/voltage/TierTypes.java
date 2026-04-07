package kayla.pulderessence.voltage;

public enum TierTypes {
    ULV("Ultra Low Voltage", 8, "NbTi"),
    MLV("Millivolt Level", 64, "Nb3Sn"),
    LV("Low Voltage", 512, "YBCuO"),
    LLV("Low Level Voltage", 4096, "HgBa2Ca2Cu3O8"),
    MV("Medium Voltage", 32768, "FluxYBCuO"),
    HV("High Voltage", 262144, "HgBCCCO2"),
    EHV("Extra High Voltage", 2097152, "FeSc"),
    SHV("Super High Voltage", 16777216, "BaFe2As2C"),
    UHV("Ultra High Voltage", 132217728, "EnDbC"),
    VHV("Very High Voltage", 1057741824, "OgCnC"),
    XHV("Extreme High Voltage", 8461934592d, "IrTiBeNd"),
    MHV("Mega High Voltage", 67695466736d, "IrPtAu");

    private final String name;
    private final double voltage;
    private final String supercond;

    TierTypes(String name, double voltage, String supercond) {
        this.name = name;
        this.voltage = voltage;
        this.supercond = supercond;
    }
    public String getName(){ return name; }
    public double getVoltage() { return voltage; }
    public String getSupercond() { return supercond; }
}
