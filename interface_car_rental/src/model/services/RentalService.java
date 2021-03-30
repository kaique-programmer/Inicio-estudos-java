package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerHour, pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        super();
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
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

    public BrazilTaxService getBrazilTaxService() {
        return brazilTaxService;
    }

    public void setBrazilTaxService(BrazilTaxService brazilTaxService){
        this.brazilTaxService = brazilTaxService;
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

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
