package collections.hashmap;

import collections.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(100, "Yi");
        Member member2 = new Member(101, "Kim");
        Member member3 = new Member(102, "Park");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.addMember(member1);
        memberHashMap.showAllMember();
    }
}
