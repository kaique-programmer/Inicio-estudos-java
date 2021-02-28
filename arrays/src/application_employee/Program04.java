package application_employee;

import entities_employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        for (int i =0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken, try again!");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }
        System.out.println();
        for (Employee employeePrintFirst: list) {
            System.out.println(employeePrintFirst.toString());
        }
        System.out.println();

        System.out.print("Enter the employee id existing that will have salary increase: ");
        int idEmployeeIncreaseSalary = sc.nextInt();
        Integer positionId = catchPosition(list, idEmployeeIncreaseSalary);
        if(positionId != null){
            System.out.print("Enter percentage: ");
            int percentageIncrease = sc.nextInt();
            list.get(positionId).increaseSalary(percentageIncrease);
        }else {
            while (positionId == null) {
                System.out.println("\nThis id does not exist again!\n");
                System.out.print("Enter the employee id existing that will have salary increase: ");
                int id = sc.nextInt();
                positionId = catchPosition(list, id);
                System.out.print("Enter percentage: ");
                int percentageIncrease = sc.nextInt();
                list.get(positionId).increaseSalary(percentageIncrease);
            }
        }
        System.out.println();

        System.out.println("List of employees");
        for (Employee employeePrintSecond: list) {
            System.out.println(employeePrintSecond.toString());
        }
    }

    public static Integer catchPosition(List<Employee> list, int id) {
        for (int i=0; i < list.size(); i++) {
            if (list.get(i).getEmployeeId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getEmployeeId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
