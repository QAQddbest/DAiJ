package daij;

/**
 * The {@code Timer} is used to measure code's execution cost in time.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class Timer {
    /**
     * Pass in a piece of code whose execution period would be measured and returned later.
     *
     * <p>Need a function interface parameter, you can call this method with lambda.
     * <p>Example:{@code
     * long cost = Timer.measure(()->{
     * // Code need to be measured
     * });}
     *
     * @param code the code needed measure
     * @return the cost of the code
     */
    public static long measure(Runnable code) {
        long start = System.currentTimeMillis();
        code.run();
        return System.currentTimeMillis() - start;
    }

    /**
     * Pass in a piece of code whose execution period would be measured in several times and the average cost would be returned later.
     *
     * <p>Need a function interface parameter, you can call this method with lambda.
     * <p>Example:{@code
     * long cost = Timer.measure(()->{
     * // Code need to be measured
     * }, 1000);}
     *
     * @param code  the code needed measure
     * @param times the times that should be measure
     * @return the cost of the code
     */
    public static long measure(Runnable code, int times) {
        long result = 0L;
        for (int i = 0; i < times; i++) {
            long start = System.currentTimeMillis();
            code.run();
            long end = System.currentTimeMillis();
            result += (end - start) / times;
        }
        return result;
    }
}
