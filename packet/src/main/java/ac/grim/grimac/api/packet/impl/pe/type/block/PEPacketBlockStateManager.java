package ac.grim.grimac.api.packet.impl.pe.type.block;

import ac.grim.grimac.api.packet.block.PacketBlockState;
import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.manager.PacketBlockStateManager;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.world.states.WrappedBlockState;
import com.github.retrooper.packetevents.protocol.world.states.type.StateType;
import org.jetbrains.annotations.NotNull;

public class PEPacketBlockStateManager implements PacketBlockStateManager {
    @Override
    public PacketBlockState getBlockStateByString(PacketClientVersion clientVersion, @NotNull String asString) {
        return WrappedBlockState.getByString((ClientVersion) clientVersion, asString);
    }

    @Override
    public PacketBlockState getBlockStateByGlobalId(PacketClientVersion blockVersion, int id) {
        return WrappedBlockState.getByGlobalId((ClientVersion) blockVersion, id);
    }

    @Override
    public PacketBlockState getBlockStateByGlobalId(int id) {
        return WrappedBlockState.getByGlobalId(id);
    }

    @Override
    public PacketBlockState getDefaultState(PacketClientVersion clientVersion, PacketStateType type) {
        return WrappedBlockState.getDefaultState((ClientVersion) clientVersion, (StateType) type);
    }
}
