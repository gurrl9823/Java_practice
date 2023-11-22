package org.Lcollection.Bhashset;

import org.Lcollection.Member;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memLee = new Member(1001, "이순신");
        Member memKim = new Member(1002, "김유신");
        Member memShin = new Member(1003, "신사임당");

        memberHashSet.addMember(memLee);
        memberHashSet.addMember(memKim);
        memberHashSet.addMember(memShin);

        memberHashSet.showAll();

        // Member에 hashCode(), equals() 를 Override해야 동일한 값에 대해 add 되지 않는다.
        Member memPark = new Member(1001, "박첨지");
        memberHashSet.addMember(memPark);

        memberHashSet.showAll();
    }



}
