package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityRelativeMoveAndRotationPacket {
    static ServerEntityRelativeMoveAndRotationPacket from(PacketSendEvent event) {
        return MCPacket.getAPI().packetFactory().serverEntityRelativeMoveAndRotationPacket.from(event);
    }

    int getEntityId();

    double getDeltaX();

    double getDeltaY();

    double getDeltaZ();

    float getYaw();

    float getPitch();
}
