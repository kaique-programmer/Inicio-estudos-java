package application;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        Map<String, Integer> registrationVoteElectoral = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (registrationVoteElectoral.containsKey(name)) {
                    int votesSum = registrationVoteElectoral.get(name);
                    registrationVoteElectoral.put(name, count + votesSum);
                } else {
                    registrationVoteElectoral.put(name, count);
                }

                line = bufferedReader.readLine();
            }

            for (String key : registrationVoteElectoral.keySet()) {
                System.out.println(key + ": " + registrationVoteElectoral.get(key));
            }
        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
