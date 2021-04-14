package thisex;

class Person {
    String name;
    int age;
    //thisで他の生成者を呼ぶ
    public Person() {
        this("No name", 20);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //自分のアドレスを返す
    public Person returnSelf() {
        return this;
    }
}

public class CallAnotherConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        System.out.println(p1.returnSelf());
    }
}
