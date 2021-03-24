package collections.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collections.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("Can't Found");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }
}
