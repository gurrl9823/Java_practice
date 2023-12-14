package org.Qstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

    // 4

    public static void main(String[] args) {

        // autoCloseable 인터페이스 사용.
        try (FileInputStream fis = new FileInputStream("input.txt")) {

            byte[] bs = new byte[10];
            int i;
            while ((i = fis.read(bs)) != -1) {
                // 읽은걸 bs에 저장하고 읽은 개수(최대 bs개)를 i에 저장한다.
                for (byte b : bs) {
                    System.out.print((char)b);
                }
                System.out.println();
            }
            // ABCDEFGHIJ
            // KLMNOPQRST
            // UVWXYZQRST
            // 알바벳은 26개인데 byte[10] 이라
            // 마지막 4개(QRST)는 그대로 남아있는 것이다.

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();

        try (FileInputStream fis = new FileInputStream("input.txt")) {

            byte[] bs = new byte[10];
            int i;
            while ((i = fis.read(bs)) != -1) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char)bs[j]);
                }
                System.out.println();
            }
            // ABCDEFGHIJ
            // KLMNOPQRST
            // UVWXYZ
            // 읽은 개수(i)만큼 출력했기 때문에 마지막은 6개만 출력됨.

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
