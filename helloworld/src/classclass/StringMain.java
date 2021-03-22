package classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");
        Constructor[] cons = strClass.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println();
        }

        Method[] methods = strClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
