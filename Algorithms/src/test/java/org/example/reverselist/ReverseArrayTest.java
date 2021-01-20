package org.example.reverselist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

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

}
