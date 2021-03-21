package templ;

public class AutoCar extends Car {

    @Override
    public void drive() {
        System.out.println("オートです");

    }

    @Override
    public void stop() {
        System.out.println("車を停止させます");
    }

    @Override
    public void wiper() {
        System.out.println("雨を感知しました、ワイパーを作動します。");
    }

}
