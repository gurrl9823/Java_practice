package org.Lcollection;

public class Member {

    private int id;
    private String name;

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
}
