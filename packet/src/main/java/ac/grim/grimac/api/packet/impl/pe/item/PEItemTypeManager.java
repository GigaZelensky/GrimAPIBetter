package ac.grim.grimac.api.packet.impl.pe.item;

import ac.grim.grimac.api.packet.item.PacketItemType;
import ac.grim.grimac.api.packet.manager.PacketItemTypeManager;
import com.github.retrooper.packetevents.protocol.item.type.ItemTypes;

import java.util.Collection;

public class PEItemTypeManager implements PacketItemTypeManager {
    @Override
    public PacketItemType getItemTypeByString(String string) {
        return ItemTypes.getByName(string);
    }

    @Override
    public Collection<PacketItemType> values() {
        return (Collection) ItemTypes.values();
    }
}
