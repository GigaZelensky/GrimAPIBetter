package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3f;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public interface VectorFactory {
    ImmutableVector3i getImmutableVec3i();
    ImmutableVector3i getImmutableVec3i(int x, int y, int z);
    ImmutableVector3f getImmutableVector3f();
    ImmutableVector3f getImmutableVector3f(float x, float y, float z);
    ImmutableVector3d getImmutableVec3d();
    ImmutableVector3d getImmutableVec3d(double x, double y, double z);
}
