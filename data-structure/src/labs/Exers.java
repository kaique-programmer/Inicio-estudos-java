package labs;

import model.entities.ListStruct;

import java.util.ArrayList;

public class Exers {
    public static void main(String[] args) {

        /* EXER 01
        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("C");

        System.out.println(listStruct.contains("A"));
        System.out.println(listStruct.contains("B"));
        System.out.println(listStruct.contains("E"));*/

        /* EXER 02
        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("A");

        System.out.println(listStruct.lastIndex("A")); */

        /* EXER 03
        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("C");
        listStruct.add("D");
        listStruct.add("E");

        System.out.println(listStruct);

        listStruct.remove("A");

        System.out.println(listStruct);

        listStruct.remove("E");

        System.out.println(listStruct);

        listStruct.remove("C");

        System.out.println(listStruct);*/

        /* EXER 04
        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("C");
        listStruct.add("D");
        listStruct.add("E");

        System.out.println(listStruct.get(0));
        System.out.println(listStruct.get(1));
        System.out.println(listStruct.get(4)); */

        ListStruct<String> listStruct = new ListStruct<>(5);

        listStruct.add("A");
        listStruct.add("B");
        listStruct.add("C");
        listStruct.add("D");
        listStruct.add("E");

        System.out.println(listStruct);

        listStruct.clear();

        System.out.println(listStruct);
    }
}
