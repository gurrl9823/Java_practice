package org.Rdecorator;

import java.io.*;

public class DataInOutStreamTest {

    // 3

    // 내가 입력한 숫자는 숫자 그대로, 문자는 문자 그래도 쓰고 싶은 경우
    // 자료형이 보존되는 DataInputStream, DataOutputStream 사용

    public static void main(String[] args) {

       try (FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {

           dos.write(100);
           dos.writeInt(10);
           dos.writeChar('A');
           dos.writeUTF("hello");

       } catch (IOException e) {
           System.out.println(e);
       }

        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            System.out.println(dis.read());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
