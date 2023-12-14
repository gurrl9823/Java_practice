package org.Pexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt"); // 없는 파일일 경우를 대비한 try catch
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close(); // 없는 파일을 닫을 경우를 대비한 try catch
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("finally");
        }
        System.out.println("end");



        // try-with-resources문
        // 리소스를 자동 해제하도록 제공해주는 구문
        // 자바 7부터 제공
        // close()를 명시적으로 호출하지 않아도 try블록에서 열린 리소스는
        // Exception이 나도 자동 해제됨.
        // 해당 리소스가 AutoCloseable 인터페이스를 구현해야 함
        // FileInputStream의 경우 AutoCloseable을 이미 구현하고 있음
        // 위의 코드에서 close()를 위한 funally 블록이 필요없어진다.
        try (FileInputStream fis2 = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end2");
    }
}
