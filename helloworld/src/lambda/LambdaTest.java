package lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 変数を使うように
        PrintString printString = str -> System.out.println(str);
        printString.showString("Hello");

        showMyString(printString);

        PrintString returnString = returnPrint();
        returnString.showString("Hello!");

    }

    public static void showMyString(PrintString printString) {
        printString.showString("Java");
    }

    public static PrintString returnPrint() {
        return s -> System.out.println(s + "World");
    }
}