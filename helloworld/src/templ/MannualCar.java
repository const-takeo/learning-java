package templ;

public class MannualCar extends Car {

    @Override
    public void drive() {
        System.out.println("マニュアルです");

    }

    @Override
    public void stop() {
        System.out.println("車を停止させます,ギアを中立に置きます");

    }

    @Override
    public void wiper() {
        System.out.println("雨が降りワイパーを作動します。");
    }

    @Override
    public void washCar() {
        System.out.println("車が汚れたら洗車します。");
    }
}
