package util;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance = 0.0;
    private double deposit, initialDeposit;
    private double withDraw;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithDraw() {
        return withDraw;
    }

    public void setWithDraw(double withDraw) {
        this.withDraw = withDraw;
    }

    public double depositAccountNumber(double deposit) {
        if (this.accountNumber == this.accountNumber) {
            this.balance += deposit;
            return deposit;
        } else {
            System.out.println("Check your account number.");
            return 0;
        }
    }

    public double cashAccountNumber(double withDraw) {
        if (this.accountNumber == this.accountNumber) {
            this.balance = this.balance - withDraw - 5;
            return this.balance;
        } else if (this.withDraw > this.balance || this.balance < 0.0){
            System.out.println("Balance insufficient for withdraw");
            return this.balance;
        } else {
            System.out.println("Account number invalid");
            return this.balance;
        }
    }

    public double accountBalance() {
        return this.balance + this.initialDeposit;
    }

    public String toString() {
        return "Account data: \n" +
                "Account: " + this.accountNumber +
                ", Holder: " + this.accountHolder +
                ", Balance: $ " + String.format("%.2f%n", accountBalance());
    }
}
