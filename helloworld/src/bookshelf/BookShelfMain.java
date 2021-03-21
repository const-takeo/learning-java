package bookshelf;

public class BookShelfMain {
    public static void main(String[] args) {
        Queue queue = new BookShelf();
        queue.enQueue("Big picture");
        queue.enQueue("The Job");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
