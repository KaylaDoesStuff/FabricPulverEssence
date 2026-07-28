package kayla.pulderessence.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;

public class SingularityBlockEntity extends BlockEntity {

    private double mass = 1.0;
    private double spin = 0.0;

    public SingularityBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SINGULARITY_BLOCK_ENTITY, pos, state);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
        markDirty();
    }

    public double getSpin() {
        return spin;
    }

    public void setSpin(double spin) {
        this.spin = spin;
        markDirty();
    }

    public static double getMu(double mass) {
        return 6.67e-11 * 1.99e24 * mass;
    }

    public static double getSchwarzschildRadius(double mass) {
        return 2.0 * getMu(mass) / 9e16;
    }

    public static double getPhotonSphereRadius(double mass) {
        return 1.5 * getSchwarzschildRadius(mass);
    }

    public static double getShadowRadius(double mass) {
        return (3.0 * Math.sqrt(3.0) / 2.0) * getSchwarzschildRadius(mass);
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return this.createNbt();
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putDouble("mass", mass);
        nbt.putDouble("spin", spin);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("mass")) {
            mass = nbt.getDouble("mass");
        }
        if (nbt.contains("spin")) {
            spin = nbt.getDouble("spin");
        }
    }
}
