package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;


/**
 * <ul>
 * <li>Time complexity:
 * <ul>
 * <li>best: o(n*log(n))</li>
 * <li>worst: o(n^2)</li>
 * <li>average: o(n*log(n))</li>
 * </ul>
 * </li>
 * <li>Space complexity: o(log(n))</li>
 * <li>Stability: No</li>
 * </ul>
 *
 * @author OliverDD
 * @version 1.0.0
 * @see daij.Sort
 */
public class QuickSortR implements Sort {

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
     * Real sorting method in {@code QuickSortR}, which will recursively call itself.
     *
     * <p>I choose the array[bidx] as the base. Everytime it is called, the {@code array} will be divided into two part by the base, which means smaller one in the left while bigger one in the left.
     *
     * @param array the array to be sorted
     * @param low   the begin index of the unsorted array
     * @param high  the end index of the unsorted array
     * @param <T>   array's generic type
     */
    private <T extends Comparable<T>> void sortImpl(@NotNull T[] array, int low, int high) {
        if (low < high) {
            int lowBp = low; // backup two index for recursive
            int highBp = high;
            T temp = array[low]; // current base element
            while (low < high) {
                while (low < high && array[high].compareTo(temp) >= 0) // find smaller one from right side
                    high--;
                array[low] = array[high];
                while (low < high && array[low].compareTo(temp) <= 0) // find bigger one from left side
                    low++;
                array[high] = array[low];
            }
            array[low] = temp; // restore the base element
            sortImpl(array, lowBp, low - 1);
            sortImpl(array, low + 1, highBp);
        }
    }
}
