package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n+k)</li>
 * <li>worst: o(n+k)</li>
 * <li>average: o(n+k)</li>
 * </ul>
 * </li>
 * <li>Space complexity: o(k)</ul>
 * <li>Stability: No</li>
 * </ul>
 *
 * @author OliverDD
 * @version 1.0.0
 * @see daij.Sort
 */
public class CountingSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null || array.length < 2)
            return;
        if (!(array instanceof Integer[])) {
            throw new UnsupportedOperationException("CountingSort only support Integer[] now");
        }
        Integer[] _array = (Integer[]) array;
        int min = Arrays.stream(_array).min(Comparator.naturalOrder()).get();
        int max = Arrays.stream(_array).max(Comparator.naturalOrder()).get();
        int[] occurrence = new int[max - min + 1];
        // counting occurrence
        for (int i = _array.length - 1; i >= 0; i--) {
            occurrence[_array[i] - min]++;
        }
        int increment = 0;
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < occurrence[i - min]; j++) {
                // in place, may not stable if you care
                _array[increment++] = i;
            }
        }
    }
}
