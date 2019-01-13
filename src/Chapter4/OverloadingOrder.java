package Chapter4;

public class OverloadingOrder {
    public static void main(String[] args) {
        call(1, 2);
    }

    // Order Java uses to choose the right overloaded method
    static void call(int i, int j) { System.out.println("Exact match by type"); }

    static void call(long i, long j) { System.out.println("Larger primitive type"); }

    static void call(Integer i, Integer j) { System.out.println("Autoboxed type "); }

    static void call(int... args) { System.out.println("Varargs"); }
}
