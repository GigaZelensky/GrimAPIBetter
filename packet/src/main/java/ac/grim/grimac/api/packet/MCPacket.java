package ac.grim.grimac.api.packet;

public class MCPacket {
    private static MCPacketAPI INSTANCE;

    public static void setAPI(MCPacketAPI api) {
        INSTANCE = api;
    }

    public static MCPacketAPI getAPI() {
        return INSTANCE;
    }
}
