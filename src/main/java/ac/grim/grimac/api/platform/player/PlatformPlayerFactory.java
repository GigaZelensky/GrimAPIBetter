package ac.grim.grimac.api.platform.player;

import org.jetbrains.annotations.ApiStatus;

import java.util.Collection;
import java.util.UUID;

@ApiStatus.Experimental
public interface PlatformPlayerFactory {
    PlatformPlayer getFromUUID(UUID uuid);

    PlatformPlayer getFromNativePlayerType(Object playerObject);

    void invalidatePlayer(UUID uuid);

    Collection<PlatformPlayer> getOnlinePlayers();
}
