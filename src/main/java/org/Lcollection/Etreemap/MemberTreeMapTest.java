package org.Lcollection.Etreemap;

import org.Lcollection.Member;

public class MemberTreeMapTest {

    public static void main(String[] args) {

        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memLee = new Member(1002, "김유신");
        Member memKim = new Member(1001, "이순신");
        Member memShin = new Member(1003, "신사임당");

        memberTreeMap.addMember(memLee);
        memberTreeMap.addMember(memKim);
        memberTreeMap.addMember(memShin);

        memberTreeMap.showAllMember(); // key 기준으로 오름차순 정렬되어 출력됨.
                                       // 여기서 key 인 Integer도 Comparable 의 compareTo가 구현되어 있다.

//        memberTreeMap.rmMember(1002);
//
//        memberTreeMap.showAllMember();
    }

}
