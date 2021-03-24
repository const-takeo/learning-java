package collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    // 再定義して既存に定義されているascendingではなくdescendingに変える
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }

}

public class ComparatorTest {
    public static void main(String[] args) {
        // 再定義したcomparatorを使う
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("aaa");
        treeSet.add("ccc");
        treeSet.add("bbb");

        System.out.println(treeSet);
    }
}
