package org.Lcollection.arrayList;

import org.Lcollection.Member;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memLee = new Member(1001, "이순신");
        Member memKim = new Member(1002, "김유신");
        Member memShin = new Member(1003, "신사임당");

        memberArrayList.addMember(memLee);
        memberArrayList.addMember(memKim);
        memberArrayList.addMember(memShin);

        memberArrayList.showAll();

        memberArrayList.rmMember(memKim.getId());

        memberArrayList.showAll();

    }


}
