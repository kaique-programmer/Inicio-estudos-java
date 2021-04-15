package application;

import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 2500.00));
        list.add(new Product("Game", 28000.00));
        list.add(new Product("Book", 25000.00));
        list.add(new Product("Telephone", 250.00));
        list.add(new Product("Chip", 25.00));

        ProductService productService = new ProductService();
        double sum = 0.0;
        //sum = productService.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        sum = productService.filteredSum(list, product -> product.getPrice() < 2500);
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
