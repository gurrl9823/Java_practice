package org.Gclassinterface;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue shelfQueue = new BookShelf();

        shelfQueue.enQueue("아이언맨1");
        shelfQueue.enQueue("아이언맨2");
        shelfQueue.enQueue("아이언맨3");

        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());

        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());

        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());

        System.out.println(shelfQueue.getSize());

    }
}
