import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>();
        catalog.put("978-1111111111", "Data Structures");
        catalog.put("978-2222222222", "Algorithms in Practice");
        catalog.put("978-3333333333", "Database Systems");
        catalog.put("978-1234567890", "Introduction to Java");
        searchByISBN(catalog, "978-2222222222");
        catalog.remove("978-3333333333");
        System.out.println("\nBooks in catalog:");
        for (Map.Entry<String, String> entry : catalog.entrySet())
            System.out.println(entry.getKey() + " → " + entry.getValue());
    }
    static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn))
            System.out.println("Book found: " + catalog.get(isbn));
        else System.out.println("Book not found!");
    }
}
