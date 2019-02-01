package Chapter6.RuntimeExceptions;

public class IllegalArgument {

    // Exception in thread "main" java.lang.IllegalArgumentException:
    // # eggs must not be negative
    public static void main(String[] args) {
        setNumberEggs(-2);
    }

    static int numberEggs = 0;

    public static void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");
        IllegalArgument.numberEggs = numberEggs;
    }
}
