package org.Sserialization;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    // 2

    /*
    RandomAccessFileTest 클래스
     - 입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스
     - 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
     - 다양한 자료형에 대한 메소드가 제공됨
     */

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100); // 4byte
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14); // 8byte
        System.out.println(rf.getFilePointer());
        rf.writeUTF("안녕하세요"); // (3byte * 5) + (마지막에 null 2byte) = 17byte
        System.out.println(rf.getFilePointer());

        rf.seek(0);// 데이터를 읽기 위해 file pointer를 다시 맨 앞으로 옮겨준다.

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }

}
