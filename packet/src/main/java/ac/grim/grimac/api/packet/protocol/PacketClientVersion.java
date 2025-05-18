package ac.grim.grimac.api.packet.protocol;

public interface PacketClientVersion {

    boolean isOlderThan(PacketClientVersion clientVersion);

    boolean isNewerThanOrEquals(PacketClientVersion clientVersion);

    boolean isOlderThanOrEquals(PacketClientVersion clientVersion);

    String getReleaseName();

    int getProtocolVersion();

    boolean isNewerThan(PacketClientVersion clientVersion);
}
