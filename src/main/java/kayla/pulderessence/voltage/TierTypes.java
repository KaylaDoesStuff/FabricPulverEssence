package kayla.pulderessence.voltage;

import kayla.pulderessence.item.ModIngots;
import kayla.pulderessence.item.ModWires;
import net.minecraft.item.Item;

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
    private Item hullIngot;
    private Item superconductorWire;

    TierTypes(String name, double voltage, String supercond) {
        this.name = name;
        this.voltage = voltage;
        this.supercond = supercond;
    }

    public static void init() {
        ULV.hullIngot = ModIngots.get("iron_ingot");
        MLV.hullIngot = ModIngots.get("bronze_alloy_ingot");
        LV.hullIngot = ModIngots.get("stainless_steel_alloy_ingot");
        LLV.hullIngot = ModIngots.get("tool_steel_alloy_ingot");
        MV.hullIngot = ModIngots.get("inconel_alloy_ingot");
        HV.hullIngot = ModIngots.get("tungsten_copper_alloy_ingot");
        EHV.hullIngot = ModIngots.get("tantalum_tungsten_alloy_ingot");
        SHV.hullIngot = ModIngots.get("niobium_titanium_alloy_ingot");
        UHV.hullIngot = ModIngots.get("naquadah_steel_alloy_ingot");
        VHV.hullIngot = ModIngots.get("naquadriah_titanium_alloy_ingot");
        XHV.hullIngot = ModIngots.get("energium_copper_alloy_ingot");
        MHV.hullIngot = ModIngots.get("eridium_tantalum_alloy_ingot");

        ULV.superconductorWire = ModWires.getWireItem("niobium_titanium", 1);
        MLV.superconductorWire = ModWires.getWireItem("niobium_tin", 1);
        LV.superconductorWire = ModWires.getWireItem("yttrium_barium_cuprate", 1);
        LLV.superconductorWire = ModWires.getWireItem("mercury_barium_calcium_cuprate", 1);
        MV.superconductorWire = ModWires.getWireItem("flux_ybco", 1);
        HV.superconductorWire = ModWires.getWireItem("mercury_barium_calcium_cuprate_1212", 1);
        EHV.superconductorWire = ModWires.getWireItem("iron_scandium", 1);
        SHV.superconductorWire = ModWires.getWireItem("barium_iron_arsenide", 1);
        UHV.superconductorWire = ModWires.getWireItem("naquadah_mythril", 1);
        VHV.superconductorWire = ModWires.getWireItem("energium_aluminium", 1);
        XHV.superconductorWire = ModWires.getWireItem("eridium_tantalum", 1);
        MHV.superconductorWire = ModWires.getWireItem("energium_copper", 1);
    }

    public String getName(){ return name; }
    public double getVoltage() { return voltage; }
    public String getSupercond() { return supercond; }
    public Item getHullIngot() { return hullIngot; }
    public Item getSuperconductorWire() { return superconductorWire; }
}
