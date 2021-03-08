package operator;

public class OperatorEx {
    public static void main(String[] args) {
        // 代入演算子
        int age = 24;
        System.out.println(age);
        // 符号演算子
        int num = 10;
        // numに符号演算子"-"をつけてもnumの値は変わらない。
        int num2 = -num;
        System.out.println(num2);

        // 増加減少演算子
        // semi colonが重要！
        int plusNum = 10;
        System.out.println(plusNum++);
        System.out.println(++plusNum);

        // 関係演算子
        int relationNum = 6;
        System.out.println(relationNum > 5);

        // 論理演算子
        System.out.println((5 > 3) || (5 > 2));
    }
}
