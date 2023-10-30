package org.arraylist;

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private ArrayList<Subject> subjectList;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        this.subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        this.subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject subject : subjectList) {
            total += subject.getScore();
            System.out.println("학생 " + this.name + "님의 " + subject.getName() + "의 성적은 " + subject.getScore() + "점 입니다.");
        }
        System.out.println("총점은 " + total + "점 입니다.");
    }
}
