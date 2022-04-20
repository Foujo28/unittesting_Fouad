package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsSumOfEvenTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void Empty() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void OnlyEven() {
        int result = arrayOfInts.sumOfEven(new int[]{2,4,6,8});
        assertEquals(20, result);
    }

    @Test
    void EvenWithUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{1,2,3,4,6,8});
        assertEquals(20, result);
    }

    @Test
    void MinusEven() {
        int result = arrayOfInts.sumOfEven(new int[]{-2,-4,-6,-8});
        assertEquals(-20, result);
    }
}