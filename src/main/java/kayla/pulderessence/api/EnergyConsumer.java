package kayla.pulderessence.api;

import net.minecraft.util.math.Direction;

public interface EnergyConsumer {
    double getMaxInputVoltage();
    double getDemandAmperage();
    double receiveEnergy(double amps, double voltage, boolean simulate);
    boolean canConnect(Direction side);
}
