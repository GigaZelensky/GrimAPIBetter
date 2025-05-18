package ac.grim.grimac.api.data;

import ac.grim.grimac.api.data.boxes.BaseSCB;
import ac.grim.grimac.api.packet.world.enums.BlockFace;

import java.util.List;

public class PistonData {
    public final boolean isPush;
    public final boolean hasSlimeBlock;
    public final boolean hasHoneyBlock;
    public final BlockFace direction;
    public final int lastTransactionSent;

    // Calculate if the player has no-push, and when to end the possibility of applying piston
    public int ticksOfPistonBeingAlive = 0;

    // The actual blocks pushed by the piston, plus the piston head itself
    public List<BaseSCB> boxes;

    public PistonData(BlockFace direction, List<BaseSCB> pushedBlocks, int lastTransactionSent, boolean isPush, boolean hasSlimeBlock, boolean hasHoneyBlock) {
        this.direction = direction;
        this.boxes = pushedBlocks;
        this.lastTransactionSent = lastTransactionSent;
        this.isPush = isPush;
        this.hasSlimeBlock = hasSlimeBlock;
        this.hasHoneyBlock = hasHoneyBlock;
    }

    // We don't know when the piston has applied, or what stage of pushing it is on
    // Therefore, we need to use what we have - the number of movement packets.
    // 10 is a very cautious number
    public boolean tickIfGuaranteedFinished() {
        return ++ticksOfPistonBeingAlive >= 10;
    }
}
