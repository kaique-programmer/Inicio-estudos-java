package entities;

import java.util.Locale;

public class Product {
    public String nameProduct;
    public double priceProduct;
    public int qtyProduct;

    public double totalValueStock() { return priceProduct *  qtyProduct; }

    public void addProducts(int quantity) { this.qtyProduct += quantity; }

    public void removeProducts(int quantity) {
        this.qtyProduct -= quantity;
    }

    public String toString() {
        return "Product data: " + nameProduct.toLowerCase()
                                + ", $ " + String.format("%.2f", priceProduct)
                                + ", " + qtyProduct
                                + " units, Total: $ "
                                + String.format("%.2f", totalValueStock());
    }
}
