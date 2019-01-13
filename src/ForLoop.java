public class ForLoop {
    public static void main(String[] args) {
//        int x = 0;
//        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE, x is already defined is this scope
//            System.out.print(x + " ");
//        }

//        for (long y = 0, int x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE,  variables in the initialization block must all be of the same type
//            System.out.print(x + " ");
//        }

        java.util.List<Integer> values = new java.util.ArrayList<>();
        for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }

        int x = 0;
        for (x = 3; x < 5; x++) { // OK
            System.out.println(x + " ");
        }

        for (String z = new String(); z.equals(""); ) {
            System.out.println("Z: " + z);
            z = "aa";
        }

        RAWR: {
            int aaaa=7;
            break RAWR;
//            System.out.println("error"); // DOES NOT COMPILE, Unreachable statement
        }

        System.out.println("END");
    }
}
