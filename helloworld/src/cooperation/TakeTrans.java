package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student park = new Student("Park", 5000);
        Student kim = new Student("Kim", 10000);

        // Bus bus100 = new Bus(100);
        // park.takeBus(bus100);
        // park.showInfo();
        // bus100.showInfo();

        // Subway subwayGrenn = new Subway(2);
        // kim.takeSubway(subwayGrenn);
        // kim.showInfo();
        // subwayGrenn.showInfo();

        Bus bus100 = new Bus(100);
        park.takeBus(bus100);
        bus100.showInfo("バス");
        park.showInfo();

        Subway subwayGreen = new Subway(2);
        kim.takeSubway(subwayGreen);
        kim.showInfo();
        subwayGreen.showInfo("地下鉄");

    }

}
