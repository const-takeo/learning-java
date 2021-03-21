package singletone;

import java.util.Calendar;

public class ComapanyMain {
    public static void main(String[] args) {
        // singletone -> systemoの中に単一のインスタンスを置く
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        System.out.println(c1);
        System.out.println(c2);

    }
}
