package org.Finterfaceex;

public interface Cal {

    // 인터페이스에 생성된 메소드는 모두 추상메소드이다.
    // pre compile 단계에서 public abstract 키워드가 앞에 붙는다.
    int add(int num1, int num2);
    public abstract int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    // interface는 abstract class 처럼, 정의되고 인스턴스가 만들어져야 힙메모리에 할당되는데
    // 그럼 아래처럼 변수는 언제 할당되냐? 얘내는 자동으로 public static final 이 된다. == 상수
    double PI = 3.14;
    public static final int ERROR = -999999999;

    // 즉 인터페이스에는 상수와 추상메소드가 선언된다.

}
