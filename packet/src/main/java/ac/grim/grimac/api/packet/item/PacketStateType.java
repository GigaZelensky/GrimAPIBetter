package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.packet.block.PacketBlockState;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface PacketStateType {
    boolean isAir();

    float getHardness();

    PacketItemType getTypePlacingState();

    float getBlastResistance();

    String getName();

    boolean isSolid();

    boolean exceedsCube();

    boolean isBlocking();

    boolean isReplaceable();

    PacketBlockState createBlockState(PacketClientVersion blockVersion);

    boolean isRequiresCorrectTool();
}
