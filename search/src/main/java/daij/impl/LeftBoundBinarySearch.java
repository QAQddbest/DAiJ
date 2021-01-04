package daij.impl;

import daij.BinarySearch;
import org.jetbrains.annotations.NotNull;

/**
 * Find the specific element in a sorted array, and return the left bound one in the array.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class LeftBoundBinarySearch implements BinarySearch {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> int search(@NotNull T[] array, @NotNull T target, int bIdx, int eIdx) {
        final int eIdxBp = eIdx;
        while (bIdx <= eIdx) { // [bIdx, eIdx]: when bIdx > eIdx, exit
            int mid = bIdx + (eIdx - bIdx) / 2;  // instead of (bIdx + eIdx) / 2 to avoid overflow
            if (array[mid].compareTo(target) > 0) {
                eIdx = mid - 1;
            } else if (array[mid].compareTo(target) < 0) {
                bIdx = mid + 1;
            } else { // key point: let eIdx = mid - 1, which may be the left one of the left bound, then bIdx would run into right + 1 then exit.
                eIdx = mid - 1;
            }
        }
        if (bIdx > eIdxBp || array[bIdx].compareTo(target) != 0)
            return -1;
        return bIdx;
    }
}
