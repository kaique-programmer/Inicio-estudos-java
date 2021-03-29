package application;

import java.io.BufferedReader;
// import java.io.File;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// import java.util.Scanner;

public class Program00 {
    public static void main(String[] args) {
        /*File file = new File("/home/kaique/test");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        } */

        /*// correct read of the file
        String path = "/home/kaique/test";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());

    }
}
