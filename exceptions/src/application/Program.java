package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String[] array = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(array[position]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enf of program");

        sc.close();
    }
}
