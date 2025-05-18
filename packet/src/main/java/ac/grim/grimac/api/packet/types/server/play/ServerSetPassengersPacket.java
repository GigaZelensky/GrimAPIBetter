package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerSetPassengersPacket extends SendablePacket {
    static ServerSetPassengersPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerSetPassengersPacket from(int entityId, int[] passengers) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    int[] getPassengers();
}
