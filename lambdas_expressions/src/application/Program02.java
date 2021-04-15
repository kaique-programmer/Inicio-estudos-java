package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Book", 20.00));
        list.add(new Product("Note", 21.00));

        //list.forEach(new PriceUpdate());
        //list.forEach(Product::staticPriceUpdate);
        //list.forEach(Product::noStaticPriceUpdate);

        /*double factor = 1.1;

        Consumer<Product> consumer = p -> {
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(consumer);*/

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(System.out::println);


    }
}
