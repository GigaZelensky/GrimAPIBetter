package ac.grim.grimac.api.packet.world.enums;

/**
 * The {@code BlockFace} enum contains constants for the different valid faces in the minecraft protocol.
 *
 * @author retrooper
 * @see <a href="https://wiki.vg/Protocol#Player_Digging">https://wiki.vg/Protocol#Player_Digging</a>
 * @since 1.7.8
 */
public enum BlockFace {
    /**
     * -Y offset
     */
    DOWN(0, -1, 0),

    /**
     * +Y offset
     */
    UP(0, 1, 0),

    /**
     * -Z offset
     */
    NORTH(0, 0, -1),

    /**
     * +Z offset
     */
    SOUTH(0, 0, 1),

    /**
     * -X offset
     */
    WEST(-1, 0, 0),

    /**
     * +X offset
     */
    EAST(1, 0, 0),

    /**
     * Face is set to 255
     */
    OTHER((short) 255, -1, -1, -1);

    private static final BlockFace[] VALUES = values();
    private static final BlockFace[] CARTESIAN_VALUES = new BlockFace[]{DOWN, UP, NORTH, SOUTH, WEST, EAST}; // FIXME: remove this or use this somewhere

    final short faceValue;
    final int modX;
    final int modY;
    final int modZ;

    BlockFace(short faceValue, int modX, int modY, int modZ) {
        this.faceValue = faceValue;
        this.modX = modX;
        this.modY = modY;
        this.modZ = modZ;
    }

    BlockFace(int modX, int modY, int modZ) {
        this.faceValue = (short) ordinal();
        this.modX = modX;
        this.modY = modY;
        this.modZ = modZ;
    }

    public static BlockFace getLegacyBlockFaceByValue(int face) {
        if (face == 255) return OTHER;
        return CARTESIAN_VALUES[face % CARTESIAN_VALUES.length];
    }

    public static BlockFace getBlockFaceByValue(int face) {
        return CARTESIAN_VALUES[face % CARTESIAN_VALUES.length];
    }

    public int getModX() {
        return modX;
    }

    public int getModY() {
        return modY;
    }

    public int getModZ() {
        return modZ;
    }

    public BlockFace getOppositeFace() {
        switch (this) {
            case DOWN:
                return UP;
            case UP:
                return DOWN;
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case WEST:
                return EAST;
            case EAST:
                return WEST;
            default:
                return OTHER;
        }
    }

    public BlockFace getCCW() {
        return getBlockFace(WEST, EAST, SOUTH, NORTH);
    }

    public BlockFace getCW() {
        return getBlockFace(EAST, WEST, NORTH, SOUTH);
    }

    private BlockFace getBlockFace(BlockFace blockFace, BlockFace blockFace2, BlockFace blockFace3, BlockFace blockFace4) {
        switch (this) {
            case NORTH:
                return blockFace;
            case SOUTH:
                return blockFace2;
            case WEST:
                return blockFace3;
            case EAST:
                return blockFace4;
            default:
                return OTHER;
        }
    }

    public int getHorizontalId() {
        switch (this) {
            case DOWN:
            case UP:
                return -1;
            case NORTH:
                return 2;
            case SOUTH:
                return 0;
            case WEST:
                return 1;
            case EAST:
                return 3;
            default:
                throw new IllegalArgumentException("Invalid block face input for getHorizontalId");
        }
    }

    public short getFaceValue() {
        return faceValue;
    }

}
