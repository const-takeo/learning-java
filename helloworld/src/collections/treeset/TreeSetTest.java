package collections.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("aaa");
        treeSet.add("ccc");
        treeSet.add("bbb");

        System.out.println(treeSet);
    }
}
