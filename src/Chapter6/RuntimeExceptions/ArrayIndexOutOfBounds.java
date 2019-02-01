package Chapter6.RuntimeExceptions;

public class ArrayIndexOutOfBounds {

    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
    public static void main(String[] args) {
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
    }
}
