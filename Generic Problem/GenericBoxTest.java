class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericBoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer Value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String Value: " + strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(12.5);
        System.out.println("Double Value: " + doubleBox.get());
    }
}
