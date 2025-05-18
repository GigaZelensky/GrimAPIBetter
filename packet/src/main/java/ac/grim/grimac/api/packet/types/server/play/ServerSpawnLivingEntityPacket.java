package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.entity.EntityData;
import ac.grim.grimac.api.packet.entity.PacketEntityType;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

import java.util.List;
import java.util.UUID;

public interface ServerSpawnLivingEntityPacket {
    static ServerSpawnLivingEntityPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    UUID getEntityUUID();

    PacketEntityType getEntityType();

    ImmutableVector3d getPosition();

    float getYaw();

    float getPitch();

    List<EntityData<?>> getEntityMetadata();
}
