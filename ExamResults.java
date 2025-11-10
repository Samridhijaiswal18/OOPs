import java.util.*;
public class ExamResults {
    public static void main(String[] args){
        Map<String,Map<String,Integer>> results=new HashMap<>();
        Map<String,Integer> math=new HashMap<>();
        math.put("Alice",95);
        math.put("Bob",88);
        math.put("Cara",91);
        Map<String,Integer> physics=new HashMap<>();
        physics.put("Alice",85);
        physics.put("Bob",92);
        physics.put("Cara",89);
        Map<String,Integer> chemistry=new HashMap<>();
        chemistry.put("Alice",70);
        chemistry.put("Bob",82);
        chemistry.put("Cara",90);
        results.put("Math",math);
        results.put("Physics",physics);
        results.put("Chemistry",chemistry);
        for(String subject:results.keySet()){
            Map<String,Integer> marks=results.get(subject);
            int max=Collections.max(marks.values());
            String topper="";
            for(Map.Entry<String,Integer> e:marks.entrySet())
                if(e.getValue()==max) topper=e.getKey();
            double avg=marks.values().stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println(subject+" → Topper: "+topper+" ("+max+"), Avg: "+avg);
        }
    }
}
