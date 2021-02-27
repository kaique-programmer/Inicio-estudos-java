package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kaique");
        list.add("Silvana");
        list.add("Santos");
        list.add("Carlos");
        list.add("Carmelita");
        list.add("Silvio");
        list.add("Carina");
        list.add("Roberta");
        list.add("Diego");
        list.add("Sabiá");
        list.add(1, "Barbosa"); // add the name in position

        System.out.println(list.size());
        for (String names: list) {
            System.out.println(names);
        }

        System.out.println("------------ REMOVES ALL NAMES ACCORDING TO THE PREDICATED ----------");
        list.removeIf(names -> names.charAt(0) == 'C'); // removes ALL names according to the predicate - initial C
        for (String names: list) {
            System.out.println(names);
        }

        System.out.println("------------ RETURN ELEMENTS POSITION EXIST OR NO EXIST --------");
        System.out.println("Index of Silvana: " + list.indexOf("Silvana")); // return the position element
        System.out.println("Index of Calixto: " + list.indexOf("Calixto")); // return -1( no exist)

        System.out.println("------------ RETURN ALL NAMES EXIST TO THE S ----------");
        List<String> result = list.stream().filter(names -> names.charAt(0) == 'S').collect(Collectors.toList());
        for (String names: result) {
            System.out.println(names);
        }

        System.out.println("------------ RETURN FIRST ELEMENT PREDICATE(S)");
        String name = list.stream().filter(names -> names.charAt(0) == 'S').findFirst().orElse(null);
        System.out.println(name);
    }
}
