class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
}

class Apple extends Fruit {
    Apple(String name) { super(name); }
}

class Mango extends Fruit {
    Mango(String name) { super(name); }
}

class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> fruits = new java.util.ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T fruit : fruits) {
            System.out.println(fruit.name);
        }
    }
}

class Car {}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple("Red Apple"));
        appleBox.add(new Apple("Green Apple"));
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango("Alphonso"));
        mangoBox.add(new Mango("Kesar"));
        mangoBox.display();
    }
}
