package daij.impl;

import daij.BinarySearch;
import org.jetbrains.annotations.NotNull;

/**
 * Find the specific element in a sorted array, may be any of the same elements.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class SimpleBinarySearch implements BinarySearch {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> int search(@NotNull T[] array, @NotNull T target, int bIdx, int eIdx) {
        while (bIdx <= eIdx) { // [bIdx, eIdx]: when bIdx > eIdx, exit
            int mid = bIdx + (eIdx - bIdx) / 2; // instead of (bIdx + eIdx) / 2 to avoid overflow
            if (array[mid].compareTo(target) > 0) {
                eIdx = mid - 1;
            } else if (array[mid].compareTo(target) < 0) {
                bIdx = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
