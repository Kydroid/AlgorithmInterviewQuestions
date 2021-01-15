package org.example.fibonacci;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void throwException_whenNthElementIsNegative() {
        assertThrows(Exception.class, () -> Fibonacci.getNthElementOfFibonacciSequence(-1));
    }

    /**
     * This test for FibonacciSequence takes 765ms (best score after several tests launched)
     *
     * @throws Exception
     */
    @Test
    void returnNthElementOfFibonacciSequence_whenNthElementIsPositive() throws Exception {
        Instant start = Instant.now();
        assertEquals(0, Fibonacci.getNthElementOfFibonacciSequence(0));
        assertEquals(1, Fibonacci.getNthElementOfFibonacciSequence(1));
        assertEquals(1, Fibonacci.getNthElementOfFibonacciSequence(2));
        assertEquals(2, Fibonacci.getNthElementOfFibonacciSequence(3));
        assertEquals(3, Fibonacci.getNthElementOfFibonacciSequence(4));
        assertEquals(5, Fibonacci.getNthElementOfFibonacciSequence(5));
        assertEquals(8, Fibonacci.getNthElementOfFibonacciSequence(6));
        assertEquals(13, Fibonacci.getNthElementOfFibonacciSequence(7));
        assertEquals(377, Fibonacci.getNthElementOfFibonacciSequence(14));
        assertEquals(317811, Fibonacci.getNthElementOfFibonacciSequence(28));
        assertEquals(267914296, Fibonacci.getNthElementOfFibonacciSequence(42));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
        System.out.println("timeElapsed to return all tests result = " + timeElapsed);
    }
}
