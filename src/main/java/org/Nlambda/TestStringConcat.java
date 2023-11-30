package org.Nlambda;

public class TestStringConcat {

    public static void main(String[] args) {

        // 1. 이전에 배운 방식
        // interface 선언하고 클래스에서 implements 받아 구현하고 사용.
        // 전통적인 객체지향 프로그래밍 방식
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        // 2. 람다식으로 구현하기
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "world");

        // 아래와 같음
        // 3. anonymous inner class 생성
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        concat2.makeString("hello", "lambda");
    }

}
