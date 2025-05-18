package ac.grim.grimac.api.packet.version;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public interface VersionManager {
    PacketClientVersion getById(int protocolVersion);

    PacketClientVersion getByString(String versionName);
}
