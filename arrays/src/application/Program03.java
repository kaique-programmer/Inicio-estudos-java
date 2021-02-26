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
        list.add(1, "Barbosa");

        System.out.println(list.size());

        for (String names: list) {
            System.out.println(names);
        }
        System.out.println("------------");
        list.removeIf(names -> names.charAt(0) == 'C');
        for (String names: list) {
            System.out.println(names);
        }
        System.out.println("------------");
        System.out.println("Index of Sil: " + list.indexOf("Silvana"));
        System.out.println("Index of Sil: " + list.indexOf("Calixto"));
        System.out.println("--------------");
        List<String> result = list.stream().filter(names -> names.charAt(0) == 'S').collect(Collectors.toList());
        for (String names: result) {
            System.out.println(names);
        }
        System.out.println("--------------");
        String name = list.stream().filter(names -> names.charAt(0) == 'S').findFirst().orElse(null);
        System.out.println(name);
    }
}
