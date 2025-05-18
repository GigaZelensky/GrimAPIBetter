package ac.grim.grimac.api.packet.impl.pe.item;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import ac.grim.grimac.api.packet.manager.PacketComponentManager;
import ac.grim.grimac.api.packet.manager.PacketEnchantmentManager;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import ac.grim.grimac.api.packet.manager.PacketItemTypeManager;
import com.github.retrooper.packetevents.protocol.item.ItemStack;

public class PEItemManager implements PacketItemManager {

    private final PacketItemTypeManager peItemManager = new PEItemTypeManager();
    private final PacketEnchantmentManager peEnchantManager = new PEEnchantManager();
    private final PacketComponentManager peComponentManager = new PEComponentManager();

    @Override
    public PacketItemStack getEmptyStack() {
        return ItemStack.EMPTY;
    }

    @Override
    public PacketItemStack.Builder getBuilder() {
        return PacketItemStack.builder();
    }

    @Override
    public PacketItemTypeManager getItemTypeManager() {
        return peItemManager;
    }

    @Override
    public PacketEnchantmentManager getEnchantmentManager() {
        return peEnchantManager;
    }

    @Override
    public PacketComponentManager getComponentManager() {
        return peComponentManager;
    }
}
