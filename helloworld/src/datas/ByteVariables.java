package datas;

public class ByteVariables {
    public static void main(String[] args) {
        // byte -> 2^7まで表現できる -> -128 ~ 127(2^7-1)まで表現できる。
        byte bData = -128;
        byte bmData = 127;
        System.out.println(bData);

        // literalの基本型はintなのでLを付けないとエラーになる。
        long num = 12345678900L;

        // char
        char ch = 'A';
        System.out.println(ch);
        System.out.println((int) ch);
        ch = 66;
        System.out.println(ch);

        // float, double
        double dnum = 3.14;
        float fNum = 3.14F;

        // type inference
        // member 変数としては使えない。
        var tiNum = 10;
        var str = "Hello";

        // type conversion
        // 黙示的型変換
        byte bNum = 10;
        int cNum = bNum;

        // longが大きい数だがfloatより精密度が低いなので黙示的型変換ができる
        long lNum = 10; // 8byte
        float cfNum = lNum; // 4byte

        // 型変換２回
        double cdNum = cfNum + cNum;
        System.out.println(cdNum);

        // 明示的型変換(Explicit Conversion)
        int exNum = 1000;
        byte exbNum = (byte) exNum;
        System.out.println(exbNum);
        //
        double exdNum = 3.14;
        exNum = (int) exdNum;
        System.out.println(exNum);
        //
        float lossNum = 0.9F;
        int result = (int) exdNum + (int) lossNum; // 3
        int result2 = (int) (exdNum + lossNum); // 4
        System.out.println(result + "<->" + result2);
    }
}