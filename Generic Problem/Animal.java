import java.util.*;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

public class Main {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Whiskers"));
        cats.add(new Cat("Luna"));

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("Cats:");
        printAnimals(cats);
    }
}
