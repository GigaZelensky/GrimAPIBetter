package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.player.PacketUserProfile;
import ac.grim.grimac.api.packet.player.enums.GameMode;
import ac.grim.grimac.api.packet.protocol.chat.RemoteChatSession;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.List;

public interface ServerPlayerInfoUpdatePacket {
    static ServerPlayerInfoUpdatePacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    List<PlayerInfo> getEntries();

    EnumSet<Action> getActions();

    void setEntries(List<PlayerInfo> entries);

    interface PlayerInfo {
        static PlayerInfo from(PacketUserProfile profile, boolean listed, int latency, GameMode gameMode, @Nullable Component displayName, @Nullable RemoteChatSession chatSession) {
            return null; // TODO (Packet Rewrite)
        }

        PacketUserProfile getGameProfile();

        GameMode getGameMode();

        boolean isListed();

        int getLatency();

        @Nullable Component getDisplayName();

        RemoteChatSession getChatSession();
    }

    enum Action {
        ADD_PLAYER,
        INITIALIZE_CHAT,
        UPDATE_GAME_MODE,
        UPDATE_LISTED,
        UPDATE_LATENCY,
        UPDATE_DISPLAY_NAME,
        /**
         * Updates the order in which the player is listed in the tablist.<br>
         * Added with 1.21.2
         */
        UPDATE_LIST_ORDER,
        /**
         * Updates whether the outer skin layer (hat) of the player will be shown in tablist.<br>
         * Added with 1.21.4
         */
        UPDATE_HAT;
    }
}
