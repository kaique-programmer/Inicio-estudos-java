package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerHour, pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        super();
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getBrazilTaxService() {
        return taxService;
    }

    public void setBrazilTaxService(BrazilTaxService brazilTaxService){
        this.taxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        long timeOne = carRental.getStart().getTime();
        long timeTwo = carRental.getFinish().getTime();
        double hours = (double) (timeOne - timeTwo) / 1000 / 60 / 60;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = Math.ceil(hours) * this.pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * this.pricePerDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
