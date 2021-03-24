package collections.arraylist;

import java.util.ArrayList;

class MyQueue {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public void enQueue(String data) {
        arrayList.add(data);
    }

    public String deQueue() {
        if (arrayList.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        return arrayList.remove(0);
    }

    public String peek() {
        if (arrayList.size() == 0) {
            System.out.println("Empty");
            return null;
        }
        return arrayList.get(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
    myQueue.enQueue("Test1");
    myQueue.enQueue("Test2");
    myQueue.enQueue("Test3");

    System.out.println(myQueue.deQueue());
    System.out.println(myQueue.deQueue());
    System.out.println(myQueue.peek());
    System.out.println(myQueue.peek());
    
    }
}
