package kayla.pulderessence.block.entity;

import kayla.pulderessence.PulderEssence;
import kayla.pulderessence.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ChargingStationBlockEntity> CHARGING_STATION_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier(PulderEssence.MOD_ID, "charging_station_be"),
                    FabricBlockEntityTypeBuilder.create(ChargingStationBlockEntity::new,
                            ModBlocks.CHARGING_STATION).build());

    public static void registerBlockEntities(){}
}
