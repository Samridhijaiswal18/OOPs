import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apples", 50);
        stock.put("Bananas", 30);
        stock.put("Oranges", 0);
        stock.put("Milk", 10);
        System.out.println("Initial stock: " + stock);
        purchase(stock, "Apples", 12);
        purchase(stock, "Bananas", 30);
        restock(stock, "Oranges", 20);
        restock(stock, "Milk", 5);
        queryStock(stock, "Milk");
        queryStock(stock, "Chocolate");
        System.out.println("\nOut-of-stock products:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println("  " + entry.getKey());
            }
        }
        System.out.println("\nFinal stock: " + stock);
    }
    static void purchase(Map<String, Integer> stock, String product, int quantity) {
        System.out.println("\nPurchasing " + quantity + " " + product);
        if (!stock.containsKey(product)) {
            System.out.println("  Product not found in stock.");
            return;
        }
        int remaining = stock.get(product) - quantity;
        if (remaining <= 0) {
            stock.put(product, 0);
            System.out.println("  " + product + " is now out of stock.");
        } else {
            stock.put(product, remaining);
            System.out.println("  Remaining " + product + ": " + remaining);
        }
    }
    static void restock(Map<String, Integer> stock, String product, int quantity) {
        System.out.println("\nRestocking " + product + " by " + quantity);
        stock.put(product, stock.getOrDefault(product, 0) + quantity);
    }
    static void queryStock(Map<String, Integer> stock, String product) {
        System.out.print("\nChecking availability of " + product + ": ");
        if (stock.containsKey(product)) {
            System.out.println(stock.get(product) + " units available");
        } else {
            System.out.println("Product not found");
        }
    }
}
