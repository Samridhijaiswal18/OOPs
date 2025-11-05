public class CompareValues {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) return b == null;
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));
        System.out.println(isEqual("Java", "Java"));
        System.out.println(isEqual(3.14, 2.71));
        System.out.println(isEqual(null, null));
        System.out.println(isEqual(null, "Test"));
    }
}
