package org.example.reverselist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void returnNull_whenArrayProvidedIsNull() {
        assertNull(ReverseArray.reverseOrder(null));
    }

    @Test
    void returnSameArray_whenArrayProvidedIsEmpty() {
        int[] array = new int[]{};
        assertSame(array, ReverseArray.reverseOrder(array));
    }

    @Test
    void returnSameArray_whenArrayProvidedContainsOneElement() {
        int[] array = new int[]{1};
        assertSame(array, ReverseArray.reverseOrder(array));
    }

    @Test
    void returnReverseArray_whenArrayProvidedContainsSeveralElements() {
        int[] array = new int[]{1, 2};
        int[] reverseArrayExpected = new int[]{2, 1};
        assertArrayEquals(reverseArrayExpected, ReverseArray.reverseOrder(array));

        array = new int[]{1, 2, 3};
        reverseArrayExpected = new int[]{3, 2, 1};
        assertArrayEquals(reverseArrayExpected, ReverseArray.reverseOrder(array));

        array = new int[]{1, 2, 3, 4};
        reverseArrayExpected = new int[]{4, 3, 2, 1};
        assertArrayEquals(reverseArrayExpected, ReverseArray.reverseOrder(array));

        array = new int[]{1, 2, 3, 4, 5};
        reverseArrayExpected = new int[]{5, 4, 3, 2, 1};
        assertArrayEquals(reverseArrayExpected, ReverseArray.reverseOrder(array));

        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        reverseArrayExpected = new int[]{19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(reverseArrayExpected, ReverseArray.reverseOrder(array));
    }

}
