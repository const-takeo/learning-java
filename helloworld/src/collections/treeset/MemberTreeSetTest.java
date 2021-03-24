package collections.treeset;

import collections.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(102, "Yi");
        Member member2 = new Member(101, "Kim");
        Member member3 = new Member(103, "Park");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2); 
        memberTreeSet.addMember(member3);

        memberTreeSet.addMember(member1);
        memberTreeSet.showAll();
    }
}
