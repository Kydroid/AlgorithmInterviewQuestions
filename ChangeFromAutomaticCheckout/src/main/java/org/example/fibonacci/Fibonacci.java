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

        if (nthElement == 0) {
            return 0;
        }

        return calculateNthElementOfFibonacciSequence(nthElement, nthElement);
    }

    private static int calculateNthElementOfFibonacciSequence(int nthElement, int nthElementOriginal) throws Exception {
        if (nthElement <= 2) {
            return 1;
        }

        return calculateNthElementOfFibonacciSequence(nthElement - 1, nthElementOriginal)
                + calculateNthElementOfFibonacciSequence(nthElement - 2, nthElementOriginal);
    }
}
