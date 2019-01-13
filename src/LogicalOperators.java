public class LogicalOperators {
    public static void main(String[] args) {
        // ^ Exclusive OR
        boolean a = true;
        boolean b = true;
        System.out.println(a ^ b);

        boolean x = true | print("Simple OR operator, print will be called");
        boolean y = true || print("Short-circuit, print wont be called");

        int c = 6;
        boolean d = (c >= 6) || (++c <= 7);
        System.out.println(c); // 6

        int hourOfDay= 1;
        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        do d = false; while(c<6);

       int w = 5;
       System.out.println(w > 2 ? w < 4 ? 10 : 8 : 7);

//        String aa = "5";
//        if (aa) { // Must be boolean
//
//        }
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE
//                id = 5;
//                break;
            case suffix:
                id = 0;
                break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5: // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J': // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//                id=15;
//                break;
        }
        return id;
    }

    private static boolean print(String msg) {
        System.out.println(msg);
        return true;
    }
}
