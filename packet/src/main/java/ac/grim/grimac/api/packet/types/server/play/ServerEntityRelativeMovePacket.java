package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerEntityRelativeMovePacket {
    static ServerEntityRelativeMovePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    double getDeltaX();

    double getDeltaY();

    double getDeltaZ();
}
