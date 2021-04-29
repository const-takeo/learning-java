package singletone;

import java.util.Calendar;

public class ComapanyMain {
    public static void main(String[] args) {
        // singletone -> systemの中に単一のインスタンスを置く
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        System.out.println(c1);
        System.out.println(c2);

        College college1 = College.getInstance();
        College college2 = College.getInstance();
        System.out.println(college1);
        System.out.println(college2);
        // calendarもsingletone
//        Calendar calendar = Calendar.getInstance();

    }
}
