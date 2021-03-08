package entitiesGradeBook;

public class GradeBook {
    private String courseName; // name of the course that this GradeBook represents
    private int[] grades; // student grade array

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method for setting the name of the course
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method for the recover name of the course
    public String getCourseName(){
        return courseName;
    }

    // realize various operations in the data
    public void processGrades() {
        // generates output array of the grades
        outputGrades();

        // call method getAverage getAverage for calculate the average grade
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // call method getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(),getMaximum());

        // call outputBarChart for print chart of the distribution of the grade
        outputBarChart();
    }

    // find grade minimum
    public int getMinimum() {
        int lowGrade = grades[0]; // supposes that grades[0] is the less grade

        // make a loop by array of the grades
        for (int grade : grades) {
            // if the grade for lower that lowGrade, attribute this grade the lowGrade
            if (grade < lowGrade)
                lowGrade = grade; // new grade lower
        }
        return lowGrade;
    }

    // find grade maximum
    public int getMaximum() {
        int highGrade = grades[0]; // supposes that grades[0] is the large grade

        // make a loop by array of the grades
        for(int grade : grades){
            // if the grade for larger that highGrade, attribute this grade the highGrade
            if (grade > highGrade)
                highGrade = grade; // new grade higher
        }
        return highGrade;
    }

    // determine average for test
    public double getAverage() {
        int total = 0;

        // sum grades of the student
        for (int grade : grades)
            total += grade;

        // return average of the grade
        return (double) total  / grades.length;
    }

    // generates bar graph output to display total grade distribution
    public void outputBarChart() {
        System.out.println("Grade distribution");

        // storage frequency of the grades in each interval 10 grades
        int[] frequency = new int[11];

        // for each grade, increment the frequency appropriates
        for (int grade : grades)
            ++frequency[grade / 10];

        // for each frequency of the grade, print bar on the chart
        for (int count =0; count < frequency.length; count++) {
            // generates output of the bar label ("00-99: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            // prints the asterisk bar
            for (int stars =0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    // generates output of the content array of the grades
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        // generates output grades each student
        for (int student =0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
    }
}
