package stack.test;

import java.util.Stack;

public class StackTest1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty()); // true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // false

        System.out.println(stack);

        System.out.println(stack.size()); // 3

        System.out.println(stack.peek()); // 3

        System.out.println(stack.pop());

        System.out.println(stack.size()); // 2
        System.out.println(stack);
    }
}
