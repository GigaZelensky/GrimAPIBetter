package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.item.PacketItemType;

import java.util.Collection;

public interface PacketItemTypeManager {
    PacketItemType getItemTypeByString(String string);

    Collection<PacketItemType> values();
}
