package org.Jclassex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // java.lang.String 클래스가 있으면
        // 클래스로더가 데이터영역(JVM의 메소드영역)에 로드한다.
        Class strclass = Class.forName("java.lang.String");
        // strclass 는 Class 객체로 String 클래스 자체가 아니라
        // String 클래스의 메타정보를 가진 객체이다.
        // 인스턴스는 아니다. 이걸로 인스턴스를 생성할 순 있다.

        Constructor[] cons = strclass.getConstructors();

        // String 클래스가 가지고 있는 constructor 가져오기
        for (Constructor c : cons) {
            System.out.println(c);
        }System.out.println();

        // String 클래스의 public field 가져오기
        // protected, private 등 접근제어자 상관없이 모든 field 가져오기 : getDeclaredFields()
        // field 란 클래스의 멤버변수이다.
        Field[] fields = strclass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }System.out.println();

        // String 클래스의 메소드 가져오기
        Method[] me = strclass.getMethods();
        for (Method m : me) {
            System.out.println(m);
        }System.out.println();

    }

}
