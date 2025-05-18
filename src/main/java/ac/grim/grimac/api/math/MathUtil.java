package ac.grim.grimac.api.math;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public class MathUtil {
    public static double square(double num) {
        return num * num;
    }

    public static int mojangFloor(double num) {
        final int floor = (int) num;
        return floor == num ? floor : floor - (int) (Double.doubleToRawLongBits(num) >>> 63);
    }
}
