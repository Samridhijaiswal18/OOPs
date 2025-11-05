import java.util.*;

class Product {
    private double price;
    public Product(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    public Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {
    public Laptop(double price) {
        super(price);
    }
}

public class Main {
    public static <T extends Product> double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(15000), new Mobile(20000));
        List<Laptop> laptops = Arrays.asList(new Laptop(55000), new Laptop(65000));

        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}
