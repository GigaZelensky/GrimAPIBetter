package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.player.enums.DiggingAction;
import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;
import ac.grim.grimac.api.packet.world.enums.BlockFace;

public interface ClientPlayerDiggingPacket extends RecievablePacket {
    DiggingAction getDiggingAction();

    int getBlockFaceId();

    ImmutableVector3i getBlockPosition();

    int getSequence();

    BlockFace getBlockFace();
}
