package org.Lcollection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int id;
    private String name;

    public Member() {}

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return this.name + " 회원님의 아이디는 " + this.id + " 입니다.";
    }


    @Override
    public int hashCode() {
        return this.id;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member)obj;
            if (member.getId() == this.id) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    @Override
    public int compareTo(Member member) {
//        return (this.id - member.id); // this 가 더 커서 이 값이 양수이면 정렬은 오름차순이 된다.
                                      // 반대로 음수이면 내림차순이 된다.
        return -this.name.compareTo(member.name); // String 끼리의 비교로도 가능하다.
    }


    @Override
    public int compare(Member member1, Member member2) {
        // member1 이 위 메소드의 this 와 같다.
        return -(member1.getId() - member2.getId());
//        return member1.name.compareTo(member2.getName());
    }
}
