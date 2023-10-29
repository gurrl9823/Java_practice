package org.example;

public class Ch7_11 {
    public static void main(String[] args) {

        Point3D point3D = new Point3D(1,2,3);
    }

    static class Point {
        int x, y;

        // 생성자
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static class Point3D extends Point {
        int z;

        Point3D(int x, int y, int z) {
            // 조상의 변수는 아래와 같이 초기화 불가능
            //this.x = x;
            //this.y = y;

            // 조상클래스의 생성자 Point(int x, int y) 호출하여 초기화
            super(x, y);
            this.z = z;
        }
    }

}
