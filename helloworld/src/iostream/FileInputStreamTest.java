package iostream;

import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        // FileInputStream fileInputStream = null;
        // try {
        // fileInputStream = new FileInputStream("input.txt");
        // System.out.println(fileInputStream.read());
        // System.out.println(fileInputStream.read());
        // System.out.println(fileInputStream.read());
        // } catch (IOException e) {
        // System.out.println(e);
        // } finally {
        // try {
        // fileInputStream.close();
        // } catch (IOException e) {
        // System.out.println(e);
        // } catch (NullPointerException e) {
        // System.out.println(e);
        // }
        // }
        // System.out.println("end");
        int i = 0;
        //文字列の場合FileReader()使う
        try (FileInputStream fileInputStream = new FileInputStream("input.txt");) {
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
