package entities;

import java.util.Locale;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100.0;
    }

    public boolean noStaticProductPredicate() {
        return this.price >= 100.0;
    }*/

    /*public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void noStaticPriceUpdate() {
        this.price = this.price * 1.1;
    }*/

    /*public static String staticUpperCaseName(Product product) {
        return product.getName().toUpperCase();
    }

    public String NoStaticUpperCaseName() {
        return this.name.toUpperCase();
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
