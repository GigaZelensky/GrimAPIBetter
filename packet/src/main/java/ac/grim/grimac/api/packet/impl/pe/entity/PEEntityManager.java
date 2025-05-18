package ac.grim.grimac.api.packet.impl.pe.entity;

import ac.grim.grimac.api.packet.entity.PacketEntityManager;
import ac.grim.grimac.api.packet.entity.PacketEntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;

public class PEEntityManager implements PacketEntityManager {
    @Override
    public PacketEntityType getEntityTypeFromString(String boat) {
        return EntityTypes.getByName(boat);
    }

    @Override
    public boolean isTypeInstanceOf(PacketEntityType type, PacketEntityType parent) {
        return EntityTypes.isTypeInstanceOf((EntityType) type, (EntityType) parent);
    }
}
