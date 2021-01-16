package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

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

        return calculateNthElementOfFibonacciSequence(nthElement, new HashMap<>());
    }

    /**
     * Use of memoization to optimize algo and reduce stack call.
     * @param nthElement
     * @param mapFibResultMemo : a map to store previous result and return cached data
     * @return
     * @throws Exception
     */
    private static int calculateNthElementOfFibonacciSequence(int nthElement, Map<Integer, Integer> mapFibResultMemo) throws Exception {
        if (nthElement <= 2) {
            return 1;
        }

        if (!mapFibResultMemo.containsKey(nthElement)) {
            int fibResult = calculateNthElementOfFibonacciSequence(nthElement - 1, mapFibResultMemo)
                    + calculateNthElementOfFibonacciSequence(nthElement - 2, mapFibResultMemo);
            mapFibResultMemo.put(nthElement, fibResult);
        }
        return mapFibResultMemo.get(nthElement);
    }
}
