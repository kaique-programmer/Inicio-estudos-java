package entitiesGradeBook;

public class GradeBookMulti {
    private String courseName; // name of the course that this grade book represents
    private int[][] grades; // array two dimensional of the student grades

    public GradeBookMulti(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method for settings the name of the course
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method for recovery the name of the course
    public String getCourseName() {
        return courseName;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void processGrade() {
        // generates output grades array
        outputGrades();

        // call method getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(),
                                                "Highest grade in the grade book is", getMaximum());

        // generates output grades distribution char of the all grades in the all the tests
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        // supposes that first element of the grades array is the less
        int lowGrade = grades[0][0];

        // make a loop by row array of the grades
        for(int[] studentGrades: grades) {
            // loops through the columns of the current row
            for(int grade : studentGrades) {
                // if the grade for less than lowGrade, attribute the grade lowGrade
                if(grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        // assume that the first element of grade array is the largest
        int highGrade = grades[0][0];

        // loops through the rows of the grades array
        for(int[] studentsGrades : grades) {
            //  loops through the columns of the current row
            for (int grade : studentsGrades) {
                // if the grade for higher than highGrade, attribute this grade highGrade
            }
        }
        return highGrade;
    }

    // determines the average of the particular set of grades
    public double getAverage(int[] setOfGrades) {
        int total =0;

        // sum grades of the student
        for(int grade : setOfGrades)
            total += grade;

        // return average of the grades
        return (double) total / setOfGrades.length;
    }

    // generates bar graph output to display total grade distribution
    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // stores note frequencies in each 10-note interval
        int[] frequency = new int[11];

        // for each GradeBook, increment the frequency appropriates
        for(int[] studentGrades : grades) {
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }

        // for each frequency of the grade, print bar on the chart
        for (int count =0; count < frequency.length; count++) {
            // generates output of the bar label ("00-99: ", ..., "90-99: ", "100: ")
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d ", count * 10, count * 10 + 9);

            // prints the asterisk bar
            for (int stars =0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    // generates output of the content array of the grades
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.printf("             "); // aligns column headings

        // creates a column header for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d ", test + 1);

        System.out.println("Average"); // title of the student's average column

        // creates text rows/columns that represent array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for(int test : grades[student]) // generates student grade output
                System.out.printf("%8d", test);

            // calls getAverage method to calculate the student's average
            // pass grade row as argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
