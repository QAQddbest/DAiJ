package daij;

public class SortUtils {

    public static <T> void swap(T[] array, int i1, int i2) {
        T temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }


}
