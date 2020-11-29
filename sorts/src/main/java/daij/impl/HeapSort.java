package daij.impl;

import daij.Sort;
import daij.SortUtils;
import org.jetbrains.annotations.NotNull;

/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n*log(n))</li>
 * <li>worst: o(n*log(n))</li>
 * <li>average: o(n*log(n))</li>
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
public class HeapSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null)
            return;
        int length = array.length;
        while (length > 1) {
            heapify(array, length);
            SortUtils.swap(array, 0, --length);
        }
    }

    /**
     * Heaping the given array and build a big heap in the given length.
     *
     * @param array  the array to be sorted
     * @param length unsorted array's length
     * @param <T>    array's generic type
     */
    private <T extends Comparable<T>> void heapify(@NotNull T[] array, int length) {
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjust(array, i, length);
        }
    }


    /**
     * Adjust the node to big heap, which means the parent node being bigger than the childes.
     * <p>
     * I need {@code length} instead of using {@code array.length} because {@code HeapSort} will put the sorted one in the last of the array.
     *
     * @param array  the array to be sorted
     * @param idx    index of parent node that need to adjust
     * @param length unsorted array's length
     * @param <T>    array's generic type
     */
    private <T extends Comparable<T>> void adjust(@NotNull T[] array, int idx, int length) {
        int left = 2 * idx + 1, right = 2 * idx + 2;
        if (right < length) { // have two child
            if (array[left].compareTo(array[right]) > 0) {
                if (array[left].compareTo(array[idx]) > 0) {
                    SortUtils.swap(array, idx, left);
                }
            } else {
                if (array[right].compareTo(array[idx]) > 0) {
                    SortUtils.swap(array, idx, right);
                }
            }
        } else if (left < length) { // have one child
            if (array[left].compareTo(array[idx]) > 0) {
                SortUtils.swap(array, left, idx);
            }
        }
    }
}
