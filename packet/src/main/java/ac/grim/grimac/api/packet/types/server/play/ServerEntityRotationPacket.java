package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityRotationPacket {
    static ServerEntityRotationPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    float getYaw();

    float getPitch();
}
