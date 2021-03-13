package conditions;

public class ConditinEx {
    public static void main(String[] args) {
        int age = 9;
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("未就学子です。");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("小学生です。");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("中高校生です。");
        } else {
            charge = 3000;
            System.out.println("一般人です。");
        }
        System.out.println("入場料は" + charge + "です。");
        // 3
        int a = 5;
        int b = 3;
        int max = (a > b) ? a : b;
        System.out.println(max);
    }
}
