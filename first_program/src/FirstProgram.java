import javax.swing.*;

public class FirstProgram {
    public static void main(String[] args) {
        double baseMenor, baseMaior, h, area;

        baseMenor = 6.0;
        baseMaior = 8.0;
        h = 5.0;

        area = (baseMenor + baseMaior) / 2.0 * h;
        System.out.println(area);
    }
}
