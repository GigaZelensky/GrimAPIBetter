package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.block.PacketBlockState;
import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import org.jetbrains.annotations.NotNull;

public interface PacketBlockStateManager {
    PacketBlockState getBlockStateByString(PacketClientVersion clientVersion, @NotNull String asString);

    PacketBlockState getBlockStateByGlobalId(PacketClientVersion blockVersion, int id);

    PacketBlockState getBlockStateByGlobalId(int id);

    PacketBlockState getDefaultState(PacketClientVersion clientVersion, PacketStateType type);
}