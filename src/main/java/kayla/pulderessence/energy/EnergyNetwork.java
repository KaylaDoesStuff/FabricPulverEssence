package kayla.pulderessence.energy;

import kayla.pulderessence.block.custom.CableBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.*;

public class EnergyNetwork {
    private final long id;
    private final Set<BlockPos> nodes = new HashSet<>();
    private final Map<BlockPos, CableBlockEntity> nodeData = new HashMap<>();

    private double totalVoltage;
    private double totalAmperage;
    private double totalResistance;

    public EnergyNetwork(long id) {
        this.id = id;
    }

    public long getId() { return id; }

    public void addNode(BlockPos pos, CableBlockEntity be) {
        nodes.add(pos);
        nodeData.put(pos, be);
        be.setNetworkId(id);
        recalculate();
    }

    public void removeNode(BlockPos pos) {
        nodes.remove(pos);
        nodeData.remove(pos);
        recalculate();
    }

    public boolean isEmpty() { return nodes.isEmpty(); }

    public boolean nodesContainsPos(BlockPos pos) {
        return nodes.contains(pos);
    }

    public void recalculate() {
        totalResistance = nodeData.values().stream()
                .mapToDouble(CableBlockEntity::getResistance)
                .sum();
        totalVoltage = 0;
        totalAmperage = 0;
    }

    public void tickEnergyFlow() {
        if (nodes.isEmpty()) return;

        if (totalResistance > 0 && totalVoltage > 0) {
            double current = totalVoltage / totalResistance;
            double voltageDrop = current * totalResistance / Math.max(1, nodes.size());

            for (Map.Entry<BlockPos, CableBlockEntity> entry : nodeData.entrySet()) {
                CableBlockEntity be = entry.getValue();
                double nodeVoltage = be.getVoltage();
                if (nodeVoltage > 0) {
                    double newVoltage = Math.max(0, nodeVoltage - voltageDrop);
                    be.setVoltage(newVoltage);
                    be.setAmperage(current / Math.max(1, nodes.size()));
                }
            }
        }
    }

    public void merge(EnergyNetwork other) {
        for (Map.Entry<BlockPos, CableBlockEntity> entry : other.nodeData.entrySet()) {
            addNode(entry.getKey(), entry.getValue());
        }
    }

    public List<EnergyNetwork> splitAt(BlockPos pos) {
        nodes.remove(pos);
        nodeData.remove(pos);

        List<Set<BlockPos>> components = new ArrayList<>();
        Set<BlockPos> visited = new HashSet<>();

        for (BlockPos start : nodes) {
            if (visited.contains(start)) continue;
            Set<BlockPos> component = new HashSet<>();
            Queue<BlockPos> queue = new LinkedList<>();
            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                BlockPos current = queue.poll();
                component.add(current);

                for (BlockPos neighbor : getConnectedNeighbors(current)) {
                    if (nodes.contains(neighbor) && !visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            components.add(component);
        }

        List<EnergyNetwork> result = new ArrayList<>();
        for (int i = 0; i < components.size(); i++) {
            EnergyNetwork sub = new EnergyNetwork(id + i + 1);
            for (BlockPos p : components.get(i)) {
                CableBlockEntity be = nodeData.get(p);
                if (be != null) sub.addNode(p, be);
            }
            result.add(sub);
        }
        return result;
    }

    private List<BlockPos> getConnectedNeighbors(BlockPos pos) {
        List<BlockPos> neighbors = new ArrayList<>();
        for (Direction dir : Direction.values()) {
            neighbors.add(pos.offset(dir));
        }
        return neighbors;
    }

    public double getTotalVoltage() { return totalVoltage; }
    public double getTotalAmperage() { return totalAmperage; }
    public int getNodeCount() { return nodes.size(); }
}
