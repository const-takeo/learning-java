package arraylist;

public class StudentMain {
    public static void main(String[] args) {
        Student studentY = new Student(1001,"Yi");
        Student studentK = new Student(1002,"Kim");

        studentY.addSubject("Korean", 100);
        studentY.addSubject("Japanese", 95);

        studentK.addSubject("English", 90);
        studentK.addSubject("Chinese", 80);

        studentK.showInfo();
        studentY.showInfo();
    }
}
