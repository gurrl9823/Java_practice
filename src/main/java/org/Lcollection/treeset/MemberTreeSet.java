package org.Lcollection.treeset;

import org.Lcollection.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<>();
//        this.treeSet = new TreeSet<>(new Member()); // Comparator 인터페이스의 compare() 메소드를 쓰는 방법
    }

    public void addMember(Member member) {
        this.treeSet.add(member);
    }

    public boolean rmMember(int id) {

        Iterator<Member> iterator = this.treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getId() == id) {
                this.treeSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "이(가) 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : this.treeSet) {
            System.out.println(member);
        }
        System.out.println(this.treeSet);
        System.out.println();
    }

}
