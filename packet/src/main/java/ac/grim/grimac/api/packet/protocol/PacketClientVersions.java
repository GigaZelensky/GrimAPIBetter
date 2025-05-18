package ac.grim.grimac.api.packet.protocol;

import ac.grim.grimac.api.packet.MCPacket;

public class PacketClientVersions {
    public static final PacketClientVersion V_1_7_10 = getById(5);
    public static final PacketClientVersion V_1_8 = getById(47);
    public static final PacketClientVersion V_1_9 = getById(107);
    public static final PacketClientVersion V_1_9_1 = getById(108);
    public static final PacketClientVersion V_1_10 = getById(210);
    public static final PacketClientVersion V_1_11 = getById(315);
    public static final PacketClientVersion V_1_11_1 = getById(316);
    public static final PacketClientVersion V_1_12 = getById(335);
    public static final PacketClientVersion V_1_12_2 = getById(340);
    public static final PacketClientVersion V_1_13 = getById(393);
    public static final PacketClientVersion V_1_13_2 = getById(404);
    public static final PacketClientVersion V_1_14 = getById(477);
    public static final PacketClientVersion V_1_14_2 = getById(485);
    public static final PacketClientVersion V_1_14_4 = getById(498);
    public static final PacketClientVersion V_1_15 = getById(573);
    public static final PacketClientVersion V_1_15_2 = getById(578);
    public static final PacketClientVersion V_1_16 = getById(735);
    public static final PacketClientVersion V_1_16_1 = getById(736);
    public static final PacketClientVersion V_1_16_2 = getById(751);
    public static final PacketClientVersion V_1_16_4 = getById(754);
    public static final PacketClientVersion V_1_17 = getById(755);
    public static final PacketClientVersion V_1_18 = getById(757);
    public static final PacketClientVersion V_1_18_2 = getById(758);
    public static final PacketClientVersion V_1_19 = getById(759);
    public static final PacketClientVersion V_1_19_3 = getById(761);
    public static final PacketClientVersion V_1_19_4 = getById(762);
    public static final PacketClientVersion V_1_20 = getById(763);
    public static final PacketClientVersion V_1_20_2 = getById(764);
    public static final PacketClientVersion V_1_20_3 = getById(765);
    public static final PacketClientVersion V_1_20_5 = getById(766);
    public static final PacketClientVersion V_1_21 = getById(767);
    public static final PacketClientVersion V_1_21_2 = getById(768);
    public static final PacketClientVersion V_1_21_4 = getById(769);
    public static final PacketClientVersion V_1_21_5 = getById(770);

    public static PacketClientVersion getByString(String versionName) {
        return MCPacket.getAPI().getVersionManager().getByString(versionName);
    }

    public static PacketClientVersion getById(int protocolVersion) {
        return MCPacket.getAPI().getVersionManager().getById(protocolVersion);
    }
}
