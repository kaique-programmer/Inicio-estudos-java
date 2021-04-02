package application;

import model.entities.Product01;

import java.util.Set;
import java.util.TreeSet;

public class Program08 {
    public static void main(String[] args) {
        Set<Product01> product01Set = new TreeSet<>();

        product01Set.add(new Product01("TV", 900.0));
        product01Set.add(new Product01("Notebook", 1200.0));
        product01Set.add(new Product01("Tablet", 400.0));

        for (Product01 p : product01Set) {
            System.out.println(p);
        }
    }
}
