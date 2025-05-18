package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.player.PacketUserProfile;
import ac.grim.grimac.api.packet.player.enums.GameMode;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;

import java.util.List;

public interface ServerPlayerInfoPacket {
    static ServerPlayerInfoPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    Action getAction();

    List<PlayerData> getPlayerDataList();

    enum Action {
        ADD_PLAYER,
        UPDATE_GAME_MODE,
        UPDATE_LATENCY,
        UPDATE_DISPLAY_NAME,
        REMOVE_PLAYER;
    }
    
    interface PlayerData {

        PacketUserProfile getUser();

        PacketUserProfile getUserProfile();

        GameMode getGameMode();

        void setGameMode(GameMode gameMode);
    }
}
