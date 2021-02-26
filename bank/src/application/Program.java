package application;

import util.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        bankAccount.setAccountNumber(accountNumber);

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        bankAccount.setAccountHolder(accountHolder);

        System.out.print("Is there an initial deposit (y/n)? ");
        char resp = sc.nextLine().charAt(0);
        if(resp == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount.setInitialDeposit(initialDeposit);
        }
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.setDeposit(deposit);
        bankAccount.depositAccountNumber(deposit);
        System.out.println();
        System.out.println(bankAccount.toString());

        System.out.print("Enter a withdraw value: ");
        double withDraw = sc.nextDouble();
        bankAccount.setWithDraw(withDraw);
        bankAccount.cashAccountNumber(withDraw);
        System.out.println();
        System.out.println(bankAccount.toString());

    }
}
