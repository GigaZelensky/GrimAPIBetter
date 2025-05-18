package ac.grim.grimac.api.packet.protocol.potion;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface PotionType {
    int getId(PacketClientVersion clientVersion);
}
