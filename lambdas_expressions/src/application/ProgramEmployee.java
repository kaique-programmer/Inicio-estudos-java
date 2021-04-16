package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String path = scanner.next();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.println("Enter a salary: ");
            double salary = scanner.nextDouble();

            List<String> emails = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(employee -> employee.getSalary()).reduce(0.0, (x,y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
