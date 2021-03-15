package application;

import entities.Array;

public class Program01 {
    public static void main(String[] args) {
        Array array1 = new Array(10);

        array1.add("Element 0");
        array1.add("Element 1");
        array1.add("Element 2");
        System.out.println(array1.length());
        System.out.println(array1.toString());
    }
}
