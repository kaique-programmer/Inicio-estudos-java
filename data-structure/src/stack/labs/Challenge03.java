package stack.labs;

import java.util.Stack;

public class Challenge03 {
    public static void main(String[] args) {

        printResult(2);

        printResult(4);

        printResult(10);

        printResult(25);

        printResult(10035);

        printResultAnyBase(25, 16);

        printResultAnyBase(10035, 8);

        printResultAnyBase(10035, 16);

    }

    public static void printResult(int number){
        System.out.println(number + " in binary is: " + binaryDecimal(number));
    }

    public static void printResultAnyBase(int number, int base){
        System.out.println(number + " at the base " + base +
                " is: " + decimalAnyBase(number, base));
    }

    public static String binaryDecimal(int number){

        Stack<Integer> stack = new Stack<>();
        String binaryNumber = "";
        int rest;

        while (number > 0){
            rest = number % 2;
            stack.push(rest);
            number /= 2; //number = number /2
        }

        while (!stack.isEmpty()){
            binaryNumber += stack.pop();
        }

        return binaryNumber;
    }

    public static String decimalAnyBase(int number, int base){

        if (base > 16){
            throw new IllegalArgumentException();
        }

        Stack<Integer> stack = new Stack<>();
        String numBase = "";
        int rest;
        String bases = "0123456789ABCDEF";

        while (number > 0){
            rest = number % base;
            stack.push(rest);
            number /= base;
        }

        while (!stack.isEmpty()){
            numBase += bases.charAt(stack.pop());
        }

        return numBase;
    }
}
