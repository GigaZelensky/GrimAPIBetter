package ac.grim.grimac.api.packet.types.server.play;
import ac.grim.grimac.api.packet.MCPacket;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityRotationPacket {
    static ServerEntityRotationPacket from(PacketSendEvent event) {
        return MCPacket.getAPI().packetFactory().serverEntityRotationPacket(event);
    }

    int getEntityId();

    float getYaw();

    float getPitch();
}
