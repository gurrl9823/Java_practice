package org.Finterfaceex;

public class CompleteCal extends Calculator {

    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return ERROR;
        }
    }

    public void showInfo() {
        System.out.println("Cal 인터페이스를 구현하였습니다.");
    }
}
