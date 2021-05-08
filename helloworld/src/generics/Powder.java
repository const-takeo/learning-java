package generics;

public class Powder extends Material{
    @Override
    public String toString() {
        return "材料はPowderです";
    }

    @Override
    public void doPrinting() {
        System.out.println("Power材料で出力をします。");
    }
}
