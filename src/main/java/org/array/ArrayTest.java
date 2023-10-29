package org.array;

public class ArrayTest {

    public static void main(String[] args) {

        // 바로 초기화
        int[] numbers = new int[]{0,1,2};
        System.out.println(numbers.length);

        // 나중에 초기화
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        for (int i : num) {
            System.out.println(i);
        }

        // 초기화 안하면 0으로 자동 초기화
        int[] ids = new int[2];
        for (int i : ids) {
            System.out.println(i);
        }

        // 알파벳 넣고 출력하기
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(65 + i);
        }
        for (char c : alphabet) {
            System.out.println(c);
        }


        // 초기화 안한 객체 어레이 = null.
        // 객체 5개가 만들어진게 아니고 참조변수 5개가 만들어진 것이다.
        // 이 후 다시 new Book[]으로 인스턴스를 만들어야 한다.
        Book[] books = new Book[5];
        for (Book book : books) {
            System.out.println(book);
        }

        books[0] = new Book("해리포터1", "J. K. 롤링");
        books[1] = new Book("해리포터2", "J. K. 롤링");
        books[2] = new Book("해리포터3", "J. K. 롤링");
        books[3] = new Book("해리포터4", "J. K. 롤링");
        books[4] = new Book("해리포터5", "J. K. 롤링");
        for (Book book : books) {
            System.out.println(book);
            book.showBookInfo();
        }


        // 객체 배열 복사하기
        Book[] ba1 = new Book[3];
        Book[] ba2 = new Book[3];

        ba1[0] = new Book("해리포터1", "J. K. 롤링");
        ba1[1] = new Book("해리포터2", "J. K. 롤링");
        ba1[2] = new Book("해리포터3", "J. K. 롤링");

        System.arraycopy(ba1, 0, ba2, 0, 3);

        for (Book book : ba2) {
            book.showBookInfo();
        }

        // ba1[0]을 변경한다면?
        ba1[0].setName("신의 달력");
        ba1[0].setAuthor("장용민");

        // ba2[0]도 똑같이 바뀌었다.
        // 즉 얕은 복사이다.
        for (Book book : ba2) {
            book.showBookInfo();
        }


        // 2차원 배열
        // int[][] twoDiArr = new int[2][3];
        int[][] twoDiArr = {{1,2,3}, {4,5,6}};
        System.out.println(twoDiArr.length);
        System.out.println(twoDiArr[0].length);
        for (int[] arr : twoDiArr) {
            for (int i : arr) {
                System.out.print(i +  " ");
            }
            System.out.println();
        }

        // 2차원 배열에 알파벳 넣고 출력
        char[][] al = new char[26][2];
        for (int i = 0; i < al.length; i++) {
            for (int j = 0; j < al[i].length; j++) {
                al[i][j] = j % 2 == 0 ? (char)(97 + i) : (char)(65 + i);
            }
        }

        for (char[] arr : al) {
            for (char c : arr) {
                System.out.print(c +  " ");
            }
            System.out.println();
        }

    }
}
