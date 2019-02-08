package Chapter1;

public class DefaultVariableValues {

//    boolean                                     false
//    byte, short, int, long                      0 (in the type’s bit-length)
//    float, double                               0.0 (in the type’s bit-length)
//    char                                        '\u0000' (NUL)
//    All object references (everything else)     null

    // Gets assigned default values
    static boolean bool;
    static int number;
    static String text;
    static char letter;

    public static void main(String[] args) {

        // COMPILE, Prints default values
        System.out.println("Instance Bool: " + bool);
        System.out.println("Instance Number: " + number);
        System.out.println("Instance Text: " + text);
        System.out.println("Instance Letter: " + letter);

        System.out.println(letter == 0);

        boolean bool2;
        int number2;
        String text2;
        String letter2;

        // DOES NOT COMPILE, Might not have been initialized
//        System.out.println("Instance Bool: " + bool2);
//        System.out.println("Instance Number: " + number2);
//        System.out.println("Instance Text: " + text2);
//        System.out.println("Instance Text: " + letter2);
    }
}
