package bookshelf;

import arraylist.Student;

class BookToString {
    private String author;
    private String name;

    public BookToString(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("著者は%sです、本の名前は%sです", author, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BookToString) {
            BookToString std = (BookToString) obj;
            if (std.author == author && std.name == name) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class Book {
    public static void main(String[] args) {
        BookToString pauloBook = new BookToString("Paulo", "Alchemist");
        BookToString pauloBook2 = new BookToString("Paulo", "Alchemist");
        BookToString copyOfPaulo = pauloBook;
        // true Object.equals() => 再定義して使用可能
        System.out.println(pauloBook.equals(pauloBook2));
        //
        String test = new String("test");
        String test2 = new String("test");
        // 物理的なaddressを比較する -> falseが戻ってくる
        System.out.println(test == test2);
        // true String.equals()
        System.out.println(test.equals(test2));
        // hashcode() -> System.identityHashcode()
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(System.identityHashCode(test));
        System.out.println(System.identityHashCode(test2));
    }
}
