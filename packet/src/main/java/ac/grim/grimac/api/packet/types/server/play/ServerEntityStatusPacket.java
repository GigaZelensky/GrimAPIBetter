package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityStatusPacket extends PacketSendEvent {
    static ServerEntityStatusPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getStatus();

    int getEntityId();
}
