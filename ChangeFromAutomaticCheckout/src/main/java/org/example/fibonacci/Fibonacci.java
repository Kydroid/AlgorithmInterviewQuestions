package org.example.fibonacci;

/**
 * Write a method that returns the nth element of the Fibonacci Sequence.
 * The next number is found by adding up the two numbers before it.
 * Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
 */
public class Fibonacci {

    public static int getNthElementOfFibonacciSequence(int nthElement) throws Exception {
        if (nthElement < 0) {
            throw new Exception("Error : negative number entered.");
        }

        if (nthElement >= 3) {
            return getNthElementOfFibonacciSequence(nthElement - 1)
                    + getNthElementOfFibonacciSequence(nthElement - 2);
        }

        return (nthElement == 1 || nthElement == 2) ? 1 : 0;
    }
}
