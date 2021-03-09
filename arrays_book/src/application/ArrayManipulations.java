package application;

import java.util.Arrays;
import java.util.Locale;

public class ArrayManipulations {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // sorts doubleArray in ascending order
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for (double value : doubleArray)
            System.out.printf("%.1f", value);

        // fills the 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray in the array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // checks the equality of intArray and intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        // checks the equality of intArray and filledIntArray
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));

        // searches for the value 5 in intArray
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0)
            System.out.printf("Found 5 at element %d in intArray%n", location);
        else
            System.out.println("5 not found in intArray");

        // searches for the value 8763 in intArray
        location = Arrays.binarySearch(intArray, 8763);

        if (location >= 0)
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        else
            System.out.println("8763 not found in intArray");

    }

    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array)
            System.out.printf("%d", value);
    }
}
