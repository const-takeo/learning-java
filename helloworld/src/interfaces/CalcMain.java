package interfaces;

public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(10, 2));
    }
}
