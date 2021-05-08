package generics;

public class Plastic extends Material{
    @Override
    public String toString() {
        return "材料はプラスチックです";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic材料で出力をします。");
    }
}
