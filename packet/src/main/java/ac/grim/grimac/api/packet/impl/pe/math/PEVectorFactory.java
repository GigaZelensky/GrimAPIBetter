package ac.grim.grimac.api.packet.impl.pe.math;

import ac.grim.grimac.api.packet.manager.VectorFactory;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3f;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

public class PEVectorFactory implements VectorFactory {
    @Override
    public ImmutableVector3i getImmutableVec3i() {
        return null;
    }

    @Override
    public ImmutableVector3i getImmutableVec3i(int x, int y, int z) {
        return null;
    }

    @Override
    public ImmutableVector3f getImmutableVector3f() {
        return null;
    }

    @Override
    public ImmutableVector3f getImmutableVector3f(float x, float y, float z) {
        return null;
    }

    @Override
    public ImmutableVector3d getImmutableVec3d() {
        return null;
    }

    @Override
    public ImmutableVector3d getImmutableVec3d(double x, double y, double z) {
        return null;
    }
}
