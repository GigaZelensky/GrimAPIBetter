package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.manager.PacketEnchantmentManager;
import org.jetbrains.annotations.ApiStatus;

public class PacketEnchantmentTypes {
    @ApiStatus.Experimental
    @ApiStatus.Internal
    private static final PacketEnchantmentManager TYPE = MCPacket.getAPI().getItemManager().getEnchantmentManager();

    @ApiStatus.Experimental @ApiStatus.Internal
    static PacketEnchantmentType getEnchantmentType(String string) {
        return TYPE.getEnchantmentTypeByString(string);
    }

    public static final PacketEnchantmentType SWIFT_SNEAK = getEnchantmentType("swift_sneak");
    public static final PacketEnchantmentType ALL_DAMAGE_PROTECTION = getEnchantmentType("protection");
    public static final PacketEnchantmentType RIPTIDE = getEnchantmentType("riptide");
    public static final PacketEnchantmentType BLOCK_EFFICIENCY = getEnchantmentType("efficiency");
    public static final PacketEnchantmentType AQUA_AFFINITY = getEnchantmentType("aqua_affinity");
    public static final PacketEnchantmentType SOUL_SPEED = getEnchantmentType("soul_speed");
    public static final PacketEnchantmentType DEPTH_STRIDER = getEnchantmentType("depth_strider");
    public static final PacketEnchantmentType KNOCKBACK = getEnchantmentType("knockback");
    public static final PacketEnchantmentType BINDING_CURSE = getEnchantmentType("binding_curse");
}
