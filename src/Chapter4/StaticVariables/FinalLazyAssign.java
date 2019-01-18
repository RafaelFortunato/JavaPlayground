package Chapter4.StaticVariables;

public class FinalLazyAssign {
    private static final int a;
//    private static final int b; // DOES NOT COMPILE, Never gets assigned
    private static final int c;
    private static final int d = 4;

    /**
     * There is a common case to use a static initializer: when you need to initialize a
     * static field and the code to do so requires more than one line. This often occurs
     * when you want to initialize a collection like an ArrayList.
     */
    static {
        a = 3;
        c = 7;
//        c = 8; // DOES NOT COMPILE, Reassigning final variable
//        d = 5; // DOES NOT COMPILE, Reassigning final variable
    }

    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
