package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i=1; i <= numberTaxPayers; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Annual income: ");
            double annualIncome = sc.nextDouble();
            System.out.println();
            System.out.print("Individual or company (i/c) ? ");
            char individualOrCompany = sc.nextLine().charAt(0);
            if(individualOrCompany == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            }else if(individualOrCompany == 'c'){
                System.out.println("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }else{
                System.out.println("Input invalid");
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer taxPayer : list)
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.getAnnualIncome()));

    }
}
