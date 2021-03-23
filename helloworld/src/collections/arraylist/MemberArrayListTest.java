package collections.arraylist;

import collections.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(0, "Yi");
        Member member2 = new Member(1, "Kim");
        Member member3 = new Member(2, "Park");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAll();

        memberArrayList.removeMember(member2.getMemberId());
        memberArrayList.showAll();
    }

}
