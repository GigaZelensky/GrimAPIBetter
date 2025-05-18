package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import ac.grim.grimac.api.packet.player.enums.InteractionHand;
import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3f;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3i;
import ac.grim.grimac.api.packet.world.enums.BlockFace;

import java.util.Optional;

public interface ClientPlayerBlockPlacementPacket extends RecievablePacket {
    BlockFace getFace();
    Optional<PacketItemStack> getItemStack();
    int getSequence();
    ImmutableVector3i getBlockPosition();
    ImmutableVector3f getCursorPosition();
    InteractionHand getHand();

    int getFaceId();

    Optional<Boolean> getInsideBlock();
}
