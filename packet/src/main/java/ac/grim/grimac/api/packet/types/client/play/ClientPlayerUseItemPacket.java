package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.player.enums.InteractionHand;
import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientPlayerUseItemPacket extends RecievablePacket {
    InteractionHand getHand();
    int getSequence();
}
