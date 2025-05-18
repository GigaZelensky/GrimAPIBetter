package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientHeldItemChangePacket extends RecievablePacket {
    int getSlot();
}
