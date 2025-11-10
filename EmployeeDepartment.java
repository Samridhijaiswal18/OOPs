import java.util.*;
public class EmployeeDepartment {
    public static void main(String[] args){
        Map<Integer,String> emp=new HashMap<>();
        emp.put(1001,"Engineering");
        emp.put(1002,"HR");
        emp.put(1003,"Engineering");
        emp.put(1004,"Sales");
        emp.put(1005,"Engineering");
        emp.put(1002,"Operations");
        System.out.println("Employees in Engineering:");
        for(Map.Entry<Integer,String> e:emp.entrySet())
            if(e.getValue().equals("Engineering")) System.out.println(e.getKey());
    }
}
