package ac.grim.grimac.api.platform.entity;

import ac.grim.grimac.api.math.Location;
import ac.grim.grimac.api.platform.world.PlatformWorld;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@ApiStatus.Experimental
public interface GrimEntity {
    UUID getUniqueId();

    /**
     * Eject any passenger.
     *
     * @return True if there was a passenger.
     */
    boolean eject();

    CompletableFuture<Boolean> teleportAsync(Location location);

    @NotNull
    Object getNative();

    boolean isDead();

    PlatformWorld getWorld();

    Location getLocation();
}
