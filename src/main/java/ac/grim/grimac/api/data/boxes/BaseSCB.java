package ac.grim.grimac.api.data.boxes;

public class BaseSCB {
    public double minX, minY, minZ, maxX, maxY, maxZ;
    protected boolean isFullBlock = false;

    /**
     * Creates a box defined by two points in 3d space; used to represent hitboxes and collision boxes.
     *
     * @param minX      x position of first corner
     * @param minY      y position of first corner
     * @param minZ      z position of first corner
     * @param maxX      x position of second corner
     * @param maxY      y position of second corner
     * @param maxZ      z position of second corner
     * @param fullBlock - whether on not the box is a perfect 1x1x1 sized block
     */
    public BaseSCB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, boolean fullBlock) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minZ = minZ;
        this.maxZ = maxZ;
        isFullBlock = fullBlock;
    }

    public BaseSCB() {
        this(0, 0, 0, 0, 0, 0, false);
    }

    public boolean isCollided(BaseSCB other) {
        return other.maxX >= this.minX && other.minX <= this.maxX
                && other.maxY >= this.minY && other.minY <= this.maxY
                && other.maxZ >= this.minZ && other.minZ <= this.maxZ;
    }

    public BaseSCB offset(double x, double y, double z) {
        this.minX += x;
        this.minY += y;
        this.minZ += z;
        this.maxX += x;
        this.maxY += y;
        this.maxZ += z;
        return this;
    }
}
