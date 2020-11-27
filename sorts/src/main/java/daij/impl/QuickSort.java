package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

import java.util.Stack;

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
public class QuickSort implements Sort {
    /**
     * Use to store begin index and end index of next round.
     *
     * <p>In fact, it is too heavy that can be replaced by an array and a index, but in that way, it's hard to design the size.
     */
    private final Stack<Integer> stack = new Stack<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends Comparable<T>> void sort(@NotNull T[] array) {
        if (array == null)
            return;
        stack.push(0);
        stack.push(array.length - 1);
        while (!stack.empty()) { // after this loop, the loop will be divided into two part.
            int high = stack.pop();
            int low = stack.pop();
            if (low < high) {
                int lowBp = low;
                int highBp = high;
                T temp = array[low];
                while (low < high) {
                    while (low < high && array[high].compareTo(temp) >= 0)
                        high--;
                    array[low] = array[high];
                    while (low < high && array[low].compareTo(temp) <= 0)
                        low++;
                    array[high] = array[low];
                }
                array[low] = temp;
                stack.push(lowBp);
                stack.push(low - 1);
                stack.push(low + 1);
                stack.push(highBp);
            }
        }
        stack.clear();
    }

}
