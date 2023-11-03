package org.Dabstractex;

public class ComputerTest {

    public static void main(String[] args) {

//        Computer c1 = new Computer(); // 추상클래스로 바로 인스턴스 생성 불가
//        c1.display(); // 구현이 안되어있기 때문에 사용 불가
        Computer c2 = new Desktop();
        Computer c3 = new Notebook() { // 추상메소드 구현하면 인스턴스 생성 가능
            @Override
            public void typing() {

            }
        };

        Computer c4 = new MyNotebook();


    }
}
