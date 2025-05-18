package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.types.PacketType;

public interface PacketTypeFactory {
    PacketType getHandshakingC2SPacketTypeByString(String packetIdentifier);

    PacketType getHandshakingS2CPacketTypeByString(String packetIdentifier);

    PacketType getStatusC2SPacketTypeByString(String packetIdentifier);

    PacketType getStatusS2CPacketTypeByString(String packetIdentifier);

    PacketType getLoginC2SPacketTypeByString(String packetIdentifier);

    PacketType getLoginS2CPacketTypeByString(String packetIdentifier);

    PacketType getConfigurationC2SPacketTypeByString(String packetIdentifier);

    PacketType getConfigurationS2CPacketTypeByString(String packetIdentifier);

    PacketType getPlayC2SPacketTypeByString(String packetIdentifier);

    PacketType getPlayS2CPacketTypeByString(String packetIdentifier);

}
