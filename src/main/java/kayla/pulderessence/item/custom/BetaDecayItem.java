package kayla.pulderessence.item.custom;

import kayla.pulderessence.item.ModElements;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class BetaDecayItem extends Item {
    public ElementItem parentElement; // The element undergoing beta decay

    public BetaDecayItem(Settings settings, ElementItem parentElement) {
        super(settings);
        this.parentElement = parentElement;
    }

    public void performBetaDecay(PlayerEntity player) {
        // Check if the element can undergo beta decay
        if (parentElement.atomicNumber < 118) { // Assuming 118 is the max atomic number
            // Create a new atomic number for the resulting isotope
            int newAtomicNumber = parentElement.atomicNumber + 1;
            ElementItem newElement = ModElements.getElementFromNumber(newAtomicNumber);

            // Create a temporary item stack for the resulting isotope
            ItemStack isotopeItem = new ItemStack(ModElements.ISOTOPE_ITEM); // Assuming you have a generic item for isotopes

            // Create an NBT compound to store isotope information
            NbtCompound nbt = new NbtCompound();
            nbt.putString("isotopeName", newElement.getName().toString());
            nbt.putFloat("mass", newElement.atomicMass); // Use the mass directly from the ElementItem
            isotopeItem.setNbt(nbt);

            // Give the temporary item to the player
            player.giveItemStack(isotopeItem);
        }
    }

    public ElementItem getBetaParticle() {
        return ModElements.BETA; // Return the beta particle
    }
}