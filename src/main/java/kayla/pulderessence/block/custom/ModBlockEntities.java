package kayla.pulderessence.block.custom;

import kayla.pulderessence.PulderEssence;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<CableBlockEntity> CABLE_BLOCK_ENTITY;

    public static void init(BlockEntityType<CableBlockEntity> type) {
        CABLE_BLOCK_ENTITY = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier(PulderEssence.MOD_ID, "cable"),
                type
        );
    }
}
