package ac.grim.grimac.api.packet.types.server.play;
import ac.grim.grimac.api.packet.MCPacket;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ServerEntityPositionSyncPacket {
    static ServerEntityPositionSyncPacket from(PacketSendEvent event) {
        return MCPacket.getAPI().packetFactory().serverEntityPositionSyncPacket(event);
    }

    int getId();
    ImmutableVector3d getPosition();
    float getYaw();
    float getPitch();
}
