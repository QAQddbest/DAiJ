package daij.impl;

import daij.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeftBoundBinarySearchTest {

    BinarySearch binarySearch = new LeftBoundBinarySearch();

    @Test
    void search() {
        assertEquals(2, binarySearch.search(new Integer[]{1, 2, 3, 3, 3}, 3));
        assertEquals(3, binarySearch.search(new Integer[]{1, 3, 4, 5}, 5));
        assertEquals(0, binarySearch.search(new Integer[]{1, 3, 4, 5}, 1));
        assertEquals(3, binarySearch.search(new Integer[]{1, 3, 4, 5, 5, 5, 7}, 5));
        assertEquals(0, binarySearch.search(new Integer[]{3, 3, 3, 3, 3}, 3));
        assertEquals(1, binarySearch.search(new Integer[]{1, 3, 3, 3}, 3));
        assertEquals(-1, binarySearch.search(new Integer[]{}, 3));
    }
}