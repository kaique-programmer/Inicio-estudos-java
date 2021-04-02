package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int howManyCourseA = scanner.nextInt();
        int courseA = 0;
        for (int i =0; i < howManyCourseA; i++) {
            courseA = scanner.nextInt();
            a.add(courseA);
        }

        System.out.print("How many students for course B? ");
        int howManyCourseB = scanner.nextInt();
        int courseB = 0;
        for (int i =0; i < howManyCourseB; i++) {
            courseB = scanner.nextInt();
            b.add(courseB);
        }

        System.out.print("How many students for course C? ");
        int howManyCourseC = scanner.nextInt();
        int courseC = 0;
        for (int i =0; i < howManyCourseC; i++) {
            courseC = scanner.nextInt();
            c.add(courseC);
        }

        Set<Integer> courseSetTotal = new HashSet<>(a);
        courseSetTotal.addAll(b);
        courseSetTotal.addAll(c);

        System.out.print("Total: " + courseSetTotal.size());

    }
}
