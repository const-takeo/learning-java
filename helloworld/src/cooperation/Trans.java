package cooperation;

public class Trans {
    int number;
    int passengerCount;
    int moeny;

    public Trans(int number) {
        this.number = number;
    }

    public void takeTrans(int money) {
        this.moeny += money;
        passengerCount++;
    }

    public void showInfo(String name) {
        System.out.println(this.number + name + "の乗客数は" + this.passengerCount + "です。収入は" + this.moeny + "です。");
    }
}
