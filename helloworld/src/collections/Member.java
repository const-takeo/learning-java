package collections;

import java.util.Collection;
import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "様の会員IDは" + +memberId + "です。";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (member.memberId == this.memberId) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {
        // + up , ascending
        // return this.memberId - member.memberId;
        // - down, descending
        // return (this.memberId - member.memberId) * -1;
        // string comparableは基本ascending
        return this.memberName.compareTo(member.memberName);
    }

    @Override
    public int compare(Member member1, Member member2) {
        // + up , ascending
        // Comparatorのcompareを呼び出すには
        return member1.memberId - member2.memberId;
    }
}
