package org.Pexception;

public class IDFormatException extends Exception {

    // 사용자 정의 Exception 만들기
    // 아이디가 null이거나 길이가 8미만, 20초과인 경우 Exception

    public IDFormatException(String message) {
        super(message);
    }
}
