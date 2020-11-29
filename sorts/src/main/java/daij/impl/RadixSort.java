package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n*k)</li>
 * <li>worst: o(n*k)</li>
 * <li>average: o(n*k)</li>
 * </ul>
 * </li>
 * <li>Space complexity: o(n+k)</ul>
 * <li>Stability: Yes</li>
 * </ul>
 *
 * @author OliverDD
 * @version 1.0.0
 * @see daij.Sort
 */
public class RadixSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null || array.length < 2)
            return;
        if (!(array instanceof Integer[])) {
            throw new UnsupportedOperationException("RadixSort only support Integer[] now");
        }
        Integer[] _array = (Integer[]) array;
        // get positive elements out
        Integer[] positiveArray = Arrays.stream(_array).filter(t -> t > 0).toArray(Integer[]::new);
        sortImpl(positiveArray);
        // convert negative elements to positive then sort them
        Integer[] negativeArray = Arrays.stream(_array).filter(t -> t < 0).map(t -> -t).toArray(Integer[]::new);
        sortImpl(negativeArray);
        negativeArray = Arrays.stream(negativeArray).sorted(Comparator.reverseOrder()).map(t -> -t).toArray(Integer[]::new);
        // copy sorted two parts back
        System.arraycopy(negativeArray, 0, _array, 0, negativeArray.length);
        System.arraycopy(positiveArray, 0, _array, negativeArray.length, positiveArray.length);
    }

    private void sortImpl(@NotNull Integer[] array) {
        if (array.length < 2)
            return;
        long exp = 1L;
        Integer[] buf = new Integer[array.length];
        int max = Arrays.stream(array).max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
        while (max >= exp) {
            int[] cnt = new int[10];
            for (int j : array) { // Counting
                cnt[(j / (int) exp) % 10]++;
            }
            for (int i = 1; i != 10; i++) { // add pre-one's count
                cnt[i] += cnt[i - 1];
            }
            for (int i = array.length - 1; i >= 0; i--) { // sort by the occurrence
                byte bit = (byte) ((array[i] / (int) exp) % 10);
                buf[--cnt[bit]] = array[i];
            }
            System.arraycopy(buf, 0, array, 0, array.length);
            exp *= 10L;
        }
    }

}
