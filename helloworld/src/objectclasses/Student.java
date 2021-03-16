package objectclasses;

public class Student {
    // property
    int studentId;
    String studentName;
    int grade;
    String address;

    // method
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    // default constructor
    public Student() {
    }

    // over load
    public Student(String name, String address) {
        this.studentName = name;
        this.address = address;
    };
}
