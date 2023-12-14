package org.Qstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    // 5

    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for (int i = 0; i < bs.length; i++) {
            bs[i] = data++;
        }

                                                  // ("output.txt", true) 로 쓰면 이어써짐
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(10); // \n
            fos.write(bs);
            fos.write(10);
            fos.write(bs, 2, 10); // 인덱스 2부터 10개만 써라
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }

}
