package singletone;

public class Company {
    static String test;
    // システムの中に単一のインスタンスだけが存在するように実装する方式
    private static Company instance = new Company();
    // constructorを作っておかないとdefault constructorがcompilerによって生成され勝手にインスタンスを作る事ができるのでconstructorを作っておく
    private Company() {
    }
    // static method = instanceが生成されなくても使える。
    public static Company getInstance() {
        //defensive programming
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
