package daij.impl;

import daij.Sort;
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
 * <li>Space complexity: o(n)</ul>
 * <li>Stability: No</li>
 * </ul>
 *
 * @author OliverDD
 * @version 1.0.0
 * @see daij.Sort
 */
public class MergeSortR implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null)
            return;
        sortImpl(array, 0, array.length - 1);
    }

    /**
     * Sort an array from {@code low} to {@code high}.
     *
     * <p>Call itself to divided and sort the subarray, then merge then after sorting.
     *
     * @param array the array to be sorted
     * @param low   the begin index of the unsorted array
     * @param high  the end index of the unsorted array
     * @param <T>   array's generic type
     */
    private <T extends Comparable<T>> void sortImpl(@NotNull T[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2; // divided the unsorted array into two parts
            sortImpl(array, low, mid); // sort the [low, mid] subarray
            sortImpl(array, mid + 1, high); // sort the [mid + 1, high] subarray
            merge(array, low, mid, high); // merge the two parts
        }
    }


    /**
     * Merge two sorted([low, mid] and [mid + 1, high]) array to an sorted array([low, high]).
     *
     * @param array the array to be sorted
     * @param low   the begin index of the unsorted array
     * @param mid   the middle index that divided the two parts
     * @param high  the end index of the unsorted array
     * @param <T>   array's generic type
     */
    @SuppressWarnings(value = "unchecked")
    private <T extends Comparable<T>> void merge(@NotNull T[] array, int low, int mid, int high) {
        T[] temp = (T[]) new Comparable[high - low + 1];
        int lptr = low, rptr = mid + 1;
        int ptr = 0;
        while (lptr <= mid || rptr <= high) {
            while (lptr <= mid && (rptr > high || array[lptr].compareTo(array[rptr]) <= 0)) {
                temp[ptr++] = array[lptr++];
            }
            while (rptr <= high && (lptr > mid || array[rptr].compareTo(array[lptr]) <= 0)) {
                temp[ptr++] = array[rptr++];
            }
        }
        System.arraycopy(temp, 0, array, low, high - low + 1);
    }

}
