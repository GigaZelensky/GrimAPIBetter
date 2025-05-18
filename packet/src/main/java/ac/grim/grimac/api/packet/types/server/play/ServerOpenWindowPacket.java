package ac.grim.grimac.api.packet.types.server.play;

public interface ServerOpenWindowPacket {
    int getType();

    int getContainerId();

    String getLegacyType();

    int getLegacySlots();

    int getHorseId();
}
