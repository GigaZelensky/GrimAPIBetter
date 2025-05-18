package ac.grim.grimac.api.packet.impl.pe.version;

import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.version.VersionManager;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public class PEPacketVersionManager implements VersionManager {
    @Override
    public PacketClientVersion getById(int protocolVersion) {
        return ClientVersion.getById(protocolVersion);
    }

    @Override
    public PacketClientVersion getByString(String versionName) {
        return ClientVersion.valueOf(versionName);
    }
}
