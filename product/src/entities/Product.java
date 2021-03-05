package entities;

public class Product {
    private String nameProduct;
    private double priceProduct;
    private int qtyProduct;

    public Product() {
    }

    public Product(String nameProduct, double priceProduct, int qtyProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.qtyProduct = qtyProduct;
    }

    public Product(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQtyProduct() {
        return qtyProduct;
    }

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
