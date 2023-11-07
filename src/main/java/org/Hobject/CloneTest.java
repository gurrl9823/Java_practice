package org.Hobject;


class Point{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

class Circle implements Cloneable { // Object 클래스의 clone 메소드를 사용하려면 Cloneable interface를 implements 받아야 한다.
    Point point;
    private int radius;

    Circle(int x, int y, int radius) {
        this.point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "원점은 " + this.point + "이고, 반지름은 " + this.radius + " 입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Object 클래스의 clone 메소드는 깊은 복사이다.

        Circle circle = new Circle(10, 20, 5);
        Circle clone =  (Circle)circle.clone();

        // 깊은 복사이기 때문에 힙메모리 주소값이 서로 다르고
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(clone));

        // 데이터까지 똑같이 복사되었다.
        System.out.println(circle);
        System.out.println(clone);
    }

}
