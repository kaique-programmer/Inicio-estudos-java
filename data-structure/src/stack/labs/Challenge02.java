package stack.labs;

import java.util.Stack;

public class Challenge02 {
    public static void main(String[] args) {
        printResult("A + B");
        printResult("A + B + (C - D)");
        printResult("{[()]}[](){()}");
        printResult("{[(]}[](){()}");
        printResult("A + B + C - D)");
    }

    public static void printResult(String expression) {
        System.out.println(expression + " is balanced? " + checkSymbolBalanced(expression));
    }

    final static String open = "([{";
    final static String close = ")]}";

    public static boolean checkSymbolBalanced(String expression) {

        Stack<Character> stack = new Stack<>();
        int index = 0;
        char symbol, top;

        while(index < expression.length()) {
            symbol = expression.charAt(index);

            if (open.indexOf(symbol) > -1) {
                stack.push(symbol);
            } else if (close.indexOf(symbol) > -1) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    top = stack.pop();

                    if (open.indexOf(top) != close.indexOf(symbol)) {
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }

}
