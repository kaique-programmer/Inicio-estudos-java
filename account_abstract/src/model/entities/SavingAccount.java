package model.entities;

public class SavingAccount extends Account{

    private Double interestRates;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRates) {
        super(number, holder, balance);
        this.interestRates = interestRates;
    }

    public Double getInterestRates() {
        return interestRates;
    }

    public void setInterestRates(Double interestRates) {
        this.interestRates = interestRates;
    }

    public void updateBalance() {
        this.balance += this.balance * this.interestRates;
    }

    @Override
    public void withDraw(double amount) {
        this.balance -= amount;
    }
}
