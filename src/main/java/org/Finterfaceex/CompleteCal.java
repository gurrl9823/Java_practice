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

    // interface에 있는 default메소드를 재정의할 수 있다.
    @Override
    public void desctiption() {
        System.out.println("완성된 계산기입니다.");
    }
}
