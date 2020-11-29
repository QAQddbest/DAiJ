package daij.impl;

import daij.Sort;
import org.jetbrains.annotations.NotNull;

import java.util.Stack;

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
                stack.push(lowBp);
                stack.push(low - 1);
                stack.push(low + 1);
                stack.push(highBp);
            }
        }
        stack.clear();
    }

}
