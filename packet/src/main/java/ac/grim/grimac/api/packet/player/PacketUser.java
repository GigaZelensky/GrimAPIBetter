package ac.grim.grimac.api.packet.player;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.protocol.PacketClientVersions;
import ac.grim.grimac.api.packet.protocol.PacketConnectionState;
import ac.grim.grimac.api.packet.types.Packet;
import ac.grim.grimac.api.packet.types.SendablePacket;
import net.kyori.adventure.text.Component;

import java.util.UUID;

public interface PacketUser {
    void sendPacket(SendablePacket packet);

    PacketUserProfile getProfile();

    UUID getUUID();

    String getName();

    Object getChannel();

    void writePacket(Packet packet);

    void sendMessage(Component component);

    void closeConnection();

    PacketConnectionState getPlayerEncoderState();

    PacketConnectionState getPlayerDecoderState();

    PacketClientVersion getPlayerClientVersion();
}
