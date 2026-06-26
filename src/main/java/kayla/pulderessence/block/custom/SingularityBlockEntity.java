package kayla.pulderessence.block.custom;

import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SingularityBlockEntity extends BlockEntity {

    private double mass = 1.0;
    private boolean registered = false;

    public SingularityBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SINGULARITY_BLOCK_ENTITY, pos, state);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (this.mass != mass) {
            unregister();
            this.mass = mass;
            register();
            markDirty();
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putDouble("mass", mass);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("mass")) {
            double newMass = nbt.getDouble("mass");
            if (newMass != mass) {
                unregister();
                mass = newMass;
                register();
            }
        }
    }

    @Override
    public void setWorld(World world) {
        if (this.world != world) {
            if (this.world != null && !this.world.isClient) {
                TimeDilation.removeSource(this.world, pos);
                registered = false;
            }
            super.setWorld(world);
            if (world != null && !world.isClient && mass > 0) {
                TimeDilation.addSource(world, pos, mass);
                registered = true;
            }
        } else {
            super.setWorld(world);
        }
    }

    @Override
    public void markRemoved() {
        unregister();
        super.markRemoved();
    }

    @Override
    public void cancelRemoval() {
        super.cancelRemoval();
        register();
    }

    private void register() {
        if (!registered && hasWorld() && !world.isClient && mass > 0) {
            TimeDilation.addSource(world, pos, mass);
            registered = true;
        }
    }

    private void unregister() {
        if (registered && hasWorld() && !world.isClient) {
            TimeDilation.removeSource(world, pos);
            registered = false;
        }
    }
}
