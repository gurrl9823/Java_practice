package org.inheritance;

public class Circle { // extends Point : 같은 변수를 쓴다고 무조건 상속받는건 아니다.

//    private int x;
//    private int y;
    Point point; // 쓰고싶으면 이렇게 객체로 만들어서 사용한다.

    private int radius;

    public Circle() {
        point = new Point();
    }
}
