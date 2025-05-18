package ac.grim.grimac.api.packet.potions;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface PacketPotionType {
    int getId(PacketClientVersion version);
}
