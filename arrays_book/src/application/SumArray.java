package application;

public class SumArray {
    public static void main(String[] args) {
        int[] array = {85, 36, 85, 99, 59, 36, 45, 36, 22, 65};
        int total = 0;

        // add value of the each element in total
        for(int i=0; i < array.length; i++)
            total += array[i];

        System.out.printf("Total of array elements: %d%n", total);
    }
}
