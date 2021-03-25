package iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStramTest {
    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for (int i = 0; i < bs.length; i++) {
            bs[i] += data;
            data++;
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            fileOutputStream.write(bs);

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
