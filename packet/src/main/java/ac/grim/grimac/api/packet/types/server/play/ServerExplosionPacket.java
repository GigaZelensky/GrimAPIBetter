package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;

public interface ServerExplosionPacket {
    ImmutableVector3d getKnockback();

    /**
     * Removed in 1.21.2
     */
    @ApiStatus.Obsolete
    List<ImmutableVector3i> getRecords();

    /**
     * Removed in 1.21.2
     */
    @ApiStatus.Obsolete
    BlockInteraction getBlockInteraction();

    enum BlockInteraction {
        KEEP_BLOCKS,
        DESTROY_BLOCKS,
        DECAY_DESTROYED_BLOCKS,
        TRIGGER_BLOCKS,
    }
}
