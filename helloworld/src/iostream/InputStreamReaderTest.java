package iostream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        // try (FileInputStream fileInputStream = new FileInputStream("writer.txt")) {
        // int i = 0;
        // while ((i = fileInputStream.read()) != -1) {
        // System.out.print((char) i);
        // }
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // System.out.println("end");
        try (InputStreamReader inputStreamReader = new InputStreamReader(
            new FileInputStream("a.exe"))
            ) {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
