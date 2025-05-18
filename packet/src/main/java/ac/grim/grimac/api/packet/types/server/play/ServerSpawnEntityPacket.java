package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.entity.PacketEntityType;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

import java.util.Optional;
import java.util.UUID;

public interface ServerSpawnEntityPacket {
    static ServerSpawnEntityPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    Optional<UUID> getUUID();

    PacketEntityType getEntityType();

    ImmutableVector3d getPosition();

    float getYaw();

    float getPitch();

    int getData();
}
