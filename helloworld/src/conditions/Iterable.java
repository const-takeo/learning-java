package conditions;

public class Iterable {
    public static void main(String[] args) {
        // while
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            System.out.println(num++ + "増加");
            System.out.println(num + "格好内");
        }
        System.out.println(num);

        // do-while
        int condition = 20;

        do {
            System.out.println(condition--);
        } while (condition > 10);

        // for
        int forSum = 0;
        for (int i = 1; i <= 10; i++) {
            forSum += i;
            System.out.println(forSum);
        }
        // gugudan
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
