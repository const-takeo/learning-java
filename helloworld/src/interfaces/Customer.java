package interfaces;

public class Customer implements Buy, Cell {

    @Override
    public void sell() {
        System.out.println("販売");
    }

    @Override
    public void buy() {
        System.out.println("購買");
    }

    @Override
    public void order() {
        System.out.println("Customer Order");
    }

}
