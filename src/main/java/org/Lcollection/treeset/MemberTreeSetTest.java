package org.Lcollection.treeset;

import org.Lcollection.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memLee = new Member(1002, "김유신");
        Member memKim = new Member(1001, "이순신");
        Member memShin = new Member(1003, "신사임당");

        memberTreeSet.addMember(memLee);
        memberTreeSet.addMember(memKim);
        memberTreeSet.addMember(memShin);

        memberTreeSet.showAll();

    }
}
