public class DefaultVariableValues {

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
