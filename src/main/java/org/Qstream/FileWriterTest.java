package org.Qstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    // 6

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("writer.txt")) {

            fw.write('A'); // char 하나 가능
            fw.write('\n');
            char[] cbuf = {'B', 'C', 'D'};
            fw.write(cbuf); // char array 가능
            fw.write('\n');
            fw.write("안녕하세요"); // string 가능
            fw.write('\n');
            fw.write(cbuf, 1, 2); // 인덱스 1부터 2개 쓰기
            fw.write('\n');

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }

}
