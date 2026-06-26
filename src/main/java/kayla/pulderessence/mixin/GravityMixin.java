package kayla.pulderessence.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class GravityMixin {

    // Realistic physics values for Earth gravity at 20 TPS
    // g = 9.81 m/s² ÷ (20 ticks/s)² = 0.024525 m/tick²
    // Terminal velocity of human skydiver = 53 m/s ÷ 20 ticks/s = 2.65 m/tick
    // Jump velocity scaled to keep jump height (~1.1m) with new gravity:
    // v_new = 0.42 * sqrt(0.024525 / 0.08) = 0.2325

    /**
     * Replaces the vanilla gravity constant (0.08) with realistic Earth gravity.
     */
    @ModifyConstant(method = "travel", constant = @Constant(doubleValue = 0.08))
    private double modifyGravityConstant(double original) {
        return 0.024525;
    }

    /**
     * Replaces the vanilla terminal velocity cap (3.92) with a realistic 53 m/s.
     */
    @ModifyConstant(method = "travel", constant = @Constant(doubleValue = 3.92))
    private double modifyTerminalVelocityConstant(double original) {
        return 2.65;
    }

    /**
     * Scales jump velocity to maintain ~1.1 block jump height with new gravity.
     */
    @ModifyConstant(method = "getJumpVelocity", constant = @Constant(floatValue = 0.42F))
    private float modifyJumpVelocity(float original) {
        return 0.2325F;
    }

    /**
     * Increases sprint boost to achieve ~7 m/s with reduced walk speed.
     */
    @ModifyConstant(method = "<clinit>", constant = @Constant(doubleValue = 0.30000001192092896))
    private static double modifySprintBoost(double original) {
        return 3.375;
    }
}