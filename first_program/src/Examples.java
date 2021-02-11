import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteredUser = sc.nextInt();

        String weekDays[] = {"Sunday", "Monday", "Tuesday"};

        //String day;
        switch (enteredUser) {
            case 0:
                //day = "Sunday";
                System.out.println(weekDays[0]);
                break;
            case 1:
                //day = "Monday";
                System.out.println(weekDays[1]);
                break;
            case 2:
                //day = "Tuesday";
                System.out.println(weekDays[2]);
                break;
        }
    }
}
