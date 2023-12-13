package org.Ostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("James");
        sList.add("Edword");

        // forEach 최종연산자
        Stream<String> stream = sList.stream();
        stream.forEach(e -> System.out.println(e));

        sList.stream().sorted().forEach(e -> System.out.println(e));

    }

}
