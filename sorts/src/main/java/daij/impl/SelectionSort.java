package daij.impl;

import daij.Sort;
import daij.SortUtils;
import org.jetbrains.annotations.NotNull;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n^2)</li>
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
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null)
            return;
        for (int cur = array.length - 1; cur > 0; cur--) { // sorted array in right side
            int idx = cur; // Max index
            for (int j = 0; j < cur; j++) { // from left(unsorted array) to sorted one
                if (array[j].compareTo(array[idx]) > 0) {
                    idx = j;
                }
            }
            if (idx != cur) { // swap array[idx] with array[cur] if find a bigger one
                SortUtils.swap(array, cur, idx);
            }
        }
    }
}
