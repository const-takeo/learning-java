package collections.hashset;

import collections.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(100, "Yi");
        Member member2 = new Member(101, "Kim");
        Member member3 = new Member(102, "Park");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.addMember(member1);
        memberHashSet.showAll();
    }
}
