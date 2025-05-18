package ac.grim.grimac.api.packet.types.event;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.types.PacketWrapperFactory;

public interface PacketListenerInterface {

    PacketWrapperFactory packetFactory = MCPacket.getAPI().packetFactory();

    default void onPacketReceive(PacketReceiveEvent event) {

    }
    default void onPacketSend(PacketSendEvent event) {

    }

    /**
     * LOWEST, LOW, NORMAL, HIGH, HIGHEST, MONITOR
     * @return
     */
    default int getListenerPriority() {
        return ListenerPriority.NORMAL;
    }
}
