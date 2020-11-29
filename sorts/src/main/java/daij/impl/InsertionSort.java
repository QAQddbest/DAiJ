package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n)</li>
 * <li>worst: o(n^2)</li>
 * <li>average: o(n^2)</li>
 * </ul>
 * </li>
 * <li>Space complexity: o(1)</ul>
 * <li>Stability: No</li>
 * </ul>
 *
 * @author OliverDD
 * @version 1.0.0
 * @see daij.Sort
 */
public class InsertionSort implements Sort {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null)
            return;
        for (int cur = array.length - 1; cur > 0; cur--) { // sorted array in right side
            T temp = array[cur - 1];
            for (int j = cur; j < array.length; j++) {  // find insertion point in the right side
                if (array[j].compareTo(temp) > 0) {
                    array[j - 1] = temp;
                    break;
                }
                array[j - 1] = array[j];
            }
            if (temp.compareTo(array[array.length - 1]) > 0) {
                array[array.length - 1] = temp;
            }
        }
    }
}
