package org.Pexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

                                                                // Exception을 미룸
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }


    public static void main(String[] args) {

        ThrowsException ex = new ThrowsException();
        try {
            ex.loadClass("a.txt", "java.lang.string");
            // loadClass 메소드에서 Exception을 미뤘기 때문에 try catch를 걸라고 나옴
        } catch (FileNotFoundException e) {
            // b.txt 없어서 에러
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            // String 이어야 하는데 string 클래스는 없어서 에러
            System.out.println(e);
        } catch (Exception e) {
            // 그 외 모든 Exception 처리
            // 얘를 맨위애 먼저쓰면 위 두개는 쓸 필요 없음(컴파일에러남)
            System.out.println(e);
        }
        System.out.println("end");
    }

}
