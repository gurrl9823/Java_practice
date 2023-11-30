package org.Minnerclass;



class OutClass {

    private int num = 10;
    private static int sNum = 20;
    InClass inClass;

    public OutClass() {
        // inner class 생성은 OutClass의 생성자에서
        inClass = new InClass();
    }


    // inner class 인데 변수와 동일한 위치에 있어서 instance inner class 라고 부른다.
    class InClass {
        int inNum = 200;
//        static int sInNum = 100; instance inner class 내부에서는 static 변수를 선언할 수 없다.

        void inTest() {
            System.out.println(num); // OutClass 의 변수를 사용할 수 있다.
            System.out.println(sNum); // static 변수도 사용할 수 있다.
        }

//        static void sTest() {} static 메소드도 생성할 수 없다.
    }

    static class StaticInClass {

        int iNum = 100;
        static int sInNum = 200; // static class 이므로 static 변수 선언 가능.

        void inTest() {
//            num += 10; OutClass 인스턴스 변수는 쓸 수 없다. static class는 이미 생성되어 있는데
//                       non static class 인 OutClass 가 아직 생성되지 않았는데 사용할 순 없기 때문이다.
            sNum += 10; // OutClass 의 static 변수는 사용할 수 있다.
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
//            System.out.println(iNum); // static 메소드이므로 일반 인스턴스 변수 사용 불가.
            System.out.println(sInNum);
        }

    }
}


public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass(); // 생성자에 의해 InClass 인스턴스가 생성됨.
        outClass.inClass.inTest();

        OutClass.InClass inClass = outClass.new InClass(); // InClass 인스턴스 직접 만드는 방법.
        inClass.inTest();

//       ----

        // StaticInClass는 OutClass의 생성 없이 인스턴스를 바로 만들 수 있음.
        OutClass.StaticInClass staticInClass = new OutClass.StaticInClass();
        staticInClass.inTest(); // inTest() 메소드는 일반 메소드 이므로 인스턴스 생성 후에 호출 가능.

        OutClass.StaticInClass.sTest(); // sTest() 는 static 메소드이므로 인스턴스 생성 없어도 호출 가능.


    }

}
