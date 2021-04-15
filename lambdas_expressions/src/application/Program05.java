package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> stream01 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream01.toArray()));

        Stream<String> stream02 = Stream.of("Kaique", "Oliveira", "Santos");
        System.out.println(Arrays.toString(stream02.toArray()));

        Stream<Integer> stream03 = Stream.iterate(0, x -> x + 1);
        System.out.println(Arrays.toString(stream03.limit(10).toArray()));

        Stream<Long> stream04 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(stream04.limit(10).toArray()));

    }
}
