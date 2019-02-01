package Chapter6;

import java.io.IOException;

public class UnreachableCatch {
    public static void main(String[] args) {
        divideNumbers(0, 0);
    }

    static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
//        } catch (IOException e) {
//            return -1;
//            Exception java.io.IOException is never thrown in body of corresponding try statement
//        } catch (ArithmeticException e) {
//            return 0;
//            Exception java.lang.ArithmeticException has already been caught
        } finally {
            System.out.print("done");
        }
    }
}
