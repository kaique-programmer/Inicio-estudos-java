package model.entities;

import java.util.Locale;
import java.util.Objects;

public class Product01 implements Comparable<Product01>{
    private String name;
    private Double price;

    public Product01(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name  + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product01 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getName().equals(product.getName()) && getPrice().equals(product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

}
