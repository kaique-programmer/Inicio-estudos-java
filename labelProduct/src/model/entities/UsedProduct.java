package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(){super();}

    public UsedProduct(String productName, Double productPrice, Date manufactureDate) {
        super(productName, productPrice);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return  this.getProductName() + " (used) - $ "
                + String.format("%.2f", this.getProductPrice())
                + " (Manufacture date: " + simpleDateFormat.format(this.manufactureDate) + ")";
    }
}
