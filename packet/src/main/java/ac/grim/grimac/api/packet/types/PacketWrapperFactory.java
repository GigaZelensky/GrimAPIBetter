package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.client.play.*;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import ac.grim.grimac.api.packet.util.vec.ImmutableVector3d;
import ac.grim.grimac.api.packet.types.server.play.*;

public interface PacketWrapperFactory {
    ClientClickWindowPacket clientClickWindow(PacketReceiveEvent event);
    ClientCreativeInventoryActionPacket clientCreativeInventoryAction(PacketReceiveEvent event);
    ClientEntityActionPacket clientEntityAction(PacketReceiveEvent event);
    ClientPlayerBlockPlacementPacket clientPlayerBlockPlacement(PacketReceiveEvent event);
    ClientStatusPacket clientStatus(PacketReceiveEvent event);
    ClientInteractEntityPacket clientInteractEntity(PacketReceiveEvent event);
    ClientPlayerDiggingPacket clientPlayerDigging(PacketReceiveEvent event);
    ClientPlayerUseItemPacket clientPlayerUseItem(PacketReceiveEvent event);
    ClientHeldItemChangePacket clientHeldItemChange(PacketReceiveEvent event);

    ServerExplosionPacket serverExplosion(PacketSendEvent event);

    ServerOpenWindowPacket serverOpenWindow(PacketSendEvent event);

    ServerOpenHorseWindowPacket serverOpenHorseWindow(PacketSendEvent event);

    ServerWindowItemsPacket serverWindowItems(PacketSendEvent event);


    ServerEntityMetadataPacket serverEntityMetadataPacket(PacketSendEvent event);
    ServerEntityPositionSyncPacket serverEntityPositionSyncPacket(PacketSendEvent event);
    ServerEntityRelativeMoveAndRotationPacket serverEntityRelativeMoveAndRotationPacket(PacketSendEvent event);
    ServerEntityRelativeMovePacket serverEntityRelativeMovePacket(PacketSendEvent event);
    ServerEntityRotationPacket serverEntityRotationPacket(PacketSendEvent event);
    ServerEntityTeleportPacket serverEntityTeleportPacket(PacketSendEvent event);
    ServerEntityTeleportPacket serverEntityTeleportPacket(int entityID, ImmutableVector3d position, float yaw, float pitch, boolean onGround);
    ServerEntityVelocityPacket serverEntityVelocityPacket(PacketSendEvent event);
    ServerEntityVelocityPacket serverEntityVelocityPacket(int entityID, ImmutableVector3d velocity);
    ServerPlayerInfoRemovePacket serverPlayerInfoRemovePacket(PacketSendEvent event);
    ServerSpawnEntityPacket serverSpawnEntityPacket(PacketSendEvent event);
    ServerSpawnLivingEntityPacket serverSpawnLivingEntityPacket(PacketSendEvent event);
    ServerSpawnPaintingPacket serverSpawnPaintingPacket(PacketSendEvent event);
    ServerSpawnPlayerPacket serverSpawnPlayerPacket(PacketSendEvent event);

    ServerSetSlotPacket serverSetSlot(PacketSendEvent event);
}
