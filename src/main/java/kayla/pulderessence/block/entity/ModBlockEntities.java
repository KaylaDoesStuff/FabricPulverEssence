package kayla.pulderessence.block.entity;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import kayla.pulderessence.block.custom.ModMachineBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static void registerBlockEntity(String name, BlockEntityType<?> blockEntityType) {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PulderEssence.MOD_ID, name), blockEntityType);
    }

    public static BlockEntityType<ModMachineBlockEntity> createBlockEntityType() {
        return FabricBlockEntityTypeBuilder.create(ModMachineBlockEntity::new, ModBlocks.CHARGING_STATION).build(null);
    }

    public static void registerBlockEntities() {
        // Register the block entity type for ModMachineBlockEntity
        BlockEntityType<ModMachineBlockEntity> machineBlockEntityType = createBlockEntityType();
        registerBlockEntity("charging_station_be", machineBlockEntityType);

        // You can register more block entities here as needed
    }
}
