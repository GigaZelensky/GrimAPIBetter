package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.protocol.potion.PotionType;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

public interface ServerRemoveEntityEffectPacket {
    static ServerRemoveEntityEffectPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    PotionType getPotionType();
}
