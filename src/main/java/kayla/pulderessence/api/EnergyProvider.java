package kayla.pulderessence.api;

import net.minecraft.util.math.Direction;

public interface EnergyProvider {
    double getOutputVoltage();
    double getMaxOutputAmperage();
    double extractEnergy(double maxAmps, boolean simulate);
    boolean canConnect(Direction side);
}
