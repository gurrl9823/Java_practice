package org.Lcollection.treeset;


import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return -str1.compareTo(str2); // 내림차순
    }
}


public class ComparatorTest {

    public static void main(String[] args) {

        // 이미 Comparable의 compareTo가 정의 되어 있는 상황에서
        // Comparator 의 compare 사용하기 : TreeSet 생성자에 Comparator 가 구현된 객체를 매개변수로 전달

//        TreeSet<String> tree = new TreeSet<>(); // 이대로 run 하면 오름차순으로 정렬됨.
        TreeSet<String> tree = new TreeSet<>(new MyCompare()); // 이렇게 하면 Comparator 의 compare 가 동작함

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree);

    }

}
