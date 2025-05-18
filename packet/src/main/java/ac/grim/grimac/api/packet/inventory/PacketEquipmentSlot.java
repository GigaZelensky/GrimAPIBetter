package ac.grim.grimac.api.packet.inventory;

public enum PacketEquipmentSlot {
    MAIN_HAND(0),
    OFF_HAND(0),
    BOOTS(1),
    LEGGINGS(2),
    CHEST_PLATE(3),
    HELMET(4),
    BODY(0),
    SADDLE(0);

    // todo
    private final int legacyId;

    PacketEquipmentSlot(int legacyId) {
        this.legacyId = legacyId;
    }
}
