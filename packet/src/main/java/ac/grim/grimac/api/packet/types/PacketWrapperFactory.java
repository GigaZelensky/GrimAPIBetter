package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.types.client.play.*;
import ac.grim.grimac.api.packet.types.event.PacketReceiveEvent;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
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

    ServerSetSlotPacket serverSetSlot(PacketSendEvent event);
}
