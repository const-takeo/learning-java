package templ;

public class CarMain {
    public static void main(String[] args) {
        Car autoCar = new AutoCar();
        autoCar.run();
        System.out.println("----------------");
        Car mannualCar = new MannualCar();
        mannualCar.run();
        
    }
}
