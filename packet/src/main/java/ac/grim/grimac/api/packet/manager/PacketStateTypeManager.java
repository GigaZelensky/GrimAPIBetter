package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.item.PacketStateType;

public interface PacketStateTypeManager {
    PacketStateType getStateTypeByString(String name);

    PacketStateType getByID(PacketClientVersion clientVersion, int id);
}
