package application;

import model.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program07 {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        productSet.add(new Product("TV", 900.0));
        productSet.add(new Product("Notebook", 1200.0));
        productSet.add(new Product("Tablet", 400.0));

        Product product = new Product("Notebook", 1200.0);

        System.out.println(productSet.contains(product));
    }
}
