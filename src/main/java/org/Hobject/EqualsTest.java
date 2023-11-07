package org.Hobject;


class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Object 클래스의 equals 메소드 재정의
    @Override
    public boolean equals(Object obj) {
        // Student 인스턴스이면 Student 타입으로 다운캐스팅
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (this.id == std.id) return true;
            else return false;

        }
        return false;
    }
}


public class EqualsTest {

    public static void main(String[] args) {

        // equals
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2); // false. 두 참조변수가 같은 인스턴스를 가르키냐 == 인스턴스의 주소값이 같냐
        System.out.println(str1.equals(str2)); // true. 두 참조변수가 가르치는 인스턴스의 데이터가 같냐
        // .equals() 는 사실 == 와 같다. 하지만 String 클래스에서 재정의 된것이다.

        Student std1 = new Student(1001, "민수");
        Student std2 = new Student(1001, "철수");

        System.out.println(std1 == std2); // false
        System.out.println(std1.equals(std2)); // 재정의 전 false. == 와 같은 동작이기 때문에.
                                               // 재정의 후 true.


        // hashCode()
        // 두 String의 인스턴스가 다른데 힙메모리 주소값이 같다고 나오네?
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // 실제 주소값을 찍어보자. 다르네??
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        // 내가 만든 Student 인스턴스의 힙메모리 주소값을 찍어보자. 얘는 다르다고 나오네??
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        // 실제 주소값과 똑같이 나온다.
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        /*
        이유
        String 클래스에서 hashCode() 메소드가 재정의 되었기 때문이다.
        재정의된 equals 메소드를 통해 true가 나오면(같은 데이터) -> 논리적으로 같음.
        hashCode() 메소드도 같은 주소값을 주도록 재정의 된 것이다.
        즉 논리적으로 같으면 동일한 hashCode() 값을 갖는다.
        Integer 클래스도 마찬가지.
        논리적 동일함을 위해 equals() 메소드를 재정의 했다면 hashCode() 메소드도 재정의한다.
        내가 만든 Student 클래스는 hashCode() 메소드를 재정의 하지 않았기 때문에
        실제 힙메모리 주소값이 각각 그대로 나온다.
        */

    }

}
