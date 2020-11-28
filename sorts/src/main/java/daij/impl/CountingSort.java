package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: </li>
 * <li>worst: </li>
 * <li>average: </li>
 * </ul>
 * </li>
 * <li>Space complexity:
 * <ul>
 * <li>best: </li>
 * <li>worst: </li>
 * <li>average: </li>
 * </ul>
 * </li>
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
        int min = _array[0], max = _array[0];
        for (int i = _array.length - 1; i > 0; i--) {
            if (_array[i] < min)
                min = _array[i];
            else if (_array[i] > max)
                max = _array[i];
        }
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
