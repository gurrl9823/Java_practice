package org.Nlambda;

public class TestMyNumber {

    public static void main(String[] args) {

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
