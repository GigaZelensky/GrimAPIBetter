package ac.grim.grimac.api.packet.impl.pe.type.state;

import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.world.states.type.StateTypes;

public class PEPacketStateTypeManager implements PacketStateTypeManager {
    @Override
    public PacketStateType getStateTypeByString(String name) {
        return StateTypes.getByName(name);
    }

    @Override
    public PacketStateType getByID(PacketClientVersion clientVersion, int id) {
        return StateTypes.getById((ClientVersion) clientVersion, id);
    }
}
