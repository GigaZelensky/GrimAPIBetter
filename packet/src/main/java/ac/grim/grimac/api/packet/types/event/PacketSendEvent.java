package ac.grim.grimac.api.packet.types.event;

import ac.grim.grimac.api.packet.player.PacketUser;
import ac.grim.grimac.api.packet.types.PacketType;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public interface PacketSendEvent extends PacketEvent {
    List<Runnable> getTasksAfterSend();
}
