package application;

import model.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] studentsArrays = new Student[9];

        System.out.println("How much rooms will be rented? 0-9");
        int n = sc.nextInt();

        for(int i=0; i < n; i++) {
            System.out.println();
            System.out.println("Rent: #" + i + ":");
            System.out.print("Enter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            studentsArrays[room] = new Student(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<9; i++) {
            if (studentsArrays[i] != null) {
                System.out.println(i + ":" + studentsArrays[i].getStudentName() + ", "
                                            + studentsArrays[i].getStudentEmail());
            }
        }

    }
}
