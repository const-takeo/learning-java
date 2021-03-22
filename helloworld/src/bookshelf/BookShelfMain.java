package bookshelf;

import java.io.IOException;

public class BookShelfMain {
    public static void main(String[] args) throws IOException {
        Queue queue = new BookShelf();
        queue.enQueue("Big picture");
        queue.enQueue("The Job");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
