package interfaces;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // buyer
        Buy buyer = new Customer();
        // seller
        Cell seller = new Customer();
        buyer.buy();
        seller.sell();

        customer.order();
        buyer.order();
        seller.order();
    }
}
