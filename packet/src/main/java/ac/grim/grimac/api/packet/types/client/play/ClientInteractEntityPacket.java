package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.player.enums.InteractionHand;
import ac.grim.grimac.api.packet.types.RecievablePacket;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3f;

import java.util.Optional;

public interface ClientInteractEntityPacket extends RecievablePacket {
    InteractAction getInteractAction();

    int getEntityId();

    Optional<ImmutableVector3f> getTarget();

    Optional<Boolean> isSneaking();

    InteractionHand getInteractionHand();

    enum InteractAction {
        INTERACT, ATTACK, INTERACT_AT;
    }
}
