package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {
        List<Integer> myIntegers = Arrays.asList(3,10,8);
        printList(myIntegers);

        List<String> myStrings = Arrays.asList("Kaique", "Oliveira", "Santos");
        printList(myStrings);
    }

    public static void printList(List<?> list) {
        //list.add(3); the compiler doesn't know what type
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
