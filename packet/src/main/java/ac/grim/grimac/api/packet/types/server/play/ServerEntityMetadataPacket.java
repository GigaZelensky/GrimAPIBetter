package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.entity.EntityData;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

import java.util.List;

public interface ServerEntityMetadataPacket {
    static ServerEntityMetadataPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    List<EntityData<?>> getEntityMetadata();

    void setEntityMetadata(List<EntityData<?>> metadataStuff);
}
