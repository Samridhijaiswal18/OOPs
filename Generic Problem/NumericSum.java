import java.util.List;
import java.util.Arrays;

public class NumericSum {

    public static <T extends Number> double sumNumbers(List<T> list) {
        double sum = 0.0;
        for (T num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Sum of Integer list: " + sumNumbers(intList));
        System.out.println("Sum of Double list: " + sumNumbers(doubleList));
    }
}
