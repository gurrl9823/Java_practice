package org.Lcollection.Dhashmap;

import org.Lcollection.Ctreeset.MemberTreeSet;
import org.Lcollection.Member;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memKim = new Member(1001, "이순신");
        Member memLee = new Member(1002, "김유신");
        Member memShin = new Member(1003, "신사임당");

        memberHashMap.addMember(memLee);
        memberHashMap.addMember(memKim);
        memberHashMap.addMember(memShin);

        memberHashMap.showAllMember();

        memberHashMap.rmMember(1002);

        memberHashMap.showAllMember();
    }

}
