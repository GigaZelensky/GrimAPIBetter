package ac.grim.grimac.api.packet.entity;

public interface PacketEntityManager {
    PacketEntityType getEntityTypeFromString(String boat);

    boolean isTypeInstanceOf(PacketEntityType type, PacketEntityType parent);
}
