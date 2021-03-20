package inheritance.witharraylist;

import java.util.ArrayList;

public class CustomerMain {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customerKim = new Customer(10010, "Kim");
        Customer customerYi = new Customer(10011, "Yi");
        GoldCustomer goldCustomerPark = new GoldCustomer(10012, "Park");
        GoldCustomer goldCustomerYim = new GoldCustomer(10013, "Yim");
        VIPCustomer vipCustomerYun = new VIPCustomer(10014, "Yun", 777);

        customers.add(customerKim);
        customers.add(customerYi);
        customers.add(goldCustomerPark);
        customers.add(goldCustomerYim);
        customers.add(vipCustomerYun);

        for (Customer customer : customers) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customers) {
            int result = customer.calcPrice(price);
            System.out.printf("%s様が%dを支払いました%n", customer.getCustomerName(), result);
        }

    }
}
