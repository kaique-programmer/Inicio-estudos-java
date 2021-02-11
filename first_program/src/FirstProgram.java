import com.sun.jdi.connect.Connector;

import java.util.Locale;
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        double billCall = 50.0;

        if (minutes > 100) {
            billCall +=  (minutes - 100) * 2.0;
        }
        System.out.printf("Valor da conta %.2f%n", billCall);

        sc.close();
    }
}
