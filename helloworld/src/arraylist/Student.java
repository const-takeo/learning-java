package arraylist;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjects;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjects = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjects.add(subject);
    }

    public void showInfo() {
        int total = 0;
        for (Subject subject : subjects) {
            int score = subject.getScore();
            System.out.printf("学生%s様の%s科目の成績は%dです%n", studentName, subject.getName(), score);
            total += score;
        }
        System.out.printf("学生%s様の総点は%d点です%n", studentName, total);
    }

}
