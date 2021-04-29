package singletone;

public class College {
    private static College instance = new College();
    private College() {
    }

    public static College getInstance() {
        if (instance == null) {
            instance = new College();
        }
        return instance;
    }
}
