package array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Korea");
        list.add("Seoul");
        for (String string : list) {
            System.out.println(string);
        }
    }
}
