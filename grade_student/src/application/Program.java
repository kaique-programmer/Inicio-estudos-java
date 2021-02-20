package application;

import entities.StudentGrade;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StudentGrade studentGrade = new StudentGrade();

        System.out.print("Enter name: ");
        studentGrade.studentName = sc.nextLine();
        System.out.print("Enter grade: ");
        studentGrade.studentGradeFirstQuarter = sc.nextDouble();
        System.out.print("Enter grade: ");
        studentGrade.studentGradeSecondQuarter = sc.nextDouble();
        System.out.print("Enter grade: ");
        studentGrade.studentGradeThirdQuarter = sc.nextDouble();
        System.out.println();

        System.out.printf("FINAL GRADE: %.2f%n", studentGrade.calculateGradeQuarter());

        if (studentGrade.calculateGradeQuarter() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f ", studentGrade.missingGrade() + " POINTS");
        }
        sc.close();
    }
}