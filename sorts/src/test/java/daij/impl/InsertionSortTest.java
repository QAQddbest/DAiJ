package daij.impl;

import daij.Sort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    Sort sort = new InsertionSort();

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