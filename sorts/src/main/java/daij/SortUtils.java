package daij;

/**
 * Some utils method that extract from sorts, in order to reduce duplicate code.
 *
 * @author OliverDD
 * @version 1.0.0
 */
public class SortUtils {

    /**
     * Swap two element in the array by their index.
     * <p>
     * Warning: We do not check the index, so {@code ArrayIndexOutOfBoundsException} may be thrown.
     *
     * @param array array need swap
     * @param i1    element1's index
     * @param i2    element2's index
     * @param <T>   element's type
     */
    public static <T> void swap(T[] array, int i1, int i2) {
        T temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }


}
