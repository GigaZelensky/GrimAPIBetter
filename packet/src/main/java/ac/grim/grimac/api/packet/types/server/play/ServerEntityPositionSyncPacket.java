package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ServerEntityPositionSyncPacket {
    static ServerEntityPositionSyncPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getId();
    ImmutableVector3d getPosition();
    float getYaw();
    float getPitch();
}
