package stack.labs;

import java.util.Stack;

public class Challenge04 {
    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        towerOfHanoi(original.size(), original, destination, aux);
    }

    public static void towerOfHanoi(int n, Stack<Integer> original,
                                    Stack<Integer> destination, Stack<Integer> aux){

        if (n > 0){
            towerOfHanoi(n-1, original, aux, destination);
            destination.push(original.pop());
            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destination: " + destination);
            System.out.println("Aux: " + aux);
            towerOfHanoi(n-1, aux, destination, original);
        }

    }
}
