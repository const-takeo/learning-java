package conditions;

public class ContinueBreak {
    public static void main(String[] args) {
        // continue
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                continue;
            }
            total += i;
        }
        System.out.println(total);

        // break
        for (int i = 0;; i++) {
            System.out.println(i);
            if (i == 100) {
                break;
            }
        }
        System.out.println("over");
    }
}
