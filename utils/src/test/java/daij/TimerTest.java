package daij;

import daij.impl.BubbleSort;
import daij.impl.InsertionSort;
import daij.impl.QuickSort;
import daij.impl.QuickSortR;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class TimerTest {

    static int SIZE = 50000;

    static Integer[] array;

    @BeforeAll
    static void init() {
        array = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt();
        }
    }


    @Test
    void libSort() {
        long cost = Timer.measure(() -> Arrays.sort(array.clone()));
        System.out.println("Java lib: " + cost);
    }

    @Test
    void quickSort() {
        Sort sort = new QuickSort();
        long cost = Timer.measure(() -> sort.sort(array.clone()));
        System.out.println("quick sort: " + cost);
    }

    @Test
    void quickSortR() {
        Sort sort = new QuickSortR();
        long cost = Timer.measure(() -> sort.sort(array.clone()));
        System.out.println("quick sort r: " + cost);
    }

    @Test
    void bubbleSort() {
        Sort sort = new BubbleSort();
        long cost = Timer.measure(() -> sort.sort(array.clone()));
        System.out.println("bubble sort: " + cost);
    }

    @Test
    void insertionSort() {
        Sort sort = new InsertionSort();
        long cost = Timer.measure(() -> sort.sort(array.clone()));
        System.out.println("insertion sort: " + cost);
    }

    @Test
    void selectionSort() {
        Sort sort = new InsertionSort();
        long cost = Timer.measure(() -> sort.sort(array.clone()));
        System.out.println("selection sort: " + cost);
    }
}