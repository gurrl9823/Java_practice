package org.Nlambda;

public class TestMyNumber {

    public static void main(String[] args) {

        /*
        람다식 문법

        1. 매개변수가 하나인 경우 자료형과 괄호 생략가능 && 구현문이 한문장인 경우 return, 중괄호 생략 가능
        (String str) -> {reutrn System.out.println(str);}
         => str -> System.out.println(str);

        2. 매개변수가 두개인 경우 자료형과 괄호 생략할 수 없음
        (int x, int y) -> x + y;

        3. 구현문이 한문장이어도 return을 썼다면 중괄호 써야함.
        (int x, int y) -> {return x + y;}
         */

        // 람다식 사용하기
        MyNumber maxNum = (x, y) -> x >= y ? x : y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);


        // 이는 사실 내부적으로 anonymous inner class(익명 내부 클래스) 가 만들어지는 것이다.
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                return num1 >= num2 ? num1 : num2;
            }
        };
    }

}
