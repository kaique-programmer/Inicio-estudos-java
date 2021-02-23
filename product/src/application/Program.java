package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with product data: ");
        System.out.print("Product name: ");
        String nameProduct = sc.nextLine();
        System.out.print("Product price: ");
        double priceProduct = sc.nextDouble();
        System.out.println();

        Product product = new Product(nameProduct, priceProduct);

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        int qtyProduct = sc.nextInt();
        product.addProducts(qtyProduct);

        System.out.println(product);

        System.out.println("Enter the number of products to be removed from stock: ");
        qtyProduct = sc.nextInt();
        product.removeProducts(qtyProduct);

        System.out.println(product);
        sc.close();
    }
}
