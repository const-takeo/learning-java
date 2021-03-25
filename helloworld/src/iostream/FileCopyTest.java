package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisec = 0;
        int len = 0;
        try (FileInputStream fileInputStream = new FileInputStream("a.exe");
                FileOutputStream fileOutputStream = new FileOutputStream("b.exe");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);) {

            millisec = System.currentTimeMillis();
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
                len++;
            }
            millisec = System.currentTimeMillis() - millisec;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(millisec + len);
    }
}
