package application;

import model.entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();

        System.out.print("How many values? ");
        int howManyValues = scanner.nextInt();

        for (int i = 0; i < howManyValues; i++) {
            String value = scanner.next();
            printService.addValue(value);
        }

        printService.print();
        System.out.print(printService);
        scanner.close();
    }
}
