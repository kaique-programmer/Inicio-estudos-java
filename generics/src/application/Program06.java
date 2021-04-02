package application;

import java.util.*;

public class Program06 {
    public static void main(String[] args) {
        /*Set<String> stringSet = new HashSet<>();

        stringSet.add("TV");
        stringSet.add("Tablet");
        stringSet.add("Notebook");

        System.out.println(stringSet.contains("TV"));

        for (String p : stringSet) {
            System.out.println(p);
        }*/

        /*Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("TV");
        stringSet.add("Tablet");
        stringSet.add("Notebook");

        stringSet.removeIf(x -> x.charAt(0) == 'T');

        for (String p : stringSet) {
            System.out.println(p);
        }*/

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // different
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
