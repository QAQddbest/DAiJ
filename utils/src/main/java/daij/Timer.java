package daij;

/**
 * The {@code Timer} is used to measure code's execution cost in time.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class Timer {
    /**
     * Pass in a piece of code whose execution period whould be measured later and returned later.
     *
     * <p>As a function interface parameter, you can call this method with lambda.
     * <p>Example:
     * ```java
     * long cost = Timer.measure(()->{
     * // Code need to be measured
     * });
     * ```
     *
     * @param code the code needed measure
     * @return the cost of the code
     */
    public static long measure(Runnable code) {
        long start = System.currentTimeMillis();
        code.run();
        return System.currentTimeMillis() - start;
    }
}
