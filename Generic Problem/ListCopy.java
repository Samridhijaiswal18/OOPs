import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListCopy {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> srcInt = Arrays.asList(1, 2, 3);
        List<Double> srcDouble = Arrays.asList(1.5, 2.5, 3.5);

        List<Number> dest = new ArrayList<>();

        copyList(dest, srcInt);
        copyList(dest, srcDouble);

        System.out.println("Destination list: " + dest);
    }
}
