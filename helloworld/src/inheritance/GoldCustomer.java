package inheritance;

public class GoldCustomer extends Customer {
    // constructor
    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        return 0;
    }
}
