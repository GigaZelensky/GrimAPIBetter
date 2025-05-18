package ac.grim.grimac.api.packet.types.server.play;

import ac.grim.grimac.api.packet.ResourceLocationI;

public interface ServerUpdateAttributesPacket {
    interface PropertyModifier {

        ResourceLocationI getName();

        enum Operation {
            ADDITION,
            MULTIPLY_BASE,
            MULTIPLY_TOTAL;
        }
    }
}
