package org.example.reverselist;


public class ReverseArray {

    public static int[] reverseOrder(int[] arrayToReverse) {
        if (arrayToReverse != null && arrayToReverse.length > 1) {
            int elementToSwitch = arrayToReverse[0];
            arrayToReverse[0] = arrayToReverse[arrayToReverse.length-1];
            arrayToReverse[arrayToReverse.length-1] = elementToSwitch;
        }
        return arrayToReverse;
    }
}
