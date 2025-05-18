package ac.grim.grimac.api.packet.util.vec;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.manager.server.ServerVersion;

public interface Vector3i {
    int getX();
    int getY();
    int getZ();

    default long getSerializedPosition(ServerVersion serverVersion) {
        // 1.17 adds support for negative values
        if (serverVersion.isNewerThanOrEquals(ServerVersion.V_1_17)) {
            long x = getX() & 0x3FFFFFF;
            long y = getY() & 0xFFF;
            long z = getZ() & 0x3FFFFFF;

            return x << 38 | z << 12 | y;
        }
        // 1.14 method for this is storing X Z Y
        if (serverVersion.isNewerThanOrEquals(ServerVersion.V_1_14)) {
            return ((long) (getX() & 0x3FFFFFF) << 38) | ((long) (getZ() & 0x3FFFFFF) << 12) | (getY() & 0xFFF);
        }
        // 1.13 and below store X Y Z
        return ((long) (getX() & 0x3FFFFFF) << 38) | ((long) (getY() & 0xFFF) << 26) | (getZ() & 0x3FFFFFF);
    }

    @Deprecated
    default long getSerializedPosition() {
        return getSerializedPosition(PacketEvents.getAPI().getServerManager().getVersion());
    }

    Vector3i add(int x, int y, int z);
}
