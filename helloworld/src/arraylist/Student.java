package arraylist;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjects;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjects.add(subject);
    }

    public void showStudentInfo() {
        subjects.forEach(subject -> {
            int score = subject.getScorePoint();
            System.out.println("学生 " + studentName + "様の"
                    + subject.getName() + "科目の成績は" + score + "点です");
        });
    }

//    public void showInfo() {
//        int total = 0;
//        for (Subject subject : subjects) {
//            int score = subject.getScore();
//            System.out.printf("学生%s様の%s科目の成績は%dです%n", studentName, subject.getName(), score);
//            total += score;
//        }
//        System.out.printf("学生%s様の総点は%d点です%n", studentName, total);
//    }

}
