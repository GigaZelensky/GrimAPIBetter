package ac.grim.grimac.api.platform.player;

import ac.grim.grimac.api.packet.item.PacketItemStack;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PlatformPlayerInventory {
    PacketItemStack getItemInHand();

    PacketItemStack getItemInOffHand();

    PacketItemStack getStack(int bukkitSlot, int vanillaSlot);

    PacketItemStack getHelmet();

    PacketItemStack getChestplate();

    PacketItemStack getLeggings();

    PacketItemStack getBoots();

    PacketItemStack[] getContents();

    String getOpenInventoryKey();
}
