package ac.grim.grimac.api.data.world;

import ac.grim.grimac.api.data.PistonData;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental @ApiStatus.Internal
public interface ICompensatedWorld {
    @ApiStatus.Experimental @ApiStatus.Internal
    boolean isChunkLoaded(int chunkX, int chunkZ);

    @ApiStatus.Experimental @ApiStatus.Internal
    void addActivePistons(PistonData data);
}
