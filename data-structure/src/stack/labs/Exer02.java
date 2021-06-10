package stack.labs;

import java.util.Scanner;
import stack.Stack;

public class Exer02 {

    public static void main(String[] args) {

        Stack<Integer> pair = new Stack<Integer>();
        Stack<Integer> odd = new Stack<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=10; i++){

            System.out.println("Enter a number: ");

            int num = scanner.nextInt();

            if (num == 0){

                //Stack pair
                Integer unstacked = pair.pop();

                if (unstacked == null){
                    System.out.println("Empty pair stack");
                } else {
                    System.out.println("Unstacking da stack pair: " + unstacked);
                }

                //Stack odd

                unstacked = odd.pop();

                if (unstacked == null){
                    System.out.println("Empty odd stack");
                } else {
                    System.out.println("Unstacking odd stack: " + unstacked);
                }


            } else if (num % 2 == 0){
                System.out.println("Pair number, stacking on pair stack: " + num);
                pair.push(num);
            } else {
                System.out.println("Odd number, in stacking on the odd Stack: " + num);
                odd.push(num);
            }
        }

        System.out.println("Unstacking all numbers from the pair stack");

        while (!pair.isEmpty()){
            System.out.println("Unstacking pair stack: " + pair.pop());
        }

        System.out.println("Unstacking all numbers from the odd stack");

        while (!odd.isEmpty()){
            System.out.println("Unstacking odd stack: " + odd.pop());
        }

    }

}
