package org.Lcollection.Etreemap;

import org.Lcollection.Member;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        this.treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getId(), member);
    }

    public boolean rmMember(int id) {
        if (treeMap.containsKey(id)) {
            treeMap.remove(id);
            return true;
        }

        System.out.println(id + " 가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        // key 로 value 가져오기
        Iterator<Integer> iter = treeMap.keySet().iterator();

        while (iter.hasNext()) {
            int key = iter.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }

        // 바로 value 가져오기 + 심플하게 for 문으로
        for (Member member : treeMap.values()) {
            System.out.println(member);
        }

        System.out.println();
    }

}
