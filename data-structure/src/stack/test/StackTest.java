package stack.test;

import stack.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        /*
        for (int i=1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println(stack.length());*/

        /* is empty ?
        System.out.println(stack.isEmpty());

        stack.push(1);

        System.out.println(stack.isEmpty()); */

        System.out.println(stack.top());

        System.out.println(stack);

        stack.push(1);
        stack.push(2);

        System.out.println(stack.top());

        System.out.println(stack);

    }
}
