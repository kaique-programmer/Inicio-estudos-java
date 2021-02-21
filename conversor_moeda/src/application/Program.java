package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double priceDollar, qtyDollars;

        System.out.println("What is the dollar price? ");
        priceDollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        qtyDollars = sc.nextDouble();

        double valueConverted = CurrencyConverter.convertCent(priceDollar, qtyDollars);

        System.out.printf("Amount to be paid in reais = %.2f R$ ", valueConverted);
    }
}
