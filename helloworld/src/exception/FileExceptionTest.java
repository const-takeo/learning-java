package exception;

import java.io.FileInputStream;

public class FileExceptionTest {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("a.txt")) {
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end");

    }
}
