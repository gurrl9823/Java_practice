package org.Finterfaceex;

public abstract class Calculator implements Cal {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    // abstract 메소드를 모두 구현하지 않아서 abstract class가 된다.
//    @Override
//    public int mul(int num1, int num2) {
//        return 0;
//    }
//
//    @Override
//    public int div(int num1, int num2) {
//        return 0;
//    }
}
