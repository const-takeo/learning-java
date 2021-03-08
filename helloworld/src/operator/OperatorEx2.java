package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int num = 10;
        //代入演算子とは違って複合演算子は直接値を足す。
        System.out.println(num += 1);
        //この時点でnumは１１
        System.out.println(num %= 10);
        //余を代入したので1
        System.out.println(num -= 1);
        //0

        //bit演算子は　intにしか適用できない
        //右にシフト → 2のn乗で割る → 10 >> 2 → result = 2;
        //左シフト　→ 2のn乗を掛ける → 10 << 2 → result = 40;
        int bitInt = 10;
        System.out.println(bitInt << 2);
    }   
}
