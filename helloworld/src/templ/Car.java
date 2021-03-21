package templ;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public abstract void wiper();
    //抽象メソッドではないhook method
    public void washCar() {
    };

    public void startCar() {
        System.out.println("エンジンを掛けます");
    }

    public void stopCar() {
        System.out.println("エンジンを切る");
    }

    // 下位クラスで再定義され変更されてはいけない時finalを使う
    // template method
    public final void run() {
        startCar();
        drive();
        wiper();
        washCar();
        stop();
        stopCar();
    }
}
