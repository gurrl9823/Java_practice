package org.Barraylist;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (String element : list) {
            System.out.println(element);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        Student lee = new Student(1001, "Lee");
        lee.addSubject("수학", 100);
        lee.addSubject("국어", 80);
        lee.addSubject("영어", 70);
        lee.showStudentInfo();

    }

}
