package org.Qstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInoutStreamTest {

    // 3

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");

            System.out.print((char)fis.read()); // 한 바이트씩 읽음. 그래서 한글은 깨짐.
            System.out.print((char)fis.read()); // 한글도 읽고 싶으면 위에 FileInputStream 대신 FileReader 사용
            System.out.print((char)fis.read()); // FileReader 는 default encoding 설정으로 읽음
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");


    }
}
