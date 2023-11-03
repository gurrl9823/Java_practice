package org.Dabstractex;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // run은 변하면 안되는 메소드이므로
    // Car를 상속받은 클래스에서 재정의하지 못하도록 final로 선언
    // 이와 같이 동작을 정해놓은 메소드를 템플릿 메소드라고 한다.
    public final void run() {
        this.startCar();
        this.drive();
        this.stop();
        this.turnOff();
    }

}
