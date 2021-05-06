package object;

import java.util.Arrays;

public class EqualsTest {
    public static void main(String[] args) {
        String str = new String("test");
        String str1 = new String("test");

        // false -> 物理的に二つのインスタンスのメモリアドレスが違うのでfalse
        System.out.println(str == str1);

        // true -> インスタンスのメモリアドレスは違うが論理的に一緒の文字列を持っているためtrue
        // String classのequalsは再定義されている
        System.out.println(str.equals(str1));


        Student student = new Student("Tomas", 1L);
        Student student1 = new Student("Tomas", 1L);

        // false
        System.out.println(student == student1);
        // true
        System.out.println(student.equals(student1));
    }
}

class Student {
    String studentName;
    Long studentId;

    Student(String studentName, Long studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            // downcasting
            Student objStudent = (Student) obj;
            if (studentId == objStudent.studentId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}