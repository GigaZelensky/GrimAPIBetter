package ac.grim.grimac.api.packet.manager;

import ac.grim.grimac.api.packet.component.PacketComponentType;

public interface PacketComponentManager {
    PacketComponentType<?> getComponentTypeFromString(String string);
}
