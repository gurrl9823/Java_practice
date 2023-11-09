package org.Istring;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str1 = new String("hello");
        System.out.println(System.identityHashCode(str1));

        // StringBuilder 는 문자열을 이어도 주소값이 바뀌지 않는다.
        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and ");
        buffer.append("world");
        System.out.println(System.identityHashCode(buffer));

        // buffer를 string으로 쓰고 싶으면 toString() 을 사용한다.
        String str2 = buffer.toString();
        System.out.println(str2);

        Integer i = 100;
        int a = 100;
        System.out.println(i == a);

    }

}
