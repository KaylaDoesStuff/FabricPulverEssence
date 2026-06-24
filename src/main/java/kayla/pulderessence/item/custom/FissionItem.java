package kayla.pulderessence.item.custom;

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
        // TODO: implement isotope lookup when element system is added
        return null;
    }

    private ElementItem getIsotopeResult() {
        // TODO: implement isotope result when element system is added
        return null;
    }

    private ElementItem createTemporaryIsotope(int protons, int neutrons) {
        // TODO: implement temporary isotope creation when element system is added
        return null;
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
