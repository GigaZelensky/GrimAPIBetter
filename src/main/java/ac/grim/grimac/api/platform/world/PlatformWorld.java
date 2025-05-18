package ac.grim.grimac.api.platform.world;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@ApiStatus.Experimental
public interface PlatformWorld {
    boolean isChunkLoaded(int chunkX, int chunkZ);

    boolean isAirAt(int x, int y, int z);

    String getName();

    @Nullable UUID getUID();

    PlatformChunk getChunkAt(int currChunkX, int currChunkZ);

    boolean isLoaded();
}
