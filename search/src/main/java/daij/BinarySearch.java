package daij;

import org.jetbrains.annotations.NotNull;

/**
 * Binary search algorithm's interface which should be implemented by others.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public interface BinarySearch {

    /**
     * Find the specific element from a sorted array.
     *
     * @param array  the sorted array
     * @param target the target element want to find
     * @param <T>    array's generic type which is comparable
     * @return index of the element in the array if found, or -1.
     */
    default <T extends Comparable<T>> int search(@NotNull T[] array, @NotNull T target) {
        if (array.length == 0)
            return -1;
        return search(array, target, 0, array.length - 1);
    }


    /**
     * Find the specific element from a sorted array from {@code bIdx} to {@code eIdx}
     *
     * @param array  the sorted array
     * @param target the target element want to find
     * @param bIdx   the begin index needed to search
     * @param eIdx   the end index needed to search
     * @param <T>    array's generic type which is comparable
     * @return index of the element in the array if found, or -1.
     */
    <T extends Comparable<T>> int search(@NotNull T[] array, @NotNull T target, int bIdx, int eIdx);
}
