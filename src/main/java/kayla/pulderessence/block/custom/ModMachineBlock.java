package kayla.pulderessence.block.custom;

import kayla.pulderessence.block.entity.ImplementedInventory;
import kayla.pulderessence.recipe.MachineRecipe;
import kayla.pulderessence.recipe.RecipeManager;
import kayla.pulderessence.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ModMachineBlockEntity extends BlockEntity implements ImplementedInventory {
    private final DefaultedList<ItemStack> items;
    private int powerStored;
    private int maxVoltage;
    private int voltageInput;
    private final String machineName;

    public ModMachineBlockEntity(String machineName) {
        super(ModMachineBlockEntity::new); // Ensure to call the super constructor with the correct BlockEntityType
        this.items = DefaultedList.ofSize(3, ItemStack.EMPTY); // Example size
        this.machineName = machineName;
        this.powerStored = 0;
        this.maxVoltage = 100; // Example maximum voltage
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    public void tick() {
        // Check for voltage input
        if (voltageInput > 0) {
            addVoltage(voltageInput);
        }

        // Process the recipe if conditions are met
        if (canProcessRecipe()) {
            processRecipe();
        }
    }

    public void setVoltageInput(int voltage) {
        this.voltageInput = voltage;
    }

    private void addVoltage(int voltage) {
        powerStored += voltage;

        // Check if the power exceeds the maximum voltage
        if (powerStored > maxVoltage) {
            explode();
        }
    }

    private void explode() {
        // Create an explosion at the block's position
        if (world != null) {
            world.createExplosion(null, getPos().getX(), getPos().getY(), getPos().getZ(), 4.0F, Explosion.DestructionType.DESTROY);
        }

        // Remove the block
        world.removeBlock(getPos(), false); // Remove the block without dropping items

        // Optionally, drop items from the inventory
        for (ItemStack itemStack : items) {
            if (!itemStack.isEmpty()) {
                ItemEntity itemEntity = new ItemEntity(world, getPos().getX(), getPos().getY(), getPos().getZ(), itemStack);
                world.spawnEntity(itemEntity);
            }
        }

        // Reset power stored to prevent further processing
        powerStored = 0;
    }

    private boolean canProcessRecipe() {
        // Check if there is enough power and if the input item matches the recipe
        MachineRecipe recipe = RecipeManager.getRecipe(machineName, items.get(0));
        return recipe != null && powerStored >= recipe.getRequiredVoltage() && isInputItemValid(recipe);
    }

    private boolean isInputItemValid(MachineRecipe recipe) {
        // Logic to check if the input item matches the recipe
        ItemStack inputItem = items.get(0); // Assuming input is in slot 0
        return inputItem.isItemEqual(recipe.getInput());
    }

    private void processRecipe() {
        // Subtract the required voltage from the stored power
        MachineRecipe recipe = RecipeManager.getRecipe(machineName, items.get(0));
        if (recipe != null) {
            powerStored -= recipe.getRequiredVoltage();

            // Get the output item from the recipe
            ItemStack outputItem = recipe.getOutput();

            // Logic to handle output
            if (items.get(1).isEmpty() || items.get(1).isItemEqual(outputItem)) {
                // If the output slot is empty or matches the output item, set the output
                items.set(1, outputItem);
            }
        }
    }

    @Override
    public void fromTag(NbtCompound tag) {
        super.fromTag(tag);
        powerStored = tag.getInt("PowerStored");
        voltageInput = tag.getInt("VoltageInput");
        Inventories.readNbt(tag, items);
    }

    @Override
    public NbtCompound toTag(NbtCompound tag) {
        super.toTag(tag);
        tag.putInt("PowerStored", powerStored);
        tag.putInt("VoltageInput", voltageInput);
        Inventories.writeNbt(tag, items);
        return tag;
    }
    @Override
    public int[] getAvailableSlots(Direction side) {
        return new int[]{0, 1}; // Input and output slots
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        return slot == 0; // Only allow insertion into the input slot
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        return slot == 1; // Only allow extraction from the output slot
    }

    @Override
    public void markDirty() {
        super.markDirty(); // Corrected method call
    }
}
