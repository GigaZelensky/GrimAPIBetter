package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;

import java.util.List;
import java.util.Optional;

public interface ServerWindowItemsPacket {
    int getWindowId();

    int getStateId();

    List<PacketItemStack> getItems();

    Optional<PacketItemStack> getCarriedItem();
}
