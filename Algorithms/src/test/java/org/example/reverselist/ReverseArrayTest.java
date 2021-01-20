package org.example.reverselist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseArrayTest {

    @Test
    void returnNull_whenArrayProvidedIsNull() {
        assertNull(ReverseArray.reverseOrder(null));
    }

}
