package ac.grim.grimac.api.packet.util.vec;

public interface ImmutableVector3d extends Vector3d {

    ImmutableVector3d add(Vector3d immutableVec3d);

    ImmutableVector3d add(double x, double y, double z);

    ImmutableVector3d withY(double y);

    ImmutableVector3d withX(double x);

    ImmutableVector3d withZ(double z);

    ImmutableVector3d subtract(ImmutableVector3d start);
}