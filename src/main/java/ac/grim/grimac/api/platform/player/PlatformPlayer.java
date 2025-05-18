package ac.grim.grimac.api.platform.player;

import ac.grim.grimac.api.math.Vector3dm;
import ac.grim.grimac.api.platform.entity.GrimEntity;
import ac.grim.grimac.api.platform.sender.Sender;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public interface PlatformPlayer extends GrimEntity {
    void kickPlayer(String textReason);

    boolean hasPermission(String s);

    boolean hasPermission(String s, boolean defaultIfUnset);

    boolean isSneaking();

    void setSneaking(boolean b);

    void sendMessage(String message);

    void sendMessage(Component message);

    boolean isOnline();

    String getName();

    void updateInventory();

    Vector3dm getPosition();

    PlatformPlayerInventory getInventory();

    @Nullable GrimEntity getVehicle();

    int getGameModeID();

    void setGameMode(int gameModeID);

    boolean isExternalPlayer();

    void sendPluginMessage(String channelName, byte[] byteArray);

    Sender getSender();

    /*
     * Replaces native player reference in PlatformPlayer implementation with a new object
     * Vanilla MC replaces ServerPlayerEntity references on respawn and dimension change
     */
    default void replaceNativePlayer(Object nativePlayerObject) {}
}
