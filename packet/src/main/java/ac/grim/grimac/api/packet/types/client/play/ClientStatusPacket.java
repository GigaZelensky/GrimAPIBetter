package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.types.RecievablePacket;

public interface ClientStatusPacket extends RecievablePacket {
    Action getClientStatusAction();

    enum Action {
        PERFORM_RESPAWN,
        REQUEST_STATS,

        // This only exists on 1.7.10 -> 1.15.2
        OPEN_INVENTORY_ACHIEVEMENT;
    }
}
