package application;

import model.entities.CalculationService;
import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program01 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "/home/kaique/Documents/test";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
