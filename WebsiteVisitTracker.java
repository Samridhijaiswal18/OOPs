import java.util.*;
public class WebsiteVisitTracker {
    public static void main(String[] args){
        Map<String,Integer> visits=new HashMap<>();
        String[] pages={"home","about","products","home","products","contact","home"};
        for(String page:pages) visits.put(page,visits.getOrDefault(page,0)+1);
        System.out.println("Pages sorted by visits:");
        visits.entrySet().stream()
        .sorted((a,b)->b.getValue().compareTo(a.getValue()))
        .forEach(e->System.out.println(e.getKey()+" → "+e.getValue()));
    }
}
