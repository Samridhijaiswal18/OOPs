import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args){
        Map<String,Double> salary=new HashMap<>();
        salary.put("Alice",70000.0);
        salary.put("Bob",50000.0);
        salary.put("Cara",120000.0);
        salary.put("David",90000.0);
        salary.put("Eve",120000.0);
        giveRaise(salary,"Bob",10);
        giveRaise(salary,"Zara",5);
        double avg=salary.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max=salary.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        System.out.println("Average Salary: "+avg);
        System.out.println("Highest Salary: "+max);
        System.out.println("Highest-paid employees:");
        for(Map.Entry<String,Double> e:salary.entrySet())
            if(e.getValue()==max) System.out.println(e.getKey());
    }
    static void giveRaise(Map<String,Double> map,String name,double percent){
        if(map.containsKey(name)){
            double updated=map.get(name)*(1+percent/100);
            map.put(name,updated);
        }
    }
}
