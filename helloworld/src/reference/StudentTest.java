package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentA = new Student(001, "AAA");
        studentA.setKorea("Korean", 100);
        studentA.setMath("Math", 99);

        studentA.showStudentInfo();
    }
}
