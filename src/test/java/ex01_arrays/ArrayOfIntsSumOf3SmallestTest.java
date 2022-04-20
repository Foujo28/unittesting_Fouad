package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayOfIntsSumOf3SmallestTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void OnlyThree() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    void ThreeOrMore() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{10, 7, 5, 3, 2, 6, 7});
        assertEquals(10, result);
    }

    @Test
    void ThreeOrLess() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{6, 7});
        assertEquals(13, result);
    }

}