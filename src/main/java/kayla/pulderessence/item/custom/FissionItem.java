package kayla.pulderessence.item.custom;

import kayla.pulderessence.item.ModElements;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class FissionItem extends Item {
    public ElementItem reactant;
    public ElementItem radiant;
    public ElementItem primaryResult;
    public static final int light = 300000000;

    // Radiation properties
    private final float alphaRadiation;
    private final float betaRadiation;
    private final float gammaRadiation;

    public FissionItem(Settings settings, ElementItem reactant, ElementItem radiant, ElementItem primaryResult,
                       float alphaRadiation, float betaRadiation, float gammaRadiation) {
        super(settings);
        this.reactant = reactant;
        this.radiant = radiant;
        this.primaryResult = primaryResult;
        this.alphaRadiation = alphaRadiation;
        this.betaRadiation = betaRadiation;
        this.gammaRadiation = gammaRadiation;
    }

    private ElementItem getIsotope() {
        int resultIsotopeNumber = this.reactant.atomicNumber - this.radiant.atomicNumber;
        return ModElements.getElementFromNumber(resultIsotopeNumber);
    }

    private ElementItem getIsotopeResult() {
        // Calculate the resulting atomic number
        int resultingAtomicNumber = this.reactant.atomicNumber - this.radiant.atomicNumber;

        // Calculate the mass number (A) based on the atomic masses
        float isotopeMass = this.reactant.atomicMass - this.radiant.atomicMass;
        int massNumber = Math.round(isotopeMass); // Round to the nearest whole number

        // Calculate the number of neutrons
        int numberOfNeutrons = massNumber - resultingAtomicNumber;

        // Check if the calculated values are valid
        if (resultingAtomicNumber < 0 || numberOfNeutrons < 0) {
            return null; // Invalid isotope
        }

        // Check if the resulting isotope is stable
        ElementItem resultingIsotope = ModElements.getElementFromMass(massNumber);
        if (resultingIsotope != null) {
            return resultingIsotope; // Return stable isotope
        } else {
            // Create a temporary item for the unstable isotope
            return createTemporaryIsotope(resultingAtomicNumber, numberOfNeutrons);
        }
    }

    private ElementItem createTemporaryIsotope(int protons, int neutrons) {
        // Create a temporary ElementItem for the unstable isotope
        // You can customize the properties of this temporary item as needed
        String name = "Unstable Isotope " + protons + "-" + (protons + neutrons);
        float atomicMass = (protons * ModElements.getMassFromElement(ModElements.PROTON) + neutrons * ModElements.getMassFromElement(ModElements.NEUTRON)); // Calculate approximate mass
        return new ElementItem(new FabricItemSettings(), name, protons, atomicMass); // Assuming false indicates instability
    }

    // Getters for radiation values
    public float getAlphaRadiation() {
        return alphaRadiation;
    }

    public float getBetaRadiation() {
        return betaRadiation;
    }

    public float getGammaRadiation() {
        return gammaRadiation;
    }
}