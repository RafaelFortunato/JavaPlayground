package Chapter6.RuntimeExceptions;

public class NullPointer {

    static String name;

    // Exception in thread "main" java.lang.NullPointerException
    public static void main(String[] args) {
        System.out.println(name.length());
    }
}
