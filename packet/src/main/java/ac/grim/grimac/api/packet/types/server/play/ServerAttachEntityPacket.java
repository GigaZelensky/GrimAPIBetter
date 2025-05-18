package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerAttachEntityPacket extends SendablePacket {
    static ServerAttachEntityPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerAttachEntityPacket from(int attachedId, int holdingId, boolean leash) {
        return null; // TODO (Packet Rewrite)
    }

    int getHoldingId();

    int getAttachedId();

    boolean isLeash();
}
