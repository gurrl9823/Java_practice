package org.Cinheritance;

public class CustomerTest {

    public static void main(String[] args) {

        /*
        Customer lee = new Customer();
        lee.setId(1001);
        lee.setName("Lee");

        VIPCustomer kim = new VIPCustomer(); // 상위 클래스의 메모리가 할당되고 그 다음 하위클래스의 메모리가 할당됨.
        kim.setId(1111);
        kim.setName("Kim");

        lee.showCustomerInfo();
        kim.showCustomerInfo();
         */

        // 상속 - 묵시적 형변환 : 상위 클래스의 메소드가 호출된다. 상위 클래스의 멤버들만 볼 수 있다.
        Customer lee = new Customer(1001, "Lee");
        Customer kim = new VIPCustomer(1111, "Kim", 100);
        lee.showCustomerInfo();
        kim.showCustomerInfo();


        // 메소드 Override : VIPCustomer에서 calPrice를 재정의 했다.
        Customer smith = new Customer(1222, "Smith");
        smith.calPrice(10000);
        smith.showCustomerInfo();

        VIPCustomer tom = new VIPCustomer(3333, "Tom", 21);
        tom.calPrice(10000);
        tom.showCustomerInfo();

        // 묵시적 형변환을 통해 상위 클래스인 Customer의 메소드가 호출될 것 같지만
        // calPrice를 Override 했기 때문에 하위 클래스인 VIPCustomer의 메소드가 호출된다.
        // 재정의를 안했을 땐 코드영역에 있는 Customer의 calPrice 메소드를 사용했는데
        // 재정의해서 코드영역에 VIPCustomer의 calPrice 메소드가 추가로 생겼고 이를 사용한 것이다.
        // 이와 같은 것을 다형성(Polymorphism)이라고 한다.
        // 다형성이란 같은 코드가 상황에 따라 다르게 동작하는 것을 말한다.
        // 객체지향 프로그래밍의 유연성, 재활용성, 유지보수성에 기본의 되는 특징이다.
        Customer who = new VIPCustomer(3213, "Who", 33);
        who.calPrice(10000);
        who.showCustomerInfo();

        // 묵시적 형변환, Override를 통한 다형성 예제 : animal.move(); 만 호출한건데 모두 다르게 동작함.
        moveAnimal(new Human());
        moveAnimal(new Tiger());
        moveAnimal(new Eagle());

    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }

}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}