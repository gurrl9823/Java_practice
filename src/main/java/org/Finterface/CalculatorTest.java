package org.Finterface;

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
        CompleteCal cal4 = new CompleteCal();

        //------------------------------------

        // default 메소드 호출
        cal.desctiption();
        cal3.desctiption(); // implement 받은 abstract 클래스에서도 사용할 수 있다.
        cal4.desctiption();
        // 3개 모두 인스턴스를 CompleteCal 로 만들었고
        // CompleteCal 에서 default 메소드를 재정의 했기 때문에
        // 가상메소드인 CompleteCal의 default 메소드가 호출된다.

        Cal cal5 = new Calculator() {
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
        };
        // cal5 는 Calculator 로 인스턴스를 만들었고
        // interface의 default 메소드를 Override 하지 않았기 때문에
        // default 메소드 그대로 호출된다.
        cal5.desctiption();

        //------------------------------------

        // static 메소드
        int[] arr = {1,2,3,4,5};
        int sum = Cal.total(arr); // 인스턴스 없이 바로 호출
        System.out.println("static sum : " + sum);

    }



}
