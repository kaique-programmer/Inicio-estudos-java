package application;

public class InitArray {
    public static void main(String[] args) {
        /**
        // declare array variable and begin with object array
        int[] array = new int[5];

        System.out.printf("%s%8s%n", "Index", "Value"); // column title

        // generates value output for each element of the array
        for (int index =0; index < array.length; index++)
            System.out.printf("%5d%8d%n", index, array[index]);


        // The list initializer specific a value initial for each element
        int[] arrayWithKeys = {10, 20, 30, 40, 50};

        System.out.printf("%s%8s%n", "Index", "Value"); // column title

        // generates value output for each element of the array
        for (int index =0; index < array.length; index++)
            System.out.printf("%5d%8d%n", index, arrayWithKeys[index]);

         */

        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH];

        // calculate value of the each element array
        for (int i =0; i < array.length; i++)
            array[i] = 2 + 2 * i;

        System.out.printf("%s%8s%n", "Index", "Value"); // column title

        // generates value output for each element of the array
        for (int index =0; index < array.length; index++)
            System.out.printf("%5d%8d%n", index, array[index]);
    }
}
