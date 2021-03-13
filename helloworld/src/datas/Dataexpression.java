package datas;

/**
 * Dataexpression
 */
public class Dataexpression {
    public static void main(String[] args) {
        int num = 10;
        int bnum = 0b1010; // 10
        int oNum = 012; // 10
        int hNum = 0xA; // 10
        System.out.println(num + "" + bnum + "" + oNum + "" + hNum);

        //intはもともと32ビットなので補数を表現するには32ビットが必要；
        // 2進数5
        int binaryFive = 0b00000000000000000000000000000101;
        // -5
        int twosComplement = 0b11111111111111111111111111111011;
        System.out.println(binaryFive + " + " + twosComplement + " = " + (binaryFive + twosComplement));

        
    }

}