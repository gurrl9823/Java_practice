package org.Nlambda;

@FunctionalInterface
public interface StringConcat {

    // 함수형 인터페이스는 메소드를 하나만 정의할 수 있음. 람다식 생성 시 혼동을 주지 않기위해.
    public void makeString(String s1, String s2);

}
