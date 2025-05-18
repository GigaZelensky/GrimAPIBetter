package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerDestroyEntitiesPacket extends SendablePacket {
    static ServerDestroyEntitiesPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int[] getEntityIds();
}
