package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double calcCircumference = Calculator.circumference(radius);
        double volumeCircumference = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", calcCircumference);
        System.out.printf("Volume: %.2f%n", volumeCircumference);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
