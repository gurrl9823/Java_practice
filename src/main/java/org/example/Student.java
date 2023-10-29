package org.example;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    // argument constructor 생성자
    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;

        this.korea = new Subject();
        this.math = new Subject();
    }

    public void setKorea(String name, int score) {
        this.korea.setSubjectName(name);
        this.korea.setScore(score);
    }

    public void setMath(String name, int score) {
        this.math.setSubjectName(name);
        this.math.setScore(score);
    }

    public void showStudentInfo() {

        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
