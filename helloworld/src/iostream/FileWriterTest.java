package iostream;

import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("writer2.txt")) {
            fileWriter.write('A');
            char[] cbuf = new char[] { 'a', 'b' };
            fileWriter.write(cbuf);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
