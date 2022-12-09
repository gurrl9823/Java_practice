package org.example;

public class Ex7_3 {
    public static void main(String[] args) {

        Child2 c = new Child2();
        c.method();
    }

    static class Parent2 {
        int x = 10;
    }

    static class Child2 extends Parent2 {
        void method() {
            System.out.println("x = " + x); // Parent2 의 x
            System.out.println("this.x = " + this.x); // Parent2 의 x
            System.out.println("super.x = " + super.x); // Parent2 의 x
        }
    }
}
