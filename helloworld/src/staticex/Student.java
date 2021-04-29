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
        int i = 10; // 地域変数
        i++;
        System.out.print(i);
//        serialNum = "Kakao"; // メンバー変数もしくはインスタンス変数, static methodの中では使用不可
        return serialNum;//static 変数もしくはクラス変数
    }

    
}
