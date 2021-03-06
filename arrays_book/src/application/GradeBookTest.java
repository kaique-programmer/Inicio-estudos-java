package application;

import entitiesGradeBook.GradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        // student grade array
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook("Course Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
