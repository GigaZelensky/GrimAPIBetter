package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.types.SendablePacket;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;

public interface ServerEntityVelocityPacket extends SendablePacket {
    static ServerEntityVelocityPacket from(int entityID, ImmutableVector3d velocity) {
        return null; // TODO (Packet Rewrite)
    }

    static ServerEntityVelocityPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();
    ImmutableVector3d getVelocity();
    void setVelocity(ImmutableVector3d add);
}
