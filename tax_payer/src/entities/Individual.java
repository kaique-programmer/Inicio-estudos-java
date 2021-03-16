package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(){super();}

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = 0.0;
        if(this.getAnnualIncome() < 20000.0)
            basicTax = this.getAnnualIncome() * 0.15;
        else
            basicTax = this.getAnnualIncome() * 0.25;

        basicTax -= this.getHealthExpenditures() * 0.5;
        if (basicTax < 0.0)
            basicTax = 0.0;

        return basicTax;
    }
}
