package collections.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void push(String data) {
        arrayList.add(data);
    }

    public String pop() {
        // defensive
        if (arrayList.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        //LIFO
        return arrayList.remove(arrayList.size() - 1);
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Test1");
        myStack.push("Test2");
        myStack.push("Test3");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
