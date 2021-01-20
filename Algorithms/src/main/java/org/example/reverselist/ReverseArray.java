package org.example.reverselist;


public class ReverseArray {

    public static int[] reverseOrder(int[] arrayToReverse) {
        if (arrayToReverse != null && arrayToReverse.length > 1) {
            for (int i = 0; i < arrayToReverse.length / 2; i++) {
                switchElements(arrayToReverse, i, arrayToReverse.length - 1 - i);
            }
        }
        return arrayToReverse;
    }

    private static void switchElements(int[] array, int indexElementA, int indexElementB) {
        int elementToSwitch = array[indexElementA];
        array[indexElementA] = array[indexElementB];
        array[indexElementB] = elementToSwitch;
    }
}
