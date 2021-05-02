package inheritance.test;

import inheritance.Customer;
import inheritance.GoldCustomer;
import inheritance.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args) {
        // Customer customer1 = new Customer();
        // customer1.setCustomerID(10100);
        // customer1.setCustomerName("Yi");

        Customer vipCustomer1 = new VIPCustomer(10101, "Kim", 100);
        Customer goldCustomer = new GoldCustomer();
        goldCustomer.setCustomerName("Park");
        goldCustomer.setCustomerID(11001);

        vipCustomer1.calcPrice(1000);
        System.out.println(goldCustomer.showCustomerInfo());
        // System.out.println(customer1.showCustomerInfo());
        System.out.println(vipCustomer1.showCustomerInfo());
    }
}
