package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        for (Book book : library) {
            System.out.println(book);
        }

        library[0] = new Book("English", "America");
        library[1] = new Book("Korean", "Korea");
        library[2] = new Book("Japanese", "Japan");
        library[3] = new Book("Chinese", "China");
        library[4] = new Book("Russian", "Russia");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }

        // ObjectArrayCopy
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("Daegu", "Daegu-si");
        bookArray1[1] = new Book("Busan", "Busan-si");
        bookArray1[2] = new Book("Incheon", "Incheon-si");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        // ObjectArrayの深い複製のときは使えない。
        // System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        // ObjectArrayの深い複製
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());
        }
        //
        bookArray1[0].setBookName("Jeju");
        bookArray1[0].setAuthor("Jeju-do");

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
