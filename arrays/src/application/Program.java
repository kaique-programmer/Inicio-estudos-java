package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] array = new double[3];

        double sum = 0.0;
        for(int i=0; i < array.length; i++) {
            System.out.println("Enter height: ");
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        double average = sum / 3;
        System.out.printf("Average height: %.2f%n ", average);
        sc.close();
    }
}
