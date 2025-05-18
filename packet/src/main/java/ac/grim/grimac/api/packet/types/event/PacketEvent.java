package ac.grim.grimac.api.packet.types.event;

import ac.grim.grimac.api.packet.player.PacketUser;
import ac.grim.grimac.api.packet.protocol.PacketConnectionState;
import ac.grim.grimac.api.packet.types.PacketType;

public interface PacketEvent {
    PacketType getPacketType();
    PacketUser getUser();
    void setCancelled(boolean cancelled);

    PacketConnectionState getConnectionState();

    boolean isCancelled();

    // TODO (Packet Rewrite), make this a boolean function to disable re-encoding implemented per-platform?
    void setLastUsedWrapper(Object o);

    void markForReEncode(boolean shouldReEncode);
}
