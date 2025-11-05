interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category=" + category.getClass().getSimpleName() + "}";
    }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory() {});
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1000, new ClothingCategory() {});
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory() {});

        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
        Marketplace.applyDiscount(phone, 5);

        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
