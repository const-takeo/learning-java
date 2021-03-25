package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String name;
    transient String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + "," + title;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person lee = new Person("Lee", "manager");
        try (FileOutputStream fileOutputStream = new FileOutputStream("serial.dat");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(lee);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream("serial.dat");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof Person) {
                Person p = (Person) obj;
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
