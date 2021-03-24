package innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;
    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            System.out.println("Annominus inner classを変数に代入して具体化");
        }

    };

    public Runnable getRunnable() {
        //メソッドで具体化する時にはメソッドの中に宣言されたlocal変数はfinal -> 定数(상수)化される
        int localNum = 300;
        return new Runnable() {

            @Override
            public void run() {
                System.out.println("Annominus inner classをメソッドの内部に具体化");
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        };

        // class MyRunnable implements Runnable {
        // int localNum = 300;

        // @Override
        // public void run() {
        // System.out.println(outNum);
        // System.out.println(sNum);
        // System.out.println(localNum);
        // }

        // }

        // return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable().run();
    }
}
