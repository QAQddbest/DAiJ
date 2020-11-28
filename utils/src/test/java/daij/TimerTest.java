package daij;

import daij.impl.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class TimerTest {

    static int SIZE = 50000;

    static Integer[] baseArray;

    Integer[] array;

    @BeforeAll
    static void initBaseArray() {
        baseArray = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            baseArray[i] = random.nextInt();
        }
    }

    @BeforeEach
    void initArray() {
        array = baseArray.clone();
    }


    @Test
    void libSort() {
        long cost = Timer.measure(() -> Arrays.sort(array));
        System.out.println("Java lib: " + cost);
    }

    @Test
    void quickSort() {
        Sort sort = new QuickSort();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("quick sort: " + cost);
    }

    @Test
    void quickSortR() {
        Sort sort = new QuickSortR();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("quick sort r: " + cost);
    }

    @Test
    void bubbleSort() {
        Sort sort = new BubbleSort();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("bubble sort: " + cost);
    }

    @Test
    void insertionSort() {
        Sort sort = new InsertionSort();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("insertion sort: " + cost);
    }

    @Test
    void selectionSort() {
        Sort sort = new InsertionSort();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("selection sort: " + cost);
    }

    @Test
    void mergeSort() {
        Sort sort = new MergeSortR();
        long cost = Timer.measure(() -> sort.sort(array));
        System.out.println("merge sort: " + cost);
    }
}