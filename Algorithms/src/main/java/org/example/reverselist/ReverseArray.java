package org.example.reverselist;


public class ReverseArray {

    public static int[] reverseOrder(int[] arrayToReverse) {
        if (arrayToReverse != null && arrayToReverse.length > 1) {
            for (int i = 0; i < arrayToReverse.length/2; i++) {
                int elementToSwitch = arrayToReverse[i];
                arrayToReverse[i] = arrayToReverse[arrayToReverse.length-1-i];
                arrayToReverse[arrayToReverse.length-1-i] = elementToSwitch;
            }
        }
        return arrayToReverse;
    }
}
