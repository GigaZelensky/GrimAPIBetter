package ac.grim.grimac.api.packet.util.vec;

public interface ImmutableVector3i extends Vector3i {
    ImmutableVector3i add(int x, int y, int z);

    ImmutableVector3i withX(int x);
    ImmutableVector3i withY(int y);
    ImmutableVector3i withZ(int z);

    ImmutableVector3d toVector3d();
}
