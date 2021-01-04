package daij.impl;

import daij.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleBinarySearchTest {

    BinarySearch binarySearch = new SimpleBinarySearch();

    @Test
    void search() {
        assertEquals(6, binarySearch.search(new Integer[]{1, 2, 5, 7, 8, 9, 22}, 22));
        assertEquals(0, binarySearch.search(new Integer[]{1, 2, 5, 7, 8, 9, 22}, 1));
        assertEquals(3, binarySearch.search(new Integer[]{1, 2, 5, 7, 8, 9, 22}, 7));
        assertEquals(-1, binarySearch.search(new Integer[]{1, 2, 5, 7, 8, 9, 22}, 4));
        assertEquals(-1, binarySearch.search(new Integer[]{}, 7));
        assertEquals(0, binarySearch.search(new Integer[]{1}, 1));
        assertEquals(-1, binarySearch.search(new Integer[]{1}, 2));
    }
}