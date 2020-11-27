package daij;

/**
 * The {@code Timer} is used to measure code's execution cost in time.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class Timer {
    public static long measure(Runnable code) {
        long start = System.currentTimeMillis();
        code.run();
        return System.currentTimeMillis() - start;
    }
}
