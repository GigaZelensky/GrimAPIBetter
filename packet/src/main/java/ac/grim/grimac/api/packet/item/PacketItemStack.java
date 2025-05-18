package ac.grim.grimac.api.packet.item;


import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.component.PacketComponentType;
import ac.grim.grimac.api.packet.manager.PacketItemManager;
import ac.grim.grimac.api.packet.nbt.PacketNBTCompound;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@ApiStatus.Experimental
public interface PacketItemStack {
    PacketItemManager ITEM = MCPacket.getAPI().getItemManager();
    PacketItemStack EMPTY = ITEM.getEmptyStack();

    boolean isSameItemSameTags(PacketItemStack packetItemStack);
    PacketItemStack split(int toTake);
    int getAmount();
    int getMaxStackSize();
    boolean isEmpty();

    static Builder builder() {
        return ITEM.getBuilder();
    }

    void setAmount(int amount);

    void shrink(int amount);

    void grow(int amount);

    PacketItemStack copy();

    int getDamageValue();

    int getMaxDamage();

    PacketItemType getType();

    boolean isDamaged();

    boolean hasComponent(PacketComponentType<?> glider);

    <T> Optional<T> getComponent(PacketComponentType<T> equippable);

    int getEnchantmentLevel(PacketEnchantmentType enchantmentType, int protocolVersion);

    int getLegacyData();

    <T> T getComponentOr(PacketComponentType<T> type, T defaultValue);

    @Nullable PacketNBTCompound getNBT();

    interface Builder {
        Builder type(String name);
        Builder type(PacketItemType name);
        Builder amount(int amount);
        PacketItemStack build();
    }
}
