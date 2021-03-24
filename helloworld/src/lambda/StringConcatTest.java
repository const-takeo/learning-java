package lambda;

public class StringConcatTest {

    public static void main(String[] args) {
        String Hello = "hello";

        //再使用が多い場合クラスで具体化した方がいい
        StringConcatImpl stringConcatImpl = new StringConcatImpl();
        stringConcatImpl.makeString(Hello, "Java");

        StringConcat stringConcat = (x, y) -> System.out.println(x + " " + y);
        stringConcat.makeString(Hello, "Java");

        StringConcat stringConcat2 = new StringConcat() {

            @Override
            public void makeString(String str1, String str2) {
                System.out.println(str1 + " " + str2);
            }

        };
        stringConcat2.makeString(Hello, "Java");
    }
}
