package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

import java.util.UUID;

public interface ServerSpawnPaintingPacket {
    static ServerSpawnPaintingPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    UUID getUUID();

    ImmutableVector3i getPosition();
}
