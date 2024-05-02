package LineCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    public void BinarySearchNullPointer(){
        Assertions.assertThrows(NullPointerException.class,()->NewBinarySearch.binarySearch(null,9));
    }
    @Test
    public void ElementFound(){
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, NewBinarySearch.binarySearch(array, 5));
    }
    @Test
    public void ElementNotFound(){
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, NewBinarySearch.binarySearch(array, 154));
    }
    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, NewBinarySearch.binarySearch(array, 325));
    }
    @Test
    public void testElementAtFirstPosition() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(0, NewBinarySearch.binarySearch(array, 2));
    }

    @Test
    public void testElementAtLastPosition() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(array.length - 1, NewBinarySearch.binarySearch(array, 10));
    }

}