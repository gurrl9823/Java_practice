package org.Qstream;

import java.io.IOException;

public class SystemInTest {

    /*
    1
    스트림
     - 네트워크에서 말하는 스트림과 같음

    스트림의 구분

    대상 기준
     - 입력 스트림 / 출력 스트림 (입출력을 동시에 하는 스트림은 없음)

    자료의 종류
     - 바이트 스트림 / 문자 스트림

    기능
     - 기반 스트림 / 보조 스트림

     */

    public static void main(String[] args) {

//        System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
//        int i = 0;
//        try {
//            i = System.in.read(); // 한 바이트씩 읽음
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        System.out.println((char) i);

        System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
        int j = 0;
        try {
            while ((j = System.in.read()) != '\n') {
                System.out.print((char) j);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
