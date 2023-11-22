package org.Lcollection.Dhashmap;

import org.Lcollection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getId(), member);
    }

    public boolean rmMember(int id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
            return true;
        }

        System.out.println(id + " 가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        // key 로 value 가져오기
        Iterator<Integer> iter = hashMap.keySet().iterator();

        while (iter.hasNext()) {
            int key = iter.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }

        // 바로 value 가져오기 + 심플하게 for 문으로
        for (Member member : hashMap.values()) {
            System.out.println(member);
        }

        System.out.println();
    }

}
