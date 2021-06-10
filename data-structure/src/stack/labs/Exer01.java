package stack.labs;

import java.util.Scanner;
import stack.Stack;

public class Exer01 {

    public static void main(String[] args) {

        Stack<Integer> Stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=10; i++){

            System.out.println("Enter a number:");

            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("Staking the number " + num);
                Stack.push(num);
            } else {

                Integer unstacked = Stack.pop();

                if (unstacked == null){
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Odd number, unstacking a Stack element: " + unstacked);
                }
            }
        }

        System.out.println("All numbers have been read, unstacking Stack numbers");

        while (!Stack.isEmpty()){
            System.out.println("Unstacking a Stack element: " + Stack.pop());
        }

        System.out.println("All elements were unstacked");

    }
}