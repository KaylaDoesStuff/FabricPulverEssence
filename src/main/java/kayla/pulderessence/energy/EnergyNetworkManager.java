package kayla.pulderessence.energy;

import kayla.pulderessence.block.custom.CableBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.*;

public class EnergyNetworkManager {
    private static final Map<Integer, Map<Long, EnergyNetwork>> WORLD_NETWORKS = new HashMap<>();
    private static long nextNetworkId = 1;

    public static long getNextNetworkId() {
        return nextNetworkId++;
    }

    public static EnergyNetwork getOrCreateNetwork(World world, long networkId) {
        Map<Long, EnergyNetwork> networks = WORLD_NETWORKS.computeIfAbsent(world.getRegistryKey().toString().hashCode(), k -> new HashMap<>());
        return networks.computeIfAbsent(networkId, EnergyNetwork::new);
    }

    public static void registerNode(World world, BlockPos pos, CableBlockEntity be) {
        EnergyNetwork network = getOrCreateNetwork(world, getNextNetworkId());
        network.addNode(pos, be);
        WORLD_NETWORKS.get(world.getRegistryKey().toString().hashCode()).put(network.getId(), network);
    }

    public static void mergeNetworks(World world, long networkId1, long networkId2) {
        if (networkId1 == networkId2) return;
        Map<Long, EnergyNetwork> networks = WORLD_NETWORKS.get(world.getRegistryKey().toString().hashCode());
        if (networks == null) return;

        EnergyNetwork net1 = networks.get(networkId1);
        EnergyNetwork net2 = networks.get(networkId2);
        if (net1 == null || net2 == null) return;

        net1.merge(net2);
        networks.remove(networkId2);
    }

    public static void splitNetwork(World world, BlockPos pos) {
        Map<Long, EnergyNetwork> networks = WORLD_NETWORKS.get(world.getRegistryKey().toString().hashCode());
        if (networks == null) return;

        for (Map.Entry<Long, EnergyNetwork> entry : networks.entrySet()) {
            EnergyNetwork network = entry.getValue();
            if (network.nodesContainsPos(pos)) {
                List<EnergyNetwork> splits = network.splitAt(pos);
                networks.remove(entry.getKey());
                for (EnergyNetwork sub : splits) {
                    networks.put(sub.getId(), sub);
                }
                break;
            }
        }
    }

    public static void tickNetworks(World world) {
        Map<Long, EnergyNetwork> networks = WORLD_NETWORKS.get(world.getRegistryKey().toString().hashCode());
        if (networks == null) return;
        for (EnergyNetwork network : networks.values()) {
            network.tickEnergyFlow();
        }
    }
}
