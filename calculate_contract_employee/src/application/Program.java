package application;


import model.entities.enums.WorkerLevel;
import entities_worker.Department;
import entities_worker.HourContract;
import entities_worker.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int workerContractsQuantity = sc.nextInt();

        for (int i =1; i <= workerContractsQuantity; i++) {
            System.out.println("Enter contract #" + i +" data: ");
            System.out.print("Date (DD/MM/YYY): ");
            Date contractDate = simpleDateFormat.parse(sc.next());
            System.out.print("Value per Hour: ");
            double valuePerHourWorker = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int workerHours = sc.nextInt();
            HourContract hourContract = new HourContract(contractDate, valuePerHourWorker, workerHours);
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
