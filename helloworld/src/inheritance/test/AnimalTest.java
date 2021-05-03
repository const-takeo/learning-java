package inheritance.test;

//polymorphism
class Animal {
    public void move() {
        System.out.println("動物が動き出します。");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("人間が動き出します。");
    }

    public void talk() {
        System.out.println("話します");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("虎が走り出します。");
    }

    public void hunting() {
        System.out.println("Huntingします。");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("ハゲワシが飛びます");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.moveAnimal(new Human());
        animalTest.moveAnimal(new Tiger());
        animalTest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();

        if (animal instanceof Human) {
            // downcasting
            Human human = (Human) animal;
            human.talk();
        }
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        }
    }
}
