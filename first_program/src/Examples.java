import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Enter with values: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int higher = max(a, b, c);
            showResult(higher);
            System.out.println("What continues? y/n");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
        sc.close();
    }

    public static int max(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        }else if(b > a && b > c) {
            return b;
        }else {
            return c;
        }
    }

    public static void showResult(int value) {
        System.out.println(value);
    }
}
