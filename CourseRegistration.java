import java.util.*;
public class CourseRegistration {
    public static void main(String[] args){
        Map<String,Integer> courses=new HashMap<>();
        courses.put("CS101",48);
        courses.put("CS102",52);
        courses.put("CS103",3);
        courses.put("CS104",20);
        courses.put("CS105",0);
        change(courses,"CS101",1);
        change(courses,"CS103",-1);
        change(courses,"CS105",-1);
        System.out.println("\nCourses near full (>=50):");
        for(Map.Entry<String,Integer> e:courses.entrySet())
            if(e.getValue()>=50) System.out.println(e.getKey()+" → "+e.getValue());
        System.out.println("\nUnder-subscribed (<5):");
        for(Map.Entry<String,Integer> e:courses.entrySet())
            if(e.getValue()<5) System.out.println(e.getKey()+" → "+e.getValue());
    }
    static void change(Map<String,Integer> map,String course,int delta){
        map.put(course,Math.max(map.getOrDefault(course,0)+delta,0));
    }
}
