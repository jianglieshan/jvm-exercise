package dev.jz;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<String> s = Arrays.asList(
                "a",
                "b",
                "c",
                "d",
                "e"
        );
        HashMap z = new HashMap();
        z.put("z","z");

        Integer re = s.stream().reduce(1, new BiFunction<Integer, String, Integer>() {
            @Override
            public Integer apply(Integer u, String s) {
                return u + (int)s.charAt(0);
            }
        }, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer s, Integer s2) {
                return 1;
            }
        });
        System.out.println(re);

        Stream<String> res = s.stream().flatMap(new Function<String, Stream<String>>() {
            @Override
            public Stream<String> apply(String s) {
                return Arrays.asList("a",s).stream();
            }
        });

        List<String> toList = res.collect(Collectors.toList());
        long count = toList.size();
        System.out.println(count);

        Collections.sort(s,(o1,o2)-> -o1.compareTo(o2));

        s.sort((o1,o2)-> -o1.compareTo(o2));

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        s.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


        s.forEach(System.out::println);
    }
}
