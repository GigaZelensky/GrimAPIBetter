package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;
import org.jetbrains.annotations.NotNull;

public interface ServerEntityTeleportPacket extends SendablePacket {
    static ServerEntityTeleportPacket from(int entityID, ImmutableVector3d position, float yaw, float pitch, boolean onGround) {
//        return MCPacket.getAPI().packetFactory().serverEntityTeleportPacket(entityID, position, yaw, pitch, onGround);
        return null; // TODO (Packet Rewrite)
    }

    static ServerEntityTeleportPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    @NotNull ImmutableVector3d getPosition();

    int getEntityId();
    float getYaw();
    float getPitch();
}
