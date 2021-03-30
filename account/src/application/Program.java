package application;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingAccount;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account account = new Account(1233, "James", 1000.0);
        account.withDraw(200);
        System.out.println(account.getBalance());

        Account account1 = new SavingAccount(1002, "Anne", 1000.0, 0.01);
        account1.withDraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new BusinessAccount(1003, "Dylan", 1000.0, 500.0);
        account2.withDraw(200.0);
        System.out.println(account2.getBalance());

        Account x = new Account(1020, "Ryan", 1000.0);
        Account y = new SavingAccount(1023, "Doll", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(y.getBalance());
        System.out.println(x.getBalance());

        /*BusinessAccount businessAccount = new BusinessAccount(1244, "Elaine", 0.0, 500.0);

        // UPCASTING

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Lebron", 0.0, 290.0);
        Account account3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        // BusinessAccount account5 = (BusinessAccount) account3;
        if(account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }
        if (account3 instanceof SavingAccount) {
            SavingAccount account5 = (SavingAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }*/
    }
}
