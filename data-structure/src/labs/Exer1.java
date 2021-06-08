package labs;

import model.entities.ListStruct;

public class Exer1 {
    public static void main(String[] args) {

        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("C");

        System.out.println(listStruct.contains("A"));
        System.out.println(listStruct.contains("B"));
        System.out.println(listStruct.contains("E"));
    }
}
