package kayla.pulderessence.item.custom;

import kayla.pulderessence.item.ModElements;
import net.minecraft.item.Item;

public class FissionItem extends Item {
    public ElementItem reactant;
    public ElementItem radiant;
    public ElementItem primaryResult;
    public static final int light = 300000000;

    public FissionItem(Settings settings, ElementItem reactant, ElementItem radiant, ElementItem primaryResult) {
        super(settings);
        this.reactant = reactant;
        this.radiant = radiant;
        this.primaryResult = primaryResult;
    }

    private ElementItem getIsotope() {
        int resultIsotopeNumber = this.reactant.atomicNumber - this.radiant.atomicNumber;
        return ModElements.getElementFromNumber(resultIsotopeNumber);
    }

    private ElementItem getIsotopeResult() {
        float isotopeMass = this.reactant.atomicMass - this.radiant.atomicMass - getIsotope().atomicMass;
        float protonIsotopeMass = ModElements.getMassFromElement((ElementItem) ModElements.PROTON) * getIsotope().atomicNumber;
        return
    }
}
