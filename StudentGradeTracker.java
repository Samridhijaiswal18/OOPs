import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Alice", 88.5);
        grades.put("Bob", 72.0);
        grades.put("Charlie", 91.0);
        grades.put("Diana", 67.5);
        System.out.println("Initial student grades: " + grades);
        grades.put("Bob", 85.0);
        System.out.println("Updated Bob's grade: " + grades.get("Bob"));
        grades.remove("Diana");
        System.out.println("After removing Diana: " + grades);
        System.out.println("\nStudents and Grades (alphabetical):");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
