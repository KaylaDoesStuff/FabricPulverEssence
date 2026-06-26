package kayla.pulderessence.mixin;

import kayla.pulderessence.physics.TimeDilation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockEntityTickInvoker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(World.class)
public class BlockEntityTimeDilationMixin {

    @Redirect(
            method = "tickBlockEntities",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/chunk/BlockEntityTickInvoker;tick()V")
    )
    private void redirectBlockEntityTick(BlockEntityTickInvoker invoker) {
        BlockPos pos = invoker.getPos();
        if (TimeDilation.accumulateBlockEntityTick((World)(Object)this, pos) >= 1.0) {
            invoker.tick();
        }
    }
}
