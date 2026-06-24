package kayla.pulderessence.block.custom;

import kayla.pulderessence.block.custom.CableBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CableBlockEntity extends BlockEntity {

    private double voltage;
    private double amperage;
    private double resistance;
    private double maxVoltage;
    private double maxAmperage;
    private boolean insulated;
    private long networkId;

    public CableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CABLE_BLOCK_ENTITY, pos, state);
        this.voltage = 0;
        this.amperage = 0;
        this.networkId = 0;
        if (state.getBlock() instanceof CableBlock cb) {
            this.maxVoltage = cb.getVoltage();
            this.maxAmperage = cb.getMaxAmperage();
            this.resistance = cb.getEffectiveLoss();
            this.insulated = cb.isInsulated();
        }
    }

    public CableBlockEntity(BlockPos pos, BlockState state, double maxVoltage, double maxAmperage, double resistance, boolean insulated) {
        super(ModBlockEntities.CABLE_BLOCK_ENTITY, pos, state);
        this.maxVoltage = maxVoltage;
        this.maxAmperage = maxAmperage;
        this.resistance = resistance;
        this.insulated = insulated;
        this.voltage = 0;
        this.amperage = 0;
        this.networkId = 0;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putDouble("voltage", voltage);
        nbt.putDouble("amperage", amperage);
        nbt.putDouble("resistance", resistance);
        nbt.putDouble("maxVoltage", maxVoltage);
        nbt.putDouble("maxAmperage", maxAmperage);
        nbt.putBoolean("insulated", insulated);
        nbt.putLong("networkId", networkId);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        voltage = nbt.getDouble("voltage");
        amperage = nbt.getDouble("amperage");
        resistance = nbt.getDouble("resistance");
        maxVoltage = nbt.getDouble("maxVoltage");
        maxAmperage = nbt.getDouble("maxAmperage");
        insulated = nbt.getBoolean("insulated");
        networkId = nbt.getLong("networkId");
    }

    public double getVoltage() { return voltage; }
    public void setVoltage(double v) { this.voltage = v; markDirty(); }

    public double getAmperage() { return amperage; }
    public void setAmperage(double a) { this.amperage = a; markDirty(); }

    public double getResistance() { return resistance; }
    public double getMaxVoltage() { return maxVoltage; }
    public double getMaxAmperage() { return maxAmperage; }
    public boolean isInsulated() { return insulated; }

    public long getNetworkId() { return networkId; }
    public void setNetworkId(long id) { this.networkId = id; markDirty(); }

    public boolean isOverVoltage() { return voltage > maxVoltage; }
    public boolean isOverCurrent() { return amperage > maxAmperage; }

    public static void serverTick(World world, BlockPos pos, BlockState state, CableBlockEntity be) {
        if (be.isOverVoltage()) {
            world.createExplosion(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    Math.min(4, (float) (be.voltage / be.maxVoltage)), World.ExplosionSourceType.BLOCK);
            world.removeBlock(pos, false);
        }
    }
}
