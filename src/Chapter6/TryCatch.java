package Chapter6;

public class TryCatch {
    public static void main(String[] args) {
        // DOEST NOT COMPILE
        // Java requires braces on try, catch and finally clauses

//        try
//            fall();
//        catch (Exception e)
//            getUp();


        // DOES NOT COMPILE
//        try {
            // Catch or finally expected
//        }


        // Finally without catch is ok
        try {
            fall();
            System.out.println("Wont print");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Wont print");
    }

    static void fall() {
        throw new RuntimeException();
    }

    static void getUp() {
        System.out.println("Got up");
    }
}
