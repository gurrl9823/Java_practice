package org.Lcollection.hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        // Set 특징
        // 중복 미허용
        // 순서 없음
        // 저장한 순서와 출력하는 순서는 다를 수 있음
        // get(i) 미제공

        HashSet<String> set = new HashSet<>();

        boolean b1 = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set); // set.toString() 호출

        boolean b2 = set.add("aaa"); // 중복 불가하여 false
        System.out.println(set);
        System.out.println(b1 + ", " + b2);
    }

}
