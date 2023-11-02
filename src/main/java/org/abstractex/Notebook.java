package org.abstractex;

public abstract class Notebook extends Computer {

    @Override
    public void display() {
        System.out.println("Notebook Display");
    }

    // 추상메소드 하나를 구현하지 않았기 때문에 구현하던지 abstract가 되라고 한다.
//    @Override
//    public void typing() {
//        System.out.println("Desktop Typing");
//    }


}
