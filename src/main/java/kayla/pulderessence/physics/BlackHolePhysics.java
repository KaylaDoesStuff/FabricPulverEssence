package kayla.pulderessence.physics;

import kayla.pulderessence.block.custom.SingularityBlockEntity;

import net.minecraft.util.math.Vec3d;

public class BlackHolePhysics {

    public static double getCriticalImpactParameter(double mass) {
        return (3.0 * Math.sqrt(3.0) / 2.0) * SingularityBlockEntity.getSchwarzschildRadius(mass);
    }

    public static double getImpactParameter(Vec3d observer, Vec3d center, Vec3d direction) {
        Vec3d diff = observer.subtract(center);
        Vec3d unitDir = direction.normalize();
        return diff.crossProduct(unitDir).length();
    }

    public static double getDeflectionAngle(double mass, double b) {
        double r_s = SingularityBlockEntity.getSchwarzschildRadius(mass);
        double clampedB = Math.max(b, r_s);
        return 4.0 * SingularityBlockEntity.getMu(mass) / (clampedB * 9e16);
    }

    public static Vec3d getDirectionToBlackHole(Vec3d observer, Vec3d center, Vec3d direction) {
        Vec3d unitDir = direction.normalize();
        double t = center.subtract(observer).dotProduct(unitDir);
        Vec3d closestPoint = observer.add(unitDir.multiply(t));
        return center.subtract(closestPoint).normalize();
    }

    public static Vec3d deflectRay(Vec3d observer, Vec3d center, Vec3d direction, double mass) {
        Vec3d unitDir = direction.normalize();
        Vec3d toCenter = center.subtract(observer);
        double t = toCenter.dotProduct(unitDir);
        Vec3d closestPoint = observer.add(unitDir.multiply(t));
        Vec3d toBlackHole = center.subtract(closestPoint);
        double b = toBlackHole.length();
        double alpha = getDeflectionAngle(mass, b);

        Vec3d perp = toBlackHole.normalize();
        Vec3d k = unitDir.crossProduct(perp).normalize();
        double cosA = Math.cos(alpha);
        double sinA = Math.sin(alpha);
        return unitDir.multiply(cosA)
                .add(k.crossProduct(unitDir).multiply(sinA))
                .add(k.multiply(k.dotProduct(unitDir) * (1 - cosA)))
                .normalize();
    }
}
