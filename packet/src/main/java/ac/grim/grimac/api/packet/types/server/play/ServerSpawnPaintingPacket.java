package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;

import java.util.UUID;

public interface ServerSpawnPaintingPacket {
    static ServerSpawnPaintingPacket from(PacketSendEvent event) {
        return MCPacket.getAPI().packetFactory().serverSpawnPaintingPacket.from(event);
    }

    int getEntityId();

    UUID getUUID();

    ImmutableVector3i getPosition();
}
