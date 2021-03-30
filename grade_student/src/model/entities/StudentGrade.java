package model.entities;

public class StudentGrade {
    public String studentName;
    public double studentGradeFirstQuarter;
    public double studentGradeSecondQuarter;
    public double studentGradeThirdQuarter;

    public double calculateGradeQuarter() {
        return this.studentGradeFirstQuarter + this.studentGradeSecondQuarter + this.studentGradeThirdQuarter;
    }

    public double missingGrade() {
        if(calculateGradeQuarter() < 60.0) {
            return 60.0 - calculateGradeQuarter();
        }else {
            return 0.0;
        }
    }
}
