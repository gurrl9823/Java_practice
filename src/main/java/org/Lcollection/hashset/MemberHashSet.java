package org.Lcollection.hashset;

import org.Lcollection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        this.hashSet.add(member);
    }

    public boolean rmMember(int id) {

        Iterator<Member> iterator = this.hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getId() == id) {
                this.hashSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "이(가) 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : this.hashSet) {
            System.out.println(member);
        }
        System.out.println(this.hashSet);
        System.out.println();
    }

}
