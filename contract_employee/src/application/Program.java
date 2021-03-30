package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int contractNumber = scanner.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date contractDate = simpleDateFormat.parse(scanner.next());
        System.out.print("Contract Value: ");
        double contractValue = scanner.nextInt();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        ContractService contractService = new ContractService(new PaypalService());

        System.out.print("Enter number of installments: ");
        int installmentsNumber = scanner.nextInt();

        contractService.processContract(contract, installmentsNumber);

        System.out.println("Installments: ");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
