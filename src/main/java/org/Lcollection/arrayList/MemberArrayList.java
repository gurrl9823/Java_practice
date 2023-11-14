package org.Lcollection.arrayList;

import org.Lcollection.Member;
import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        this.arrayList.add(member);
    }

    public boolean rmMember(int id) {
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                this.arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void showAll() {
        for (Member member : this.arrayList) {
            System.out.println(member);
        }
        System.out.println(this.arrayList);
    }

}
