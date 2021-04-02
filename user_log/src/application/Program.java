package application;

import model.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logEntrySet = new HashSet<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logEntrySet.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + logEntrySet.size());
        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
