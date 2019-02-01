package Chapter6.Errors;

public class ExceptionInInitializer {

    // Exception in thread "main" java.lang.ExceptionInInitializerError
    // Caused by: java.lang.ArrayIndexOutOfBoundsException: -1

    // The ExceptionInInitializerError is an error because Java failed to load the whole class.
    // This failure prevents Java from continuing.
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static void main(String[] args) {
        System.out.println("x");
    }
}
