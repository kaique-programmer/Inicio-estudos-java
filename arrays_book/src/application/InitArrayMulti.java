package application;

public class InitArrayMulti {
    // create and generates output array two dimensional
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Values in array by row are");
        outputArray(array1); // display array1 by row

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // display array2 by row
    }

    // generates output of the row and columns of the an array two dimensional
    public static void outputArray(int[][] array) {
        int total=0;
        // make a loop by rows of the array
        for(int row=0; row < array.length; row++) {
            // make a loop by columns of the row current
            for(int column =0; column < array[row].length; column++){
                System.out.printf("%d", array[row][column]);
                total += array[row][column];
            }
            System.out.println();
        }
        System.out.print("Total values array: " + total);
    }

}
