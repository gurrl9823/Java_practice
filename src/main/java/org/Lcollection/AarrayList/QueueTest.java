package org.Lcollection.AarrayList;


import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        this.arrayQueue.add(data);
    }

    public String deQueue() {
        int len = this.arrayQueue.size();
        if (len > 0) {
            return this.arrayQueue.remove(0);
        }
        System.out.println("큐가 비었습니다.");
        return null;
    }
}

public class QueueTest {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("a");
        myQueue.enQueue("b");
        myQueue.enQueue("c");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }

}
