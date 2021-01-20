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
        int[] reverseArray = new int[]{2, 1};
        assertArrayEquals(reverseArray, ReverseArray.reverseOrder(array));
    }

}
