package daij;

import org.jetbrains.annotations.NotNull;

/**
 * Sorting algorithm's interface which should be implemented by others.
 *
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
 */
@FunctionalInterface
public interface Sort {

    /**
     * Sorts the specified array into ascending numerical order.
     *
     * @param array the array to be sorted
     * @param <T>   array's generic type
     */
    <T extends Comparable<T>> void sort(@NotNull T[] array);

}
