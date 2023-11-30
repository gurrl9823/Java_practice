package org.Nlambda;

@FunctionalInterface // 컴파일 에러를 막기 위한 어노테이션
public interface MyNumber {

    // 함수형 인터페이스
    // 람다식을 선언하기 위한 인터페이스
    // 익명함수와 매개변수로만 구현되기때문에 하나의 메소드만 있어야한다.

    int getMaxNumber(int num1, int num2);
//    int getNumber(int x, int y); 람다식 생성 시 오류가 생길 수 있기때문에 함수형 인터페이스에는 하나의 메소드만 정의한다.

}
