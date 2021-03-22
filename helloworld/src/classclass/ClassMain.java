package classclass;

public class ClassMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        // Object.getClass() : Class class
        // static loading
        Class pClass = person.getClass();

        System.out.println(pClass.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        // dynamic loading
        Class pClass3 = Class.forName("classclass.Person");
        System.out.println(pClass3.getName());
    }
}
