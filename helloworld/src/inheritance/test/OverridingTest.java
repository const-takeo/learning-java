package inheritance.test;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customer = new Customer(0001, "Samitto");
        int price = customer.calcPrice(1000);
        System.out.println(price + customer.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer(0002, "Life", 101);
        int vipPrice = vipCustomer.calcPrice(1000);
        System.out.println(vipPrice + vipCustomer.showCustomerInfo());

        // overriding
        Customer customer1 = new VIPCustomer(0002, "Lyar", 102);
        int price1 = customer1.calcPrice(1000);
        System.out.println("price1 = " + price1 + customer1.showCustomerInfo());
    }
}
