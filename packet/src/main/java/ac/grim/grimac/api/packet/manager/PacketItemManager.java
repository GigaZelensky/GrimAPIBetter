package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.item.PacketItemStack;

public interface PacketItemManager {
    PacketItemStack getEmptyStack();

    PacketItemStack.Builder getBuilder();

    PacketItemTypeManager getItemTypeManager();

    PacketEnchantmentManager getEnchantmentManager();

    PacketComponentManager getComponentManager();
}
