package daij.impl;

import daij.Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortRTest {

    Sort sort = new MergeSortR();

    @Test
    void normalTest() {
        Integer[] array = new Integer[]{8, 4, 6, 2, 3, 1, 7, 5};
        sort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void sameTest() {
        Integer[] array = new Integer[]{1, 1};
        sort.sort(array);
        assertArrayEquals(new Integer[]{1, 1}, array);
    }

    @Test
    void hugeTest() {
        Integer[] array = new Integer[]{5, 2, 7, 1, 6, 23, 8, 1, 8, 2, 76, 1, 7, 1, 51, 362, 263, 27, 24, 2365, 236, 21561, 717427, 215161, 16137171, 6315151,
                161361, 1251, 1612761, 17171, 1241, 7373, 5151, 73473, 17171, 7548, 63462, 8484, 25276, 2732873, 252362, 73743, 25625,
                2523652, 235125, 61761, 35151, 643732, 4312, 73473, 6246, 25, 463, 6437, 2523, 7373, 75474, 64363, 6536, 535, 7548, 643, 754,
                3252, 65262, 626342, 62436, 732754, 754, 74, 75, 47, 4, 64, 62, 36, 23, 652, 6, 2, 62, 6, 26, 4, 6, 3, 73, 56, 2, 62, 6, 27, 23, 72};
        sort.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 6, 6, 6, 6, 6, 7, 7, 8, 8, 23, 23, 23, 24, 25, 26, 27, 27, 36, 47, 51, 56, 62, 62, 62, 64, 72, 73, 74, 75, 76, 236, 263, 362, 463, 535, 643, 652, 754, 754, 1241, 1251, 2365, 2523, 3252, 4312, 5151, 6246, 6437, 6536, 7373, 7373, 7548, 7548, 8484, 17171, 17171, 21561, 25276, 25625, 35151, 61761, 62436, 63462, 64363, 65262, 73473, 73473, 73743, 75474, 161361, 215161, 235125, 252362, 626342, 643732, 717427, 732754, 1612761, 2523652, 2732873, 6315151, 16137171}, array);
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

    @Test
    void randomTest() {
        Integer[] array = new Integer[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            array[i] = random.nextInt();
        }
        Integer[] arrayClone = array.clone();
        Arrays.sort(arrayClone);
        sort.sort(array);
        assertArrayEquals(arrayClone, array);
    }
}