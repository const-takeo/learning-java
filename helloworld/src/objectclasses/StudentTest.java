package objectclasses;

public class StudentTest {
    public static void main(String[] args) {
        // instanceの生成
        // studentYun <- reference variable
        Student studentYun = new Student();
        studentYun.studentName = "Yun";
        studentYun.address = "Tokyo";
        Student studentKim = new Student("Kim", "Seoul");
        // studentYun.setStudentName("Yun");
        String name = studentYun.getStudentName();
        studentYun.showStudentInfo();
        System.out.println(name);
        System.out.println(studentKim.studentName);
    }
}
