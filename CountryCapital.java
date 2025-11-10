import java.util.*;
public class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("India","New Delhi");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        map.put("Canada","Ottawa");
        map.put("Brazil","Brasília");
        map.put("Australia","Canberra");
        map.put("Germany","Berlin");
        map.put("Kenya","Nairobi");
        System.out.println("Capital of India: "+map.get("India"));
        System.out.println("Capital of Spain: "+map.getOrDefault("Spain","Not Found"));
        System.out.println("\nAll Countries and Capitals:");
        for (Map.Entry<String,String> e:map.entrySet())
            System.out.println(e.getKey()+" → "+e.getValue());
    }
}
