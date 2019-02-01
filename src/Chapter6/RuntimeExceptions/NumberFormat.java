package Chapter6.RuntimeExceptions;

public class NumberFormat {

    // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
    public static void main(String[] args) {
        Integer.parseInt("abc");
    }
}
