package stack.labs;

import stack.Stack;

public class Challenge {
    public static void main(String[] args) {
        printResult("ADA");

        printResult("ABCD");

        printResult("ABCCBA");

        printResult("Kaique");
    }

    public static void printResult(String word){
        System.out.println(word + " Is palindrome? " + palindromeTest(word));
    }

    public static boolean palindromeTest(String word){

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<word.length(); i++){
            stack.push(word.charAt(i));
        }

        String reverseWord = "";
        while (!stack.isEmpty()){
            reverseWord += stack.pop();
        }

        if (reverseWord.equalsIgnoreCase(word)){
            return true;
        }

        return false;
    }
}
