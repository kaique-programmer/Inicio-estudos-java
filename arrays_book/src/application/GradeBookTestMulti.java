package application;

import entitiesGradeBook.GradeBookMulti;

public class GradeBookTestMulti {
    public static void main(String[] args) {
        // array two dimensional student's grades
        int[][] gradesArray = {{87, 96, 70},
                               {68, 56, 33},
                               {88, 66, 37},
                               {68, 56, 23},
                               {45, 51, 93},
                               {66, 16, 73},
                               {16, 16, 73},
                               {65, 82, 79},
                               {69, 56, 43},
                               {99, 100, 98}};

        GradeBookMulti myGradeBookMulti = new GradeBookMulti("Course Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBookMulti.getCourseName());
        myGradeBookMulti.processGrade();
    }
}
