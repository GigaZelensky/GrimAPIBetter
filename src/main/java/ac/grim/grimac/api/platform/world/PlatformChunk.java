package ac.grim.grimac.api.platform.world;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PlatformChunk {
    int getBlockID(int x, int y, int z);
}
