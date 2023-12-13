package org.Finterface;

public interface Cal {

    // interface에 선언할 수 있는 것
    // 상수
    // abstract 메소드
    // 자바8 추가 : default 메소드, static 메소드, private 메소드

    // abstract 메소드
    // 인터페이스에 생성된 메소드는 모두 추상메소드이다.
    // pre compile 단계에서 public abstract 키워드가 앞에 붙는다.
    int add(int num1, int num2);
    public abstract int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    // 상수
    // interface는 abstract class 처럼, 정의되고 인스턴스가 만들어져야 힙메모리에 할당되는데
    // 그럼 아래처럼 변수는 언제 할당되냐? 얘내는 자동으로 public static final 이 된다. == 상수
    double PI = 3.14;
    public static final int ERROR = -999999999;

    // default 메소드
    // default를 쓰지 않으면 빨간줄이 뜨고 default 또는 static을 붙이거나 구현부를 지우라고 한다.
    default void desctiption() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    // static 메소드
    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    // private 메소드
    // 외부에선 쓸 수 없고 interface 내부에서만 쓰려고 만드는 것.
    // 예를 들면 메소드가 여러갠데 모두 같은 로직이 있다면
    // 메소드로 만들고 그것을 private로 선언하는 것.


}
