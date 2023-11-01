package org.inheritance;

public class VIPCustomer extends Customer{

    // VIPCustomer용 변수
    private int agentId;
    private double saleRatio;

    /*
    public VIPCustomer() {
//        super(); 프리컴파일 단계에서 이 코드가 추가됨. 부모클래스의 생성자 호출.
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        System.out.println("VIPCustomer 생성자 호출 : 하위 클래스가 그 다음에 생성된다.");
    }*/

    public VIPCustomer(int id, String name, int agentId) {
//        super(); Customer 클래스에 argument를 받는 생성자가 있기때문에 기본 생성자가 없는 상태이다. 그래서 기본 생성자를 호출하는 super()는 에러가 뜬다.
        super(id, name); // Customer 클래스에 argument를 받는 생성자를 호출하기 위해 파라미터를 넣어준다.
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentId = agentId;
        System.out.println("VIPCustomer(int, Sring) 생성자 호출 : 하위 클래스가 그 다음에 생성된다.");
    }

    @Override
    public int calPrice(int price) {
        this.point += price * this.bonusRatio;
        return price - (int)(price * this.saleRatio);
    }

    public int getAgentId() {
        return this.agentId;
    }

}
