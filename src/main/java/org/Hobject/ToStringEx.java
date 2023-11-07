package org.Hobject;


class Book extends Object {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 모든 클래스는 Object 라는 클래스를 extends 받고 있다. 컴파일하면서 extends Object 가 추가된다.
    // Object 클래스의 메소드들도 Override 받아 재정의 할 수 있다.
    // 단 final 로 선언되어 있는 것은 재정의 불가능햐다.

    // toString 재정의
//    @Override
//    public String toString() {
//        return this.title + ", " + this.author;
//    }
}


public class ToStringEx {

    public static void main(String[] args) {

        // toString
        Book book = new Book("두잇자바", "박은종");
        System.out.println(book); // == book.toString();
                                  // org.Hobject.Book@6a5fc7f7
                                  // 패키지경로.클래스명@인스턴스 힙메모리 주소값(16진수 == .hashCode() 메소드(10진수))
        System.out.println(Integer.toHexString(book.hashCode()));

        String str = new String("test");
        System.out.println(str); // test
                                 // String 클래스의 toString 메소드는 문자 그대로 나오는 것으로 재정의되어 있다.
    }

}
