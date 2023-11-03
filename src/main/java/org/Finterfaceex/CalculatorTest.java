package org.Finterfaceex;

public class CalculatorTest {

    public static void main(String[] args) {

        // interface implement는 타입 상속 이라고하고
        // class extends는 구현 상속 이라고 한다.

        Cal cal = new CompleteCal(); // 인터페이스도 타입 상속을 받은 것이므로 타입으로 사용 가능
                                     // 추상 메소드 모두 구핸했으므로 가능(업캐스팅)
        System.out.println(cal.add(1, 2));
//        cal.showInfo(); // Cal 인터페이스에는 없으므로 사용 불가능.
//        Cal cal1 = new Cal(); // 인터페이스는 추상 메소드를 가지고 있으므로 인스턴스 생성 불가능
//        Cal cal2 = new Calculator(); // 이 또한 추상클래스이므로 인스턴스 생성 불가능
        Calculator cal3 = new CompleteCal(); // 상위 클래스이므로 타입 선언 가능(업캐스팅)


    }



}
