package ac.grim.grimac.api.platform.manager;

import ac.grim.grimac.api.platform.player.PlatformPlayer;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public interface ItemResetHandler {
    void resetItemUsage(@Nullable PlatformPlayer player);
}
