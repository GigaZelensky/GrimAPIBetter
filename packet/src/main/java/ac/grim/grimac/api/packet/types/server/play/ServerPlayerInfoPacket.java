package ac.grim.grimac.api.packet.types.server.play;

public interface ServerPlayerInfoPacket {
    enum Action {
        ADD_PLAYER,
        UPDATE_GAME_MODE,
        UPDATE_LATENCY,
        UPDATE_DISPLAY_NAME,
        REMOVE_PLAYER;
    }
}
