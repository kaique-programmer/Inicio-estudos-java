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

        torreDeHanoi(original.size(), original, destination, aux);
    }

    public static void torreDeHanoi(int n, Stack<Integer> original,
                                    Stack<Integer> destination, Stack<Integer> aux){

        if (n > 0){
            torreDeHanoi(n-1, original, aux, destination);
            destination.push(original.pop());
            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destination: " + destination);
            System.out.println("Aux: " + aux);
            torreDeHanoi(n-1, aux, destination, original);
        }

    }
}
