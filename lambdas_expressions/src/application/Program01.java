package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tablet", 210.00));
        list.add(new Product("TV", 21.00));
        list.add(new Product("Note", 2100.00));

        //list.removeIf(p -> p.getPrice() >= 100);
        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(Product::noStaticProductPredicate);

        // version declare
        double min = 100.0;

        Predicate<Product> productPredicate = p -> p.getPrice() >= min;

        list.removeIf(productPredicate);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
