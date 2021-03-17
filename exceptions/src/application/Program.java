package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method2();

        System.out.println("Enf of program");

    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }

    public static void method2() {
        System.out.println("*** METHOD2 START ***");
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
        System.out.println("*** METHOD2 END ***");
        sc.close();
    }
}
