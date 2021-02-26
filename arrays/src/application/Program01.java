package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0, average = 0.0;
        Product[] productsArrays = new Product[n];
        for(int i=0; i<productsArrays.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            productsArrays[i] = new Product(name, price);
            sum += productsArrays[i].getProductPrice();
        }
        average = sum / n;

        System.out.printf("Average products: %.2f%n", average);
        sc.close();
    }
}
