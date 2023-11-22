package org.Lcollection.Ctreeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree); // toString() 호출됨. Collection interface를 구현한 클래스들은 모두 toString()이 구현되어 있음.
        // [aaa, bbb, ccc] 정렬되어 출력됨. 이유는 compareTo() 라는 메소드가 정의되어 있기 때문에.
        // compareTo() 메소드는 Comparable 을 implement 받아 Override 할 수 있으며
        // 어떻게 비교하고 정렬할 것인지 구현되어 있다.
    }

}
