package kayla.pulderessence.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;



public class CableBlock extends BlockWithEntity implements BlockEntityProvider {

    public static final BooleanProperty NORTH = BooleanProperty.of("north");
    public static final BooleanProperty EAST = BooleanProperty.of("east");
    public static final BooleanProperty SOUTH = BooleanProperty.of("south");
    public static final BooleanProperty WEST = BooleanProperty.of("west");
    public static final BooleanProperty UP = BooleanProperty.of("up");
    public static final BooleanProperty DOWN = BooleanProperty.of("down");

    private final double voltage;
    private final double amperage;
    private final double loss;
    private final int thickness;
    private final boolean insulated;

    public CableBlock(Settings settings, double voltage, double amperage, double loss, int thickness, boolean insulated) {
        super(settings);
        this.voltage = voltage;
        this.amperage = amperage;
        this.loss = loss;
        this.thickness = thickness;
        this.insulated = insulated;
        setDefaultState(getStateManager().getDefaultState()
                .with(NORTH, false).with(EAST, false).with(SOUTH, false)
                .with(WEST, false).with(UP, false).with(DOWN, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state.with(getProperty(direction), neighborState.getBlock() instanceof CableBlock);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        updateConnections(world, pos, state);
    }

    private void updateConnections(World world, BlockPos pos, BlockState state) {
        BlockState newState = state;
        for (Direction dir : Direction.values()) {
            BlockPos neighbor = pos.offset(dir);
            BlockState neighborState = world.getBlockState(neighbor);
            newState = newState.with(getProperty(dir), neighborState.getBlock() instanceof CableBlock);
        }
        if (newState != state) {
            world.setBlockState(pos, newState);
        }
        for (Direction dir : Direction.values()) {
            BlockPos neighbor = pos.offset(dir);
            BlockState neighborState = world.getBlockState(neighbor);
            if (neighborState.getBlock() instanceof CableBlock) {
                BooleanProperty prop = ((CableBlock) neighborState.getBlock()).getProperty(dir.getOpposite());
                world.setBlockState(neighbor, neighborState.with(prop, true));
            }
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        double c = 0.5 - thickness * 0.03125;
        VoxelShape center = VoxelShapes.cuboid(c, c, c, 1 - c, 1 - c, 1 - c);
        VoxelShape shape = center;
        if (state.get(NORTH)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(c, c, 0, 1 - c, 1 - c, c));
        if (state.get(SOUTH)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(c, c, 1 - c, 1 - c, 1 - c, 1));
        if (state.get(EAST)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1 - c, c, c, 1, 1 - c, 1 - c));
        if (state.get(WEST)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, c, c, c, 1 - c, 1 - c));
        if (state.get(UP)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(c, 1 - c, c, 1 - c, 1, 1 - c));
        if (state.get(DOWN)) shape = VoxelShapes.union(shape, VoxelShapes.cuboid(c, 0, c, 1 - c, c, 1 - c));
        return shape;
    }

    public static BooleanProperty getProperty(Direction dir) {
        return switch (dir) {
            case NORTH -> NORTH;
            case EAST -> EAST;
            case SOUTH -> SOUTH;
            case WEST -> WEST;
            case UP -> UP;
            case DOWN -> DOWN;
        };
    }

    public double getVoltage() { return voltage; }
    public double getMaxAmperage() { return amperage * thickness; }
    public double getEffectiveLoss() { return loss / thickness; }
    public int getThickness() { return thickness; }
    public boolean isInsulated() { return insulated; }
    public boolean isSuperconductor() { return loss == 0; }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CableBlockEntity(pos, state, voltage, amperage * thickness, loss / thickness, insulated);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (type != ModBlockEntities.CABLE_BLOCK_ENTITY) return null;
        return world.isClient ? null : (w, p, s, be) -> CableBlockEntity.serverTick(w, p, s, (CableBlockEntity) be);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
