package org.inheritance;

public class Customer {

//    private int id; // private 변수는 상속 시 접근할 수 없다.(메모리는 할당 되는데 접근만 못하는 것.)
    protected int id; // 상속 시에도 접근할 수 있도록 protected를 사용한다. 패키지가 달라도 접근가능.
    protected String name;
    protected String grade;
//    int point; // 같은 패키지에서 상속하는 경우 이렇게 써도 된다. 하지만 다른 패키지인 경우 접근할 수 없기 때문에 protected를 사용한다.
    protected int point;
    protected double bonusRatio;


    /*
    public Customer() {
//        super(); extends는 안써있지만 부모클래스의 생성자를 호출함. 모든 클래스의 최상위 클래스는 Object 라는 클래스이다. Object가 부모클래스가 되는 것. extends Object라고 써있는 것과 같음.
        this.grade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("Customer 생성자 호출 : 상위 클래스 먼저 생성되고");
    }*/
    public int calPrice(int price) {
        this.point += price * this.bonusRatio;
        return price;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출 : 상위 클래스 먼저 생성되고");
    }

    public void showCustomerInfo() {
        System.out.println(this.name + "님의 등급은 " + this.grade + "이며, 포인트는 " + this.point + "점 입니다.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
