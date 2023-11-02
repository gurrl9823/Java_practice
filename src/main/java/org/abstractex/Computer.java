package org.abstractex;

public abstract class Computer {

    // 추상 클래스 : 추상 메소드를 가지고 있는 클래스.

    // {} 선언부 없이 ;로 끝내면 선언부를 추가하거나
    // abstract로 만들라는 에러 메시지가 뜬다.
    public abstract void display();
    public abstract void typing();

    // 일반 메소드도 만들 수 있다.
    public void turnOn() {
        System.out.println("전원을 킵니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    // 추상 클래스는 상속을 위해 만든 클래스이다.
    // 구현되지 않은 추상 메소드를 무조건 상속 받아서 구현부를
    // 만들어야하기 때문에 상속으로만 사용할 수 있다.

}
