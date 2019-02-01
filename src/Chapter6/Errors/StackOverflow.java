package Chapter6.Errors;

// Since the method calls itself, it will never end.
// Eventually, Java runs out of room on the stack and throws the error.
// This is called infinite recursion.
// It is better than an infinite loop because at least Java will catch it and throw the error.
// With an infinite loop, Java just uses all your CPU until you can kill it.
public class StackOverflow {

    // Exception in thread "main" java.lang.StackOverflowError
    public static void main(String[] args) {
        infiniteRecursion(1);
    }

    public static void infiniteRecursion(int num) {
        infiniteRecursion(num);
    }

    public static void infiniteLoop(int num) {
        for (int i = 0; i < 1;) {

        }
    }
}
