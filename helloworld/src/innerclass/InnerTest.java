package innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    // instance inner class
    class InClass {
        int inNum = 200;

        private void inTest() {
            System.out.println("inClass" + sNum);
            System.out.println("inClass" + inNum);
        }

    }

    public void useInClass() {
        inClass.inTest();
    }

    // static inner class
    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 300;

        void inTest() {
            // インスタンス変数使えない → OutClassが生成されなくてもstaticメソッドのInStaticClassは使えるから
            // num = 20;
            // sNum += 10; <- 推薦しないやり方
            System.out.println("inStaticClass" + sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            // System.out.println(iNum); instance 変数なので使えない
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        //
        // OutClass.InClass inClass = outClass.new InClass();
        // inClass.inTest();
        outClass.useInClass();
        //staticではないのでinstanceを生成しなければ使えない
        OutClass.InStaticClass sInStaticClass = new OutClass.InStaticClass();
        sInStaticClass.inTest();
        //staticなのでインスタンスを生成しなくてもすぐ使える
        OutClass.InStaticClass.sTest();
        
    }
}
