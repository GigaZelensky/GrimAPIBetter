package ac.grim.grimac.api.packet.types.client.play;

import ac.grim.grimac.api.packet.item.PacketItemStack;

public interface ClientCreativeInventoryActionPacket {
    int getSlot();

    PacketItemStack getItemStack();
}
