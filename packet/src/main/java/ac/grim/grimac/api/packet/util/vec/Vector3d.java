package ac.grim.grimac.api.packet.util.vec;

public interface Vector3d {
    double getX();
    double getY();
    double getZ();

    double distanceSquared(Vector3d position);

    Vector3d add(Vector3d immutableVec3d);

    double lengthSquared();
}