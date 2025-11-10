import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun, and Java is powerful. Java, java!?";
        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words = sentence.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) freq.put(word, freq.getOrDefault(word, 0) + 1);
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : freq.entrySet())
            System.out.println(entry.getKey() + " → " + entry.getValue());
    }
}
