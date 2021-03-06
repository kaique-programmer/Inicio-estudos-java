package application;

import java.util.Scanner;

public class EnhancedForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int total=0;
        for (int i =0; i < array.length; i++) {
            System.out.printf("Enter a values for array: ");
            array[i] = sc.nextInt();
        }

        for (int number : array)
            total += number;

        System.out.printf("Total of array elements: %d%n", total);
    }
}
