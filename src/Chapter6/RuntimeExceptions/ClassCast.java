package Chapter6.RuntimeExceptions;

public class ClassCast {

    // Exception in thread "main" java.lang.ClassCast: java.lang.String cannot be cast to java.lang.Integer
    public static void main(String[] args) {
        String type = "moose";
//        Integer number = (Integer) type; // DOES NOT COMPILE

        Object obj = type;
        Integer number = (Integer) obj;
    }
}
