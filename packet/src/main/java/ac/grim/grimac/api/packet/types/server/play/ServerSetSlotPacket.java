package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;

public interface ServerSetSlotPacket {
    int getWindowId();

    int getSlot();

    int getStateId();

    PacketItemStack getItem();
}
