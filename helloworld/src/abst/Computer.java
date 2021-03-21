package abst;

public abstract class Computer {
    public abstract void display();

    public abstract void keyboard();

    public void turnOn() {
        System.out.println("パソコンをオンにする");
    };

    public void turnOff() {
        System.out.println("パソコンをオフにする");
    }
}
