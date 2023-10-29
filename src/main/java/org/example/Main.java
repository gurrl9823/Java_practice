package org.example;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! 한글 테스트\n");

        int[] score = new int[5];
        int[] array = new int[]{1,2,3,4,5};
        char[] name = new char[]{'a', 'b', 'c'};

        Ex7_2.Parent parent = new Ex7_2.Parent();

        System.out.println(score);
        System.out.println(score.getClass().getName());
        System.out.println(array.getClass().getName());
        System.out.println(name.getClass().getName());
        System.out.println(parent);

        System.out.println(array);

        Student james = new Student(1001, "James");
        james.setKorea("국어", 100);
        james.setMath("수학", 100);

        Student tomas = new Student(1002, "Tomas");
        tomas.setKorea("국어", 80);
        tomas.setMath("수학", 80);

        james.showStudentInfo();
        tomas.showStudentInfo();
    }
}
