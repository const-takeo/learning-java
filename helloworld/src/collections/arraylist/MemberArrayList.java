package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

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
        // for (Member member : arrayList) {
        // if (memberId == member.getMemberId()) {
        // arrayList.remove(memberId);
        // return true;
        // }
        // }
        // use Iterator
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
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
