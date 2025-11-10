import java.util.*;
public class BankingSystem {
    public static void main(String[] args){
        Map<String,Double> acc=new HashMap<>();
        acc.put("A001",15000.0);
        acc.put("A002",250000.0);
        acc.put("A003",50000.0);
        acc.put("A004",1000000.0);
        acc.put("A005",75000.0);
        deposit(acc,"A001",5000);
        withdraw(acc,"A003",60000);
        withdraw(acc,"A005",25000);
        System.out.println("\nTop 3 Customers:");
        acc.entrySet().stream()
        .sorted((a,b)->Double.compare(b.getValue(),a.getValue()))
        .limit(3)
        .forEach(e->System.out.println(e.getKey()+" → "+e.getValue()));
    }
    static void deposit(Map<String,Double> map,String acc,double amt){
        map.put(acc,map.getOrDefault(acc,0.0)+amt);
    }
    static void withdraw(Map<String,Double> map,String acc,double amt){
        double bal=map.getOrDefault(acc,0.0);
        if(amt<=bal) map.put(acc,bal-amt);
    }
}
