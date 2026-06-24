package kayla.pulderessence.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class WireBlockItem extends BlockItem {
    private final double voltage;
    private final double amperage;
    private final double energyLoss;
    private final int thickness;

    public WireBlockItem(Block block, Settings settings, double voltage, double amperage, double energyLoss, int thickness) {
        super(block, settings);
        this.voltage = voltage;
        this.amperage = amperage;
        this.energyLoss = energyLoss;
        this.thickness = thickness;
    }

    public double getVoltage() { return voltage; }
    public double getBaseAmperage() { return amperage; }
    public double getBaseLoss() { return energyLoss; }
    public int getThickness() { return thickness; }

    public double getMaxAmperage() { return amperage * thickness; }
    public double getEffectiveLoss() { return energyLoss / thickness; }
    public boolean isSuperconductor() { return energyLoss == 0; }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("§6⚡ " + (long)voltage + "V / " + (long)getMaxAmperage() + "A / "
                + (isSuperconductor() ? "§bSuperconducting" : String.format("%.2fΩ·t", getEffectiveLoss()))
                + " §7| " + thickness + "x"));
    }
}
