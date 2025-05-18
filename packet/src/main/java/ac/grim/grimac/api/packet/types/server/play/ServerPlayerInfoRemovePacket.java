package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

import java.util.List;
import java.util.UUID;

public interface ServerPlayerInfoRemovePacket {
    static ServerPlayerInfoRemovePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    List<UUID> getProfileIds();
}
