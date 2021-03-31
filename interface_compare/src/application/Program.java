package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "/home/kaique/Documents/names";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeCsv = bufferedReader.readLine();
            while(employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (Employee employee : list ) {
                System.out.println(employee.getName() + " - " + employee.getSalary());
            }
        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
