package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayOfIntsSumOf3SmallestTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void OnlyThree() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(6, result);
    }


}