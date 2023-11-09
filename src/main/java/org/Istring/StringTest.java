package org.Istring;

public class StringTest {

    public static void main(String[] args) {

        // 인스턴스. 힙메모리에 생성
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); // false. 두 참조변수는 서로 다른 인스턴스를 가리키고 있다.

        // 상수. 데이터영역에 생성
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4); // true. 두 참조변수는 같은 상수를 가리키고 있다.

        // 스트링은 immutable, 불변하다. 처음 선언되면 이 후 변하지 않는다.
        // String 클래스를 들어가 보면 new String("value"); 에서
        // value final로 선언되어 있기 때문이다. private final byte[] value;

        String str5 = new String("hello");
        String str6 = new String("world");

        System.out.println(System.identityHashCode(str5));
        // str5 인스턴스의 데이터가 바뀐것이 아니라 helloworld 를 가진 인스턴스가 새로 생성된 것이다.
        str5 = str5.concat(str6);
        System.out.println(str5);
        // 힙메모리 주소값을 보면 달라진 것을 알 수 있다.
        System.out.println(System.identityHashCode(str5));



    }

}
