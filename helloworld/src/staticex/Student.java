package staticex;

public class Student {
    private static int serialNum = 10000;
    int studentId;
    String studentName;

    public Student() {
        serialNum++;
        this.studentId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    
}
