package org.Sserialization;


import java.io.*;

    // 1

                // 직렬화는 데이터가 외부로 나가는 것이기 때문에
                // 직렬화가 허용된(가능한) 객체라는 것을 알려주기 위해
                // Serializable을 implements 받는다.
                // 구현 코드 없이 의도를 표시하는 인터페이스를 maker(마커) interface 라고 한다.
class Person implements Serializable {
    String name;
    String title;

    public Person() {}
    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return this.name + ", " + this.title;
    }
}

public class SerializationTest {

    // 인스턴스의 상태를 그대로 저장하거나(serialization) 다시 복원하는(deserialization) 방식
    // 객체를 직렬화하여 외부로 주고 받기
    // 파일에 쓰거나 네트워크로 데이터를 주고받을때도 쓸 수 있다.
    // ObjectInputStream, ObjectOutputStream 보조 스트림 사용

    public static void main(String[] args) {

        // 객체를 serialize 해서 외부로 내보내기
        Person personLee = new Person("Lee", "Manager");
        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             // 직렬화를 위한 보조스트림. object 자체를 저장하는 기능 제공.
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee); // 객체를 저장한다.
        } catch (IOException e) {
            System.out.println(e);
        }

        // 직렬화된 객체 읽기
        try (FileInputStream fis = new FileInputStream("serial.dat");
             // 직렬화를 위한 보조스트림. object 자체를 저장하는 기능 제공.
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof Person) { // 읽은 객체가 Person이 아닌 경우 대비
                Person p = (Person) obj;
                System.out.println(p);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}
