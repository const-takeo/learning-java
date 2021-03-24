package collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collections.Member;

public class MemberHashSet {
    private HashSet<Member> hashset;

    public MemberHashSet() {
        hashset = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashset.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> member = hashset.iterator();
        while (member.hasNext()) {
            int tempId = member.next().getMemberId();
            if (tempId == memberId) {
                hashset.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAll() {
        for (Member member : hashset) {
            System.out.println(member);
        }
    }
}
