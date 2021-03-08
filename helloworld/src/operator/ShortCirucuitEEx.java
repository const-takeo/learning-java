package operator;

public class ShortCirucuitEEx {
    public static void main(String[] args) {
        int num = 10;
        int i = 2;

        // 論理積 &&
        // 一つ目の被演算子がtrueなので二つ目の演算子まで実行する。
        // boolean value = ((num = num + 10) > 10) && ((i = i + 2) < 10);
        // System.out.println(value);
        // System.out.println(i);

        // 論理和 ||
        // 一つ目の被演算子がtrueなので二つ目の演算子は実行しない。
        boolean value = ((num = num + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(i);
    }
}
