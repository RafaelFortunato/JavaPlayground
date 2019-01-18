package Chapter4;

// These will be printed in crescent order
public class StaticInitializers {
    {
        System.out.println("4");
    }

    static {
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    public static void main(String[] args) {
        System.out.println("3");
        new StaticInitializers();
        System.out.println("5");
    }
}
