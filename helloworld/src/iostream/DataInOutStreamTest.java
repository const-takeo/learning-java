package iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);) {
            dataOutputStream.write(100);
            dataOutputStream.writeInt(10);
            dataOutputStream.writeChar('A');
            dataOutputStream.writeUTF("String");
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream("data.txt");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);) {
            System.out.println(dataInputStream.read());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readUTF());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
