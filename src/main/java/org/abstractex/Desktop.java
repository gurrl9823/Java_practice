package org.abstractex;

public class Desktop extends Computer {

    // 추상클래스를 상속받으면 추상메소드를 Override하라는 빨간줄이 뜬다.
    // 아니면 너도 추상 클래스가 되라고 한다.
    @Override
    public void display() {
        System.out.println("Desktop Display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop Typing");
    }
}
