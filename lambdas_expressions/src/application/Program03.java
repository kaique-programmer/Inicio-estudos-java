package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 500.00));
        list.add(new Product("Book", 600.00));
        list.add(new Product("Note", 700.00));
        list.add(new Product("Computer", 750.00));
        list.add(new Product("Iphone", 1234.00));

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::NoStaticUpperCaseName).collect(Collectors.toList());

        /*Function<Product, String> function = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(function).collect(Collectors.toList());*/

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
