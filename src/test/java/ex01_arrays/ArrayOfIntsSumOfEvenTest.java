package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsSumOfEvenTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void empty() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void onlyEven() {
        int result = arrayOfInts.sumOfEven(new int[]{2,4,6,8});
        assertEquals(20, result);
    }

    @Test
    void evenWithUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{1,2,3,4,6,8});
        assertEquals(20, result);
    }

    @Test
    void minusEven() {
        int result = arrayOfInts.sumOfEven(new int[]{-2,-4,-6,-8});
        assertEquals(-20, result);
    }
}