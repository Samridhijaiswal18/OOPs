import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice","Bob","Charlie","Diana","Ethan");
        Map<String,Integer> attendance = new HashMap<>();
        for (String s:students) attendance.put(s,0);
        for (int day=1;day<=15;day++){
            List<String> present;
            if (day%2==0) present=Arrays.asList("Alice","Bob","Charlie");
            else present=Arrays.asList("Alice","Charlie","Ethan");
            for (String name:present) attendance.put(name,attendance.get(name)+1);
        }
        System.out.println("Total attendance: "+attendance);
        System.out.println("Students with <10 days attendance:");
        for (Map.Entry<String,Integer> e:attendance.entrySet())
            if (e.getValue()<10) System.out.println(e.getKey()+" → "+e.getValue());
    }
}
