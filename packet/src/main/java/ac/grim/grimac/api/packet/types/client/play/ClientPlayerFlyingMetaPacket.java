package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.PacketType;
import ac.grim.grimac.api.packet.types.PacketTypes;

public interface ClientPlayerFlyingMetaPacket {
    static boolean isFlying(PacketType type) {
        return type == PacketTypes.Play.Client.PLAYER_FLYING
                || type == PacketTypes.Play.Client.PLAYER_POSITION
                || type == PacketTypes.Play.Client.PLAYER_ROTATION
                || type == PacketTypes.Play.Client.PLAYER_POSITION_AND_ROTATION;
    }
}
