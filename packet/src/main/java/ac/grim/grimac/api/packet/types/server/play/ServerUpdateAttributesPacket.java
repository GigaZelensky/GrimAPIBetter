package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.ResourceLocationI;
import ac.grim.grimac.api.packet.protocol.attribute.Attribute;
import ac.grim.grimac.api.packet.types.event.PacketSendEvent;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;
import java.util.UUID;

public interface ServerUpdateAttributesPacket {
    static ServerUpdateAttributesPacket from(PacketSendEvent event) {
        return null; // TODO (Packet Rewrite)
    }

    int getEntityId();

    List<Property> getProperties();

    interface PropertyModifier {

        static PropertyModifier from(ResourceLocationI name, double amount, Operation operation) {
            return null; // TODO (Packet Rewrite)
        }

        static PropertyModifier from(UUID uuid, double amount, Operation operation) {
            return null; // TODO (Packet Rewrite)
        }

        ResourceLocationI getName();

        /**
         * No longer used since 1.21
         * @return
         */
        @ApiStatus.Obsolete
        UUID getUUID();

        Operation getOperation();

        double getAmount();

        enum Operation {
            ADDITION,
            MULTIPLY_BASE,
            MULTIPLY_TOTAL;
        }
    }

    interface Property {
        static ServerUpdateAttributesPacket.Property from(Attribute key, double value, List<PropertyModifier> modifiers) {
            return null; // TODO (Packet Rewrite)
        }

        List<PropertyModifier> getModifiers();

        Attribute getAttribute();

        double getValue();
    }
}
