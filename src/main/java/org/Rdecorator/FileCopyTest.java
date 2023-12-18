package org.Rdecorator;

import java.io.*;

public class FileCopyTest {

    // 2

    public static void main(String[] args) {

        // a.exe를 a.exe 로 복사하기. 한 byte씩 읽어서.

        long milliSeconds = 0; // 복사하는데 걸린 시간
        int len = 0; // 복사한 byte

        try (FileInputStream fis = new FileInputStream("usbFormatter.exe");
             FileOutputStream fos = new FileOutputStream("copyUsbFormatter.exe");
             // Buffered 스트림은 내부적으로 8KB 배열을 가지고 있어서 읽기, 쓰기 속도가 빨라짐
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos) ) {

            milliSeconds = System.currentTimeMillis();

            int i;
//            while ((i = fis.read()) != -1) {
//                fos.write(i); // FileStream 쓰면 1229 ms
//                len++;
//            }
            while ((i = bis.read()) != -1) {
                bos.write(i); // bufferedStream 쓰면 14 ms
                len++;
            }
            milliSeconds = System.currentTimeMillis() - milliSeconds; // 옮긴 시간 구하기

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("복사 소요 시간 : " + milliSeconds + " ms\n복사한 byte : " + len + " byte");

    }

}
