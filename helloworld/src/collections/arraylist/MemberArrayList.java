package collections.arraylist;

import java.util.ArrayList;

import collections.Member;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (Member member : arrayList) {
            if (memberId == member.getMemberId()) {
                arrayList.remove(memberId);
                return true;
            }
        }
        System.out.println("Didn't find anything");
        return false;
    }

    public void showAll() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        // System.out.println(arrayList);
    }
}
