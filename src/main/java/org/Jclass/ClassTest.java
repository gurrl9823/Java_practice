package org.Jclass;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person();

        // 1. 최상의 클래스인 Object 클래스의 getClass 메소드
        // Class 클래스를 반환해준다.
        Class pclass1 = person.getClass();

        System.out.println(pclass1.getName()); // org.Jclassex.Person
                                               // 패키지 경로.클래스이름

        // 2. .class 직접 호출
        Class pclass2 = Person.class;
        System.out.println(pclass2.getName()); // org.Jclassex.Person

        // 3. Class 클래스의 forName() 메소드 호출
        Class pclass3 = Class.forName("org.Jclass.Person");
        System.out.println(pclass3.getName()); // org.Jclass.Person
        // forName 메소드로 넘어온 string과 동일한 클래스가 있으면
        // 클래스로더가 데이터영역(JVM의 메소드영역)에 로드한다.

        // 1, 2번을 스테틱로딩, 3번을 동적로딩이라고 한다.
    }

}
