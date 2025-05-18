package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.item.PacketEnchantmentType;

public interface PacketEnchantmentManager {
    PacketEnchantmentType getEnchantmentTypeByString(String string);
}
