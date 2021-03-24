package collections.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collections.Member;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> member = treeSet.iterator();
        while (member.hasNext()) {
            int tempId = member.next().getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAll() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
    }
}
