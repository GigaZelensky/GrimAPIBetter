package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import ac.grim.grimac.api.packet.types.RecievablePacket;

import java.util.Map;
import java.util.Optional;

public interface ClientClickWindowPacket extends RecievablePacket {
    WindowClickType getWindowClickType();

    int getButton();
    int getSlot();
    int getWindowId();

    /**
     * Added in 1.17, and not actually optional; Removed with 1.21.5, replaced with {@link #setHashedSlots(Map)}
     */
    Optional<Map<Integer, PacketItemStack>> getSlots();

    enum WindowClickType {
        PICKUP,
        QUICK_MOVE,
        SWAP,
        CLONE,
        THROW,
        QUICK_CRAFT,
        PICKUP_ALL,
        UNKNOWN;
    }
}
