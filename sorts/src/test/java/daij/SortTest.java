package daij;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {
    Sort sort = new Sort() {
        @Override
        public <T extends Comparable<T>> void sort(@NotNull T[] array) {
            if (array == null)
                return;
            Arrays.sort(array, Comparator.naturalOrder());
        }
    };

    @Test
    void normalTest() {
        Integer[] array = new Integer[]{8, 4, 6, 2, 3, 1, 7, 5};
        sort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void oneTest() {
        Integer[] array = new Integer[]{1};
        sort.sort(array);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    void zeroTest() {
        Integer[] array = new Integer[]{};
        sort.sort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    void nullTest() {
        sort.sort(null);
    }
}