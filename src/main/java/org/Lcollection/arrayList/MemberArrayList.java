package org.Lcollection.arrayList;

import org.Lcollection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        this.arrayList.add(member);
    }

    public boolean rmMember(int id) {
//        for (int i = 0; i < this.arrayList.size(); i++) {
//            if (arrayList.get(i).getId() == id) {
//                this.arrayList.remove(i);
//                return true;
//            }
//        }

        // 위에 for로 구현한 것과 아래의 iterator로 구현한 것은 같다.

        // ArrayList는 Collection interface를 구현한 클래스이기 때문에
        // Collection 이 가지고 있는 iterator를 호출할 수 있다.
        // generic 타입으로 쓸 수 있다. 하나씩 볼 객체인 Member로 작성한다.
        Iterator<Member> iterator = this.arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next(); // 얘는 원래 Object 타입을 리턴하는데
                                             // generic 타입으로 Member를 지정했기 때문에 Member를 리턴한다.
            if (member.getId() == id) {
                this.arrayList.remove(member);
                return true;
            }
        }

        System.out.println(id + "이(가) 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : this.arrayList) {
            System.out.println(member);
        }
        System.out.println(this.arrayList);
        System.out.println();
    }

}
