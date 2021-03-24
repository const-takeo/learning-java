package collections.treemap;

import collections.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member member3 = new Member(102, "Park");
        Member member1 = new Member(100, "Yi");
        Member member2 = new Member(101, "Kim");

        memberTreeMap.addMember(member1);
        memberTreeMap.addMember(member2);
        memberTreeMap.addMember(member3);

        memberTreeMap.addMember(member1);
        memberTreeMap.showAllMember();
    }

}
