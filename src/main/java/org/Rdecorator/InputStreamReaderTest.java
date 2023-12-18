package org.Rdecorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

    // 1

    /*

    보조 스트림
     - 실제 읽고 쓰는 스트림이 아닌 보조적인 기능을 추가하는 스트림
     - 데코레이터 패턴
     - FilterInputStream 과 FilterOutputStream 이 보조 스트림의 상위 클래스
     - 생성자의 매개변수로 또 다른 스트림을 가짐

     바이트 단위 파일 입력 스트림 + 문자로 변환 기능 추가 + 버퍼렁 기능 추가
            기반 스트림              보조 스트림          보조 스트림


    ex) InputSreamReader : 인풋을 문자로 바꿔주는 보조 스트림
        OutputStreamWriter : 아웃풋을 문자로 바꿔주는 보조 스트림

     */



    public static void main(String[] args) {

        try (InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt")))  {

            int i = 0;
            while ((i = fis.read()) != -1) { // 1byte씩 읽기
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket(); // 소켓 통신을 위한 소켓 생성
        try {
            InputStreamReader ir = new InputStreamReader(socket.getInputStream()); // byte 타입으로 받지만 문자로 바꿔준다.
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 기반스트림을 보조스트림이 감싸고 다시 보조스트림이 감싼다.
            br.readLine(); // BufferedReader 는 한줄씩 읽기가 가능하다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
