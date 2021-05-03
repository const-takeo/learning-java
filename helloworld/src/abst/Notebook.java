package abst;

public abstract class Notebook extends Computer {
    // 継承されたクラスのメソッドを全部具現しないとabstractクラスになれざるをえない
    @Override
    public void display() {
        System.out.println("Notebook display");
    }
}
