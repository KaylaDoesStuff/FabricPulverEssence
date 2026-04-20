package kayla.pulderessence.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class GravityMixin {

    // Realistic physics values for Earth gravity at 20 TPS
    // g = 9.81 m/s² ÷ 20 ticks/s = 0.4905 m/tick²
    // Terminal velocity of human skydiver = 53 m/s ÷ 20 ticks/s = 2.65 m/tick

    /**
     * Replaces the vanilla gravity constant (0.08) with realistic Earth gravity.
     */
    @ModifyConstant(method = "travel", constant = @Constant(doubleValue = 0.08))
    private double modifyGravityConstant(double original) {
        return 0.4905;
    }

    /**
     * Replaces the vanilla terminal velocity cap (3.92) with a realistic 53 m/s.
     */
    @ModifyConstant(method = "travel", constant = @Constant(doubleValue = 3.92))
    private double modifyTerminalVelocityConstant(double original) {
        return 2.65;
    }
}