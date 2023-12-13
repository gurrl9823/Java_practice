package org.Ostream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String> {
    // functional interface BinaryOperator

    @Override
    public String apply(String s1, String s2) {
        return null;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~", "hello", "good morning", "반값습니다"};

        String reduce = Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length > s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        });
        System.out.println(reduce);

    }

}
