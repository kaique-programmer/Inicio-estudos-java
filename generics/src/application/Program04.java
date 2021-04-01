package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        /*List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);

        List<? extends Number> list = integerList;

        Number x = list.get(0);

        list.add(20); // err compilation: can't add */

        /*List<Object> objectList = new ArrayList<>();
        objectList.add("Maria");
        objectList.add("Kaique");

        List<? super Number> myNums = objectList;
        myNums.add(10);
        myNums.add(5);

        Number x = myNums.get(0); // err compilation: can't attribute to number */

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<Double> doubleList = Arrays.asList(3.14, 6.28);
        List<Object> objectList = new ArrayList<Object>();

        copy(integerList, objectList);
        printList(objectList);
        copy(doubleList, objectList);
        printList(objectList);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number number : source) {
            destination.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
