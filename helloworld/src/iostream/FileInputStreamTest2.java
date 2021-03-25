package iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("input.txt")) {
            byte[] byteArr = new byte[10];
            int i;
            while ((i = fileInputStream.read(byteArr)) != -1) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char) byteArr[j]);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
