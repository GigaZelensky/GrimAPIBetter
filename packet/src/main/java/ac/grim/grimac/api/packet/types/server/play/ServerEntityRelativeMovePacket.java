package ac.grim.grimac.api.packet.types.server.play;
import ac.grim.grimac.api.packet.MCPacket;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityRelativeMovePacket {
    static ServerEntityRelativeMovePacket from(PacketSendEvent event) {
        return MCPacket.getAPI().packetFactory().serverEntityRelativeMovePacket(event);
    }

    int getEntityId();

    double getDeltaX();

    double getDeltaY();

    double getDeltaZ();
}
