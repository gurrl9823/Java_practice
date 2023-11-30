package org.Minnerclass;



class Outer {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable() { // 쓰레드를 생성할 때 사용하는 Runnable 인터페이스

        int localNum = 100;

        class MyRunnable implements Runnable {

            @Override
            public void run() {
//                localNum += 10;
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }

        return new MyRunnable(); // Runnable 객체 반환
    }
}


public class LocalInnerTest {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.getRunnable().run();


    }

}
