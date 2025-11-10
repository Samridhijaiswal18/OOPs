import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        Map<String,Double> cart=new LinkedHashMap<>();
        cart.put("Laptop",45000.0);
        cart.put("Mouse",800.0);
        cart.put("Keyboard",1500.0);
        cart.put("Headphones",2500.0);
        double total=0;
        for(double p:cart.values()) total+=p;
        if(total>5000) total*=0.9;
        System.out.println("Final Bill: "+total);
    }
}
