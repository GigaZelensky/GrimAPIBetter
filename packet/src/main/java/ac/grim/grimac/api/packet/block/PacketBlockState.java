package ac.grim.grimac.api.packet.block;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;
import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.world.enums.*;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface PacketBlockState {

    /* ────────────────────────────────────────────────────
     *  1. Static lookup / factory helpers
     * ──────────────────────────────────────────────────── */
    static PacketBlockState getByString(PacketClientVersion clientVersion, @NotNull String asString) {
        return MCPacket.getAPI().getBlockStateManager().getBlockStateByString(clientVersion, asString);
    }

    static PacketBlockState getByGlobalId(PacketClientVersion clientVersion, int id) {
        return MCPacket.getAPI().getBlockStateManager().getBlockStateByGlobalId(clientVersion, id);
    }

    static PacketBlockState getByGlobalId(int id) {
        return MCPacket.getAPI().getBlockStateManager().getBlockStateByGlobalId(id);
    }

    static PacketBlockState getDefaultState(PacketClientVersion clientVersion, PacketStateType type) {
        return MCPacket.getAPI().getBlockStateManager().getDefaultState(clientVersion, type);
    }


    /* ────────────────────────────────────────────────────
     *  2. Basic meta / identification
     * ──────────────────────────────────────────────────── */
    PacketStateType getType();
    int             getGlobalId();


    /* ────────────────────────────────────────────────────
     *  3. Direction & orientation
     * ──────────────────────────────────────────────────── */
    // Cardinal sub-faces
    North north();
    void  setNorth(North north);

    East  east();
    void  setEast(East east);

    South south();
    void  setSouth(South south);

    West  west();
    void  setWest(West west);

    // General orientation flags
    boolean isUp();
    void    setUp(boolean up);

    boolean isDown();
    void    setDown(boolean down);

    boolean isBottom();
    void    setBottom(boolean bottom);

    // Facing / axis variants
    BlockFace facing();
    void      setFacing(BlockFace face);

    Axis axis();
    void setAxis(Axis axis);

    VerticalDirection verticalDirection();
    void              setVerticalDirection(VerticalDirection direction);

    Half  half();
    void  setHalf(Half half);

    Face  face();
    void  setFace(Face face);

    Hinge hinge();
    void  setHinge(Hinge hinge);

    Attachment attachment();
    void       setAttachment(Attachment attachment);

    Shape shape();
    Tilt  tilt();

    boolean isShort();
    boolean isExtended();


    /* ────────────────────────────────────────────────────
     *  4. Boolean state toggles / flags
     * ──────────────────────────────────────────────────── */
    boolean isOpen();
    void    setOpen(boolean open);

    boolean isLit();
    void    setLit(boolean lit);

    boolean isPowered();
    void    setPowered(boolean powered);

    boolean isHasRecord();
    boolean isHasBook();

    boolean isAttached();
    boolean isEye();

    boolean isHanging();
    void    setHanging(boolean hanging);

    boolean isDrag();

    boolean isTip();

    void setWaterlogged(boolean waterlogged);

    // Thickness flag pair
    Thickness thickness();
    void      setThickness(Thickness thickness);

    boolean isBerries();
    void    setBerries(boolean berries);


    /* ────────────────────────────────────────────────────
     *  5. Numeric / level-like properties
     * ──────────────────────────────────────────────────── */
    int  getAge();
    void setAge(int age);

    int  getBites();
    void setBites(int bites);

    int getLevel();

    int getDistance();

    int  getCandles();
    void setCandles(int candles);

    int  getPickles();
    void setPickles(int pickles);

    int getFlowerAmount();
    int getPower();
    int getEggs();

    int  getLayers();
    void setLayers(int layers);

    int getSegmentAmount();


    /* ────────────────────────────────────────────────────
     *  6. Variant / enum sub-types
     * ──────────────────────────────────────────────────── */
    Type   typeData();
    void   setTypeData(Type type);

    Leaves leaves();


    /* ────────────────────────────────────────────────────
     *  7. Miscellaneous
     * ──────────────────────────────────────────────────── */
    Map<?, Object> getInternalData();
}
