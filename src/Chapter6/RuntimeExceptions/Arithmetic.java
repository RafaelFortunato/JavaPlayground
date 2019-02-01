package Chapter6.RuntimeExceptions;

public class Arithmetic {

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    public static void main(String[] args) {
        try {
            int answer = 11 / 0;
        } catch (Exception e) {
            System.out.println("Caught");
        }
        System.out.println("End");
    }
}
