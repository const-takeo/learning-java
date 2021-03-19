package arraylist;

public class StudentMain {
    public static void main(String[] args) {
        Student studentY = new Student(1001,"Yi");
        Student studentK = new Student(1002,"Kim");
        studentY.addSubject("Korean", 100);
        studentK.addSubject("English", 90);

        studentK.showInfo();
        studentY.showInfo();
    }
}
