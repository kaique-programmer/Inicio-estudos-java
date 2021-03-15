package entities;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String productName, Double productPrice, Double customFee) {
        super(productName, productPrice);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return super.getProductPrice() + this.customFee;
    }

    @Override
    public String priceTag() {
        return super.getProductName() + " - $ " +
                String.format("%.2f", this.totalPrice())
                + " (Custom fee: $ " + String.format("%.2f", this.customFee) + ")";
    }
}
