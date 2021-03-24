package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("b.txt", "java.lang.string");
        } catch (ClassNotFoundException e) {
            System.out.println(e);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("どんなエラーが発生するか分からない時一番最後に最上位のExceptio classを使う事");
        }
        System.out.println("end");
    }
}
