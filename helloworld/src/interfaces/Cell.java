package interfaces;

public interface Cell {
    void sell();

    default void order() {
        System.out.println("Sell");
    }
}
