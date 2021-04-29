package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Korea");
        list.add("Seoul");
        list.forEach(member -> System.out.println(member));
        for (String string : list) {
            System.out.println(string);
        }
    }
}
