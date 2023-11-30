package org.Nlambda;


import static org.Nlambda.LambdaTest.showMyString;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {

    public static void main(String[] args) {

        // 1. 람다식을 변수처럼 사용하기
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("test");

        // 2. 람다식을 매개변수로 사용하기
        showMyString(lambdaPrint);

        // 3. 람다식을 리턴받기
        PrintString reStr = returnPrint();
        reStr.showString("hello"); // 두개의 람다식이 사용된 것이다.

    }

    // 람다식을 매개변수로 사용하기
    // 람다식 전체가 넘어온 것이다.
    // 내부적으로 anonymous inner class 가 생성되는 것이므로 객체가 넘어오는 것과 같다.
    public static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }

    // 람다식을 리턴하기
    // 이또한 마찬가지로 내부적으로 anonymous inner class 가 생성되는 것이므로 객체를 리턴하는 것과 같다.
    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world");
    }

}
