package application;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(101, "James", 500.0, 0.01));
        list.add(new BusinessAccount(102, "Lebron", 500.0, 100.0));
        list.add(new SavingAccount(103, "Anne", 600.0, 200.0));
        list.add(new BusinessAccount(104, "Frankie", 900.0, 80.0));

        double sum =0, sumUpdated=0;
        for (Account account : list)
            sum += account.getBalance();

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account account : list)
            account.deposit(10.0);

        for (Account account : list)
            System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber() , account.getBalance());

        for (Account account : list)
            sumUpdated += account.getBalance();

        System.out.printf("Total balance updated: %.2f%n", sumUpdated);
    }
}
