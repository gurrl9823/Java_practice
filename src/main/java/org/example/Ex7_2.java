package org.example;

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }

    static class Parent {
        int x = 10;
    }

    static class Child extends Parent {
        int x = 20; // this.x

        void method() {
            System.out.println("x = " + x); // Child class의 x
            System.out.println("this.x = " + this.x); // Child class의 x
            System.out.println("super.x = " + super.x); // Parent class의 x
        }
    }
}